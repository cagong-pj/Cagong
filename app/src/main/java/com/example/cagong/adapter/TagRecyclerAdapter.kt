package com.example.cagong.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cagong.data.TagData
import com.example.cagong.databinding.TagItemBinding

class TagRecyclerAdapter(private val itemList: List<TagData>): RecyclerView.Adapter<TagRecyclerAdapter.MyViewHolder>(){

    inner class MyViewHolder(val binding: TagItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TagData) {
            binding.tag = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val listItemBinding = TagItemBinding.inflate(inflater, parent, false)
        return MyViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}