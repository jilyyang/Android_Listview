package com.example.jilyyang.test_listview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //String[]类型的数据源
    private String[] s1 = {"关于","版本","应用"};
    private String[] s21 = {"作者：jilyyang","QQ：605320140","手机：15238360730","City：河南郑州"};
    private String[] s22 = {"Android4.0","V1.0.1","By-AndroidStudio"};
    private String[] s23 = {"微信","微博","腾讯视频","优酷","高德地图","美团","糯米","淘宝","支付宝","百度","via"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //定义四个适配器
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s1);
        final ArrayAdapter<String> adapter21 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s21);
        final ArrayAdapter<String> adapter22 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s22);
        final ArrayAdapter<String> adapter23 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s23);

        //声明变量并实例化
        ListView listView1 = findViewById(R.id.lv1);
        final ListView listView2 = findViewById(R.id.lv2);

        //listView1传入适配器
        listView1.setAdapter(adapter1);

        //listView1点击事件
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("点击位置",String.valueOf(position));

                //依据listView1中点击位置的不同，将对应的适配器传递给listView2中进行显示。
                switch (position){
                    case 0:
                        listView2.setAdapter(adapter21);
                        break;
                    case 1:
                        listView2.setAdapter(adapter22);
                        break;
                    case 2:
                        listView2.setAdapter(adapter23);
                        break;
                    default:
                        break;

                }

            }
        });


    }
}
