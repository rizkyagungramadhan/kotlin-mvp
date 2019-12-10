package com.jagungin.kotlin_mvp.v2

import com.jagungin.kotlin_mvp.v2.base.BaseView
import com.jagungin.kotlin_mvp.v2.model.HasilModel

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 10/12/2019.
 */
interface MainView: BaseView {
    fun success(hasil: HasilModel)
    fun error()
}