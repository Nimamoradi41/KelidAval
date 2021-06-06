package com.example.NewKlidaval.Frags

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.*
import com.example.NewKlidaval.Models.Model_Respons_Login_Moshaver
import com.example.NewKlidaval.Models.Model_regUser
import kotlinx.android.synthetic.main.fragment_frag__admin__login.view.*
import kotlinx.android.synthetic.main.fragment_frag__user__singin.*
import kotlinx.android.synthetic.main.fragment_frag__user__singin.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Frag_User_Singin : BaseFRAGMENT() {


    var VV:View ?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var v=inflater.inflate(R.layout.fragment_frag__user__singin, container, false)
        VV=v
        VV?.rootView?.textView73ssds?.setOnClickListener {
            Login()
        }

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
        var name= VV?.rootView?.name_1?.text.toString();
        var pass= VV?.rootView?.mobile_2?.text.toString();

//        Log.i("Advagegqe",VV?.name_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.name_edt?.text.toString())+"1")
//        Log.i("Advagegqe",pass)
//        Log.i("Advagegqe",VV?.pass_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.pass_edt?.text.toString())+"2")
        DialLoad()
        var req= App_Start.getApi()?.regUser(Conv(name),Conv(pass))
        req?.enqueue(object : Callback<Model_regUser> {
            override fun onResponse(call: Call<Model_regUser>, response: Response<Model_regUser>) {
                Dial_Close()
                if (!response.body()?.error!!)
                {
                    if (response.body()?.login!!)
                    {
                        Share?.edit()?.putBoolean(Constanc.Login,true)?.apply()
                        Share?.edit()?.putString(Constanc.Login_Flag,"2")?.apply()
                        Share?.edit()?.putString(Constanc.user_id,response.body()?.userId)?.apply()
                        Log.i("acvadvabab", admin_id.toString())
//                    AvaknvknAFsfwww
                        activity?.startActivity(Intent(context, SplashScreen::class.java))
                        activity?.finish()
                        MainActivity.Act?.finish()
                    }

                }else{
                    com.google.android.material.snackbar.Snackbar.
                    make(VV?.rootView?.yriyrirywi!!,"${response.body()?.MSG}",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                }
            }
            override fun onFailure(call: Call<Model_regUser>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(VV?.rootView?.yriyrirywi!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgasss",t.message.toString())
            }

        })
        req?.request()


    }

}