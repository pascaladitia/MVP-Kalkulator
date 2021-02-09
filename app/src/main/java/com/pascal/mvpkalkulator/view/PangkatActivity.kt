package com.pascal.mvpkalkulator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pascal.mvpkalkulator.R
import com.pascal.mvpkalkulator.model.Kalkulator
import com.pascal.mvpkalkulator.presenter.KalkulatorPresenter
import com.pascal.mvpkalkulator.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_pangkat.*

class PangkatActivity : AppCompatActivity(), KalkulatorView {

    private var presenter: KalkulatorPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pangkat)
        supportActionBar?.title = "Hitung Pangkat"

        presenter = KalkulatorPresenter(this)
        initView()
    }

    private fun initView() {

        btn_pangkat.setOnClickListener {
            val pangkat1 = edt_pangkat1.text.toString()
            val pangkat2 = edt_pangkat2.text.toString()

            presenter?.hitungPangkat(pangkat1, pangkat2)
        }
    }

    override fun bindView(kal: Kalkulator) {
        hasil_pangkat.setText(kal.total.toString())
    }

    override fun isEmpty() {

    }
}