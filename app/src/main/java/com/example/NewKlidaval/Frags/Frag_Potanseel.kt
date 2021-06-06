package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_List_Fav
import com.example.NewKlidaval.App_Start
import com.example.NewKlidaval.BaseFRAGMENT
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Rec_invest
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frag__potanseel.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Frag_Potanseel : BaseFRAGMENT() {



    var V:View?=null

    var adapter: adapter_List_Fav?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_frag__potanseel, container, false)
        V=v
        adapter=adapter_List_Fav(context!!)
        v.recy_potanseeel.adapter=adapter
        Data()
        return v
    }


    fun Data()
    {
        var req= App_Start.getApi()?.invest()
        req?.enqueue(object : Callback<Rec_invest> {
            override fun onResponse(call: Call<Rec_invest>, response: Response<Rec_invest>) {
                Dial_Close()
                if (response.body()?.news!=null)
                {
                    if (response.body()?.news?.size!=0)
                    {
                        var body=response.body()?.news
                        adapter?.news=body
                        adapter?.notifyDataSetChanged()
                    }
                }

            }
            override fun onFailure(call: Call<Rec_invest>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(V?.sds!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas",t.message.toString())
            }

        })
        req?.request()


    }




}