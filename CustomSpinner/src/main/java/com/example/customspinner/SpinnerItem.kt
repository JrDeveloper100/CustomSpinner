package com.example.customspinner

data class SpinnerItem(val iconResId: Int, val text: String){
    override fun toString(): String {
        return text
    }
}
