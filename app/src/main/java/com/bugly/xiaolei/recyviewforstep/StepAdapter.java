package com.bugly.xiaolei.recyviewforstep;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class StepAdapter extends RecyclerView.Adapter<StepAdapter.ViewHolder> {

    private Context context;
    private List<String> data;
    private   int   currentPosition;
    private   int   itemLayout;

    public StepAdapter(Context context, List<String> data,int itemLayout){
        this.context = context;
        this.data = data;
        this.itemLayout=itemLayout;

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(itemLayout,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.name.setText(data.get(position));
        if (position==0){
            holder.viewHead.setVisibility(View.INVISIBLE);
        }else {
            holder.viewHead.setVisibility(View.VISIBLE);
        }
        if (position==data.size()-1){
            holder.viewFoot.setVisibility(View.INVISIBLE);
        }else {
            holder.viewFoot.setVisibility(View.VISIBLE);
        }
        if (position<=currentPosition-1){//根据进度设置样式
            holder.img_position.setImageResource(R.drawable.icon_attention);
        }else {
            holder.img_position.setImageResource(R.drawable.icon_default);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("这里是点击每一行item的响应事件",""+position);
                Toast.makeText(context,data.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private View viewHead;
        private View  viewFoot;
        private ImageView img_position;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.content_name);
            viewHead=itemView.findViewById(R.id.view_head);
            viewFoot=itemView.findViewById(R.id.view_foot);
            img_position=itemView.findViewById(R.id.img_position);

        }
    }
    public   void   setCurrentPosition(int  currentPosition){
        this.currentPosition=currentPosition;
    }
}
