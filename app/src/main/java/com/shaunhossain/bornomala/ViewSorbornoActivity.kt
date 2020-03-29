package com.shaunhossain.bornomala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_sorborno.*

class ViewSorbornoActivity : AppCompatActivity() {
    private val customAdapter = CustomAdapter(
       listOf(
           Model(R.drawable.b_1,
                 R.drawable.b_r_1,
                 "অজগর"),
           Model(R.drawable.b_2,
               R.drawable.b_r_2,
               "আম"),
           Model(R.drawable.b_3,
               R.drawable.b_r_3,
               "ইঁদুর"),
           Model(R.drawable.b_4,
               R.drawable.b_r_4,
               "ঈগল"),
           Model(R.drawable.b_5,
               R.drawable.b_r_5,
               "উট"),
           Model(R.drawable.b_6,
               R.drawable.b_r_6,
               "ঊষা"),
           Model(R.drawable.b_7,
               R.drawable.b_r_7,
               "ঋষি"),
           Model(R.drawable.b_8,
               R.drawable.b_r_8,
               "একতারা"),
           Model(R.drawable.b_9,
               R.drawable.b_r_9,
               "ঐরাবত"),
           Model(R.drawable.b_10,
               R.drawable.b_r_10,
               "ওলকচু"),
           Model(R.drawable.b_11,
               R.drawable.b_r_11,
               "ঔষধ")
       )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_sorborno)
        view_pager_sorborno.adapter = customAdapter
    }
}
