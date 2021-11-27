package com.example.buttoncolor_alertdialogex101;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author Agam Toledano
 * @version 1.0
 * @since 26/11/2021
 * Short description - Credits screen.
 */

public class CreditActivity extends AppCompatActivity {
    TextView ctext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        ctext = (TextView) findViewById(R.id.ctext);

        ctext.setText("Credits:\n\n\n"+ "- https://findicons.com/");
    }

    /**
     * Button:
     * Short description - Go To Activity_Main.
     *
     * <p>
     *
     * @param view
     */
    public void goBack(View view) {
        finish();
    }
}