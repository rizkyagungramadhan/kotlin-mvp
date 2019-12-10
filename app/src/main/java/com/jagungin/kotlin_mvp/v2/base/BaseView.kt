package com.jagungin.kotlin_mvp.v2.base

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */

interface BaseView {
    //memindahkan proses dari model ke view
    fun onAttachView()
    fun onDetachView()

}
