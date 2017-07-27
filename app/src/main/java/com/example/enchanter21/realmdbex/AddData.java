package com.example.enchanter21.realmdbex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import io.realm.Realm;

public class AddData extends AppCompatActivity {

    EditText name,age,email,phoneno;
    Realm realm;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addview);
        name=(EditText)findViewById(R.id.name);
        age=(EditText)findViewById(R.id.age);
        email=(EditText)findViewById(R.id.email);
        phoneno=(EditText)findViewById(R.id.phone);
        Realm.init(this);
        realm=Realm.getDefaultInstance();
        findViewById(R.id.addbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realm.beginTransaction();
                Information obj=realm.createObject(Information.class);
                obj.setName(name.getText().toString());
                obj.setAge(age.getText().toString());
                obj.setEmail(email.getText().toString());
                obj.setMobileno(phoneno.getText().toString());
                realm.commitTransaction();
                finish();
            }
        });
    }
}
