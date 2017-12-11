package com.jilyyang.test_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //第一步：声明一个String类型的数组，并初始化数组内容。
    private String[] s = {"郑州","开封","洛阳","济源","漯河","平顶山","驻马店","焦作","安阳","南阳","长垣","新乡","南阳","信阳","三门峡"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第二步：声明一个适配器并实例化。由于数据源是String数组，泛型中填写String。
        ArrayAdapter<String> adapte = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);

        //第三步：声明ListView对象，并实例化。
        ListView ls1 = (ListView) findViewById(R.id.ls1);

        //第四步：将适配器传递给ListView对象。
        ls1.setAdapter(adapte);
    }
}
