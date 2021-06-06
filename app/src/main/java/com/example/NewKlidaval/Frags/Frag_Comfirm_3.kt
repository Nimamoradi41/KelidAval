package com.example.NewKlidaval.Frags

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__comfirm_3.view.*

class Frag_Comfirm_3: Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var V= inflater.inflate(R.layout.fragment_frag__comfirm_3, container, false)
        V.test_3.setOnClickListener {
            var vvx=activity?.getSharedPreferences("App",Activity.MODE_PRIVATE)
            vvx?.edit()?.putBoolean("Login",true)?.apply()
            startActivity(Intent(activity,MainActivity::class.java))
            activity?.finish()
        }

        return  V

    }


}