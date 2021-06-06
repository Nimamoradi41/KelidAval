package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_P_Gari
import com.example.NewKlidaval.Models.places
import com.example.NewKlidaval.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.custome_sort.*
import kotlinx.android.synthetic.main.custome_sort.view.*

class Sub_City() :BottomSheetDialogFragment() {
    var ad_adapter: adapter_P_Gari?=null
    var tit:title ?=null
    var citys:ArrayList<places> ?=null
    var citys_temp:ArrayList<places> ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun title_clicl(f:title)
    {
        this.tit=f
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         var View=View.inflate(context, R.layout.custome_sort, null)

        return View
    }

    interface title {
        fun  TITLE(S:String)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ad_adapter= adapter_P_Gari()
        ad_adapter?.clicl(object  :adapter_P_Gari.datas{
            override fun id(S:String) {
                 dismiss()
                tit?.TITLE(S)
            }

        })
        citys_temp=java.util.ArrayList<places>()
        citys_temp=citys
        recy_subcitys.adapter=ad_adapter
        ad_adapter?.data=citys
        ad_adapter?.notifyDataSetChanged()

        view.imageView12.setOnClickListener {
            editTextTextPersonName.text.clear()
            imageView12.animate().alpha(0f).setDuration(700).start()

        }
        view.editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (s.toString().length > 0)
                {
                    Log.i("sdvlsmdvmsda","Ok4")
                    if (imageView12.alpha==0f)
                    {
                        imageView12.animate().alpha(1f).setDuration(700).start()
                    }


                    var d=false

                    var dda=ArrayList<places>()
                    citys?.forEach {
                        Log.i("sdvlsmdvmsda","Ok5")
                        if (it.area_name.toString().contains(s.toString()))
                        {
                            Log.i("sdvlsmdvmsda","Ok")
                            var da=places()
                            d=true
                            da.area_id=it.area_id
                            da.area_name=it.area_name
                            dda.add(da)

                        }
                    }
                    if (d)
                    {
                        Log.i("sdvlsmdvmsda","Ok2")
                        ad_adapter?.data=dda
                        ad_adapter?.notifyDataSetChanged()

                    }

//                    Search(s.toString())

                }else{
                    ad_adapter?.data=citys
                    ad_adapter?.notifyDataSetChanged()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }
}