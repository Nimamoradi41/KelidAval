package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.Adapters.adapter_P_Gari
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__p__gari.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frag_P_Gari.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frag_P_Gari : Fragment() {

   var ad_d: adapter_P_Gari ?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      var vvv=inflater.inflate(R.layout.fragment_frag__p__gari, container, false)
        ad_d= adapter_P_Gari()
        vvv.recy_P_Gari.adapter=ad_d
        return   vvv
    }


}