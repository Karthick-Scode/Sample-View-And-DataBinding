package com.example.binding

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl", "displayTitle", requireAll = true)
fun ImageView.loadImageFromUrl(profilePhoto: String, title: String) {
    this.load(profilePhoto)
    Log.d("Title", title)
}

@BindingAdapter("setVisibility")
fun View.setMyViewVisibility(points: Int) {
    if (points > 10) {
        this.visibility = View.INVISIBLE
    }
    when(this) {
        is ImageView -> {

        }
        is TextView -> {

        }
    }
}


//
//class MyBindingAdapter {
//    companion object {
//        @BindingAdapter("loadImageFromUrl")
//        @JvmStatic
////        fun ImageView.loadImageFromUrl(profilePhoto: String) {
////            this.load(profilePhoto)
////        }
//
//        fun loadImageFromUrl(imageView: ImageView, profilePhoto: String) {
//            imageView.load(profilePhoto)
//        }
//    }
//}