package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_P_Ghabell
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__list__darkhastmelk.view.*

class Frag_List_Darkhastmelk : Fragment() {

   var vv:adapter_P_Ghabell ?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var V= inflater.inflate(R.layout.fragment_frag__list__darkhastmelk, container, false)
        vv= adapter_P_Ghabell()
        V.recy_list_darkhast_melk.adapter=vv
        return  V
    }


}