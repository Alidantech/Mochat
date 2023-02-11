package com.app.mochat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.app.mochat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //db ui components
    Button btn_register;
    Button printer;
    EditText name, phone, password;
    ListView list;

    //variables
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean valid_user = false;

        setContentView(R.layout.fragment_sing_up);
        name = findViewById(R.id.user_name);
        phone = findViewById(R.id.phone_number);
        password = findViewById(R.id.password_text);
        btn_register = findViewById(R.id.button_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this a reference to the constructor that refers to the user details.
                SingUpFragment singUpFragment;

                singUpFragment = new SingUpFragment(Math
                        .random()*1000000,name
                        .getText().toString(),phone
                        .getText().toString(),password
                        .getText().toString());
                System.out.println("Added the user successfully");
                DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);
                databaseHelper.addone(singUpFragment);
            }
        });
      binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());
//        setSupportActionBar(binding.toolbar);
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}