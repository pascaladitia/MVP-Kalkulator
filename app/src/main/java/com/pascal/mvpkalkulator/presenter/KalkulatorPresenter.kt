package com.pascal.mvpkalkulator.presenter

import com.pascal.mvpkalkulator.model.Kalkulator

class KalkulatorPresenter(val kkView: KalkulatorView) {

    fun hitungPangkat(angka1: String, angka2: String) {
        if (angka1.isNotEmpty() && angka2.isNotEmpty()) {
            val nilaiA = angka1.toDouble()
            val nilaiB = angka2.toDouble()

            val total = Math.pow(nilaiA, nilaiB)

            val kalkulator = Kalkulator()
            kalkulator.total = total

            kkView.bindView(kalkulator)
        } else {
            kkView.isEmpty()
        }
    }

    fun hitungDetik(angka1: String) {
        if (angka1.isNotEmpty()) {
            val nilaiA = angka1.toDouble()

            val total = nilaiA

            val kalkulator = Kalkulator()
            kalkulator.total = total

            kkView.bindView(kalkulator)
        } else {
            kkView.isEmpty()
        }
    }

    fun hitungFaktor(angka1: String) {
        if (angka1.isNotEmpty()) {
            val nilaiA = angka1.toInt()

            var total = (1..nilaiA).reduce(Int::times)

            val kalkulator = Kalkulator()
            kalkulator.total = total.toDouble()

            kkView.bindView(kalkulator)
        } else {
            kkView.isEmpty()
        }
    }
}