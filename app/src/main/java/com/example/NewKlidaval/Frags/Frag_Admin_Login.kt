package com.example.NewKlidaval.Frags

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.NewKlidaval.*
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Model_Respons_Login_Moshaver
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frag__admin__login.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Frag_Admin_Login : BaseFRAGMENT() {
    var VV:View ?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v=inflater.inflate(R.layout.fragment_frag__admin__login, container, false)
        v.textView565.setOnClickListener {
            val url = "https://www.kelidaval.ir/admin/realEstateRegester.php"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        v.textView73.setOnClickListener {
            Login()
        }
        VV=v
        return  v

    }
    fun  Conv(S:String): String{
        var dd=""
        // ۱۲۳۴۵۶۷۸۹
        var dd2=ArrayList<String>()
        for (i in S)
        {
            Log.i("cvmkkxcvmsvadv",i.toString())
            if (i=='۱')
            {
                dd=dd+"1"

            }
           else if (i=='۲')
            {
                dd2.add("2")

            }
           else  if (i=='۳')
            {
                dd=dd+"3"

            }
            else   if (i=='۰')
            {
                dd=dd+"0"

            }
         else    if (i=='۴')
            {
                dd=dd+"4"

            }
          else   if (i=='۵')
            {
                dd=dd+"5"

            }
          else   if (i=='۶')
            {
                dd=dd+"6"

            }
          else   if (i=='۷')
            {
                dd=dd+"7"


            }
            else if (i=='۸')
            {
                dd=dd+"8"

            }
            else if (i=='۹')
            {
                dd=dd+"9"

            }
            else {
                dd=dd+i
            }



        }

//        dd2.forEach {
//            dd=dd+it
//        }
        Log.i("cvmkkxcvmsvadvsssvf","dd"+dd)
//        dd2.clear()
        return  dd
    }
    fun Login()
    {
        var name= VV?.name_edt?.text.toString();
        var pass=VV?.pass_edt?.text.toString();
        Log.i("Advagegqe",name)
//        Log.i("Advagegqe",VV?.name_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.name_edt?.text.toString())+"1")
//        Log.i("Advagegqe",pass)
//        Log.i("Advagegqe",VV?.pass_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.pass_edt?.text.toString())+"2")
        DialLoad()
        var req= App_Start.getApi()?.Login_Moshaver(Conv(name),Conv(pass))
        req?.enqueue(object : Callback<Model_Respons_Login_Moshaver> {
            override fun onResponse(call: Call<Model_Respons_Login_Moshaver>, response: Response<Model_Respons_Login_Moshaver>) {
                Dial_Close()
                if (response.body()?.login!!)
                {
                    Log.i("acvadvabab", response.body()?.admin_id.toString())
                     Share?.edit()?.putBoolean(Constanc.Login,true)?.apply()
                     Share?.edit()?.putString(Constanc.Name_Moshaver,Conv(VV?.name_edt?.text.toString()))?.apply()
                     Share?.edit()?.putString(Constanc.Pass_Moshaver,Conv(VV?.pass_edt?.text.toString()))?.apply()
                     Share?.edit()?.putString(Constanc.Admin_id,response.body()?.admin_id)?.apply()
                     Share?.edit()?.putString(Constanc.admin_name,response.body()?.admin_name)?.apply()
                     Share?.edit()?.putString(Constanc.Login_Flag,"1")?.apply()
                     admin_id=response.body()?.admin_id
                     Log.i("acvadvabab", admin_id.toString())
//                    AvaknvknAFsfwww
                    activity?.startActivity(Intent(context,SplashScreen::class.java))
                    activity?.finish()
                    MainActivity.Act?.finish()
                }else{
                    com.google.android.material.snackbar.Snackbar.
                    make(VV?.scdfbs!!,"${response.body()?.MSG}",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                }
            }
            override fun onFailure(call: Call<Model_Respons_Login_Moshaver>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(VV?.scdfbs!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgasss",t.message.toString())
            }

        })
        req?.request()


    }
    }