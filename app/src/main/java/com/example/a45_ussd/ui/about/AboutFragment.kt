package com.example.a45_ussd.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a45_ussd.R
import com.example.a45_ussd.databinding.FragmentAboutBinding
import com.example.a45_ussd.models.Tarif
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


private const val ARG_PARAM1 = "tarif"


class AboutFragment : Fragment(R.layout.fragment_about) {
    private var tarif: Tarif? = null

    private  val binding by viewBinding(FragmentAboutBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            tarif = it.getSerializable(ARG_PARAM1) as Tarif?
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}