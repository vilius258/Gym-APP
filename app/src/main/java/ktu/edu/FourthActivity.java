package ktu.edu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FourthActivity extends AppCompatActivity {
    private ListView thisisthelist;
    private ListAdapter adapter;
    private Context context =this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        thisisthelist = (ListView) findViewById(R.id.listView); //lv
        Bundle b = getIntent().getExtras();
        final ArrayList<ListItem> q = (ArrayList<ListItem>) b.getSerializable("mylist");
        adapter = new ListAdapter(this, q);
        thisisthelist.setAdapter(adapter);
        thisisthelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(context, FifthActivity.class);
                intent.putExtra("image",q.get(position).getImageId());
                intent.putExtra("title",q.get(position).getTitle());
                intent.putExtra("description",q.get(position).getDescription());
                context.startActivity(intent);
            }
        });
    }
}
