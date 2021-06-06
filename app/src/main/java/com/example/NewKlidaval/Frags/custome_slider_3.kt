package com.example.NewKlidaval.Frags

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.NewKlidaval.R
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.fragment_custome_slider.view.*

class custome_slider_3(var S:String) : Fragment() {
   var i: String ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            i= arguments?.getString("data",null)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        var V= inflater.inflate(R.layout.fragment_custome_slider, container, false)
        var V= inflater.inflate(R.layout.fragment_custome_slider_2, container, false)

        if (!S.isNullOrEmpty())
        {
            Picasso.get().load(S).placeholder(R.drawable.ic_placeho).into(V.img_)
        }




        // Inflate the layout for this fragment
//        V.img_.setImageResource(i)
        return V;
    }


}