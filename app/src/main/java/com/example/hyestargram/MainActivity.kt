package com.example.hyestargram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hyestargram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // xml에서 binding 된 객체의 '_'은 java에 뒷글자 대문자로 만들어서 사용
        // findViewById<ImageView>(R.id.btn_google) 과 binding.btnGoogle 은 똑같은 기능

    }
}