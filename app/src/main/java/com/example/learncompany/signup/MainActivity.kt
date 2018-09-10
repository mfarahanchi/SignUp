package com.example.learncompany.signup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val snack = Snackbar.make(it, editText.text.toString() + editText2.text + editText3.text, Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}
