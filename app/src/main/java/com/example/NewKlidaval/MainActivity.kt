package com.example.NewKlidaval
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import com.example.NewKlidaval.Adapters.Adapter_productBoxDtos
import com.example.NewKlidaval.Adapters.adapter_address_2
import com.example.NewKlidaval.Frags.Filter_Box
import com.example.NewKlidaval.Frags.Sub_City
import com.example.NewKlidaval.Frags.Type_Melc
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Res_citys
import com.example.NewKlidaval.Models.estate
import com.example.NewKlidaval.Models.places
import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.oginotihiro.snackbar.Snackbar
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custome_filter.*
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.*
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.*
import kotlinx.android.synthetic.main.mydrawer.*
import okhttp3.MediaType
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MainActivity : BaseActivity() {
    var  ad_slider : adapter_address_2? =null
    var Citys:ArrayList<places> ?=null
    companion object{
        var api:Api ?= null
        var Transaction="4"
        var Type ="0"
        var Aria="0"
        var Flag_Type_Selectd=2
        var Act:Activity ?=null
    }
    var ad_productBoxDtos_ : Adapter_productBoxDtos?= null
//    override fun attachBaseContext(newBase: Context?) {
//        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase!!))
//    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.NewKlidaval.R.layout.activity_main)
//         initSpinner()
        Act=this



        Citys=java.util.ArrayList<places>()


        Clicks()
        imageView2.setOnClickListener {

            ddddd.openDrawer(GravityCompat.END as Int)

        }

        ad_slider= adapter_address_2(this)
        recy_main.adapter=ad_slider
        recy_main.isNestedScrollingEnabled=false
        Nesteed.scrollTo(0, 0)
        ad_slider!!.datas= intent.getSerializableExtra("estate") as ArrayList<estate>?
        ad_slider?.notifyDataSetChanged()
        Citys= intent.getSerializableExtra("places") as ArrayList<places>?



        if(Login!!)
        {
            imageView4.visibility=View.INVISIBLE
            textView3.visibility=View.GONE
            textView4.visibility=View.GONE
            imageView5.visibility=View.GONE
            imageView6.visibility=View.GONE
            textView5.visibility=View.GONE
            imageView5.visibility=View.GONE
        }else{
            imageView7.visibility=View.GONE
            textView6.visibility=View.GONE
            imageView8.visibility=View.GONE
            textView7.visibility=View.GONE
        }
    }


    private fun Clicks() {







        textView4.setOnClickListener {
            var vv= Intent(this, MultyActivity::class.java)
            vv.putExtra("Type", "Frag_User_Singin")
            startActivity(vv)
        }

        textView73_qq.setOnClickListener {
            DialLoad()
            Data()
        }



        textView3.setOnClickListener {
            var vv= Intent(this, MultyActivity::class.java)
            vv.putExtra("Type", "Frag_User_Login")
            startActivity(vv)
        }
        textView44.setOnClickListener {
            var vv= Intent(this, MultyActivity::class.java)
            vv.putExtra("Type", "Potanseel")
            startActivity(vv)
        }
        textView5.setOnClickListener {
            var vv= Intent(this, MultyActivity::class.java)
            vv.putExtra("Type", "Admin_Singin")
            startActivity(vv)
        }
        textView6.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        textView64.setOnClickListener {
            if(textView.tag.equals("L"))
            {
                Flag_Type_Selectd=2
                Transaction="4"
                val colorFrom = Color.parseColor("#03A3C5")
                val colorTo = resources.getColor(R.color.white)
                val colorAnimation = ValueAnimator.ofObject(ArgbEvaluator(), colorFrom, colorTo)
                colorAnimation.duration = 350 // milliseconds
                colorAnimation.addUpdateListener { animator ->
                    textView64.setTextColor(animator.animatedValue as Int) }
                colorAnimation.start()
                val colorFrom_2 =Color.parseColor("#FFFFFF")
                val colorTo_2 = Color.parseColor("#03A3C5")
                val colorAnimation_2 = ValueAnimator.ofObject(
                    ArgbEvaluator(),
                    colorFrom_2,
                    colorTo_2
                )
                colorAnimation_2.duration = 350 // milliseconds
                colorAnimation_2.addUpdateListener { animator ->
                    textView66.setTextColor(animator.animatedValue as Int) }
                colorAnimation_2.start()
                val valueAnimator = ValueAnimator.ofFloat(0.5f, 1f)
                valueAnimator.duration = 300
                valueAnimator.addUpdateListener { valueAnimator ->
                    val lp = guideline11.layoutParams as ConstraintLayout.LayoutParams
                    val lp_2 = guideline14.layoutParams as ConstraintLayout.LayoutParams
                    // get the float value
                    lp.guidePercent = valueAnimator.animatedValue as Float
                    lp.guidePercent = valueAnimator.animatedValue as Float
                    // update layout params
                    guideline11.layoutParams = lp
                }
                valueAnimator.start()
                val valueAnimator_2 = ValueAnimator.ofFloat(0f, 0.5f)
                valueAnimator_2.duration = 300
                valueAnimator_2.addUpdateListener { valueAnimator ->
                    val lp_2 = guideline14.layoutParams as ConstraintLayout.LayoutParams
                    // get the float value
                    lp_2.guidePercent = valueAnimator.animatedValue as Float
                    // update layout params
                    guideline14.layoutParams = lp_2
                }
                valueAnimator_2.start()
                textView.tag="R"
            }
        }
        textView66.setOnClickListener {

            if (textView.tag.equals("R"))
            {
                Transaction="3"
                Flag_Type_Selectd=1
                val colorFrom =Color.parseColor("#03A3C5")
                val colorTo = resources.getColor(R.color.white)
                val colorAnimation = ValueAnimator.ofObject(ArgbEvaluator(), colorFrom, colorTo)
                colorAnimation.duration = 350 // milliseconds
                colorAnimation.addUpdateListener { animator ->
                    textView66.setTextColor(animator.animatedValue as Int) }
                colorAnimation.start()
                val colorFrom_2 =Color.parseColor("#FFFFFF")
                val colorTo_2 = Color.parseColor("#03A3C5")
                val colorAnimation_2 = ValueAnimator.ofObject(
                    ArgbEvaluator(),
                    colorFrom_2,
                    colorTo_2
                )
                colorAnimation_2.duration = 350 // milliseconds
                colorAnimation_2.addUpdateListener { animator ->
                    textView64.setTextColor(animator.animatedValue as Int) }
                colorAnimation_2.start()
                val valueAnimator = ValueAnimator.ofFloat(1f, 0.5f)
                valueAnimator.duration = 300
                valueAnimator.addUpdateListener { valueAnimator ->
                    val lp = guideline11.layoutParams as ConstraintLayout.LayoutParams
                    val lp_2 = guideline14.layoutParams as ConstraintLayout.LayoutParams
                    // get the float value
                    lp.guidePercent = valueAnimator.animatedValue as Float
                    lp.guidePercent = valueAnimator.animatedValue as Float
                    // update layout params
                    guideline11.layoutParams = lp
                }
                valueAnimator.start()
                val valueAnimator_2 = ValueAnimator.ofFloat(0.5f, 0f)
                valueAnimator_2.duration = 300
                valueAnimator_2.addUpdateListener { valueAnimator ->
                    val lp_2 = guideline14.layoutParams as ConstraintLayout.LayoutParams
                    // get the float value
                    lp_2.guidePercent = valueAnimator.animatedValue as Float
                    // update layout params
                    guideline14.layoutParams = lp_2
                }
                valueAnimator_2.start()
                textView.tag="L"
            }
        }
        textView7.setOnClickListener {
            Share?.edit()?.putBoolean(Constanc.Login,false)?.apply()
            Share?.edit()?.putString(Constanc.Login_Flag,"")?.apply()
            Share?.edit()?.putString(Constanc.Name_Moshaver,"")?.apply()
            Share?.edit()?.putString(Constanc.Pass_Moshaver,"")?.apply()
            Share?.edit()?.putString(Constanc.Number_Karbar,"")?.apply()
            Share?.edit()?.putString(Constanc.admin_name,"")?.apply()
            Share?.edit()?.putString(Constanc.Admin_id,"")?.apply()
            Share?.edit()?.putString(Constanc.user_id,"")?.apply()
            startActivity(Intent(this,SplashScreen::class.java))
            finish()
        }
        textView68.setOnClickListener {
            var vs= Sub_City()
            var ss=places()
            vs.citys=Citys
            vs.show(supportFragmentManager, "s")
            vs.title_clicl(object :Sub_City.title{
                override fun TITLE(S: String) {
                    textView68.setText(S)
                }

            })
        }
        textView69.setOnClickListener {
            var vs= Type_Melc()
            vs.show(supportFragmentManager, "M")
            vs.title_clicl(object :Sub_City.title{
                override fun TITLE(S: String) {
                    textView69.setText(S)
                }

            })
        }
        imageView56.setOnClickListener {
            var vs= Filter_Box()
            vs.show(supportFragmentManager, "F")
        }
    }

//    private fun SetSlider() {
////        var vx=ArrayList<String>()
////        vx.add(Data.firstImage.toString())
//        ad_slider= adapter_slider_2(supportFragmentManager)
//        imageSlider_2.adapter=ad_slider
//    }
}