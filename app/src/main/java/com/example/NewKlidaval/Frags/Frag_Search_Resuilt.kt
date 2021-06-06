
package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_address_2
import com.example.NewKlidaval.Models.estate
import com.example.NewKlidaval.Models.places
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frag__search__resuilt.view.*

class Frag_Search_Resuilt : Fragment() {
    var  ad_slider : adapter_address_2? =null
    var Citys:ArrayList<estate> ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Citys=ArrayList<estate>()
        Citys= arguments?.getSerializable("data_2") as ArrayList<estate>?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var V= inflater.inflate(R.layout.fragment_frag__search__resuilt, container, false)
        ad_slider= adapter_address_2(requireActivity())
        ad_slider?.datas=Citys
        V.recy_seaerch.adapter=ad_slider
        Log.i("sdvnaknfa",Citys.toString())

//        ad_slider?.notifyDataSetChanged()

        return V
    }


}