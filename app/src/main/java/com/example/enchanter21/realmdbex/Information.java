package com.example.enchanter21.realmdbex;

import io.realm.RealmObject;

/**
 * Created by enchanter21 on 3/7/17.
 */
public class Information extends RealmObject{
    String name,email;
    String age;
    String mobileno;
    public String toString(){
        return "name:"+name+"email:"+email+"age:"+age+"mobileno:"+mobileno;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
}

