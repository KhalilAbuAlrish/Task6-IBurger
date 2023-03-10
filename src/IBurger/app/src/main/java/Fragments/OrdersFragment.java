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
import android.widget.ImageView;

import com.example.iburger.R;

import java.util.ArrayList;
import java.util.List;

import Controller.FoodAdapter;
import Controller.OrderAdapter;
import Moudle.FoodMoudle;
import Moudle.OrderModule;


public class OrdersFragment extends Fragment {


    public OrdersFragment() {
        // Required empty public constructor
    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_orders,container,false);

        return myView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView=view.findViewById(R.id.recycler_orders);
        ImageView orderCheck=view.findViewById(R.id.btn_order);
        List<OrderModule> listOrder=new ArrayList<>();

        listOrder.add(new OrderModule(R.drawable.item_1,R.drawable.fast_food,"Chess burger","3jd","7"));
        listOrder.add(new OrderModule(R.drawable.item_2,R.drawable.chicken_b,"Bfr Snaks","6jd","5"));
        listOrder.add(new OrderModule(R.drawable.item_3,R.drawable.fast_food,"Mash burger","8jd","4"));
        listOrder.add(new OrderModule(R.drawable.item_1,R.drawable.chicken_b,"Chess Snaks","4jd","3"));
        listOrder.add(new OrderModule(R.drawable.item_2,R.drawable.fast_food,"Super burger","10jd","8"));
        listOrder.add(new OrderModule(R.drawable.item_3,R.drawable.chicken_b,"Lolo Snaks","5jd","9"));


        OrderAdapter orderAdapter=new OrderAdapter(listOrder);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(orderAdapter);


        orderCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout,new CheckFragment())
                        .addToBackStack(null).commit();
            }
        });

    }








}