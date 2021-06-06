package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_Padash
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__padash.view.*

class Frag_Padash : Fragment() {

  var ad_d:adapter_Padash?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     var vvvv=inflater.inflate(R.layout.fragment_frag__padash, container, false)
        ad_d= adapter_Padash(requireActivity())
        vvvv.recy_padash.adapter=ad_d

        return  vvvv
    }


}