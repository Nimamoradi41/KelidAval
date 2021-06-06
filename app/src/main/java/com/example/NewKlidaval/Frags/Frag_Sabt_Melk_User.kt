package com.example.NewKlidaval.Frags

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.NewKlidaval.*
import com.example.NewKlidaval.Models.Model_Respons
import com.example.NewKlidaval.Models.Model_Respons_Addmelc
import com.example.NewKlidaval.Models.Res_Arias
import com.example.NewKlidaval.Models.places_2
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.*
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Frag_Sabt_Melk_User : BaseFRAGMENT() {
 var V_2:View ?=null

 var transaction="4"
 var type="1"
 var aria="15"
 var name=""
 var mobile=""

 var asli=""
 var address=""
 var num=""
 var kafArea=""
 var balkonArea=""
 var area=""
 var year=""
 var bedroom=""
 var unit=""
 var unitFloor=""
 var floor=""
 var mortgage=""
 var rent=""
 var price=""
 var detail=""
 var detailUser=""
 var position=""
 var asansur=""
 var parking=""
 var data3_takvahe=""
 var data4_anbari=""
 var data5_takhliye=""
 var data6_kelidaval=""
 var data7_hayat=""
 var data8_abgarmkon=""
 var data9_hood=""
 var data10_gazsafheee=""
 var data11_komoddevari=""
 var data12_pompab=""
 var data13_darbzedserghat=""
 var pool_pakage=""
 var garden_teras=""
 var special_melkmige=""
 var data15_pishkharid=""
 var data16_moaveze=""
 var data16_show=""
 var admin_id_2=""
 var Arias:ArrayList<places_2> ?=null
    fun getAria()
    {
        DialLoad()
        var req= App_Start.getApi()?.getArias()
        req?.enqueue(object : Callback<Res_Arias> {
            override fun onResponse(call: Call<Res_Arias>, response: Response<Res_Arias>) {
                Dial_Close()
                if (response.isSuccessful)
                {
                    if (response.body()?.places!=null)
                    {
                        Arias=response.body()?.places;
                        var data=ArrayList<String>()
                        response.body()?.places?.forEach {
                            data.add(it.area_name.toString())
                        }
                        V_2?.spinner_mojri_3?.setItems(data)
                        aria=Arias?.get(0)?.area_id.toString();
                    }else{
                        Toast.makeText(context,"مشکلی در ارتباط با سرور به وجود امده",Toast.LENGTH_SHORT).show()
                        activity?.finish()
                    }
                }else{
                    Toast.makeText(context,"مشکلی در ارتباط با سرور به وجود امده",Toast.LENGTH_SHORT).show()
                    activity?.finish()
                }


//                if (response.body()?.estate?.size!=0)
//                {
//                    var body=response.body()?.estate
//                    ad_slider?.datas=body
//                    ad_slider?.notifyDataSetChanged()
//                }
            }
            override fun onFailure(call: Call<Res_Arias>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(V_2?.baseroot!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas",t.message.toString())
            }

        })
        req?.request()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var V= inflater.inflate(R.layout.fragment_frag__sabt__melk_2, container, false)
//        val items = listOf("رهن اجاره", "خرید فروش")
//        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
//        V.ddvsa?.setAdapter(adapter)
        V_2=V
        Arias=ArrayList<places_2>()
        Log.i("AvaknvknAFsfwww", admin_id.toString())
        initSpinner();
        getAria()
        V_2?.spinner_mojri?.setOnItemSelectedListener { view, position, id, item ->
        if (position==0)
        {
            transaction="4"
            V.box_mortgage.isEnabled=false
            V.box_rent.isEnabled=false
            V.box_price.isEnabled=true
        }else{
            transaction="3"
            V.box_price.isEnabled=false
            V.box_mortgage.isEnabled=true
            V.box_rent.isEnabled=true
        }

        }
        V_2?.spinner_mojri_2?.setOnItemSelectedListener { view, position, id, item ->
             type= (position+1).toString()

        }
        V_2?.spinner_mojri_3?.setOnItemSelectedListener { view, position, id, item ->
            aria= Arias?.get(position)?.area_id.toString()

        }


        V.checkBox61.setOnCheckedChangeListener { compoundButton, b ->
            if (b)
            {
                V.checkBox81.isChecked=false
                position="1"

            }
        }
        V.checkBox81.setOnCheckedChangeListener { compoundButton, b ->
            if (b)
            {
                V.checkBox61.isChecked=false
                position="0"
            }
        }

        V.textView7323.setOnClickListener {
            name=V.edt_name.text.toString()
            mobile=V.edt_mobile.text.toString()
//            renterMobile=V.edt_renterMobile.text.toString(
            asli=V.edt_asli.text.toString()
            address=V.edt_address.text.toString()
            bedroom=V.edt_bedroom.text.toString()
            kafArea=V.edt_kafArea.text.toString()
            balkonArea=V.edt_balkonArea.text.toString()
            area=V.edt_area.text.toString()
            year=V.edt_year.text.toString()
            unit=V.edt_unit.text.toString()
            unitFloor=V.edt_unitfloor.text.toString()
            floor=V.edt_floor.text.toString()
            mortgage=V.box_mortgage.text.toString()
            rent=V.box_rent.text.toString()
            price=V.box_price.text.toString()
            detail=V.edt_detail.text.toString()
            detailUser=V.edt_Userdetail.text.toString()
            asansur= Conver(V.checkBox6_asansor.isChecked.toString())
            Log.i("amkcamkvkegq",V.checkBox6_asansor.isChecked.toString())
            parking= Conver(V.checkBox7.isChecked.toString())
            data3_takvahe= Conver(V.checkBox8.isChecked.toString())
            data5_takhliye= Conver(V.checkBox10.isChecked.toString())
            data7_hayat= Conver(V.checkBox12.isChecked.toString())
            data9_hood= Conver(V.checkBox14.isChecked.toString())
            data11_komoddevari= Conver(V.checkBox16.isChecked.toString())
            data13_darbzedserghat= Conver(V.checkBox18.isChecked.toString())
            garden_teras= Conver(V.checkBox20.isChecked.toString())
            data15_pishkharid= Conver(V.checkBox22.isChecked.toString())
            special_melkmige=Conver( V.checkBox21.isChecked.toString())
            data4_anbari= Conver(V.checkBox9.isChecked.toString())
            data6_kelidaval=Conver( V.checkBox11.isChecked.toString())
            data8_abgarmkon= Conver(V.checkBox13.isChecked.toString())
            data10_gazsafheee= Conver(V.checkBox15.isChecked.toString())
            data12_pompab=Conver( V.checkBox17.isChecked.toString())
            pool_pakage=Conver( V.checkBox17.isChecked.toString())
            data16_moaveze=Conver( V.checkBox17.isChecked.toString())
            data16_show= Conver(V.checkBox26.isChecked.toString())
        if (area.equals(""))
        {
            Snackbar.make(V?.baseroot!!,"متراژ ملک را مشخص کنید",Snackbar.LENGTH_SHORT).show()
            return@setOnClickListener
        }

            if (year.equals(""))
            {
                Snackbar.make(V?.baseroot!!,"سال ساخت  ملک را مشخص کنید",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (bedroom.equals(""))
            {
                Snackbar.make(V?.baseroot!!," تعداد اتاق  ملک را مشخص کنید",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            if (transaction.equals("4"))
            {
                if (V.box_price.text.equals(""))
                {
                    Snackbar.make(V?.baseroot!!,"قیمت ملک را مشخص کنید",Snackbar.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }   else{
                if (V.box_rent.text.equals("")||V.box_mortgage.text.equals(""))
                {
                    Snackbar.make(V?.baseroot!!,"قیمت رهن واجاره ملک را مشخص کنید",Snackbar.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }







            Add_Melc()

        }


        return  V
    }


    fun  Conver(B:String) :String{
        if (B.equals("true"))
        {
            return "1"
        }else{
            return ""
        }
    }


    fun Add_Melc()
    {


        DialLoad()
        var req= App_Start.getApi()?.Add_Melc_User(transaction,aria,type,name,
        mobile,asli,address,num,kafArea,balkonArea,area,year,bedroom,unit,unitFloor,floor,mortgage,rent,
        price,detail,detailUser,position,asansur,parking,data3_takvahe,data4_anbari,data5_takhliye,data6_kelidaval,data7_hayat,
        data8_abgarmkon,data9_hood,data10_gazsafheee,data11_komoddevari,data12_pompab,data13_darbzedserghat,pool_pakage,garden_teras
                ,special_melkmige,data15_pishkharid,data16_show,user_id)
        req?.enqueue(object : Callback<Model_Respons_Addmelc> {
            override fun onResponse(call: Call<Model_Respons_Addmelc>, response: Response<Model_Respons_Addmelc>) {
                Dial_Close()
                if (response.isSuccessful)
                {
                    if (response.body()?.error==false)
                    {
                        activity?.setResult(Activity.RESULT_OK)
                        Toast.makeText(context,"ملک با موفقیت ثبت شد",Toast.LENGTH_LONG).show()
                        activity?.finish()
                    }
                }


//                if (response.body()?.estate?.size!=0)
//                {
//                    var body=response.body()?.estate
//                    ad_slider?.datas=body
//                    ad_slider?.notifyDataSetChanged()
//                }
            }
            override fun onFailure(call: Call<Model_Respons_Addmelc>, t: Throwable) {
                Dial_Close()
                com.google.android.material.snackbar.Snackbar.
                make(V_2?.baseroot!!,"اتصال خود را به اینترنت چک کنید",com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
                Log.i("lmsvkndgas",t.message.toString())
            }

        })
        req?.request()
    }




    private fun initSpinner() {
        var   provinceList = ArrayList<String>()
        provinceList.add("خرید و فروش")
        provinceList.add("رهن و اجاره")
        V_2?.spinner_mojri?.setItems(provinceList)
        V_2?.box_mortgage?.isEnabled=false
        V_2?.box_rent?.isEnabled=false
        V_2?.box_price?.isEnabled=true
//        provinceList.clear()
        var   provinceList_2 = ArrayList<String>()
        provinceList_2.add("آپارتمان اداری")
        provinceList_2.add("آپارتمان مسکونی")
        provinceList_2.add("پزشکی")
        provinceList_2.add("مغازه")
        provinceList_2.add("ویلایی")
        provinceList_2.add("زمین و مشارکت")
        V_2?.spinner_mojri_2?.setItems(provinceList_2)
//        provinceList.clear()
//        provinceList.add("زیتون کارمندی")
//        provinceList.add("گلستان")
//        provinceList.add("کوی علوی")
//        provinceList.add("امانیه")
//        V_2?.spinner_mojri_3?.setItems(provinceList)
//        spinner.setItems(provinceList);
//        fffff.setItems(provinceList)
    }


}