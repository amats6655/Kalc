package ru.mrkotik.kalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var b_0: Button? = null
    private var b_1: Button? = null
    private var b_2: Button? = null
    private var b_3: Button? = null
    private var b_4: Button? = null
    private var b_5: Button? = null
    private var b_6: Button? = null
    private var b_7: Button? = null
    private var b_8: Button? = null
    private var b_9: Button? = null
    private var b_dot: Button? = null
    private var b_plus: Button? = null
    private var b_minus: Button? = null
    private var b_div: Button? = null
    private var b_multy: Button? = null
    private var b_equal: Button? = null
    private var b_AC: Button? = null
    private var b_del: Button? = null
    private var b_percent: Button? = null
    private var b_wdtfs: Button? = null

    private var res_view: EditText? = null
    private var hyst_view: EditText? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_0 = findViewById(R.id.b_0)
        b_1 = findViewById(R.id.b_1)
        b_2 = findViewById(R.id.b_2)
        b_3 = findViewById(R.id.b_3)
        b_4 = findViewById(R.id.b_4)
        b_5 = findViewById(R.id.b_5)
        b_6 = findViewById(R.id.b_6)
        b_7 = findViewById(R.id.b_7)
        b_8 = findViewById(R.id.b_8)
        b_9 = findViewById(R.id.b_9)
        b_plus = findViewById(R.id.b_plus)
        b_minus = findViewById(R.id.b_minus)
        b_multy = findViewById(R.id.b_mult)
        b_div = findViewById(R.id.b_div)
        b_equal = findViewById(R.id.b_equals)
        b_dot = findViewById(R.id.b_dot)
        b_AC = findViewById(R.id.b_AC)
        b_del = findViewById(R.id.b_del)
        b_percent = findViewById(R.id.b_percent)
        b_wdtfs = findViewById(R.id.b_wdtfs)

        res_view = findViewById(R.id.res_view)
        hyst_view = findViewById(R.id.hystory_view)

        var operator = ""
        var num1 = 0.0
        var num2 = 0.0
        var res = 0.0
        var tmp = ""

        b_0?.setOnClickListener(){
            tmp += "0"
            if (res_view?.text?.toString() == "") res_view?.setText("0")
            else res_view?.setText(res_view?.text.toString() + "0")
        }
        b_1?.setOnClickListener(){
            tmp += "1"
            if (res_view?.text?.toString() == "") res_view?.setText("1")
            else res_view?.setText(res_view?.text.toString() + "1")
        }
        b_2?.setOnClickListener(){
            tmp += "2"
            if (res_view?.text?.toString() == "") res_view?.setText("2")
            else res_view?.setText(res_view?.text.toString() + "2")
        }
        b_3?.setOnClickListener(){
            tmp += "3"
            if (res_view?.text?.toString() == "") res_view?.setText("3")
            else res_view?.setText(res_view?.text.toString() + "3")
        }
        b_4?.setOnClickListener(){
            tmp += "4"
            if (res_view?.text?.toString() == "") res_view?.setText("4")
            else res_view?.setText(res_view?.text.toString() + "4")
        }
        b_5?.setOnClickListener(){
            tmp += "5"
            if (res_view?.text?.toString() == "") res_view?.setText("5")
            else res_view?.setText(res_view?.text.toString() + "5")
        }
        b_6?.setOnClickListener(){
            tmp += "6"
            if (res_view?.text?.toString() == "") res_view?.setText("6")
            else res_view?.setText(res_view?.text.toString() + "6")
        }
        b_7?.setOnClickListener(){
            tmp += "7"
            if (res_view?.text?.toString() == "") res_view?.setText("7")
            else res_view?.setText(res_view?.text.toString() + "7")
        }
        b_8?.setOnClickListener(){
            tmp += "8"
            if (res_view?.text?.toString() == "") res_view?.setText("8")
            else res_view?.setText(res_view?.text.toString() + "8")
        }
        b_9?.setOnClickListener(){
            tmp += "9"
            if (res_view?.text?.toString() == "") res_view?.setText("9")
            else res_view?.setText(res_view?.text.toString() + "9")
        }

        b_dot?.setOnClickListener(){
            when{
                tmp == "" -> {
                    tmp += "0."
                    res_view?.setText(res_view?.text.toString() + "0.")
                }
                "." !in tmp -> {
                    tmp += "."
                    res_view?.setText(res_view?.text.toString() + ".")
                }
            }
        }

        b_div?.setOnClickListener(){
            if (operator == "") {
                operator = "/"
                if (num1 == 0.0) num1 = tmp.toDouble()
                tmp = ""
                if (res_view?.text?.toString() == "") {
                    res_view?.setText("0/")
                } else {
                    res_view?.setText(res_view?.text.toString() + "/")
                }
            }
        }
        b_plus?.setOnClickListener(){
            if (operator == "") {
                operator = "+"
                if (num1 == 0.0) num1 = tmp.toDouble()
                tmp = ""
                if (res_view?.text?.toString() == "") {
                    res_view?.setText("0+")
                } else {
                    res_view?.setText(res_view?.text.toString() + "+")
                }
            }
        }
        b_minus?.setOnClickListener() {
            if (tmp == ""){
                tmp += "-"
            }
            if (operator == "") {
                operator = "-"
                if (num1 == 0.0) num1 = tmp.toDouble()
                tmp = ""
                if (res_view?.text?.toString() == "") {
                    res_view?.setText("0-")
                } else {
                    res_view?.setText(res_view?.text.toString() + "-")
                }
            }
        }
        b_multy?.setOnClickListener(){
            if (operator == "") {
                operator = "*"
                if (num1 == 0.0) num1 = tmp.toDouble()
                tmp = ""
                if (res_view?.text?.toString() == "") {
                    res_view?.setText("0*")
                } else {
                    res_view?.setText(res_view?.text.toString() + "*")
                }
            }
        }
        b_wdtfs?.setOnClickListener(){
            if (res_view?.text?.toString() == "") res_view?.setText("")
            else res_view?.setText(res_view?.text.toString() + "")
        }
        b_percent?.setOnClickListener(){
            if (res_view?.text?.toString() == "") res_view?.setText("Херушки")
            else res_view?.setText(res_view?.text.toString() + "%")
            operator = "%"
        }


        b_del?.setOnClickListener(){
            res_view?.setText(res_view!!.text?.dropLast(1).toString())
            tmp = tmp.dropLast(1)
        }
        b_AC?.setOnClickListener() {
            res_view?.setText("")
            tmp = ""
            num1 = 0.0
            num2 = 0.0
        }


        b_equal?.setOnClickListener(){
            num2 = tmp.toDouble()
            when (operator) {
                "/" -> res = num1 / num2
                "*" -> res = num1 * num2
                "+" -> res = num1 + num2
                "-" -> res = num1 - num2
            }
            operator = ""
            tmp = ""
            num1 = res
            num2 = 0.0
            res_view?.setText(res.toString())
        }
    }
}