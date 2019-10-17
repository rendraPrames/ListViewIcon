package com.example.listviewicon_5170411064

object DataArray {
    private val languages = listOf("Ruby","Ralls","Python","JavaScript","PHP")

    val desk = listOf(
        "Ruby is an open-source and fully object oriented programming language",
        "Ruby on Ralls is a server-side web application development framework written in Ruby language",
        "Pyhton is interpreted scripting and object-oriented programming language",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language, compilation"
    )

    private val pictDat = intArrayOf(
        R.drawable.ruby,
        R.drawable.ruby_on_the_rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )
    val listData : ArrayList<AturArray>
        get() {
            val list = arrayListOf<AturArray>()
            for (position in languages.indices){
                val listDat =AturArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}