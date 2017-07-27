package com.example.enchanter21.realmdbex;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class showData extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showview);
        TextView show=(TextView)findViewById(R.id.show);
        Realm.init(this);
        Realm realm=Realm.getDefaultInstance();
        RealmResults<Information> results=realm.where(Information.class).findAllAsync();
        results.load();
        String output="";
        for (Information information:results){
            output+=information.toString();
        }
        show.setText(output);
    }
}
