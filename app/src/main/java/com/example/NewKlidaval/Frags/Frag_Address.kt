package com.example.NewKlidaval.Frags

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Activity_PayBascet
import com.example.NewKlidaval.Adapters.adapter_address
import com.example.NewKlidaval.Add_Address_Activity
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__address.view.*

class Frag_Address : Fragment() {

    var ad_address: adapter_address?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var vv= inflater.inflate(R.layout.fragment_frag__address, container, false)
        ad_address= adapter_address(activity!!)
        vv.imageView9.setOnClickListener {
            activity?.finish()
        }
        vv.rect_address.adapter=ad_address
        vv.rect_address.isNestedScrollingEnabled=false


        vv.cvdgnfh.setOnClickListener {
            val i = Intent(activity, Add_Address_Activity::class.java)
            startActivity(i)
        }

        vv.button8.setOnClickListener {
         if (ad_address?.Selected!=-1)
         {
             val i = Intent(activity, Activity_PayBascet::class.java)
             startActivity(i)
             activity?.finish()
         }
        }

        return  vv
    }


}