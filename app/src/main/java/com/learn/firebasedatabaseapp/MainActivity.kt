package com.learn.firebasedatabaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import com.learn.firebasedatabaseapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var database = FirebaseDatabase.getInstance().reference

        binding.save.setOnClickListener {

            var name = binding.etName.text.toString()
            var age = binding.etAge.text.toString().toInt()
            var email = binding.etEmail.text.toString()


            database.child(name.toString()).setValue(User(age,email))
            binding.etName.text.clear()
            binding.etAge.text.clear()
            binding.etEmail.text.clear()
        }
    }
}