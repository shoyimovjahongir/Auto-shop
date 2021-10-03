package com.example.a45_ussd.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.a45_ussd.R
import com.example.a45_ussd.adapters.ViewPagerAdapter
import com.example.a45_ussd.databinding.FragmentHomeBinding
import com.example.a45_ussd.models.Tarif
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var tarifList: ArrayList<Tarif>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {
            loadData()

            viewPagerAdapter = ViewPagerAdapter(
                childFragmentManager,
                tarifList, object : ViewPagerAdapter.OnClicListener {
                    override fun onItemClic(modelList: List<Tarif>, position: Int) {
                        var bundle = Bundle()
                        bundle.putSerializable("tarif", tarifList[position])
                        findNavController().navigate(R.id.nav_gallery, bundle)
                    }
                })

            viewPager.adapter = viewPagerAdapter
            tabLayout.setupWithViewPager(viewPager)

            internet.setOnClickListener {
                findNavController().navigate(R.id.internetFragment)
            }
            sms.setOnClickListener {
                findNavController().navigate(R.id.smsFragment)
            }
            xizmat.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment)
            }
            ussd.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment)
            }
            tarif.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment)
            }
        }
    }

    private fun loadData() {
        tarifList = ArrayList()
        tarifList.add(
            Tarif(
                "Просто 10",
                10,
                10,
                50,
                15000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 20",
                100,
                100,
                100,
                20000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 30",
                500,
                200,
                200,
                25000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 40",
                1000,
                300,
                400,
                30000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 50",
                1500,
                400,
                800,
                35000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 60",
                2000,
                500,
                1600,
                50000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
        tarifList.add(
            Tarif(
                "Просто 70",
                3000,
                1000,
                3000,
                60000,
                "Tarif rejasi  jismoniy va yuridik shaxslar uchun, 2019-yil  1-fеvraldan 30-iyunga qadar taqdim etiladi.\n" +
                        "Kiritilgan daqiqa limiti, MB, SMS 1 kalеndar oyiga taqdim etiladi.\n" +
                        "Tarif rejasiga «O‘zbеktеlеkom» AK sotuvlar ofisi, shuningdek, dilеrlar orqali ulanish mumkin.\n" +
                        "Abonеnt to‘lovini hisoblash abonеnt faol bo‘lganida amalga oshiriladi.  Agar abonеnt hisobida pul mablag‘i yetarli bo‘lmaganligi sababli abonеnt bloklangan bo‘lsa, to‘lov kiritilmaguniga qadar to‘lov hisoblanmaydi.\n" +
                        " Ushbu tarif rejasiga ulanish yoki unga o‘tishda abonent to‘lovi kalendar oyidagi qolgan kunlar soniga nisbatan, kiritilgan daqiqalar, SMS va Internet trafigi, shuningdek, qolgan kunlar soni bo‘yicha (to‘liq daqiqaga yaxlitlangan holda) hisoblab chiqiladi."
            )
        )
    }

}