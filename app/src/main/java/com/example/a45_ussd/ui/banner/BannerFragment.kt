package com.example.a45_ussd.ui.banner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a45_ussd.R
import com.example.a45_ussd.databinding.FragmentBannerBinding
import com.example.a45_ussd.models.Tarif
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

private const val ARG_PARAM1 = "tarif"

class BannerFragment : Fragment(R.layout.fragment_banner) {
    private var tarif: Tarif? = null
    private val binding by viewBinding(FragmentBannerBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            tarif = it.getSerializable(ARG_PARAM1) as Tarif?
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            daqiqa.text = tarif?.daqiqa.toString()
            internet.text = tarif?.internet.toString()
            sms.text = tarif?.sms.toString()
            name.text = tarif?.name.toString()
            cost.text = tarif?.cost.toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_banner, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(tarif: Tarif) =
            BannerFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, tarif)
                }
            }
    }
}