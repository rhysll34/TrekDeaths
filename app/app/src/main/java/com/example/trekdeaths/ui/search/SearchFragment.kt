package com.example.trekdeaths.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trekdeaths.R
import com.example.trekdeaths.presenter.Presenter
import com.example.trekdeaths.ui.adapters.CrewAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : Fragment() {
    @Inject
    lateinit var presenter: Presenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_search, container, false)

        val crewAdapter = CrewAdapter(listOf("Errand of Terror"), true)
        val crewRecycler = root.findViewById<RecyclerView>(R.id.fs_results_recycler)
        crewRecycler.adapter = crewAdapter
        crewRecycler.layoutManager = LinearLayoutManager(activity)

        val searchBox = root.findViewById<TextView>(R.id.fs_search_text)
        searchBox.addTextChangedListener {0}

        return root
    }
}