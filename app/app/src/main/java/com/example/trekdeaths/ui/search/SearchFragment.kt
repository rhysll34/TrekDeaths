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
import com.example.trekdeaths.ui.adapters.CrewAdapter

class SearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_search, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)

        val crewAdapter = CrewAdapter(listOf("Errand of Terror"))
        val crewRecycler = root.findViewById<RecyclerView>(R.id.fs_results_recycler)
        crewRecycler.adapter = crewAdapter
        crewRecycler.layoutManager = LinearLayoutManager(activity)

        val searchBox = root.findViewById<TextView>(R.id.fs_search_text)
        searchBox.addTextChangedListener {0}

        return root
    }
}