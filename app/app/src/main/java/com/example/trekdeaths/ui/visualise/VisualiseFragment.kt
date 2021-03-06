package com.example.trekdeaths.ui.visualise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.trekdeaths.R
import com.example.trekdeaths.presenter.Presenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class VisualiseFragment : Fragment() {

    private lateinit var visualiseViewModel: VisualiseViewModel
    @Inject
    lateinit var presenter: Presenter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        visualiseViewModel =
                ViewModelProviders.of(this).get(VisualiseViewModel::class.java)
        return inflater.inflate(R.layout.fragment_visualise, container, false)
    }
}