package com.example.enchanter21.realmdbex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button add1,view1,delete1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delete1=(Button)findViewById(R.id.delete);
        add1=(Button)findViewById(R.id.add);
        view1=(Button)findViewById(R.id.view);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,AddData.class);
                startActivity(i);
            }
        });
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,showData.class);
                startActivity(i1);
            }
        });
//        delete1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i2=new Intent(MainActivity.this,DelData.class);
//                startActivity(i2);
//            }
//        });
    }
}
