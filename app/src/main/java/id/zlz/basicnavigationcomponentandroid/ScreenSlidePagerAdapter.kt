package id.zlz.basicnavigationcomponentandroid

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2

//    override fun createFragment(position: Int): Fragment {
//        var fragment : Fragment? = null
//        when(position){
//            0-> fragment = HomeFragment()
//            1-> fragment = GuruFragment()
//        }
//
//        return fragment as Fragment
//    }
//
    override fun createFragment(position: Int): Fragment = GuruFragment()
}