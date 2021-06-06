package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_wallet
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__wallet.view.*

class Frag_Wallet : Fragment() {
     var ad_d=adapter_wallet()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      var vv=inflater.inflate(R.layout.fragment_frag__wallet, container, false)
        ad_d= adapter_wallet()
        vv.recy_wallet.adapter=ad_d
        return vv
    }


}