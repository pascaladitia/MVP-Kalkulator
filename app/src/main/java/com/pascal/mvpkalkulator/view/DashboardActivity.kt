package com.pascal.mvpkalkulator.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pascal.mvpkalkulator.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()

        dashboard_pangkat.setOnClickListener(this)
        dashboard_detik.setOnClickListener(this)
        dashboard_faktor.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.dashboard_pangkat -> {
                startActivity(Intent(this, PangkatActivity::class.java))
            }
            R.id.dashboard_detik -> {
                startActivity(Intent(this, DetikActivity::class.java))
            }
            R.id.dashboard_faktor -> {
                startActivity(Intent(this, FaktorActivity::class.java))
            }
        }
    }
}