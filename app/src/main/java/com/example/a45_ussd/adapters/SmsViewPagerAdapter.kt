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
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a45_ussd.MainActivity
import com.example.a45_ussd.models.Internetlar
import com.example.a45_ussd.ui.components.Internet_ViewPagerFragment
import com.example.a45_ussd.ui.components.Sms_ViewPagerFragment


class SmsViewPagerAdapter(
    fa: FragmentActivity,
    modelList: List<Internetlar>,
    var listener: OnClicListener
) :
    FragmentStateAdapter(fa) {
    private val modelList: List<Internetlar> = modelList



    interface OnClicListener {

        fun onItemClic(modelList: List<Internetlar>, position: Int)

    }

    override fun getItemCount(): Int =modelList.size

    override fun createFragment(position: Int): Fragment {
        return Sms_ViewPagerFragment.newInstance(modelList[position])
    }

}

