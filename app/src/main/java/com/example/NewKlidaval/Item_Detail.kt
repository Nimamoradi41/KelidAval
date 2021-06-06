package com.example.NewKlidaval

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.NewKlidaval.Adapters.adapter_slider__3
import com.example.NewKlidaval.Models.estate
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item__detail.*
import java.text.DecimalFormat

class Item_Detail : BaseActivity() {
    var adapter:adapter_slider__3 ?= null
    var estate : estate?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item__detail)

        estate= intent.getSerializableExtra("data") as estate?
        Slider(estate?.img.toString())

        if (!estate?.address.isNullOrEmpty())
        {
            textView121.setText(estate?.address)
        }



        if (!estate?.cod.isNullOrEmpty())
        {
            textView135.setText(estate?.cod)
        }


        if (!estate?.year.isNullOrEmpty())
        {
            textView123.setText(estate?.year)
        }


        if (!estate?.area.isNullOrEmpty())
        {
            textView125.setText(estate?.area)
        }



        if (!estate?.floor.isNullOrEmpty())
        {
            textView127.setText(estate?.floor)
        }


        if (!estate?.date.isNullOrEmpty())
        {
            textView139ss.setText(estate?.date)
        }



        if (!estate?.emkanat.isNullOrEmpty())
        {
            textView139.setText(estate?.emkanat)
        }



        if (!estate?.tozihat.isNullOrEmpty())
        {
            textView143ssc.setText(estate?.tozihat)
        }



        if (!estate?.adminMobile.isNullOrEmpty())
        {
            textView143.setText(estate?.adminMobile+" "+estate?.adminName)
        }




        if (!estate?.adminTell.isNullOrEmpty())
        {
            textView144.setText(estate?.adminTell+" "+estate?.admiBbrand)
        }



        if (!estate?.adminImg.isNullOrEmpty())
        {
           Picasso.get().load(estate?.adminImg).placeholder(R.drawable.ic_placeho).into(circleImageView2)
        }




















        if (!estate?.price.isNullOrEmpty()&&!estate?.price.equals("0"))
        {
            Log.i("sdvsdv","A")
            rent.visibility=View.GONE
            textView161.visibility=View.GONE
            textView162.visibility=View.GONE
            textView163.visibility=View.GONE
            textView164.visibility=View.GONE
            var format = DecimalFormat("#,###,###,###")
            var newPrice: String = format.format(estate?.price?.toDouble())
            textView137.setText(newPrice)
        }else{
            Log.i("sdvsdv","B")
            price.visibility=View.GONE
            textView137.visibility=View.GONE
            textView136.visibility=View.GONE
//            var format = DecimalFormat("#,###,###,###")
//            var newPrice: String = format.format(estate?.mortgage?.toDouble())
            textView162.setText(estate?.mortgage)
//            var newPrice_2: String = format.format(estate?.rent?.toDouble())
            textView164.setText(estate?.rent)
        }










    }
  fun  Slider(S:String)
  {
      adapter= adapter_slider__3(supportFragmentManager,S)
      view_Slider?.adapter=adapter
      pageIndicatorView?.setViewPager(view_Slider);
  }
}