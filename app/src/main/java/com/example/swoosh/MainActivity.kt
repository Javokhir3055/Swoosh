package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GetStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
