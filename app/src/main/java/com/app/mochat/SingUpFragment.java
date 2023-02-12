package com.app.mochat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.app.mochat.databinding.FragmentSingUpBinding;

public class SingUpFragment extends Fragment {

    private DatabaseHelper mDbHelper;
    private FragmentSingUpBinding binding;

    /*DATABASE HANDLING SECTION*/
    private double user_id;
    private String user_name;
    private String user_password;
    private String phone_number;

    //constructor for getting the data
    public SingUpFragment(double user_id, String user_name, String user_password, String phone_number) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.phone_number = phone_number;
    }
    public SingUpFragment() {}
    //to string methods for printing the contexts of the class objects.
    @NonNull
    @Override
    public String toString() {
        return "DatabaseHelper{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
    //This are the senders and getters for the users table
    public double getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_password() {
        return user_password;
    }
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }



    /*UI HANDLING METHODS SECTION*/
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSingUpBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    //this is the code for the opening the main page
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//             NavHostFragment.findNavController(SingUpFragment.this)
//                      .navigate(R.id.action_SignUpFragment_to_FirstFragment);
//                System.out.println("the navigation part is working");
//
        }
        });
    }
    private FragmentSingUpBinding getMenuInflater() {
        return null;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}