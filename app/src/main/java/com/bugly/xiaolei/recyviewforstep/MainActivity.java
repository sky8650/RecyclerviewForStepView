package com.bugly.xiaolei.recyviewforstep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   RecyclerView  recy_list;
   StepAdapter  stepAdapter;
   CheckBox    check_status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy_list=findViewById(R.id.recy_list);
        check_status=findViewById(R.id.check_status);
        initVerTical();
        check_status.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    check_status.setText("横向");
                    initHorizontal();
                }else {
                    check_status.setText("竖向");
                    initVerTical();
                }
            }
        });
    }

   private   void   initHorizontal(){
       recy_list.setLayoutManager(new LinearLayoutManager(this,
               LinearLayoutManager.HORIZONTAL, false));
       List<String> stringList=new ArrayList<>();
       stringList.add("提交申请");
       stringList.add("审查");
       stringList.add("审核");
       stringList.add("退款");
       stringList.add("完成");
       stringList.add("关闭");
       stepAdapter=new StepAdapter(this,stringList,R.layout.item_horizontal_step);
       stepAdapter.setCurrentPosition(3);
       recy_list.setAdapter(stepAdapter);
   }


   private  void   initVerTical(){
       recy_list.setLayoutManager(new LinearLayoutManager(this,
               LinearLayoutManager.VERTICAL, false));
       List<String> stringList=new ArrayList<>();
       stringList.add("提交申请");
       stringList.add("审查");
       stringList.add("审核");
       stringList.add("退款");
       stringList.add("完成");
       stringList.add("关闭");
       stepAdapter=new StepAdapter(this,stringList,R.layout.item_step);
       stepAdapter.setCurrentPosition(3);
       recy_list.setAdapter(stepAdapter);
   }



}
