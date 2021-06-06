package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_zirmagmoee
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__zir_magmoe.view.*


class Frag_ZirMagmoe : Fragment() {
   var ad_d: adapter_zirmagmoee?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
      var vv=inflater.inflate(R.layout.fragment_frag__zir_magmoe, container, false)
        ad_d= adapter_zirmagmoee()
        vv.recy_zir.adapter=ad_d
        return  vv
    }


}