package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(fa: Fragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        when(position){
            0-> fragment = HomeFragment()
            1-> fragment = CategoryFragment()

        }

        return fragment as Fragment

//        val fragment = GuruFragment()
//        fragment.arguments = Bundle().apply {
//            // Our object is just an integer :-P
//            putInt("object", position + 1)
//        }
//        return fragment
    }

//    override fun createFragment(position: Int): Fragment = GuruFragment()
}