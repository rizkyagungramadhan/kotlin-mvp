package com.jagungin.kotlin_mvp.v1

import com.jagungin.kotlin_mvp.v1.model.ModelMVP

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */
class PresenterImp(model: View) : Presenter {


    var viewModel: View? = null

    init {
        viewModel = model
    }

    //override function di interface Presenter class
    override fun tambahData(msg: String) {
        //cek inputan
        if(msg.isNotEmpty()){
            var model = ModelMVP(msg)

            //tambahkan ke view
            viewModel?.berhasil(model)

        } else{
            //jika data inputan kosong
            viewModel?.error()
        }

    }

}