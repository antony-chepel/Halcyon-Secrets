package com.tocaboca.tocalifeworldt.teijw.isdoko
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.tocaboca.tocalifeworldt.R
import android.os.Bundle
import androidx.fragment.app.Fragment



class Gfokvichu : Fragment() {
    private lateinit var sidjw: Context
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(R.id.woqosxz)

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        sidjw=context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gsdcxcxuivuhd, container, false)
    }

}