package com.shaunhossain.bornomala

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import android.os.Build

class SoundPlayer {

    private var audioAttributes: AudioAttributes? = null
    val SOUND_POOL_MAX = 2
    private var soundPool: SoundPool? = null
    private var hitSound = 0
    private var overSound = 0


    fun SoundPlayer(context: Context?) {

        // SoundPool is deprecated in API level 21. (Lollipop)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
            soundPool = SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(SOUND_POOL_MAX)
                .build()
        } else {
            //SoundPool (int maxStreams, int streamType, int srcQuality)
            soundPool = SoundPool(SOUND_POOL_MAX, AudioManager.STREAM_MUSIC, 0)
        }
        hitSound = soundPool!!.load(context, R.raw.hit, 1)
        overSound = soundPool!!.load(context, R.raw.over, 1)
    }
    fun playHitSound() {

        // play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)
        soundPool!!.play(hitSound, 1.0f, 1.0f, 1, 0, 1.0f)
    }

    fun playOverSound() {
        soundPool!!.play(overSound, 1.0f, 1.0f, 1, 0, 1.0f)
    }

}