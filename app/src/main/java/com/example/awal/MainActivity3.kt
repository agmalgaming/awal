package com.example.awal

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.coba3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coba3)


        button2.setOnClickListener {

            val nama = editText2.text.toString()
            val umur = editText3.text.toString()

            val intent = Intent(this,MainActivity4::class.java)
                .putExtra(EXTRA_MESSAGE,nama)
            finish()
            startActivity(intent)
        }

    }


}