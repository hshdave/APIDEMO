package com.example.harsh.apidemo;

import android.os.AsyncTask;

public class Asycdata extends AsyncTask<String, Void, String> {


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        //   System.out.println("From the Class json.....  "+s);
    }

    @Override
    protected String doInBackground(String... strings) {

        String jsonurl = strings[0];

        Httphandler sh = new Httphandler();

        System.out.println("From Owner Details............." + jsonurl);
        String jsonstr = sh.makeServiceCall(jsonurl);

        System.out.println("Do in Background service call : " + jsonstr);

        return jsonstr;
    }

}
