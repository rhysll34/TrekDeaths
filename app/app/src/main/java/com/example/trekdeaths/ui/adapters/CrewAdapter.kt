package com.example.trekdeaths.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trekdeaths.R
import kotlinx.android.synthetic.main.crew_recycler.view.*

class CrewAdapter(var crewMember: List<String>, val showStardate: Boolean) : RecyclerView.Adapter<CrewAdapter.ViewHolder>() {
    class ViewHolder(view: View, showStardate: Boolean) : RecyclerView.ViewHolder(view) {
        val crewName: TextView = view.cr_crew_name
        val crewNote: TextView = view.cr_crew_note
        val stardate: TextView = view.cr_stardate

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
        holder.crewName.text = crewMember[position]
        holder.crewNote.text = crewMember[position]
        holder.stardate.text = "1234.5"
    }

    override fun getItemCount(): Int {
        return crewMember.size
    }
}