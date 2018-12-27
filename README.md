# RecyclerviewForStepView
一款由Recyclerview打造的步骤控件，支持横向和纵向
由Recyclerview构造而成， 节点的图片和样式可以根据需求改动， 节点的连接线可以自定义<br>
横向
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
   
  纵向
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
   ![](https://github.com/sky8650/RecyclerviewForStepView/blob/master/app/img/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181227092629.png)
   
