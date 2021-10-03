package com.example.a45_ussd.ui.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a45_ussd.R
import com.example.a45_ussd.adapters.RvAdapter
import com.example.a45_ussd.databinding.FragmentInternetViewPagerBinding
import com.example.a45_ussd.models.Internetlar
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

private const val ARG_PARAM1 = "internetlar"


class Internet_ViewPagerFragment : Fragment(R.layout.fragment_internet__view_pager) {
    // TODO: Rename and change types of parameters
    private var internetlar: Internetlar? = null
    lateinit var rvAdapter: RvAdapter

    private val binding by viewBinding(FragmentInternetViewPagerBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            internetlar = it.getSerializable(ARG_PARAM1) as Internetlar?
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            rvAdapter = RvAdapter(internetlar!!.internetList)
            rv.adapter = rvAdapter
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(internetlar: Internetlar) =
            Internet_ViewPagerFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, internetlar)
                }
            }
    }
}