package ru.mrkotik.kalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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

    private var res_view: TextView? = null
    private var hyst_view: TextView? = null

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

        res_view = findViewById(R.id.res_view)
        hyst_view = findViewById(R.id.hystory_view)


    }
}