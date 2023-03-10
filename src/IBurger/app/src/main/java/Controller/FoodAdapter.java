package Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iburger.R;

import java.util.List;

import Moudle.FoodMoudle;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {

    List<FoodMoudle> listFood;

    public FoodAdapter(List<FoodMoudle>listFood){
        this.listFood=listFood;
    }




    @NonNull
    @Override
    public FoodAdapter.FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,null,false);


        return new FoodHolder(myView);
    }





    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.FoodHolder holder, int position) {

        FoodMoudle foodMoudle=listFood.get(position);
        holder.imageBackground.setImageResource(foodMoudle.getImageBackground());
        holder.foodName.setText(foodMoudle.getFoodName());
        holder.priceFood.setText(foodMoudle.getFoodPrice());
        holder.priceMale.setText(foodMoudle.getMalePrice());
       // holder.theNumberFood.setText(foodMoudle.getFoodNumber());

        final int[] counter = {0};

        holder.increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]++;
                holder.theNumberFood.setText(String.valueOf(counter[0]));

            }
        });


        holder.decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]--;
                if(counter[0]>=0){
                    holder.theNumberFood.setText(String.valueOf(counter[0]));
                } else if (counter[0]<0) {
                    counter[0]=0;
                }

            }
        });




    }





    @Override
    public int getItemCount() {
        return listFood.size();
    }





    public class FoodHolder extends RecyclerView.ViewHolder {

        ImageView imageBackground;
        RadioButton foodName;
        TextView priceFood;
        TextView priceMale;
        TextView theNumberFood;

        ImageView increase;
        ImageView decrease;
        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imageBackground=itemView.findViewById(R.id.iamge);
            foodName=itemView.findViewById(R.id.radio_button_name_food);
            priceFood=itemView.findViewById(R.id.food_price);
            priceMale=itemView.findViewById(R.id.male_price);
            theNumberFood=itemView.findViewById(R.id.food_number);
            increase=itemView.findViewById(R.id.increase);
            decrease=itemView.findViewById(R.id.decrease);


        }
    }
}
