package com.lustig.projectlynx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class FormChooserActivity extends ActionBarActivity {

    // Doctor, dentist, or generic
    public static String form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_chooser);
    }

    public void doctor(View v) {

        form = Constants.DOCTOR_KEY;

        // Go to doctor form with correct user, bugs or bravo
        startActivity(new Intent(this, FormFilledActivity.class));

    }

    public void dentist(View v) {

        form = Constants.DENTIST_KEY;

        // Go to doctor form with correct user, bugs or bravo
        startActivity(new Intent(this, FormFilledActivity.class));

    }

    public void generic(View v) {

        form = Constants.GENERIC_KEY;

        // Go to doctor form with correct user, bugs or bravo
        startActivity(new Intent(this, FormFilledActivity.class));

    }

}
