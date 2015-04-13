package com.lustig.projectlynx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    // bugs or bravo (use Constants.X_NAME)
    public static String user = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bravo(View v) {

        user = Constants.BRAVO_NAME;

        // Start activity with Johnny's info
        startActivity(new Intent(this, FormChooserActivity.class));

    }

    public void bugs(View v) {

        user = Constants.BUGS_NAME;

        // Start activity with Bug's info
        startActivity(new Intent(this, FormChooserActivity.class));

    }

}
