package com.example.NewKlidaval

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add__address_.*

class Add_Address_Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add__address_)
        button8.setOnClickListener {
            finish()
        }
        imageView9.setOnClickListener {
            finish()
        }
    }
}