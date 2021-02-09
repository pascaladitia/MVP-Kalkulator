package com.pascal.mvpkalkulator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pascal.mvpkalkulator.R
import com.pascal.mvpkalkulator.model.Kalkulator
import com.pascal.mvpkalkulator.presenter.KalkulatorPresenter
import com.pascal.mvpkalkulator.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_faktor.*

class FaktorActivity : AppCompatActivity(), KalkulatorView {

    private var presenter: KalkulatorPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faktor)
        supportActionBar?.title = "Pemfaktoran"

        presenter = KalkulatorPresenter(this)

        initView()
    }

    private fun initView() {
        btn_faktor.setOnClickListener {
            val angka = edt_faktor.text.toString()

            presenter?.hitungFaktor(angka)
        }
    }

    override fun bindView(kal: Kalkulator) {
        hasil_faktor.setText(kal.total.toString())
    }

    override fun isEmpty() {
        Toast.makeText(this, "Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show()
    }
}