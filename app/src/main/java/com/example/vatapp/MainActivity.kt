package com.example.vatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vatapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root // reference layout file
        setContentView(view) // link layout

        binding.btCalcVAT.setOnClickListener {
            calculatVat()
        } // End setOnClickListener

    } // End onCreate

    private fun calculatVat() {
        TODO("Not yet implemented")
    }
} // End Class