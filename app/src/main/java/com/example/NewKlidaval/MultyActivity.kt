package com.example.NewKlidaval

import android.R.attr
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.NewKlidaval.Frags.*
import com.example.NewKlidaval.Models.estate
import com.example.NewKlidaval.Models.estate_2
import io.github.inflationx.viewpump.ViewPumpContextWrapper


class MultyActivity : BaseActivity() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase!!))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multy)
        var Type=intent.getStringExtra("Type")
        if (Type.equals("A"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Comfirm_1()).commit()
        }





        if (Type.equals("Serach_Resuilt"))
        {
            var ddas=Frag_Search_Resuilt()
            var ssa=Bundle()
            var sssa=intent.getSerializableExtra("data_3") as ArrayList<estate>
            Log.i("dvmksdkmvska", sssa.toString())
            ssa.putSerializable("data_2", sssa)
            ddas.arguments=ssa
            supportFragmentManager.beginTransaction().add(R.id.Cont, ddas).commit()
        }


        if (Type.equals("Edit_Melck"))
        {
            var ddas=Frag_Edit_Melk()
            var ssa=Bundle()
            var sssa=intent.getSerializableExtra("dddaata") as  estate_2
            Log.i("dvmksdkmvska", sssa.toString())
            ssa.putSerializable("datasetta", sssa)
            ddas.arguments=ssa
            supportFragmentManager.beginTransaction().add(R.id.Cont, ddas).commit()
        }





        if (Type.equals("Frag_User_Login"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_User_Login()).commit()
        }

        if (Type.equals("Frag_User_Singin"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_User_Singin()).commit()
        }






        if (Type.equals("Potanseel"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Potanseel()).commit()
        }







        if (Type.equals("list_darkhast"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_List_Darkhastmelk()).commit()
        }

        if (Type.equals("darkhastmelk"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Sabt_Darkhast()).commit()
        }


        if (Type.equals("Sabtemelk"))
        {
            Log.i("acvavv", "AA")

            if (intent.getStringExtra("TypeS").equals("1"))
            {
                supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Sabt_Melk()).commit()
            }else{
                supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Sabt_Melk_User()).commit()
            }

        }

        if (Type.equals("sabtmoshtari"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Sabt_Moshtari()).commit()
        }



        if (Type.equals("Sabtemelk_list"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_List_MyMelk()).commit()
        }


        if (Type.equals("Sabtemelk_ex"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_List_MyMelkEx()).commit()
        }




        if (Type.equals("Admin_Singin"))
        {
            Log.i("acvavv", "AA")
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Admin_Login()).commit()
        }
        if (Type.equals("B"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Comfirm_2()).commit()
        }
        if (Type.equals("C"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Comfirm_3()).commit()
        }

        if (Type.equals("WW"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Address()).commit()
        }

        if (Type.equals("Zir"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_ZirMagmoe()).commit()
        }

        if (Type.equals("Wallet"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Wallet()).commit()
        }


        if (Type.equals("P_Gari"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_P_Gari()).commit()
        }



        if (Type.equals("P_GHABELL"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_P_Ghabell()).commit()
        }


        if (Type.equals("PADASH"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Padash()).commit()
        }



        if (Type.equals("SANDOGH"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Sandogh()).commit()
        }


        if (Type.equals("Shop_His"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_Shop_History()).commit()
        }


        if (Type.equals("List_Fav"))
        {
            supportFragmentManager.beginTransaction().add(R.id.Cont, Frag_List_Fav()).commit()
        }






















    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        for (fragment in supportFragmentManager.fragments) {
            fragment.onActivityResult(requestCode, resultCode, data)
        }
    }
}