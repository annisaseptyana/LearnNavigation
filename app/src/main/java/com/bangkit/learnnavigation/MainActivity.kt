package com.bangkit.learnnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bangkit.learnnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActionBar.setOnClickListener {
            val moveToActionBar = Intent(this@MainActivity, ActionBar::class.java)
            startActivity(moveToActionBar)
        }

        binding.btnNavigationDrawer.setOnClickListener {
            val moveToNavigationDrawer = Intent(this@MainActivity, NavigationDrawer::class.java)
            startActivity(moveToNavigationDrawer)
        }

        binding.btnBottomNav.setOnClickListener {
            val moveToBottomNavigation = Intent(this@MainActivity, BottomNavigation::class.java)
            startActivity(moveToBottomNavigation)
        }

        binding.btnTabLayout.setOnClickListener {
            val moveToTabLayout = Intent(this@MainActivity, TabLayout::class.java)
            startActivity(moveToTabLayout)
        }
    }
}