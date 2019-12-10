package com.jagungin.kotlin_mvp.v2

import com.jagungin.kotlin_mvp.v2.base.BasePresenter
import com.jagungin.kotlin_mvp.v2.model.HasilModel

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */

class MainPresenter : BasePresenter<MainView> {

    //deklarasi
    var modelView: MainView? = null

    //secondary constructor
    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    //buat function sendiri
    fun hitung(satu: Double, dua: Double) {

        //kondisional
        if (!satu.isNaN() && !dua.isNaN()) {
            val hasil = satu * dua
            val model = HasilModel(hasil)

            //masukkan ke view
            modelView?.success(model)
        } else {
            //response ke view jika string kosong
            modelView?.error()
        }
    }

    override fun onAttach(view: MainView) {
        modelView = view
    }

    override fun onDettach() {
        modelView = null
    }

}