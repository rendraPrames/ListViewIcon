package com.example.listviewicon_5170411064

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listdat: RecyclerView
    private var list: ArrayList<AturArray> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listdat = findViewById(R.id.data_layout)
        listdat.setHasFixedSize(true)
        list.addAll(DataArray.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        listdat.layoutManager =LinearLayoutManager(this)
        val listOut =Output(list)
        listdat.adapter =listOut

        listOut.setOnItemClickCallback(object : Output.OnItemClickCallback {
            override fun onItemClicked(data: AturArray) {
                showData(data)
            }
        })
    }

    private fun showData(det: AturArray) {
        Toast.makeText(this, "" +det.detail, Toast.LENGTH_SHORT).show()
    }
}
