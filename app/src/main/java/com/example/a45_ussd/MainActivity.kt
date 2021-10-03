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
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
//        when (item.itemId) {
//
//            R.id.action_settings -> {
//                val menuShare = Intent(Intent.ACTION_SEND)
//                menuShare.type = "text/plain"
//                menuShare.putExtra(Intent.EXTRA_SUBJECT, "This is the subject")
//                menuShare.putExtra(Intent.EXTRA_TEXT, "This is body text")
//                startActivity(Intent.createChooser(menuShare, "Share this text"))
//            }
//            R.id.telegram -> {
//                val waIntent = Intent(Intent.ACTION_SEND)
//                waIntent!!.setPackage("com.telegram")
//                    startActivity(Intent.createChooser(waIntent, "Share with"))
//            }
//
//        }


//    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.telegram -> {
                val uri =
                    Uri.parse("https://t.me/ussduz")
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
                    "http://play.google.com/store/apps/details?id=uz.pdp.uzmobile"
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