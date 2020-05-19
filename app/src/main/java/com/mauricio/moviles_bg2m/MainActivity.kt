package com.mauricio.moviles_bg2m

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mauricio.moviles_bg2m.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())
        colorToolbar()
    }


    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    println("home pressed")
                    replaceFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.nav_producto -> {
                    println("product pressed")
                    replaceFragment(productsFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.nav_presupuesto -> {
                    println("home pressed")
                    replaceFragment(BudgetFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.nav_mas -> {
                    println("home pressed")
                    replaceFragment(MoreFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.Fragment_container, fragment)
        fragmentTransaction.commit()
    }

    private fun colorToolbar() {
        val actionBar: ActionBar?
        actionBar = supportActionBar

        val colorDrawable = ColorDrawable(Color.parseColor("#00303f"))

        actionBar?.setBackgroundDrawable(colorDrawable);
    }
}