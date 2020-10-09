package com.example.trekdeaths.ui.episodes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trekdeaths.R
import com.example.trekdeaths.presenter.Presenter
import com.example.trekdeaths.ui.adapters.EpisodeAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class EpisodesFragment : Fragment() {

    private lateinit var episodesViewModel: EpisodesViewModel
    private lateinit var episodesRecycler: RecyclerView
    @Inject lateinit var presenter: Presenter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        episodesViewModel =
                ViewModelProviders.of(this).get(EpisodesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_episodes, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        episodesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val episodeAdapter = EpisodeAdapter(listOf("Errand of Terror"))
        val episodeRecycler = root.findViewById<RecyclerView>(R.id.episodes_recycler)
        episodeRecycler.adapter = episodeAdapter
        episodeRecycler.layoutManager = LinearLayoutManager(activity)

        return root
    }
}