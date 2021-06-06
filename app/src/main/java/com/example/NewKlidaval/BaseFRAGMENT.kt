package com.example.NewKlidaval

import android.app.Dialog
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

open class BaseFRAGMENT :Fragment() {
    var Share: SharedPreferences?=null
    var Dialog_load:Dialog ?=null
    var admin_id:String ?=null
    var user_id:String ?=null
    var admin_name:String ?=null
    var Name_Moshaver:String ?=null
    var Pass_Moshaver:String ?=null
    var Number_Karbar:String ?=null
    var Login_Flag:String ?=null
    var Login:Boolean ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       UpdateData()
    }
    private fun UpdateData() {
        Share=activity?.getSharedPreferences("App", AppCompatActivity.MODE_PRIVATE)
        Login=Share?.getBoolean(Constanc.Login,false)
        Name_Moshaver=Share?.getString(Constanc.Name_Moshaver,"")
        Pass_Moshaver=Share?.getString(Constanc.Pass_Moshaver,"")
        Number_Karbar=Share?.getString(Constanc.Number_Karbar,"")
        Login_Flag=Share?.getString(Constanc.Login_Flag,"")
        admin_name=Share?.getString(Constanc.admin_name,"")
        user_id=Share?.getString(Constanc.user_id,"")
        admin_id=Share?.getString(Constanc.Admin_id,"")
    }
    public fun DialLoad() {
        Dialog_load = Dialog(requireActivity())
        Dialog_load?.setCancelable(false)
        val inflater = LayoutInflater.from(requireActivity())
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
}