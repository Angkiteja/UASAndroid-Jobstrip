package com.firejobcourse.apps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    //membuat variable
    Context context;
    ArrayList<Pengguna> list;

    //constructor
    public MyAdapter(Context context, ArrayList<Pengguna> list) {
        this.context = context;
        this.list = list;
    }

    //membuat objek di class view
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return  new MyViewHolder(v);
    }

    //membuat objek pengguna
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Pengguna pengguna = list.get(position);
        holder.namaLengkap.setText(pengguna.getNamaLengkap());
        holder.password.setText(pengguna.getPassword());
        holder.username.setText(pengguna.getUsername());
        holder.emailAddress.setText(pengguna.getEmailAddress());
        holder.bio.setText(pengguna.getBio());
        holder.noTelp.setText(pengguna.getNoTelp());
        holder.Linked.setText(pengguna.getLinked());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //mendefinisikan textview di view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaLengkap,password, username, emailAddress,
                bio, noTelp, Linked;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            namaLengkap = itemView.findViewById(R.id.tvNamaLengkap);
            password = itemView.findViewById(R.id.tvPassword);
            username = itemView.findViewById(R.id.tvUsername);
            emailAddress = itemView.findViewById(R.id.tvEmailAddress);
            bio = itemView.findViewById(R.id.tvBio);
            noTelp = itemView.findViewById(R.id.tvNoTelp);
            Linked = itemView.findViewById(R.id.tvLinked);

        }
    }

}
