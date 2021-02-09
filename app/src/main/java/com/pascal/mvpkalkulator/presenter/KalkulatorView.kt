package com.pascal.mvpkalkulator.presenter

import com.pascal.mvpkalkulator.model.Kalkulator

interface KalkulatorView {

    fun bindView(kal: Kalkulator)
    fun isEmpty()
}