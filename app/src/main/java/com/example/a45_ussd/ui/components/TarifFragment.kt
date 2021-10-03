package com.example.a45_ussd.ui.components

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.a45_ussd.R
import com.example.a45_ussd.adapters.InternetViewPagerAdapter
import com.example.a45_ussd.adapters.RvAdapter
import com.example.a45_ussd.adapters.SmsViewPagerAdapter
import com.example.a45_ussd.adapters.TarifViewPagerAdapter
import com.example.a45_ussd.databinding.FragmentInternetBinding
import com.example.a45_ussd.databinding.FragmentSmsBinding
import com.example.a45_ussd.databinding.FragmentTarifBinding
import com.example.a45_ussd.models.Internet
import com.example.a45_ussd.models.Internetlar
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class TarifFragment : Fragment(R.layout.fragment_tarif) {
    private var param1: String? = null
    private var param2: String? = null

    private val binding by viewBinding(FragmentTarifBinding::bind)
    lateinit var internetViewAdapter: TarifViewPagerAdapter
    lateinit var kunlikList: ArrayList<Internet>
    lateinit var internetList: ArrayList<Internetlar>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        binding.apply {

            internetViewAdapter = TarifViewPagerAdapter(
                childFragmentManager,
                internetList,
                object : TarifViewPagerAdapter.OnClicListener {
                    override fun onItemClic(modelList: List<Internetlar>, position: Int) {

                    }
                })

            viewPager.adapter = internetViewAdapter

//            tabLayout.addTab(tabLayout.newTab().setText(internetList[0].turi));
//            tabLayout.addTab(tabLayout.newTab().setText(internetList[1].turi));
//            tabLayout.addTab(tabLayout.newTab().setText(internetList[2].turi))

            trafikniTekshirish.setOnClickListener {
                val builder =
                    AlertDialog.Builder(requireContext())
                builder.setTitle("Sizning tarifingiz: ")
                builder.setMessage(" Siz Oddiy 10 tarifidasiz  " +
                        " sizga 10 Daqiqa " +
                        " 10 MB  " +
                        " 50 SMS taqdim etilgan !!!")
//            builder.setCancelable(false);              // nazat la ishlamaydi
                builder.setPositiveButton(
                    "OK"
                ) { dialog: DialogInterface?, which: Int ->
                    Toast.makeText(
                        requireContext(),
                        "Good",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                builder.setNegativeButton(
                    "Cancle"
                ) { dialog: DialogInterface?, which: Int ->
                    Toast.makeText(
                        requireContext(),
                        "Ok",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                builder.show()
            }

        }


    }

    private fun loadData() {
        kunlikList = ArrayList()
        internetList = ArrayList()

        kunlikList.add(
            Internet(
                50, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                100, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                500, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                1000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                1500, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                5000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                9000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                15000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                20000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        kunlikList.add(
            Internet(
                50000, "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                        "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                        "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
            )
        )

        internetList.add(Internetlar("Kunlik", kunlikList))
        internetList.add(Internetlar("Haftalik", kunlikList))
        internetList.add(Internetlar("Oylik", kunlikList))


    }
}