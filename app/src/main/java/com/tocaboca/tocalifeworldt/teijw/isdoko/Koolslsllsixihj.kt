package com.tocaboca.tocalifeworldt.teijw.isdoko
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.core.qualifier.named
import android.content.Context
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.teijw.fdgf.Tiosksajix
import android.view.View
import android.view.LayoutInflater
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.gdshudushuhuxhhuzc
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
class Koolslsllsixihj : Fragment() {
    val ygxzcs by activityViewModel<Tiosksajix>(named("MainModel"))
    lateinit var isookkoxokcizji: String
    val hvijjid: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var qpwws: Context



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fookwsa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ygxzcs.dkoeokkosadlppl.observe(viewLifecycleOwner) {
            if (it!=null) {
                isookkoxokcizji = it.jcjxjjixijcjijidv
                hvijjid.edit().putString(gdshudushuhuxhhuzc, isookkoxokcizji).apply()
                findNavController().navigate(R.id.noowiwiiwuhsaygd)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        qpwws = context
    }










}