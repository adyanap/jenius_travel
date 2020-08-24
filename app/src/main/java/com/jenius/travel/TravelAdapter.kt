package com.jenius.travel
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_travel.view.*

class TravelAdapter(val listDestination: ArrayList<Destination>) : RecyclerView.Adapter<TravelAdapter.TravelViewHolder>(){

    var context: Context? = null

    //sejenis wrapper untuk tiap2 data
    inner class TravelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(){
            val destination = listDestination[adapterPosition]

            itemView.text_name.text = destination.name
            itemView.text_days.text = "${destination.days} days"

            if(destination.isFeatured)
                itemView.text_featured.visibility = View.VISIBLE
            else
                itemView.text_featured.visibility = View.GONE

            //NOT RECOMMENDED (krn setiap item akan punya listener ini)
            //solusi: menggunakan interface
            itemView.list_container.setOnClickListener {
                Toast.makeText(context, "${destination.name} is clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //untuk menginisiasi layout viewnya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_travel, parent, false)
        return TravelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDestination.size
    }

    //untuk menginisiasi layout datanya
    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        holder.bind() //bind ini function yang di atas
    }
}