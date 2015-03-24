package com.androidhive.androidsqlite;

/**
 * Created by Md.Ziauddin on 22-Feb-15.
 */
public class Contacts {

    private int _id;
    private String _person_name;
    private int _person_number;

    public Contacts(){
    }

    public Contacts(String person_name,int person_number) {

        this._person_name = person_name;
        this._person_number = person_number;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_person_number() {
        return _person_number;
    }

    public void set_person_number(int _person_number) {
        this._person_number = _person_number;
    }

    public String get_person_name() {
        return _person_name;
    }

    public void set_person_name(String _person_name) {
        this._person_name = _person_name;
    }
}
