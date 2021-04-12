    package com.fati.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var first : Int?=null
    var second : Int?=null
    var result: Int?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view: View){

        first= input1.text.toString().toIntOrNull()
        second= input2.text.toString().toIntOrNull()

        if(first == null || second == null){
            resultText.text="Girilen Değerleri Kontrol Ediniz!"
        }else {

            result = first!! + second!!
            resultText.text = "Result: ${result}"
        }
    }

    fun mySub(view: View){

        first= input1.text.toString().toIntOrNull()
        second= input2.text.toString().toIntOrNull()

        if(first == null || second == null){
            resultText.text="Girilen Değerleri Kontrol Ediniz!"
        }else {

            result = first!! - second!!
            resultText.text = "Result: ${result}"
        }
    }

    fun myMultiply(view: View){



        first= input1.text.toString().toIntOrNull()
        second= input2.text.toString().toIntOrNull()

        if(first == null || second == null){
            resultText.text="Girilen Değerleri Kontrol Ediniz!"
        }else {

            result = first!! * second!!
            resultText.text = "Result: ${result}"
        }
            }

    fun myDiv(view: View){


        first= input1.text.toString().toIntOrNull()
        second= input2.text.toString().toIntOrNull()

        if(first == null || second == null){
            resultText.text="Girilen Değerleri Kontrol Ediniz!"
        }else {

            result = first!! / second!!

            resultText.text = "Result: ${result}"
        }
    }
}