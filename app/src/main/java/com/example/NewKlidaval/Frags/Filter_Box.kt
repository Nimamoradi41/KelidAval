package com.example.NewKlidaval.Frags
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.NewKlidaval.*
import com.example.NewKlidaval.Adapters.adapter_P_Gari_2
import com.example.NewKlidaval.Models.Model_Respons
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custome_filter.*
import kotlinx.android.synthetic.main.custome_filter.view.*
import kotlinx.android.synthetic.main.custome_sort.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class Filter_Box :BottomSheetDialogFragment() {
    var ad_adapter: adapter_P_Gari_2? = null
    var Count_Bed_From = 1
    var Count_Bed_To = 5
    var asansur = ""
    var parking = ""
    var Dialog_load: Dialog? = null
    var takvahed = ""
    var pishKharid = ""
    var bedMin = ""
    var bedMax = ""
    var priceMin = ""
    var priceMax = ""
    var mortgageMin = ""
    var mortgageMax = ""
    var rentMin = ""
    var areaMin = ""
    var areaMax = ""
    var rentMax = ""
    var yearMin = ""
    var yearMax = ""
    var text = ""
    var V: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun Clear()
    {
          asansur = ""
          parking = ""

          takvahed = ""
          pishKharid = ""
          bedMin = ""
          bedMax = ""
          priceMin = ""
          priceMax = ""
          mortgageMin = ""
          mortgageMax = ""
          rentMin = ""
          areaMin = ""
          areaMax = ""
          rentMax = ""
          yearMin = ""
          yearMax = ""
          text = ""
    }
    fun Rent() {
        V?.textView78?.visibility = View.GONE
        V?.textView147?.visibility = View.GONE
        V?.textView79?.visibility = View.GONE
        V?.range_slider2?.visibility = View.GONE
        V?.range_slider7?.visibility = View.GONE
        Clear()

//        V?.textView82?.visibility=View.VISIBLE
//        V?.textView83?.visibility=View.VISIBLE
//        V?.range_slider4?.visibility=View.VISIBLE
    }

    fun Sold() {
        V?.textView82?.visibility = View.GONE
        V?.range_slider9?.visibility = View.GONE
        V?.textView148?.visibility = View.GONE
        V?.textView149?.visibility = View.GONE
        V?.textView83?.visibility = View.GONE
        V?.range_slider4?.visibility = View.GONE
        V?.range_slider8?.visibility = View.GONE
        V?.textView84?.visibility = View.GONE
        V?.textView85?.visibility = View.GONE
        V?.range_slider5?.visibility = View.GONE
        Clear()
    }

    public fun Dial_Close() {
        if (Dialog_load != null) {
            Dialog_load?.dismiss()
        }
    }
    fun DialLoad() {
        Dialog_load = Dialog(requireActivity())
        Dialog_load?.setCancelable(false)
        val inflater = LayoutInflater.from(requireActivity())
        val view: View = inflater.inflate(R.layout.layout_loading, null, false)
        Dialog_load?.setContentView(view)
        Dialog_load?.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        Dialog_load?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        Dialog_load?.show()


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var View = View.inflate(context, R.layout.custome_filter, null)
        var vvs = ArrayList<Float>()

        V = View
        vvs.add(1f)
        vvs.add(5f)




        if (MainActivity.Flag_Type_Selectd == 1) {
            Rent()

        } else {
            Sold()
            vvs.clear()














            vvs.clear()
            vvs.add(500000000f)
            vvs.add(3800000000f)





            vvs.clear()
            vvs.add(0f)
            vvs.add(10000000f)



            vvs.clear()
            vvs.add(30000000f)
            vvs.add(1400000000f)

            View.range_slider7.textLocale=  Locale.ENGLISH

            return View
        }





      return View


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
    fun ArabicToEnglish(str: String):String {
        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '۰' -> en = '0'
                '۱' -> en = '1'
                '۲' -> en = '2'
                '۳' -> en = '3'
                '۴' -> en = '4'
                '۵' -> en = '5'
                '۶' -> en = '6'
                '۷' -> en = '7'
                '۸' -> en = '8'
                '۹' -> en = '9'
            }
            result = "${result}$en"
        }
        return result
    }
    fun Filter() {

        for (i  in mortgageMin)
        {

        }


        DialLoad()
        var req = App_Start.getApi()?.search(
            MainActivity.Transaction,
            MainActivity.Aria,
            MainActivity.Type,
           asansur,
            Conv(parking),
            Conv(takvahed),
            Conv(pishKharid),
            Conv(bedMin),
            Conv(bedMax),
            Conv(priceMin),
            Conv(priceMax),
            Conv(mortgageMin),
            Conv(mortgageMax),
            Conv(rentMin),
            Conv(rentMax),
            Conv(yearMin),
            Conv(yearMax),
            Conv(areaMin),
            Conv(areaMax),
            text
        )
        Log.i("dvsmovoamvaww", "MainActivity.Transaction" + MainActivity.Transaction)
        Log.i("dvsmovoamvaww", "MainActivity.Aria" + MainActivity.Aria)
        Log.i("dvsmovoamvaww", "MainActivity.Type" + MainActivity.Type)
        Log.i("dvsmovoamvaww", "asansur" + asansur)
        Log.i("dvsmovoamvaww", "parking" + parking)
        Log.i("dvsmovoamvaww", "takvahed" + takvahed)
        Log.i("dvsmovoamvaww", "pishKharid" + pishKharid)
        Log.i("dvsmovoamvaww", "bedMin" + bedMin)
        Log.i("dvsmovoamvaww", "bedMax" + bedMax)
        Log.i("dvsmovoamvaww", "priceMax" + priceMax)
        Log.i("dvsmovoamvaww", "priceMin" + priceMin)
        Log.i("dvsmovoamvaww", "mortgageMin" + mortgageMin)
        Log.i("dvsmovoamvaww", "mortgageMax" + mortgageMax)
        Log.i("dvsmovoamvaww", "rentMin" + rentMin)
        Log.i("dvsmovoamvaww", "rentMax" + rentMax)
        Log.i("dvsmovoamvaww", "yearMin" + yearMin)
        Log.i("dvsmovoamvaww", "yearMax" + yearMax)
        Log.i("dvsmovoamvaww", "text" + text)



        req?.enqueue(object : Callback<Model_Respons> {
            override fun onResponse(call: Call<Model_Respons>, response: Response<Model_Respons>) {
                Dial_Close()
                Log.i("svmbsmlsgvsa", "A")
                Log.i("svmbsmlsgvsa", response.body()?.estate.toString())
                if (response.body()?.estate?.size != 0) {
                    var body = response.body()?.estate
                    var ss = Intent(requireActivity(), MultyActivity::class.java)
                    ss.putExtra("data_3", body)
                    ss.putExtra("Type", "Serach_Resuilt")
                    requireActivity().startActivity(ss)
                } else {
                    Toast.makeText(context, "ملکی با این مشخصات یافت نشد", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<Model_Respons>, t: Throwable) {
                Dial_Close()
                Log.i("svmbsmlsgvsa", "B")
                com.google.android.material.snackbar.Snackbar.make(
                    V?.close!!,
                    "اتصال خود را به اینترنت چک کنید",
                    com.google.android.material.snackbar.Snackbar.LENGTH_LONG
                ).show()
                Log.i("lmsvkndgas", t.message.toString())
            }

        })
        req?.request()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.textView73.setOnClickListener {
            view.range_slider7.textLocale=Locale.ENGLISH
            // کد
          if (!view.textz.text.isNullOrEmpty())
          {
              text= view.textz.text.toString()
          }else{
              text=""
          }



            // تعداد اتاق خواب
            if (!view.range_slider.text.isNullOrEmpty())
            {
                bedMin= view.range_slider.text.toString()
            }else{
                bedMin=""
            }



            // تعداد اتاق خواب
            if (!view.range_slider6.text.isNullOrEmpty())
            {
                bedMax= view.range_slider6.text.toString()
            }else{
                bedMax=""
            }




            if (!view.range_slider2.text.isNullOrEmpty())
            {
                if (view.range_slider2.text.toString().contains("٬"))
                {
                    priceMin= view.range_slider2.text.toString().replace("٬", "")
                }else{
                    priceMin= view.range_slider2.text.toString()
                }

                Log.i("svadvsbnsa", priceMin)
            }else{
                priceMin=""
            }



            if (!view.range_slider7.text.isNullOrEmpty())
            {
                if ( view.range_slider7.text.toString().contains("٬"))
                {
                    priceMax= view.range_slider7.text.toString().replace("٬", "")
                    Log.i("svadvsbnsa", "A")
                }else{
                    priceMax= view.range_slider7.text.toString()
                    Log.i("svadvsbnsa", "B")
                }

                Log.i("svadvsbnsa", priceMax)
            }else{
                priceMax=""
            }


            if (!view.range_slider4.text.isNullOrEmpty())
            {

                if (view.range_slider4.text.toString().contains("٬"))
                {
                    rentMin= view.range_slider4.text.toString().replace("٬", "")
                }else{
                    rentMin= view.range_slider4.text.toString()
                }

            }else{
                rentMin=""
            }



            if (!view.range_slider8.text.isNullOrEmpty())
            {
                if (view.range_slider8.text.toString().contains("٬"))
                {
                    rentMax= view.range_slider8.text.toString().replace("٬", "")
                }else{
                    rentMax= view.range_slider8.text.toString()
                }

            }else{
                rentMax=""
            }







            if (!view.range_slider5.text.isNullOrEmpty())
            {
                if (view.range_slider5.text.toString().contains("٬"))
                {
                    mortgageMin= view.range_slider5.text.toString().replace("٬", "")
                }else{
                    mortgageMin= view.range_slider5.text.toString()
                }

            }else{
                mortgageMin=""
            }



            if (!view.range_slider9.text.isNullOrEmpty())
            {
                if (view.range_slider9.text.toString().contains("٬"))
                {
                    mortgageMax= view.range_slider9.text.toString().replace("٬", "")
                }else{
                    mortgageMax= view.range_slider9.text.toString()
                }

            }else{
                mortgageMax=""
            }

            if (!view.range_slider11.text.isNullOrEmpty())
            {
                yearMin= view.range_slider11.text.toString()
            }else{
                yearMin=""
            }

            if (!view.range_slider12.text.isNullOrEmpty())
            {
                yearMax= view.range_slider12.text.toString()
            }else{
                yearMax=""
            }




            if (!view.range_slider3.text.isNullOrEmpty())
            {
                areaMin= view.range_slider3.text.toString()
            }else{
                areaMin=""
            }



            if (!view.range_slider10.text.isNullOrEmpty())
            {
                areaMax= view.range_slider10.text.toString()
            }else{
                areaMax=""
            }



//            if (!view.range_slider3.text.isNullOrEmpty())
//            {
//                = view.range_slider3.text.toString()
//            }else{
//                mortgageMax=""
//            }
//
//
//
//            if (!view.range_slider9.text.isNullOrEmpty())
//            {
//                mortgageMax= view.range_slider9.text.toString()
//            }else{
//                mortgageMax=""
//            }










            if (view.checkBox.isChecked)
            {
                Log.i("svkkkvxxvv", "1")
                asansur="1"
            }else{
                Log.i("svkkkvxxvv", "0")
                asansur=""
            }

            if (view.checkBox2.isChecked)
            {
                parking="1"
            }else{
                parking=""
            }


            if (view.checkBox3.isChecked)
            {
                takvahed="1"
            }else{
                takvahed=""
            }


            if (view.checkBox4.isChecked)
            {
                pishKharid="1"
            }else{
                takvahed=""
            }


            Filter()



        }


    }
}