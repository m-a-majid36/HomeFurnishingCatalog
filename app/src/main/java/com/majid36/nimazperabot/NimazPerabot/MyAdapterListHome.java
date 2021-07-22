package com.majid36.nimazperabot.NimazPerabot;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.user.NimazPerabot.R;

class MyAdapterListHome extends RecyclerView.Adapter<MyAdapterListHome.MyViewHolder> {

    String dataUsername[];
    String dataId[];
    String dataLocation[];
    Integer dataImage[];

    Context context;

    public MyAdapterListHome(Context ct, String username[], String id[], Integer img[], String location[]){
        context = ct;
        dataUsername = username;
        dataId = id;
        dataImage = img;
        dataLocation = location;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cards_layout_account, parent, false);
        return new MyViewHolder(view);
    }

    //menset cardlist
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tvUsername.setText(dataUsername[position]);
        holder.tvId.setText(dataId[position]);
        holder.ivPP.setImageResource(dataImage[position]);
        holder.cardAccount.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Account account = new Account();

                account.setUsername(dataUsername[position]);
                account.setId(dataId[position]);
                account.setImg(dataImage[position]);
                account.setLocation(dataLocation[position]);

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_ACCOUNT, account);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataUsername.length;
    }

    // declare layout
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvUsername;
        TextView tvId;
        ImageView ivPP;
        LinearLayout cardAccount;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tvUsername);
            tvId = itemView.findViewById(R.id.tvId);
            ivPP = itemView.findViewById(R.id.ivPP);
            cardAccount = itemView.findViewById(R.id.main_card_account);
        }
    }
}
