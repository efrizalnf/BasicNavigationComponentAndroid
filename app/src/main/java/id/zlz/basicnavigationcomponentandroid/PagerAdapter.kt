package id.zlz.basicnavigationcomponentandroid

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        when(position){
            0-> fragment = HomeFragment()
            1-> fragment = ListFragment()
        }

        return fragment as Fragment
    }
}