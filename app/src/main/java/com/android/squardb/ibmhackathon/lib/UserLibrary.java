package com.android.squardb.ibmhackathon.lib;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class UserLibrary {

    public String getTime(){
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

        return date;
    }
    public String getCurrentTemp(){

        return "";
    }
}
