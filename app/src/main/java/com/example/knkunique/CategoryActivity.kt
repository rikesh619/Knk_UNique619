package com.example.knkunique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.knkunique.databinding.ActivityCategoryBinding
import com.example.knkunique.databinding.ActivityMainBinding

class CategoryActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.barCategory.setOnClickListener {
            startActivity(Intent(this , CategoryActivity::class.java))
        }

        binding.barHome.setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))
        }

        binding.barForYou.setOnClickListener {
            startActivity(Intent(this , ForYouActivity::class.java))
        }

        binding.barNewIn.setOnClickListener {
            startActivity(Intent(this , NewInActivity::class.java))
        }

    }
}