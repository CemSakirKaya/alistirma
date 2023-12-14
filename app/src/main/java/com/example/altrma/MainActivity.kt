package com.example.altrma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.altrma.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarım:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarım= ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarım.root)

            tasarım.yap.setOnClickListener(){
                Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            }
    }
}