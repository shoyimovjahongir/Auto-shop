package com.example.a45_ussd.ui.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.a45_ussd.R
import com.example.a45_ussd.databinding.FragmentGalleryBinding
import com.example.a45_ussd.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

//    private  var binding by viewBinding(FragmentSplashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)


        @Suppress("DEPRECATION")
        Handler().postDelayed({
            findNavController().popBackStack()
            findNavController().navigate(R.id.languageFragment)
        },
            1500
        )
        return binding.root
    }

}