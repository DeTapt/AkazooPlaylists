package com.akazoo.akazooplaylists.Activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.akazoo.akazooplaylists.R;


public class BaseActivity extends AppCompatActivity {
    private ProgressDialog mProgressDialog;


    void initProgressDialog(){
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage("Loading...");
    }

    void showProgressDialog(){
        mProgressDialog.show();

    }

    void dismissProgressDialog(){
        if(mProgressDialog.isShowing()){
            mProgressDialog.dismiss();
        }
    }

    void networkError(){
        Toast.makeText(this, R.string.no_network, Toast.LENGTH_SHORT).show();
    }

    void responseError(){
        Toast.makeText(this, R.string.response_error, Toast.LENGTH_SHORT).show();
    }

    Boolean NetworkExists(Context ctx){

        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        return netInfo != null && netInfo.isConnectedOrConnecting();
    }


}
