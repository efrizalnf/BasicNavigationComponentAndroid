package id.zlz.basicnavigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import id.zlz.basicnavigationcomponentandroid.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? =null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCategory.setOnClickListener{v->
            v.findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
        }

        binding.btnProfile.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_profileActivity)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}