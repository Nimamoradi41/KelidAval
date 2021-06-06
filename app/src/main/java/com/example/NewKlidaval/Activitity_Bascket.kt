package com.example.NewKlidaval

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.NewKlidaval.Adapters.adapter_items_card_bascket
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.activity_activitity__bascket.*

class Activitity_Bascket : BaseActivity() {
    var ad_card: adapter_items_card_bascket? =null
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase!!))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitity__bascket)
        ad_card= adapter_items_card_bascket(this)
        recy_bascet.adapter=ad_card
        recy_bascet.isNestedScrollingEnabled=false
        test.setOnClickListener {
            var cv=Intent(this,MultyActivity::class.java)
            cv.putExtra("Type","WW")
            startActivity( cv)
            finish()
        }

        imageView9.setOnClickListener {
            finish()
        }
    }
}