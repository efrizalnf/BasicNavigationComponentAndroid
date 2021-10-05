package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import id.zlz.basicnavigationcomponentandroid.databinding.FragmentGuruBinding


class GuruFragment : Fragment() {
    private lateinit var _binding : FragmentGuruBinding
    private val binding get() = _binding
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     _binding = FragmentGuruBinding.inflate(layoutInflater, container, false)
        viewPager2 = binding.pager

        val pageradapter = ScreenSlidePagerAdapter(this)
        viewPager2.adapter = pageradapter
        return binding.root
    }

}