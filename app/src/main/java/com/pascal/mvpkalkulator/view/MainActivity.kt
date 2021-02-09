package com.pascal.mvpkalkulator.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.pascal.mvpkalkulator.R
import com.pascal.mvpkalkulator.model.Kalkulator
import com.pascal.mvpkalkulator.presenter.KalkulatorPresenter
import com.pascal.mvpkalkulator.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }, 2000)
    }
}