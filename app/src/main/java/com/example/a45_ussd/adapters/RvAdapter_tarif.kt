package com.example.a45_ussd.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a45_ussd.databinding.RvItemBinding
import com.example.a45_ussd.models.Internet

class RvAdapter_tarif(val list: List<Internet>) : RecyclerView.Adapter<RvAdapter_tarif.MV>() {

    inner class MV(val itemBinding: RvItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(course: Internet, position: Int) {
            itemBinding.tv1.text = course.qiymat.toString()
            itemBinding.tv2.text = "ODDIY  "
            itemBinding.tv3.text = course.qiymat.toString()
            itemBinding.text.text = course.text


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MV {
        return MV(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MV, position: Int) {

        holder.onBind(list[position], position)
    }
}