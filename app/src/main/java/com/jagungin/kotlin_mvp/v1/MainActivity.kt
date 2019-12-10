package com.jagungin.kotlin_mvp.v1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jagungin.kotlin_mvp.R
import com.jagungin.kotlin_mvp.v1.model.ModelMVP
import com.jagungin.kotlin_mvp.v2.Main2Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View {

    //deklarasi presenter
    lateinit var presenterImp: PresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi presenter
        presenterImp = PresenterImp(this)

        //event onclick
        buttonSubmit.setOnClickListener {
            presenterImp.tambahData(inputText.text.toString())
        }
        v2.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }

    override fun berhasil(hasil: ModelMVP) {
        Toast.makeText(this, hasil.textMessage, Toast.LENGTH_SHORT).show()
    }

    override fun error() {
        Toast.makeText(this, "Inputan kosong", Toast.LENGTH_SHORT).show()
    }

}
