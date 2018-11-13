package com.example.cleme.mspr_esport.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var textEdit = "";
    var text3 = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()

        textEdit = findViewById<TextView>(R.id.textView2).toString()
        text3 = findViewById<TextView>(R.id.textView3).toString()
    }


    fun main() {
        //print("sum of 5 and 15 is ")
        //println(sum(5, 15))
        textEdit= "sum of 5 and 15 is "
        text3 = sum(5, 15).toString()
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
