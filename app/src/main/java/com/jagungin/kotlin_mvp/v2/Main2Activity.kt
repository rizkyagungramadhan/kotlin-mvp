package com.jagungin.kotlin_mvp.v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jagungin.kotlin_mvp.R
import com.jagungin.kotlin_mvp.v2.model.HasilModel
import kotlinx.android.synthetic.main.activity_main2.*

//inherit ke MainView
class Main2Activity : AppCompatActivity(), MainView {


    //deklarasi
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //inisialisasi
        presenter = MainPresenter(this)

        //aksi button
        submitHitung.setOnClickListener {
            if (!input1.text.isNullOrEmpty() && !input2.text.isNullOrEmpty())
                presenter.hitung(
                    (input1.text.toString().toInt()).toDouble(),
                    (input2.text.toString().toInt()).toDouble()
                )
            else {
                toast("kosong coeg")
            }
        }
    }

    override fun success(hasil: HasilModel) {
        toast(hasil.hasils.toString())
    }

    override fun error() {
        toast("Masukkan angka pada kedua inputan diatas")
    }

    override fun onAttachView() {
        presenter.onAttach(this)
    }

    override fun onDetachView() {
        onDetachView()
    }

    fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}
