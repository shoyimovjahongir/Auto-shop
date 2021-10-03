package com.example.a45_ussd.adapters

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.a45_ussd.models.Tarif
import com.example.a45_ussd.ui.banner.BannerFragment
import android.R.layout

import androidx.viewpager.widget.ViewPager

import android.R
import android.content.Context

import android.widget.TextView

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import com.example.a45_ussd.MainActivity
import com.example.a45_ussd.models.Internetlar
import com.example.a45_ussd.ui.components.Internet_ViewPagerFragment
import com.example.a45_ussd.ui.components.Sms_ViewPagerFragment
import com.example.a45_ussd.ui.components.Tarif_ViewPagerFragment


class TarifViewPagerAdapter(
    fm: FragmentManager,
    modelList: List<Internetlar>,
    var listener: OnClicListener
) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val modelList: List<Internetlar> = modelList

    override fun getItem(position: Int): Fragment {
        return Tarif_ViewPagerFragment.newInstance(modelList[position])


    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        return super.instantiateItem(container, position)

        container.setOnClickListener {
            listener.onItemClic(modelList, position)
        }
    }


    override fun getCount(): Int {
        return modelList.size
    }

    interface OnClicListener {

        fun onItemClic(modelList: List<Internetlar>, position: Int)

    }

}

