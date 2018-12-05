package es.babel.interviewandroid


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.babel.interviewandroid.models.Question


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_QUESTION = "param1"
private const val ARG_SIZE = "size"
private const val ARG_INDEX = "index"

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragmentFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class QuestionFragmentFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var question: Question? = null

    private var size: Int=0

    private var index: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            question = it.getParcelable(ARG_QUESTION)
            size = it.getInt(ARG_SIZE)
            index = it.getInt(ARG_INDEX)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @return A new instance of fragment QuestionFragmentFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Question, size: Int, index: Int) =
                QuestionFragmentFragment().apply {
                    arguments = Bundle().apply {
                        putParcelable(ARG_QUESTION, param1)
                        putInt(ARG_SIZE, size)
                        putInt(ARG_INDEX, index)
                    }
                }
    }
}
