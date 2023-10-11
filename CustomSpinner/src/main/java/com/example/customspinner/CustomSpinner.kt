package com.example.customspinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAutoCompleteAdapter(
    context: Context,
    private val items: List<SpinnerItem>
) : ArrayAdapter<SpinnerItem>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createView(position, convertView, parent)
    }

    private fun createView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.custom_spinner_layout, parent, false)

        val item = getItem(position)
            val iconImageView = view.findViewById<ImageView>(com.example.customspinner.R.id.iconImageView)
        val textTextView = view.findViewById<TextView>(com.example.customspinner.R.id.textTextView)
        val separator = view.findViewById<View>(com.example.customspinner.R.id.separator)

        iconImageView.setImageResource(item?.iconResId ?: R.drawable.leading_icon3)
        textTextView.text = item?.text ?: ""
        if (position==2) {
            separator.visibility = View.GONE
        }else
        {
            separator.visibility = View.VISIBLE
        }

        return view
    }
}