package com.pascal.mvpkalkulator.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pascal.mvpkalkulator.R
import com.pascal.mvpkalkulator.model.Kalkulator
import com.pascal.mvpkalkulator.presenter.KalkulatorPresenter
import com.pascal.mvpkalkulator.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_detik.*

class DetikActivity : AppCompatActivity(), KalkulatorView {

    private var presenter: KalkulatorPresenter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detik)
        supportActionBar?.title = "Konversi Detik"

        presenter = KalkulatorPresenter(this)

        initView()
    }

    private fun initView() {
        btn_detik.setOnClickListener {
            val detik = edt_detik1.text.toString()

            presenter?.hitungDetik(detik)
        }
    }

    override fun bindView(kal: Kalkulator) {
        val waktu: Int = kal.total!!.toInt()

        val sisajam = waktu % 3600
        val bagijam = waktu - sisajam
        val jam = bagijam / 3600
        val waktumenit = waktu - jam * 3600
        val sisamenit = waktumenit % 60
        val minutes = (waktumenit - sisamenit) / 60

        hasil_detik.setText("$jam Jam, $minutes Menit, $sisamenit Detik")
    }

    override fun isEmpty() {
        Toast.makeText(this, "Detik tidak boleh kosong", Toast.LENGTH_SHORT).show()
    }
}