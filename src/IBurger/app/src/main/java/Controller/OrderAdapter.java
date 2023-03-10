package Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iburger.R;

import java.util.List;

import Moudle.OrderModule;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderHolder> {

    List<OrderModule> listOrder;

    public OrderAdapter(List<OrderModule> listOrder) {
        this.listOrder = listOrder;
    }


    @NonNull
    @Override
    public OrderAdapter.OrderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order,null,false);

        return new OrderHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderHolder holder, int position) {

        OrderModule orderModule=listOrder.get(position);

        holder.backgroundOrder.setImageResource(orderModule.getBackgroundOrder());
        holder.imageOrder.setImageResource(orderModule.getImageOrder());
        holder.nameOrder.setText(orderModule.getNameOrder());
        holder.priceOrder.setText(orderModule.getPriceOrder());
      //  holder.numberOfOrder.setText(orderModule.getNumberOfOrder());

        final int[] counter = {0};

        holder.increaseOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]++;
                holder.numberOfOrder.setText(String.valueOf(counter[0]));

            }
        });


        holder.decreaseOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]--;
                if(counter[0]>=0){
                    holder.numberOfOrder.setText(String.valueOf(counter[0]));
                } else if (counter[0]<0) {
                    counter[0]=0;
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return listOrder.size();
    }

    public class OrderHolder extends RecyclerView.ViewHolder{

        ImageView backgroundOrder;
        ImageView imageOrder;
        TextView nameOrder,priceOrder,numberOfOrder;
        ImageView increaseOrder,decreaseOrder;
        public OrderHolder(@NonNull View itemView) {
            super(itemView);

            backgroundOrder=itemView.findViewById(R.id.image);
            imageOrder=itemView.findViewById(R.id.image_order);
            nameOrder=itemView.findViewById(R.id.name_order);
            priceOrder=itemView.findViewById(R.id.price_item_order);
            numberOfOrder=itemView.findViewById(R.id.number_item_order);
            increaseOrder=itemView.findViewById(R.id.increase_order);
            decreaseOrder=itemView.findViewById(R.id.decrease_order);


        }
    }
}
