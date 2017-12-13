# Android_Listview
* 文件夹ListView下为ListView的基本用法，实现此功能需要四步骤。
1. 第一步：声明一个String类型的数组，并初始化数组内容。
2. 第二步：声明一个适配器并实例化。由于数据源是String数组，泛型中填写String。
3. 第三步：声明ListView对象，并实例化。
4. 第四步：将适配器传递给ListView对象。
# 
# 
* 文件夹Test_ListView3为在同一个Acticity上显示两个ListView，点击左侧Item，右侧对应显示相关的内容。

* Test_RecyclerView的项目中演示了该控件的基本用法：
1. 第一步：创建RecyclerView控件，宽和高为match_parent;
2. 第二步：创建RecyclerView中Item的布局文件fruit_item.xml;在该布局中添加了一个ImageView和TextView，水平布置。
3. 第三步：创建Fruit类，即Item布局对应的对象类。
4. 第四步：创建适配器FruitAdapter类;
* 在MainActivity中添加如下代码：
5. 声明Fruit型的List，并实例化。
6. 初始化数据：创建若干的Fruit实例，并添加到List对象中。
7. 声明RecyclerView控件变量并实例化。
8. 创建LinearLayoutManager对象，用于指定RecyclerView中的布局。
9. 将创建的布局传递给RecyclerView。
10. 声明适配器，并实例化。
11. 将适配器传递给RecyclerView。