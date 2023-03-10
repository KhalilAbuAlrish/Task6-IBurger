package com.example.iburger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import Fragments.BurgerFragment;
import Fragments.HomeFragment;
import Fragments.LocationsFragment;
import Fragments.OrdersFragment;
import Fragments.ProfileFragment;
import Fragments.SnaksFragment;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menuButton;
    TextView homeMenu,profileMenu,burgerMenu,snaksMenu,ordersMenu,locationsMenu,logoutMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawer_layout);
        menuButton=findViewById(R.id.menu_icon);
        homeMenu=findViewById(R.id.nav_home);
        profileMenu=findViewById(R.id.nav_profile);
        burgerMenu=findViewById(R.id.nav_burger);
        snaksMenu=findViewById(R.id.nav_snaks);
        ordersMenu=findViewById(R.id.nav_orders);
        locationsMenu=findViewById(R.id.nav_locations);
        logoutMenu=findViewById(R.id.nav_logout);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);
            }
        });

        homeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new HomeFragment());
            }
        });

        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new ProfileFragment());
            }
        });


        burgerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new BurgerFragment());
            }
        });


        snaksMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new SnaksFragment());
            }
        });

        ordersMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new OrdersFragment());
            }
        });


        locationsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new LocationsFragment());
            }
        });

        logoutMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        if(savedInstanceState==null){
            replaceFragment(new HomeFragment());
        }



    }




    public void openDrawer(DrawerLayout drawerLayout){

        // open drawer layout
        drawerLayout.openDrawer(GravityCompat.END);


    }

    public void closeDrawer(DrawerLayout drawerLayout){

        // check condition
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){

            // when drawer is open
            drawerLayout.closeDrawer(GravityCompat.END);

        }

    }


    public void replaceFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment)
                .addToBackStack(null).commit();

        closeDrawer(drawerLayout);

    }





























}