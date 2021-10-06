package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import id.zlz.basicnavigationcomponentandroid.databinding.FragmentGuruBinding


class GuruFragment : Fragment() {
    private lateinit var _binding: FragmentGuruBinding
    private val binding get() = _binding
    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGuruBinding.inflate(layoutInflater, container, false)


        viewPager2 = binding.pager
        val pageradapter = ScreenSlidePagerAdapter(this)
        viewPager2.adapter = pageradapter


        tabLayout = binding.tabLayout
        TabLayoutMediator(
            tabLayout, viewPager2
        ) { tab, position ->
//            when (position) {
//                0 -> {
//                    tab.text = "Administrasi"
//                }
//                1 -> {
//                    tab.text = "Literasi"
//                }
//            }

            tab.text =resources.getString(TAB_JUDUL[position])
        }.attach()

        return binding.root
    }


    companion object {
        private val TAB_JUDUL = intArrayOf(
            R.string.tab1,
            R.string.tab2,
        )
    }

}