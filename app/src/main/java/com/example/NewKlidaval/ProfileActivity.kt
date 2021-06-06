package com.example.NewKlidaval

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile2.*

class ProfileActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        if (Login_Flag.equals("1"))
        {
            textView88.setText(admin_name)
        }else {
            textView88.setText("پروفایل")
        }


        list_ex.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","Sabtemelk_ex")
            startActivity(dd)
        }



        sabtmelk.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","Sabtemelk")
            if (Login_Flag.equals("1"))
            {
                dd.putExtra("TypeS","1")
            }else{
                dd.putExtra("TypeS","2")
            }
            startActivity(dd)
        }
        list_2.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","Sabtemelk_list")
            startActivity(dd)
        }

        sabtmoshtari.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","sabtmoshtari")
            startActivity(dd)
        }




        darkhastmelk.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","darkhastmelk")
            startActivity(dd)
        }

        list_darkhast.setOnClickListener {
            var dd=Intent(this,MultyActivity::class.java)
            dd.putExtra("Type","list_darkhast")
            startActivity(dd)
        }







    }
}