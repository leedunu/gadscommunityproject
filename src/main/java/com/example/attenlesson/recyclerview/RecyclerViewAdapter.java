package com.example.attenlesson.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attenlesson.R;
import com.example.attenlesson.model.DataModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Holder> {
    private ArrayList<DataModel> model;

    public RecyclerViewAdapter(ArrayList<DataModel> model){
        this.model = model;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent, false);
        Holder holder = new Holder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.Holder holder, int position) {
       TextView contents = holder.contents;
       TextView title = holder.title;

       contents.setText(model.get(position).getLecture());
       title.setText(model.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView title;
        TextView contents;

        public Holder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            contents = itemView.findViewById(R.id.cont);
        }
    }


}
