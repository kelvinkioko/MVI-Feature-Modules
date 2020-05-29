package com.transaction.mvi.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.coroutines.FlowPreview
import com.transaction.mvi.login.R as LoginResource
import com.transaction.mvi.R as MainResource


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@FlowPreview
class LoginFragment : Fragment(LoginResource.layout.fragment_login), View.OnClickListener {

    private var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<TextView>(LoginResource.id.sign_in_create_new_account).setOnClickListener ( this )
    }

    override fun onClick(v: View?) {
        when (v!!.id){
            LoginResource.id.sign_in_create_new_account -> {
                navController!!.navigate(MainResource.id.action_loginFragment_to_viewRegisterFragment)
            }
        }
    }


}
