package com.google.homework_one_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils.copy
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.nio.file.Files.copy
import java.time.chrono.HijrahChronology.INSTANCE
import java.util.Collections.copy

class MainActivity : AppCompatActivity(), View.OnClickListener {
    object Repository

    lateinit var button : Button
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.click_one)
        button.setOnClickListener(this)
        button = findViewById(R.id.click_two)
        button.setOnClickListener(this)

        textView = findViewById(R.id.textView)


        fun Concole(){
            for(i in 1..9){
                for(j in 1..9){
                    print("${i * j} \t")
                }
                println()
            }
        }
    }

    data class MyData(
        val count: Int,
        val peanuts: Int?,
        val name: String


    )

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.click_one->{
                val second = MyData(1, null, "Monkey")
                textView.setText("" + second)
            }
        }
        when(v?.id){
            R.id.click_two->{
                val data = MyData(1, null, "Monkey")
                val copy = data.copy(peanuts = 100, name = "Elephant")
                textView.setText("" + copy)

            }
        }
    }




}