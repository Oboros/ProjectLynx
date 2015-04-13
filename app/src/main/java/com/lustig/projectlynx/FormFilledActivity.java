package com.lustig.projectlynx;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lustig.projectlynx.model.BravoFields;
import com.lustig.projectlynx.model.BugsFields;
import com.lustig.projectlynx.model.Form;


/**
 * In this activity, we'll display all info form Bugs or Bravo
 *  for either the doctor, dentist, or generic form
 */
public class FormFilledActivity extends ActionBarActivity {

    TextView tvName;
    String form;

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_filled);

        root = (LinearLayout) findViewById(R.id.rootBitches);

        form = FormChooserActivity.form;

        tvName = (TextView) findViewById(R.id.name);
        tvName.setText(MainActivity.user);

        // Check which form, and then check which user
        // This is the worst code, but a wonderful
        // example of how truly helpful OOP is
        // Which really makes me wonder if avoiding the hastle
        // of creating serializable classes or using sqlite
        // or shared preferences was really worth the hassle.

        if (MainActivity.user.equals(Constants.BUGS_NAME)) {

            // Doctor
            if (form.equals(Constants.DOCTOR_KEY)) {

                for (int i = 0; i < Form.doctorFields.length
                        && i < BugsFields.doctorFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.doctorFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BugsFields.doctorFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

            // Dentist
            if (form.equals(Constants.DENTIST_KEY)) {

                for (int i = 0; i < Form.dentistFields.length
                        && i < BugsFields.doctorFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.dentistFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BugsFields.dentistFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

            // Generic
            if (form.equals(Constants.GENERIC_KEY)) {

                for (int i = 0; i < Form.genericFields.length
                        && i < BugsFields.genericFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.genericFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BugsFields.genericFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

        } else if (MainActivity.user.equals(Constants.BRAVO_NAME)) {

            // Doctor
            if (form.equals(Constants.DOCTOR_KEY)) {

                for (int i = 0; i < Form.doctorFields.length
                        && i < BugsFields.doctorFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.doctorFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BravoFields.doctorFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

            // Dentist
            if (form.equals(Constants.DENTIST_KEY)) {

                for (int i = 0; i < Form.dentistFields.length
                        && i < BravoFields.doctorFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.dentistFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BravoFields.dentistFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

            // Generic
            if (form.equals(Constants.GENERIC_KEY)) {

                for (int i = 0; i < Form.genericFields.length
                        && i < BravoFields.genericFields.length; ++i) {

                    TextView fieldTV = new TextView(this);
                    fieldTV.setText(Form.genericFields[i]);

                    TextView userTV = new TextView(this);
                    userTV.setText(BravoFields.genericFields[i]);


                    root.addView(fieldTV);
                    root.addView(userTV);

                }

            }

        }

    }

    public void submit(View v) {

        Toast.makeText(getApplicationContext(),
                       "ToDo, how should we implement?",
                       Toast.LENGTH_SHORT).show();

    }

}
