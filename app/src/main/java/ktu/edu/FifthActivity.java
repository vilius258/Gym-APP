package ktu.edu;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    ImageView ProfileImage;
    TextView Title;
    TextView Description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        ProfileImage = (ImageView)findViewById(R.id.profileimage);
        Title = (TextView)findViewById(R.id.title);
        Description = findViewById(R.id.description);
        ProfileImage.setImageResource(getIntent().getIntExtra("image",0));
        Title.setText(getIntent().getStringExtra("title"));
        Description.setText(getIntent().getStringExtra("description"));

    }
}
