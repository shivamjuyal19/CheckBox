package com.example.pc77.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View v)
    {
       CheckBox cb1=(CheckBox)findViewById(R.id.checkBox5);
       CheckBox cb2=(CheckBox)findViewById(R.id.checkBox6);
       CheckBox cb3=(CheckBox)findViewById(R.id.checkBox7);
       CheckBox cb4=(CheckBox)findViewById(R.id.checkBox8);
       String str=new String();
       if(cb1.isChecked())
       {
           str+=cb1.getText().toString();
       }
        if(cb2.isChecked())
        {
            str+=cb2.getText().toString();
        }
        if(cb3.isChecked())
        {
            str+=cb3.getText().toString();
        }
        if(cb4.isChecked())
        {
            str+=cb4.getText().toString();
        }
        if(str.isEmpty())
        {
            Toast.makeText(this,"Language Selected is none ",Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this,"Language Selected is " +str,Toast.LENGTH_SHORT).show();

    }
}
