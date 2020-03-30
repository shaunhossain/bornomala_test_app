package com.shaunhossain.bornomala

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NumberActivity : AppCompatActivity() {

    lateinit var soundZero: MediaPlayer
    lateinit var soundOne: MediaPlayer
    lateinit var soundTwo: MediaPlayer
    lateinit var soundThree: MediaPlayer
    lateinit var soundFour: MediaPlayer
    lateinit var soundFive: MediaPlayer
    lateinit var soundSix: MediaPlayer
    lateinit var soundSeven: MediaPlayer
    lateinit var soundEight: MediaPlayer
    lateinit var soundNine: MediaPlayer


    private var zero: ImageView? = null
    private var one: ImageView? = null
    private var two: ImageView? = null
    private var three: ImageView? = null
    private var four: ImageView? = null
    private var five: ImageView? = null
    private var six: ImageView? = null
    private var seven: ImageView? = null
    private var eight: ImageView? = null
    private var nine: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        zero = findViewById(R.id.zero_view)
        one = findViewById(R.id.one_view)
        two = findViewById(R.id.two_view)
        three = findViewById(R.id.three_view)
        four = findViewById(R.id.four_view)
        five = findViewById(R.id.five_view)
        six = findViewById(R.id.six_view)
        seven = findViewById(R.id.seven_view)
        eight = findViewById(R.id.eight_view)
        nine = findViewById(R.id.nine_view)

        playNumberAudio()
    }

    private fun playNumberAudio() {
        soundZero = MediaPlayer.create(this, R.raw.shunno)
        zero!!.setOnClickListener(View.OnClickListener { soundZero.start() })
        soundOne = MediaPlayer.create(this, R.raw.one)
        one!!.setOnClickListener(View.OnClickListener { soundOne.start() })
        soundTwo = MediaPlayer.create(this, R.raw.two)
        two!!.setOnClickListener(View.OnClickListener { soundTwo.start() })
        soundThree = MediaPlayer.create(this, R.raw.three)
        three!!.setOnClickListener(View.OnClickListener { soundThree.start() })
        soundFour = MediaPlayer.create(this, R.raw.four)
        four!!.setOnClickListener(View.OnClickListener { soundFour.start() })
        soundFive = MediaPlayer.create(this, R.raw.five)
        five!!.setOnClickListener(View.OnClickListener { soundFive.start() })
        soundSix = MediaPlayer.create(this, R.raw.six)
        six!!.setOnClickListener(View.OnClickListener { soundSix.start() })
        soundSeven = MediaPlayer.create(this, R.raw.seven)
        seven!!.setOnClickListener(View.OnClickListener { soundSeven.start() })
        soundEight = MediaPlayer.create(this, R.raw.eight)
        eight!!.setOnClickListener(View.OnClickListener { soundEight.start() })
        soundNine = MediaPlayer.create(this, R.raw.nine)
        nine!!.setOnClickListener(View.OnClickListener { soundNine.start() })
    }
}
