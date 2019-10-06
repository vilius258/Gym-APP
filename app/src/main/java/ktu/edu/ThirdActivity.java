package ktu.edu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    private ListView aaa;
    private ListAdapter adapter;
    private Button additem;
    List<ListItem> itemslist = new ArrayList<>(); //itemlist
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        aaa = (ListView) findViewById(R.id.listView); //lv
        additem = (Button) findViewById(R.id.add_item);

        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = itemslist.size() +1;
                itemslist.add(new ListItem("Jack", R.drawable.ic_android_black_24dp, "Mathematic,Chemistry"));
                adapter.notifyDataSetChanged();
            }
        });

        adapter = new ListAdapter(this, itemslist);

        aaa.setAdapter(adapter);
    }
}
