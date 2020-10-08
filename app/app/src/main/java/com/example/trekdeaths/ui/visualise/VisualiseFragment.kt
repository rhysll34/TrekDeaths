package com.example.trekdeaths.ui.visualise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.trekdeaths.R

class VisualiseFragment : Fragment() {

    private lateinit var visualiseViewModel: VisualiseViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        visualiseViewModel =
                ViewModelProviders.of(this).get(VisualiseViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_visualise, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        visualiseViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}