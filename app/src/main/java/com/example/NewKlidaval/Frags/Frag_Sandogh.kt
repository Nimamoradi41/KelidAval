package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_Sandogh
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__sandogh.view.*

class Frag_Sandogh : Fragment() {

    var ad_d=adapter_Sandogh()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var vvc=inflater.inflate(R.layout.fragment_frag__sandogh, container, false)
        ad_d= adapter_Sandogh()
        vvc.recy_sandogh.adapter=ad_d
        return vvc
    }


}