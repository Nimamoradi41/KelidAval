package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_List_Fav
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__list__fav.view.*

class Frag_List_Fav : Fragment() {
   var ad_d:adapter_List_Fav?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       var vvs= inflater.inflate(R.layout.fragment_frag__list__fav, container, false)
        ad_d=adapter_List_Fav(context!!)
        vvs.recy_fav_list.adapter=ad_d
        return  vvs
    }


}