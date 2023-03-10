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

import com.example.iburger.R;

import java.util.ArrayList;
import java.util.List;

import Controller.FoodAdapter;
import Moudle.FoodMoudle;


public class SnaksFragment extends Fragment {




    public SnaksFragment() {
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_snaks,container,false);

        return myView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView=view.findViewById(R.id.recycler_snaks);
        List<FoodMoudle> listFood=new ArrayList<>();
        listFood.add(new FoodMoudle(R.drawable.item_1,"Chess Snaks","2jd","5jd","3"));
        listFood.add(new FoodMoudle(R.drawable.item_2,"Bfr Snaks","10jd","15jd","12"));
        listFood.add(new FoodMoudle(R.drawable.item_3,"Beef Snaks","5jd","10jd","14"));
        listFood.add(new FoodMoudle(R.drawable.item_1,"Mash Snaks","3jd","7jd","5"));
        listFood.add(new FoodMoudle(R.drawable.item_2,"Super Snaks","12jd","17jd","6"));
        listFood.add(new FoodMoudle(R.drawable.item_3,"Lolo Snaks","17jd","21jd","1"));
        listFood.add(new FoodMoudle(R.drawable.item_1,"Tas Snaks","8jd","13jd","6"));

        FoodAdapter foodAdapter=new FoodAdapter(listFood);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);



    }


}