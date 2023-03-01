package com.tocaboca.tocalifeworldt.teijw.isdoko
import androidx.navigation.fragment.findNavController
import android.content.Context
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.sokdokwkoko
import com.tocaboca.tocalifeworldt.teijw.fdgf.Tiosksajix
import org.koin.android.ext.android.inject




class Eqoqowijsdx : Fragment() {
    private lateinit var gokookvjichuudhf: Context
    val dekos by activityViewModel<Tiosksajix>(named("MainModel"))
    val dtshhuuhuhuhchu: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var fpldlpfd: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cioioixovijd = dtshhuuhuhuhchu.getString(sokdokwkoko, null)
        val dkofoke = dtshhuuhuhuhchu.getString("appCamp", null)

        if (cioioixovijd=="1" &&dkofoke == null) {
            dekos.vokobkkov(gokookvjichuudhf)
            dekos.rokeok.observe(viewLifecycleOwner) {
                if (it != null) {
                    fpldlpfd = it.toString()
                    dtshhuuhuhuhchu.edit().putString("appCamp", fpldlpfd).apply()
                    findNavController().navigate(R.id.kmcxmjydgytf)
                }
            }
        } else {
            findNavController().navigate(R.id.kmcxmjydgytf)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        gokookvjichuudhf = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ncjutdtdrsw, container, false)
    }

}