package com.example.NewKlidaval

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.NewKlidaval.Adapters.Adapter_Producte_look_Like
import com.example.NewKlidaval.Adapters.adapter_count_shop
import com.example.NewKlidaval.Adapters.adapter_slider_2
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.activity_main.imageView2
import kotlinx.android.synthetic.main.custome_modal.view.*

class ItemDetail : BaseActivity() {
    var  ad_slider : adapter_slider_2? =null
    var  ad_look_like : Adapter_Producte_look_Like? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        imageView2.setOnClickListener {
            drawer_2.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
            drawer_2.openDrawer(Gravity.RIGHT)
        }
        imageView9_2.setOnClickListener {
            val i = Intent(this, Serach_Activity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        imageView24.setOnClickListener {
            if (imageView24.tag.equals("0"))
            {
                imageView24.animate().scaleX(1.3f).scaleY(1.3f).setDuration(250).withEndAction {
                    imageView24.setImageResource(R.drawable.ic_fav_true)
                    imageView24.animate().scaleX(1f).scaleY(1f).setDuration(250).setStartDelay(250).start()
                }.start()
                imageView24.setTag("1")
            }else{
                imageView24.animate().scaleX(1.3f).scaleY(1.3f).setDuration(250).withEndAction {
                    imageView24.setImageResource(R.drawable.ic_fave_false)
                    imageView24.animate().scaleX(1f).scaleY(1f).setDuration(250).setStartDelay(250).start()
                }.start()
                imageView24.setTag("0")
            }
        }
        test.setOnClickListener {
            val d= Dialog(this, R.style.CustomDialog)
            d.setCancelable(true)
            var v= LayoutInflater.from(this).inflate(R.layout.custome_modal, null, false)
            d.setContentView(v)
            var i_Count=ArrayList<String> ()

            var r = 5
            var i = 0
            while (i < r) {
                i++
                i_Count.add(i.toString())
            }
            i_Count.add(0,"0")
            var ad_= adapter_count_shop(i_Count,d,"")
            v.recy_itemmmms.adapter=ad_
            ad_.clicl(object : adapter_count_shop.data_i {
                override fun Data_d(I: Int, Id: String) {
                    if (I==0)
                    {
                        test.setText("افزودن به سبد خرید")
                    }else{
                        test.setText(I.toString()+" عدد ")
                    }

//                    if (Item.getCount()==0)
//                    {
//                        Toast.makeText(c,"عدم موجودی", Toast.LENGTH_SHORT).show()
//                        return
//                    }
//                    if (Item.getCurrentReserved()!=I)
//                    {
////
//                        interface_1?.Data(I,Id,position)
//                    }
                }

            })
            d.window?.setLayout(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            d.window?.setBackgroundDrawable(ColorDrawable((Color.TRANSPARENT)))
            v.imageView15.setOnClickListener {
                d.dismiss()
            }

            v.cccv.setOnClickListener {

            }
            v.close.setOnClickListener {
                d.dismiss()
            }
            d.show()
        }
        recy_look_like.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val dm = DisplayMetrics()
        getWindowManager()?.getDefaultDisplay()?.getMetrics(dm)
        val width = dm.widthPixels
        val height = dm.widthPixels
        ad_look_like= Adapter_Producte_look_Like(this,width)
        recy_look_like.adapter=ad_look_like
        ad_slider= adapter_slider_2(supportFragmentManager)
        imageSlider_2.adapter=ad_slider
        pageIndicatorView_2?.setViewPager(imageSlider_2);
    }
}