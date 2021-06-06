package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_Shop_History
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__shop__history.view.*

class Frag_Shop_History : Fragment() {
     var ad_d:adapter_Shop_History?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var vvx=inflater.inflate(R.layout.fragment_frag__shop__history, container, false)
        ad_d= adapter_Shop_History()
        vvx.recy_shop_history.adapter=ad_d
        return  vvx
    }


}