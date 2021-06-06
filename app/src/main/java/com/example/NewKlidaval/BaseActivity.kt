package com.example.NewKlidaval

import android.app.Dialog
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

open class BaseActivity : AppCompatActivity() {
    var Share:SharedPreferences ?=null
    var Login:Boolean ?=null
    var Name_Moshaver:String ?=null
    var admin_name:String ?=null
    var user_id:String ?=null
    var Pass_Moshaver:String ?=null
    var Number_Karbar:String ?=null
    var Login_Flag:String ?=null
    var Dialog_load:Dialog ?=null
    companion object{
        var admin_id:String ?=null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_base)
        UpdateData()
    }

    public fun DialLoad() {
        Dialog_load = Dialog(this)
        Dialog_load?.setCancelable(false)
        val inflater = LayoutInflater.from(this)
        val view: View = inflater.inflate(R.layout.layout_loading, null, false)
        Dialog_load?.setContentView(view)
        Dialog_load?.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT)
        Dialog_load?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        Dialog_load?.show()






    }
    public fun Dial_Close() {
        if (Dialog_load!=null)
        {
            Dialog_load?.dismiss()
        }
    }
    private fun UpdateData() {
         Share=getSharedPreferences("App", MODE_PRIVATE)
         Login=Share?.getBoolean(Constanc.Login,false)
        Name_Moshaver=Share?.getString(Constanc.Name_Moshaver,"")
        Pass_Moshaver=Share?.getString(Constanc.Pass_Moshaver,"")
        Number_Karbar=Share?.getString(Constanc.Number_Karbar,"")
        Login_Flag=Share?.getString(Constanc.Login_Flag,"")
        admin_id=Share?.getString(Constanc.Admin_id,"")
        user_id=Share?.getString(Constanc.user_id,"")
        admin_name=Share?.getString(Constanc.admin_name,"")

    }
}