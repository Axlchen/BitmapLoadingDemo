package xyz.axlchen.bitmaploadingdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<Map<String, String>> data = new ArrayList<>();
        Map map1 = new HashMap();
        map1.put("path", "SD卡加载图片");

        Map map2 = new HashMap();
        map2.put("path", "drawable-mdpi目录加载图片");

        Map map3 = new HashMap();
        map3.put("path", "drawable-hdpi目录加载图片");

        Map map4 = new HashMap();
        map4.put("path", "drawable-xhdpi目录加载图片");

        Map map5 = new HashMap();
        map5.put("path", "drawable-xxhdpi目录加载图片");

        Map map6 = new HashMap();
        map6.put("path", "drawable-xxhdpi目录加载图片");

        data.add(map1);
        data.add(map2);
        data.add(map3);
        data.add(map4);
        data.add(map5);
        data.add(map6);

        ListAdapter adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_1, new String[]{"path"},
                new int[]{android.R.id.text1});
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

    }
}
