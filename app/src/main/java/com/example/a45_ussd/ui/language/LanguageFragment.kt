package com.example.a45_ussd.ui.language

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a45_ussd.MainActivity
import com.example.a45_ussd.R
import com.example.a45_ussd.databinding.FragmentLanguageBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class LanguageFragment : Fragment(R.layout.fragment_language) {

    private val binding by viewBinding(FragmentLanguageBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            uzBtn.setOnClickListener {
                val intent = Intent(requireActivity(), MainActivity::class.java)
                startActivity(intent)
            }
            ruBtn.setOnClickListener {
                val intent = Intent(requireActivity(), MainActivity::class.java)
                startActivity(intent)
            }
            krillBtn.setOnClickListener {
                val intent = Intent(requireActivity(), MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}