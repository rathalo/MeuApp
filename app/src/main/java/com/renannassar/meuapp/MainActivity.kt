package com.renannassar.meuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.renannassar.minhabiblioteca.demo.Calculadora
import com.renannassar.minhabiblioteca.toast.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customToast = CustomToast(this,layoutInflater)


        if(BuildConfig.REPORT_CRASH){
            customToast.showToast("Crash ligado")
        }else{
            customToast.showToast("Crash desligado")
        }






        /*
        val calculadora = Calculadora()
        calculadora.somar(1,2)
        */
    }
}
