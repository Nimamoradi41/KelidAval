package com.example.NewKlidaval.Frags

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_Padash
import com.example.NewKlidaval.App_Start
import com.example.NewKlidaval.BaseFRAGMENT
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Model_Respons_Addmelc
import com.example.NewKlidaval.Models.Model_melkList
import com.example.NewKlidaval.Models.estate_2
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.ddddd
import kotlinx.android.synthetic.main.fragment_frag__list__my_melk.*
import kotlinx.android.synthetic.main.fragment_frag__list__my_melk.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Frag_List_MyMelk : BaseFRAGMENT() {
   var adapter : adapter_Padash?=null

    var vv:View?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var V=inflater.inflate(R.layout.fragment_frag__list__my_melk,container, false)
        vv=V
        adapter= adapter_Padash(activity!!)
        adapter?.clicl(object :adapter_Padash.data{
            override fun Click(S: String) {
                Del(S)
            }
        })
        V.recy_items_mymelk.adapter=adapter
        Data()
        return  V
    }

    open fun Del(S:String)
    {


        DialLoad()

        var req= App_Start.getApi()?.deleteEstate(S)
        req?.enqueue(object : Callback<Model_Respons_Addmelc> {
            override fun onResponse(call: Call<Model_Respons_Addmelc>, response: Response<Model_Respons_Addmelc>) {
                Log.i("lmsvkndgasscssa",response.body().toString())
                Dial_Close()
                adapter?.datas?.clear()
                adapter?.notifyDataSetChanged()
                Data()
            }
            override fun onFailure(call: Call<Model_Respons_Addmelc>, t: Throwable) {
                Dial_Close()
                Log.i("lmsvkndgasscssa",t.message.toString())
                adapter?.datas?.clear()
                adapter?.notifyDataSetChanged()
                com.google.android.material.snackbar.Snackbar.
                make(vv?.scdgnrn!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas",t.message.toString())
            }

        })
        req?.request()


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==21)
        {
            if (resultCode== Activity.RESULT_OK)
            {
             Data()
            }
        }
    }


   open fun Data()
    {

        var data=""
        if (Login_Flag.equals("1"))
        {
            data=admin_id.toString()
        }else{
            data= user_id.toString()
        }
        DialLoad()
        Log.i("svknsvjladjv","admin_id"+ admin_id.toString())
        Log.i("svknsvjladjv", "user_id"+user_id.toString())
        var req= App_Start.getApi()?.ListOfHomeAdmins(data)
        req?.enqueue(object : Callback<Model_melkList> {
            override fun onResponse(call: Call<Model_melkList>, response: Response<Model_melkList>) {
                Log.i("lmsvkndgasscssa",response.body().toString())
                Dial_Close()
                adapter?.datas?.clear()
                adapter?.notifyDataSetChanged()
                if (response.body()?.editEstate?.size!=0)
                {
                    var body=response.body()?.editEstate
                    adapter?.datas=body
                    adapter?.notifyDataSetChanged()
                }
            }
            override fun onFailure(call: Call<Model_melkList>, t: Throwable) {
                Dial_Close()
                Log.i("lmsvkndgasscssa",t.message.toString())
                adapter?.datas?.clear()
                adapter?.notifyDataSetChanged()
                com.google.android.material.snackbar.Snackbar.
                make(vv?.scdgnrn!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas",t.message.toString())
            }

        })
        req?.request()


    }


}