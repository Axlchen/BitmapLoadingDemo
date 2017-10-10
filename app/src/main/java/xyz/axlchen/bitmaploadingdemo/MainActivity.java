package xyz.axlchen.bitmaploadingdemo;

import android.app.ListActivity;
import android.content.Intent;
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

        Map<String, String> map1 = new HashMap();
        map1.put("path", "从SD卡加载图片");

        Map<String, String> map2 = new HashMap();
        map2.put("path", "从assets目录加载图片");

        Map<String, String> map3 = new HashMap();
        map3.put("path", "从drawable目录加载图片");

        Map<String, String> map4 = new HashMap();
        map4.put("path", "从drawable-mdpi目录加载图片");

        Map<String, String> map5 = new HashMap();
        map5.put("path", "从drawable-hdpi目录加载图片");

        Map<String, String> map6 = new HashMap();
        map6.put("path", "从drawable-xhdpi目录加载图片");

        Map<String, String> map7 = new HashMap();
        map7.put("path", "从drawable-xxhdpi目录加载图片");

        Map<String, String> map8 = new HashMap();
        map8.put("path", "从drawable-xxxhdpi目录加载图片");

        data.add(map1);
        data.add(map2);
        data.add(map3);
        data.add(map4);
        data.add(map5);
        data.add(map6);
        data.add(map7);
        data.add(map8);

        ListAdapter adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_1, new String[]{"path"},
                new int[]{android.R.id.text1});
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, DisplayActivity.class);
        switch (position) {
            case 0:
                intent.putExtra("type", "sd");
                break;
            case 1:
                intent.putExtra("type", "assets");
                break;
            case 2:
                intent.putExtra("type", "");
                break;
            case 3:
                intent.putExtra("type", "mdpi");
                break;
            case 4:
                intent.putExtra("type", "hdpi");
                break;
            case 5:
                intent.putExtra("type", "xhdpi");
                break;
            case 6:
                intent.putExtra("type", "xxhdpi");
                break;
            case 7:
                intent.putExtra("type", "xxxhdpi");
                break;
            default:
        }
        startActivity(intent);
    }
}
