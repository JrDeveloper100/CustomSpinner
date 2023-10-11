package com.example.customspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AutoCompleteTextView
import android.widget.PopupWindow
import android.widget.Spinner
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoCompleteTextView  = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView )
        val items = listOf(
            SpinnerItem(R.drawable.leading_icon3, "List item"),
            SpinnerItem(R.drawable.leading_icon3, "List item"),
            SpinnerItem(R.drawable.leading_icon3, "List item")
        )
        val adapter = CustomAutoCompleteAdapter(this, items)
        autoCompleteTextView.setAdapter(adapter)

//        customSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                // Handle the selected item here
//                val selectedItem = items[position]
//                val selectedIconResId = selectedItem.iconResId
//                val selectedText = selectedItem.text
//
//                // Do something with the selected item
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                // Handle case when nothing is selected
//            }
//        }



    }
}