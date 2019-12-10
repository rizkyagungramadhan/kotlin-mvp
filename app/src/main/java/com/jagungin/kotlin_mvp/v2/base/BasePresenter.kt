package com.jagungin.kotlin_mvp.v2.base

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */
interface BasePresenter<in T: BaseView> {
    //T sebagai variable generator saja, bebas mau N atau A sebenarnya

    //onAttach untuk memindahkan data ke model ataupun ke view
    fun onAttach(view: T)
    //onDettach dijalankan ketika onAttach telah selesai
    fun onDettach()
}