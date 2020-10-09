package com.example.trekdeaths.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trekdeaths.R
import kotlinx.android.synthetic.main.crew_recycler.view.*

class CrewAdapter(private val crewMember: List<String>, val showStardate: Boolean) : RecyclerView.Adapter<CrewAdapter.ViewHolder>() {
    class ViewHolder(view: View, showStardate: Boolean) : RecyclerView.ViewHolder(view) {
        val crewName = view.cr_crew_name
        val crewNote = view.cr_crew_note
        val stardate = view.cr_stardate

        init {
            if (showStardate) {
                view.cr_stardate.visibility = VISIBLE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.crew_recycler, parent, false)
        return ViewHolder(view, showStardate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.crewName.text = crewMember.get(position)
        holder.crewNote.text = crewMember.get(position)
        holder.stardate.text = crewMember.get(position)
    }

    override fun getItemCount(): Int {
        return crewMember.size
    }
}