package com.example.NewKlidaval

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Res_citys
import com.example.NewKlidaval.Models.estate
import com.example.NewKlidaval.Models.places
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.ddddd
import kotlinx.android.synthetic.main.activity_splash_screen.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashScreen : BaseActivity() {
    var estate :ArrayList<estate>?=null
    var places:ArrayList<places> ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        estate=ArrayList<estate>()
        places=ArrayList<places>()
          Data()
//        var vvv=getSharedPreferences("App", MODE_PRIVATE).getBoolean(Constanc.Login,false)
//        if (vvv)
//        {
//            Log.i("avavkmaa","a")
//            startActivity(Intent(this,MainActivity::class.java))
//            finish()
//        }else{
//            Log.i("avavkmaa","safaf")
//            var cv=Intent(this,MultyActivity::class.java)
//            cv.putExtra("Type","A")
//            startActivity( cv)
//            finish()
//        }
    }
    fun  Citys()
    {
        var req_2= App_Start.getApi()?.citys()
        req_2?.enqueue(object : Callback<Res_citys> {
            override fun onResponse(call: Call<Res_citys>, response: Response<Res_citys>) {
                Log.i("scasfaefrytyjuk",response.body().toString())
                places=response.body()?.places
                var ss= places()
                ss.area_name="همه"
                ss.area_id="0"
                places?.add(0,ss)
                var ssa=Intent(this@SplashScreen,MainActivity::class.java)
                ssa.putExtra("places",places)
                ssa.putExtra("estate",estate)
                ssvsvf.cancelAnimation()
                startActivity(ssa)
                finish()

            }
            override fun onFailure(call: Call<Res_citys>, t: Throwable) {
                com.google.android.material.snackbar.Snackbar.
                make(dvasdva,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("scasfaefrytyjuk",t.message.toString())
            }

        })
        req_2?.request()
    }
    fun Data()
    {
        var req= App_Start.getApi()?.index(
           "4",
           "0",
           "0"
        )
        req?.enqueue(object : Callback<Model_Respons> {
            override fun onResponse(call: Call<Model_Respons>, response: Response<Model_Respons>) {
                estate=response.body()?.estate
                 Citys()
            }
            override fun onFailure(call: Call<Model_Respons>, t: Throwable) {
                com.google.android.material.snackbar.Snackbar.
                make(dvasdva,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas333",t.message.toString())
            }

        })
        req?.request()


    }
}