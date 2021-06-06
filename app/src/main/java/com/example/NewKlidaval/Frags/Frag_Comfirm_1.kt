package com.example.NewKlidaval.Frags

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.MultyActivity
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__comfirm_1.view.*

class Frag_Comfirm_1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var V= inflater.inflate(R.layout.fragment_frag__comfirm_1, container, false)

        V.test.setOnClickListener {
            var vv=Intent(requireActivity(),MultyActivity::class.java)
            vv.putExtra("Type","B")
            activity?.startActivity(vv)
            activity?.finish()
        }


        return  V

    }


}