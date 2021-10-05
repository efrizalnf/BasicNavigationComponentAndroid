package id.zlz.basicnavigationcomponentandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.zlz.basicnavigationcomponentandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        viewPager2 = binding.pager
//
//        val pageradapter = ScreenSlidePagerAdapter(this)
//        viewPager2.adapter = pageradapter
//        val bottomNavView: BottomNavigationView = binding.bottomnav
//        val navController = findNavController(R.id.fragment_host)
//        val appBarConfig = AppBarConfiguration.Builder(R.id.homeFragment, R.id.categoryFragment).build()
////        Log.d("TAG", "onCreate: $navController" )
//        setupActionBarWithNavController(navController, appBarConfig)
//        bottomNavView.setupWithNavController(navController)
    }
}