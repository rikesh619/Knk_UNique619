package com.example.knkunique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.example.knkunique.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
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

        val drawerLayout:DrawerLayout = findViewById(R.id.drawerlayout)
        val menuView:NavigationView = findViewById(R.id.menu_view)

        toggle = ActionBarDrawerToggle(this , drawerLayout , R.string.open , R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        menuView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.menu_home -> Toast.makeText(applicationContext,"Clicked HOME" , Toast.LENGTH_SHORT).show()
                R.id.menu_bag -> Toast.makeText(applicationContext,"Clicked  BAG" , Toast.LENGTH_SHORT).show()
                R.id.menu_help -> Toast.makeText(applicationContext,"Clicked HELP & FAQS" , Toast.LENGTH_SHORT).show()
                R.id.menu_my_account -> Toast.makeText(applicationContext,"Clicked MY ACCOUNT" , Toast.LENGTH_SHORT).show()
                R.id.menu_dark_mode -> Toast.makeText(applicationContext,"Clicked DARK MODE" , Toast.LENGTH_SHORT).show()
                R.id.menu_saved_item -> Toast.makeText(applicationContext,"Clicked SAVED ITEM" , Toast.LENGTH_SHORT).show()
                R.id.menu_app_setting -> Toast.makeText(applicationContext,"Clicked APP SETTING" , Toast.LENGTH_SHORT).show()
                R.id.menu_gift_vouchers -> Toast.makeText(applicationContext,"Clicked GIFT VOUCHERS" , Toast.LENGTH_SHORT).show()
                R.id.menu_help_improve -> Toast.makeText(applicationContext,"Clicked HELP IMPROVE THE APP" , Toast.LENGTH_SHORT).show()
                R.id.menu_marketplace -> Toast.makeText(applicationContext,"Clicked MARKETPLACE" , Toast.LENGTH_SHORT).show()
                R.id.menu_rate_app -> Toast.makeText(applicationContext,"Clicked RATE THE APP" , Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}