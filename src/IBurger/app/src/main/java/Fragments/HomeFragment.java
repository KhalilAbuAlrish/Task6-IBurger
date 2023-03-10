package Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.iburger.R;


public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_home,container,false);

        return myView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView burgerPage=view.findViewById(R.id.burger_home);
        ImageView snaksPage=view.findViewById(R.id.burger_snaks);

        burgerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.frame_layout,new BurgerFragment())
                        .addToBackStack(null).commit();

            }
        });

        snaksPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout,new SnaksFragment())
                        .addToBackStack(null).commit();
            }
        });



    }
}