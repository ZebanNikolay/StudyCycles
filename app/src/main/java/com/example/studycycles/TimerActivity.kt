package com.example.studycycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
    }
    companion object {

        fun startActivity(btnStart: FragmentActivity) {
            val intent = Intent(btnStart, TimerActivity::class.java)
            btnStart.startActivity(intent)
        }
    }
}
