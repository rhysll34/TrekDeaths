package com.example.trekdeaths.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trekdeaths.R
import kotlinx.android.synthetic.main.episode_recycler.view.*

class EpisodeAdapter(val episodes: List<String>) : RecyclerView.Adapter<EpisodeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.episode_recycler, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.episodeNumber.text = "1"
        holder.episodeTitle.text = "Errand of Terror"
        holder.redDead.text = "13"
        holder.blueDead.text = "0"
        holder.yellowDead.text = "0"
        holder.details.setOnClickListener {
            if(holder.crewDetailsRecycler.visibility == VISIBLE)
            {
                holder.crewDetailsRecycler.visibility = GONE
            } else {
                holder.crewDetailsRecycler.visibility = VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return episodes.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val episodeNumber = view.er_episode_number
        val episodeTitle = view.er_episode_title
        val redDead = view.er_red_dead
        val blueDead = view.er_blue_dead
        val yellowDead = view.er_yellow_dead
        val details = view.er_crew_details
        val crewDetailsRecycler = view.er_crew_recycler
    }
}
