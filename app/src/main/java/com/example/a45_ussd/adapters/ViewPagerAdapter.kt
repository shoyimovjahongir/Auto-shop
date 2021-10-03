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


class ViewPagerAdapter(
    fm: FragmentManager,
    modelList: List<Tarif>,
    var listener: OnClicListener
) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val modelList: List<Tarif> = modelList

    override fun getItem(position: Int): Fragment {
        return BannerFragment.newInstance(modelList[position])


//        listener.onItemClic(modelList, position)
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

        fun onItemClic(modelList: List<Tarif>, position: Int)

    }

}

