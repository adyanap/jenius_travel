package com.jenius.travel

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_travel_list.*

class TravelListFragment : Fragment() {

    //array of object kosong
    val listDestination = ArrayList<Destination>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_travel_list, container, false)
    }

    //execute ketika activity terbuat
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        listDestination.add(Destination("Tokyo, Japan", 14, true))
        listDestination.add(Destination("Bali, Indonesia", 5, true))
        listDestination.add(Destination("Penang, Malaysia", 5, false))
        listDestination.add(Destination("Paris, France", 10, false))
        listDestination.add(Destination("Singapore, Singapore", 3, true))
        listDestination.add(Destination("Yogyakarta, Indonesia", 5, false))


        recylerView.adapter = TravelAdapter(listDestination)
    }

}
