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
import com.example.a45_ussd.databinding.FragmentInternetBinding
import com.example.a45_ussd.databinding.ItemTabBinding
import com.example.a45_ussd.models.Internet
import com.example.a45_ussd.models.Internetlar
import com.google.android.material.tabs.TabLayoutMediator
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


private const val ARG_PARAM1 = "param1"

class InternetFragment : Fragment(R.layout.fragment_internet) {
    private var param1: Internetlar? = null

    private val binding by viewBinding(FragmentInternetBinding::bind)
    lateinit var internetViewAdapter: InternetViewPagerAdapter
    lateinit var kunlikList: ArrayList<Internet>
    lateinit var internetList: ArrayList<Internetlar>

    //    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getSerializable(ARG_PARAM1)
//        }
//    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()


        binding.apply {

            internetViewAdapter = InternetViewPagerAdapter(
                requireActivity(),
                internetList,
                object : InternetViewPagerAdapter.OnClicListener {
                    override fun onItemClic(modelList: List<Internetlar>, position: Int) {

                    }
                })


            viewPager.adapter = internetViewAdapter
            TabLayoutMediator(tabLayout, viewPager) { tab, i ->
                val itemtab = ItemTabBinding.inflate(layoutInflater)
                tab.customView = itemtab.root
                itemtab.tv.text = internetList[i].turi
            }.attach()

//            tabLayout.addTab(tabLayout.newTab().setText(internetList[0].turi));
//            tabLayout.addTab(tabLayout.newTab().setText(internetList[1].turi));
//            tabLayout.addTab(tabLayout.newTab().setText(internetList[2].turi))

            trafikniTekshirish.setOnClickListener {
                val builder =
                    AlertDialog.Builder(requireContext())
                builder.setTitle("Sizning tarif rejangiz:")
                builder.setMessage("Siz Bir oylik 50000 MB lik tarifda siz !!!")
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

    fun newInstance(param1: Internetlar) =
        InternetFragment().apply {
            arguments = Bundle().apply {
                putSerializable(ARG_PARAM1, param1)
            }
        }
}
