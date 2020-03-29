package com.shaunhossain.bornomala

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter

class CustomAdapter (private val model: List<Model>): RecyclerView.Adapter<CustomAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_sonborno,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return model.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(model[position])
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view){
        private val bornoView = view.findViewById<ImageView>(R.id.sorborno_view)
        private val photoView = view.findViewById<ImageView>(R.id.photo_view)
        private val photoName = view.findViewById<TextView>(R.id.photo_name)

        fun bind (model: Model){
            bornoView.setImageResource(model.bornoImage)
            photoView.setImageResource(model.relatedImage)
            photoName.text = model.description
        }

    }

}