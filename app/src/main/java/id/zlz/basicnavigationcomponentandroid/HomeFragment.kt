package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import id.zlz.basicnavigationcomponentandroid.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? =null
    private val binding get() = _binding!!
//    private lateinit var viewPager2: ViewPager2
//
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        binding.btnCategory.setOnClickListener{v->
////            v.findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
//        }

//        binding.btnProfile.setOnClickListener(
////            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_profileActivity)
//        )

    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
////        viewPager2 = binding.pager
////
////        val pageradapter = ScreenSlidePagerAdapter(this)
////        viewPager2.adapter = pageradapter
//    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}