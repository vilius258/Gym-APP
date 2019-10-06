package ktu.edu;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private ListView mylist;
    private ListAdapter adapter;
    List<ListItem> items = new ArrayList<>(); //itemlist
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mylist = (ListView) findViewById(R.id.listView); //lv
        Intent intent = getIntent();
        if (intent.getBooleanExtra("flag", true)) {
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
            items.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));

        } else {
            items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));
            items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));
        }
        adapter = new ListAdapter(this, items);
/*
        mylist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                SparseBooleanArray positionchecker = mylist.getCheckedItemPositions();
                int count = mylist.getCount();

                for(int item = count-1; item>=0;item--){
                    if(positionchecker.get(item)){
                        adapter.remove(items.get(item));
                    }
                }
                positionchecker.clear();
                adapter.notifyDataSetChanged();
                return false;
            }
        });
        */
        mylist.setAdapter(adapter);
    }

}
