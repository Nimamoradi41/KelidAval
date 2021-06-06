package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_P_Gari
import com.example.NewKlidaval.Adapters.adapter_P_Gari_2
import com.example.NewKlidaval.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.custome_sort.*
import kotlinx.android.synthetic.main.custome_sort.view.*

class Type_Melc :BottomSheetDialogFragment() {
    var ad_adapter: adapter_P_Gari_2?=null
    var tit: Sub_City.title?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    fun title_clicl(f: Sub_City.title)
    {
        this.tit=f
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.textView86.setText("نوع ملک را مشخص کنید")
        view.cardView3.visibility=View.GONE
        ad_adapter=adapter_P_Gari_2()
        recy_subcitys.adapter=ad_adapter
        ad_adapter?.clicl(object  :adapter_P_Gari_2.title{
            override fun TITLE(S:String) {
                dismiss()
                tit?.TITLE(S)
            }

        })
    }
}