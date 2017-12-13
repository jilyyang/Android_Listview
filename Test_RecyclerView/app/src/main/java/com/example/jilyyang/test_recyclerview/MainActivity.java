package com.example.jilyyang.test_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //声明一个对象列表，对象的类型为Fruit。
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //声明若干个Fruit对象
        Fruit fruit1 = new Fruit("fruit1",R.mipmap.ic_launcher);
        Fruit fruit2 = new Fruit("fruit2",R.mipmap.ic_launcher);
        Fruit fruit3 = new Fruit("fruit3",R.mipmap.ic_launcher);
        Fruit fruit4 = new Fruit("fruit4",R.mipmap.ic_launcher);
        Fruit fruit5 = new Fruit("fruit5",R.mipmap.ic_launcher);
        Fruit fruit6 = new Fruit("fruit6",R.mipmap.ic_launcher);
        Fruit fruit7 = new Fruit("fruit7",R.mipmap.ic_launcher);

        //将Fruit对象加入列表中
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);
        fruitList.add(fruit6);
        fruitList.add(fruit7);

        //声明RecyclerView并赋值；
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycylerview);

        //创建LayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);//布局方式是垂直结构。

        //设置布局方式。
        recyclerView.setLayoutManager(layoutManager);

        //创建一个适配器，并实例化
        FruitAdapter adapter = new FruitAdapter(fruitList);

        //将适配器传递给view
        recyclerView.setAdapter(adapter);

    }
}
