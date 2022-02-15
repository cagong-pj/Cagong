package com.example.cagong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cagong.adapter.TagRecyclerAdapter
import com.example.cagong.databinding.ActivityMainBinding
import com.example.cagong.data.TagData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var manager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        manager = GridLayoutManager(this, 3)

        val data = listOf(TagData(getDrawable(R.drawable.icon_plugin)!!, "콘센트가 많아요"),
            TagData(getDrawable(R.drawable.icon_mute)!!, "조용해요"),
            TagData(getDrawable(R.drawable.icon_table)!!, "책상이 넓어요"),
            TagData(getDrawable(R.drawable.icon_eyes)!!, "눈치가 덜 보여요"),
            TagData(getDrawable(R.drawable.icon_chair)!!, "자리가 편해요"),
            TagData(getDrawable(R.drawable.icon_light)!!, "눈이 편해요")
        )

        binding.recyclerView.apply{
            adapter = TagRecyclerAdapter(data)
            layoutManager = manager
        }
    }
}