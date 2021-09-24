package id.zlz.basicnavigationcomponentandroid

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.zlz.basicnavigationcomponentandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavView: BottomNavigationView = binding.bottomnav
        val navController = findNavController(R.id.fragment_host)
        val appBarConfig = AppBarConfiguration.Builder(R.id.categoryFragment, R.id.profileActivity).build()
//        Log.d("TAG", "onCreate: $navController" )
        setupActionBarWithNavController(navController, appBarConfig)
        bottomNavView.setupWithNavController(navController)
    }
}