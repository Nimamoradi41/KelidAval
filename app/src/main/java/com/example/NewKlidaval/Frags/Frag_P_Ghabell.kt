package com.example.NewKlidaval.Frags

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.NewKlidaval.Adapters.adapter_P_Ghabell
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_dial_app.view.*
import kotlinx.android.synthetic.main.fragment_frag__p__ghabell.view.*

class Frag_P_Ghabell : Fragment() {

    var ad_d:adapter_P_Ghabell?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      var vvv=inflater.inflate(R.layout.fragment_frag__p__ghabell, container, false)
        ad_d=adapter_P_Ghabell()
        vvv.recy_P_Ghabell.isNestedScrollingEnabled=false
        vvv.recy_P_Ghabell.adapter=ad_d

        vvv.test.setOnClickListener {
            Dialapp(context!!)
        }
        return   vvv
    }


    public fun Dialapp( context: Context) {
        var d = Dialog(context)
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.custome_dial_app, null, false)
        d.setContentView(view)
        d.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT)
        d.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))



        view.teswwwwt.setOnClickListener {
            d.dismiss()
        }

        view.sscvd.setOnClickListener {
            d.dismiss()

        }
        d.show()
    }

}