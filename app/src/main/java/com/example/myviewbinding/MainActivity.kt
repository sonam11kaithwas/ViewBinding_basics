package com.example.myviewbinding

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("","")
        binding.btn.setOnClickListener {
            Toast.makeText(this, "Click on button", Toast.LENGTH_SHORT).show()
        }
    }

    fun click(view: View) {
        Log.e("","")
        Toast.makeText(this, binding.edt.text.toString(), Toast.LENGTH_SHORT).show()

    }
}