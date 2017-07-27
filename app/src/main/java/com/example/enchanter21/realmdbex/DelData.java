package com.example.enchanter21.realmdbex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

import static com.example.enchanter21.realmdbex.R.id.splist;

public class DelData extends AppCompatActivity {

    Realm realm;
    Spinner sp1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deletedata);
        sp1 = (Spinner) findViewById(splist);
        Realm.init(this);
        realm = Realm.getDefaultInstance();

        RealmResults<Information> results = realm.where(Information.class).findAllAsync();
        results.load();
        String output = "";
        for (Information information : results) {
            output += information.toString();
        }
        sp1.setContentDescription(output);
        sp1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s1=sp1.getSelectedItem().toString();
                Toast.makeText(getBaseContext(),s1,Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realm.beginTransaction();
                Information obj=realm.createObject(Information.class);
                obj.deleteFromRealm();
                realm.commitTransaction();
                finish();
            }
        });

    }
}
