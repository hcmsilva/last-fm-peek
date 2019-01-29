package com.demos.henrique.lastfmpeek.sharedui

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseRotationalHolder<T : CustomListable>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindHolder(item: T)
}