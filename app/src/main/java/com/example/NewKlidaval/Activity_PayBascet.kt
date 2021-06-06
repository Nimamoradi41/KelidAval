package com.example.NewKlidaval

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity__pay_bascet.*

class Activity_PayBascet : BaseActivity() {
    var adapter_address_marsole:Adapter_second_bascket_marsole_22 ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__pay_bascet)
        recy_marsole.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        adapter_address_marsole= Adapter_second_bascket_marsole_22(this)
        recy_marsole.adapter=adapter_address_marsole

        imageView9.setOnClickListener {
            finish()
        }
    }
}