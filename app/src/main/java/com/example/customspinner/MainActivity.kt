package com.example.customspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.PopupWindow
import android.widget.Spinner
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customSpinner = findViewById<Spinner>(R.id.customSpinner)
        val popupWindow = PopupWindow(this)
        val openDrawable = ContextCompat.getDrawable(this, R.drawable.spinner_icon_design_default)
        val closedDrawable = ContextCompat.getDrawable(this, R.drawable.spinner_icon_design_opened)
        val items = listOf(
            SpinnerItem(R.drawable.leading_icon3, "List item"),
            SpinnerItem(R.drawable.leading_icon3, "List item"),
            SpinnerItem(R.drawable.leading_icon3, "List item")
        )
        val adapter = CustomSpinnerAdapter(this, items)
        customSpinner.adapter = adapter

// Add an OnDismissListener to change the icon when the popup is dismissed (closed)
        popupWindow.setOnDismissListener {
            customSpinner.background = closedDrawable
        }

        customSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Handle the selected item here
                val selectedItem = items[position]
                val selectedIconResId = selectedItem.iconResId
                val selectedText = selectedItem.text

                // Do something with the selected item
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected
            }
        }



    }
}