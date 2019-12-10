package com.jagungin.kotlin_mvp.v1

import com.jagungin.kotlin_mvp.v1.model.ModelMVP

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */
interface View {
    //membawa data dari presenter ke activity
    fun berhasil(hasil: ModelMVP)
    fun error()
}