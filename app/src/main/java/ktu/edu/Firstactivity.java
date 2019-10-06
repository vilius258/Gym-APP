package ktu.edu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Firstactivity extends AppCompatActivity {

    private Button myButton;
    private TextView mytextField;
    private Button secondActivityButton;
    private Context context =this;
    private Button thirdActivityButton;
    private  Button fourthActivityButton;
    List<ListItem> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity);

        myButton =(Button) findViewById((R.id.button)); // First Button
        mytextField =(TextView) findViewById(R.id.textfield); //Textfield
        secondActivityButton= (Button) findViewById(R.id.secondActivityButton); // secondbutton
        thirdActivityButton = (Button) findViewById(R.id.thirdActivityButton);
        fourthActivityButton = (Button) findViewById(R.id.fourthActivityButton);
        // All of the listeners in first screen
        myButton.setOnClickListener(myButtonClick);
        secondActivityButton.setOnClickListener(startSecondActivity);
        thirdActivityButton.setOnClickListener(startThirdActivity);
        fourthActivityButton.setOnClickListener(startFourthActivity);
        secondActivityButton.setOnLongClickListener(startSecibdActivityLong);
        items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));
        items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));
        items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));
        items.add(new ListItem("mathematics", R.drawable.ic_android_black_24dp, "Mathematics is the study of topis such as quantity,structurre," + "space and change."));

    }
// First button response
    View.OnClickListener myButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mytextField.setText(mytextField.getText()+"\n" + "Next line");
        }
    };
    // Second Activity start code
    public void runSecondActivity(boolean b)
    {
        Intent intent= new Intent(context, SecondActivity.class);
        intent.putExtra("flag", b);
        context.startActivity(intent);
    }
    View.OnClickListener startSecondActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            runSecondActivity(true);
        }
    };
    View.OnLongClickListener startSecibdActivityLong = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            runSecondActivity(false);
            return true;
        }
    };
    // Third Activity start code
    public void runThirdActivity(boolean b)
    {
        Intent intent= new Intent(context, ThirdActivity.class);
        intent.putExtra("flag", b);
        context.startActivity(intent);
    }
    View.OnClickListener startThirdActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            runThirdActivity(true);
        }
    };
    // Fourth Activity start code
    public void runFourthActivity(boolean b)
    {
        Bundle d = new Bundle();

        d.putSerializable("mylist", (Serializable) items);
        Intent intent = new Intent(context, FourthActivity.class);
        intent.putExtras(d);
        context.startActivity(intent);
    }
    View.OnClickListener startFourthActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            runFourthActivity(true);
        }
    };


}
