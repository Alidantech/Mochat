package com.app.mochat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.app.mochat.databinding.FragmentSingUpBinding;

public class SingUpFragment extends Fragment {
    private DatabaseHelper mDbHelper;
    //ui components
    Button btn_register;
    EditText name, phone, password;
    ListView list;
    private FragmentSingUpBinding binding;



    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSingUpBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    //this is the code for the floating action bar
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SingUpFragment.this)
                        .navigate(R.id.action_SignUpFragment_to_FirstFragment);
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