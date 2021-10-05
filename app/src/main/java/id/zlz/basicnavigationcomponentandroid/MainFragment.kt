package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.zlz.basicnavigationcomponentandroid.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private  var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val bottomNavView: BottomNavigationView = binding.bottomnav
        childFragmentManager.findFragmentById(R.id.fragmentHome)?.findNavController()?.let {
            NavigationUI.setupWithNavController(
                binding?.bottomnav,
                it
            )
        }
//        val navController = parentFragment?.findNavController()
//        val appBarConfig = AppBarConfiguration.Builder(R.id.homeFragment, R.id.categoryFragment).build()
//        Log.d("TAG", "onCreate: $navController" )
//        setupActionBarWithNavController(navController, appBarConfig)
//        bottomNavView.setupWithNavController(navController!!)
        bottomNavView.setOnNavigationItemReselectedListener {  }
        return binding.root
    }


}