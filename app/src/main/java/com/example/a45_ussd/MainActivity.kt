package com.example.a45_ussd

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.a45_ussd.databinding.ActivityMainBinding
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.a45_ussd.databinding.FragmentHomeBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)


        supportActionBar?.setDisplayShowTitleEnabled(false)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_share, R.id.nav_mark, R.id.nav_about

            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        binding.appBarMain.home.setOnClickListener {
            while (navController.currentDestination!!.id != R.id.nav_home) {
                navController.popBackStack()
            }
            if (navController.currentDestination!!.id != R.id.nav_home) {
                navController.navigate(R.id.nav_home)
            }
        }
        binding.appBarMain.balans.setOnClickListener {
            while (navController.currentDestination!!.id != R.id.nav_slideshow &&
                navController.currentDestination!!.id != R.id.nav_home) {
                navController.popBackStack()
            }
            if (navController.currentDestination!!.id != R.id.nav_slideshow) {
                navController.navigate(R.id.nav_slideshow)
            }
        }
        binding.appBarMain.person.setOnClickListener {
            while (navController.currentDestination!!.id != R.id.nav_gallery &&
                navController.currentDestination!!.id != R.id.nav_home) {
                navController.popBackStack()
            }
            if (navController.currentDestination!!.id != R.id.nav_gallery) {
                navController.navigate(R.id.nav_gallery)
            }
        }
        binding.appBarMain.news.setOnClickListener {
            while (navController.currentDestination!!.id != R.id.aboutFragment &&
                navController.currentDestination!!.id != R.id.nav_home) {
                navController.popBackStack()
            }
            if (navController.currentDestination!!.id != R.id.aboutFragment) {
                navController.navigate(R.id.aboutFragment)
            }
        }
        binding.appBarMain.setting.setOnClickListener {
            while (navController.currentDestination!!.id != R.id.bannerFragment &&
                navController.currentDestination!!.id != R.id.nav_home
            ) {
                navController.popBackStack()
            }
            if (navController.currentDestination!!.id != R.id.bannerFragment) {
                navController.navigate(R.id.bannerFragment)
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.telegram -> {
                val uri =
                    Uri.parse("https://t.me/uz_avto_kredit_uz")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                try {
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
            R.id.action_settings -> {
                val sendIntent = Intent()
                sendIntent.action = Intent.ACTION_SEND
                sendIntent.putExtra(
                    Intent.EXTRA_TEXT,
                    "https://play.google.com/store/apps/details?id=uzavtosanoat.uz"
                )
                sendIntent.type = "text/plain"
                startActivity(sendIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}