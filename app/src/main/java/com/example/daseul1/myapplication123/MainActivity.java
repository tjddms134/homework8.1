package com.example.daseul1.myapplication123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioButton jellybean;
    RadioButton kitcat;
    RadioButton lollipop;
    RadioGroup os;
    LinearLayout linear1;
    ImageView img;
    Button end;
    Button first;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox= (CheckBox) findViewById(R.id.checkBox2);
        linear1 = (LinearLayout)findViewById(R.id.linear1);
        img = (ImageView)findViewById(R.id.imageView2) ;
        end = (Button)findViewById(R.id.button) ;
        os = (RadioGroup) findViewById(R.id.RadioGroup);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linear1.setVisibility(View.VISIBLE);
                } else {
                    linear1.setVisibility(View.INVISIBLE);
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (os.getCheckedRadioButtonId() == R.id.dog) {
                    img.setImageResource(R.drawable.dog);
                } else if (os.getCheckedRadioButtonId() == R.id.cat) {
                    img.setImageResource(R.drawable.cat);
                } else {
                    img.setImageResource(R.drawable.rabbit);
                }
            }
        });
    }
}