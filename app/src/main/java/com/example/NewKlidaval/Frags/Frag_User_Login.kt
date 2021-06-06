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
import com.example.NewKlidaval.Models.Model_Respons_loginUser
import kotlinx.android.synthetic.main.fragment_frag__admin__login.view.*
import kotlinx.android.synthetic.main.fragment_frag__user__login.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frag_User_Login.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frag_User_Login : BaseFRAGMENT() {


    var VV:View ?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       var v=    inflater.inflate(R.layout.fragment_frag__user__login, container, false)
        VV=v;
        v.textView73wwrthb.setOnClickListener {
            Login()
        }

        v.textView565eeraedfa.setOnClickListener {
            var dd=Intent(activity,MultyActivity::class.java)
            dd.putExtra("Type","Frag_User_Login")
            activity?.startActivity(dd)
            activity?.finish()
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
        var mob_22= VV?.mob_22?.text.toString();

        Log.i("Advagegqe",mob_22)
//        Log.i("Advagegqe",VV?.name_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.name_edt?.text.toString())+"1")
//        Log.i("Advagegqe",pass)
//        Log.i("Advagegqe",VV?.pass_edt?.text.toString())
//        Log.i("Advagegqe",Conv(VV?.pass_edt?.text.toString())+"2")
        DialLoad()
        var req= App_Start.getApi()?.loginUser(Conv(mob_22))
        req?.enqueue(object : Callback<Model_Respons_loginUser> {
            override fun onResponse(call: Call<Model_Respons_loginUser>, response: Response<Model_Respons_loginUser>) {
                Dial_Close()
                if (response.body()?.login!!)
                {
                    Share?.edit()?.putBoolean(Constanc.Login,true)?.apply()
                    Share?.edit()?.putString(Constanc.user_id,response.body()?.usreId)?.apply()
                    Share?.edit()?.putString(Constanc.Login_Flag,"2")?.apply()

                    Log.i("acvadvabab", admin_id.toString())
//                    AvaknvknAFsfwww
                    activity?.startActivity(Intent(context, SplashScreen::class.java))
                    activity?.finish()
                    MainActivity.Act?.finish()
                }else{
                    com.google.android.material.snackbar.Snackbar.
                    make(VV?.rootView?.fbrohryku!!,"${response.body()?.MSG}",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                }
            }
            override fun onFailure(call: Call<Model_Respons_loginUser>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(VV?.rootView?.fbrohryku!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgasss",t.message.toString())
            }

        })
        req?.request()


    }


}