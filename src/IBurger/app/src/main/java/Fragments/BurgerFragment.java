package Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.iburger.R;

import java.util.ArrayList;
import java.util.List;

import Controller.FoodAdapter;
import Moudle.FoodMoudle;

public class BurgerFragment extends Fragment {





    public BurgerFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_burger,container,false);

        return myView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView=view.findViewById(R.id.recycler_burger);
        List<FoodMoudle>listFood=new ArrayList<>();
        listFood.add(new FoodMoudle(R.drawable.item_1,"Chess Burger","2jd","5jd","6"));
        listFood.add(new FoodMoudle(R.drawable.item_2,"Bfr Burger","10jd","15jd","8"));
        listFood.add(new FoodMoudle(R.drawable.item_3,"Beef Burger","5jd","10jd","15"));
        listFood.add(new FoodMoudle(R.drawable.item_1,"Mash Burger","3jd","7jd","14"));
        listFood.add(new FoodMoudle(R.drawable.item_2,"Super Burger","12jd","17jd","7"));
        listFood.add(new FoodMoudle(R.drawable.item_3,"Lolo Burger","17jd","21jd","5"));
        listFood.add(new FoodMoudle(R.drawable.item_1,"Tas Burger","8jd","13jd","3"));

        FoodAdapter foodAdapter=new FoodAdapter(listFood);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);



    }
}