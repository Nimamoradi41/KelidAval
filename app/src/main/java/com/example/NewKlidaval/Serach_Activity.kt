package com.example.NewKlidaval

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_serach_.*

class Serach_Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serach_)
        imageView12.setOnClickListener {
            editTextTextPersonName_1.text.clear()
            imageView12.animate().alpha(0f).setDuration(700).start()

//            ad_adapter_searchbar?.list?.clear()
//            ad_adapter_searchbar?.notifyDataSetChanged()
        }
        editTextTextPersonName_1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (s.toString().length > 0)
                {
                    if (imageView12.alpha==0f)
                    {
                        imageView12.animate().alpha(1f).setDuration(700).start()
                    }

//                    Search(s.toString())

                }else{
//                    ad_adapter_searchbar?.list?.clear()
//                    ad_adapter_searchbar?.notifyDataSetChanged()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }
}