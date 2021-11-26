package com.example.buttoncolor_alertdialogex101;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Random;

/**
 * @author Agam Toledano
 * @version 1.0
 * @since 26/11/2021
 * Short description - Practice (Alert Dialog) - Each button activates a different type of Alert Dialog.
 */

public class MainActivity extends AppCompatActivity {
    View background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (View) findViewById(R.id.background);
    }

    /**
     * OptionMenu - Create
     * Short descriptions - Creation of OptionMenu
     * @param menu
     * @return super.onCreateOptionsMenu(menu)
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * OptionMenu - Create
     * Short descriptions - Activating the OptionMenu
     * @param item
     * @return super.onOptionsItemSelected(item)
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Intent si = new Intent(this,CreditActivity.class);
        startActivity(si);
        return super.onOptionsItemSelected(item);
    }

    /**
     * Button1:
     * Short description - Alert Dialog (Message)
     * <p>
     *
     * @param view
     * @return none
     */
    public void mesForUser(View view) {
        AlertDialog.Builder onlyM;
        onlyM = new AlertDialog.Builder(this);

        onlyM.setTitle("Message");
        onlyM.setMessage("Hello!");

        AlertDialog ad = onlyM.create();
        ad.show();
    }

    /**
     * Button2:
     * Short description - Alert Dialog (Message + Drawing)
     * <p>
     *
     * @param view
     * @return none
     */
    public void mesADraw(View view) {
        AlertDialog.Builder mesDra;
        mesDra = new AlertDialog.Builder(this);

        mesDra.setTitle("Message");
        mesDra.setMessage("Hello!");
        mesDra.setIcon(R.drawable.smiley);

        AlertDialog ad = mesDra.create();
        ad.show();
    }
    /**
     * Button3:
     * Short description - Alert Dialog (Message + Drawing + 1 Button)
     * <p>
     *
     * @param view
     * @return none
     */
    public void mDB(View view) {
        AlertDialog.Builder btnMD;
        btnMD = new AlertDialog.Builder(this);
        btnMD.setCancelable(false);

        btnMD.setTitle("Message");
        btnMD.setMessage("Hello!");
        btnMD.setIcon(R.drawable.smiley);
        btnMD.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog ad = btnMD.create();
        ad.show();
    }

    /**
     * Button4:
     * Short description - Alert Dialog (Message + 2 Buttons)
     * <p>
     *
     * @param view
     * @return none
     */
    public void randomC(View view) {
        AlertDialog.Builder bRandom;
        bRandom = new AlertDialog.Builder(this);
        bRandom.setCancelable(false);


        bRandom.setTitle("Background Color");
        bRandom.setMessage("Select a background for the screen");
        bRandom.setPositiveButton("Random Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                background.setBackgroundColor(randomColor());
            }
        });
        bRandom.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog ad = bRandom.create();
        ad.show();
    }

    /**
     * Button5:
     * Short description - Alert Dialog (Message + 3 Buttons)
     * <p>
     *
     * @param view
     * @return none
     */
    public void rWhiteC(View view) {
        AlertDialog.Builder bWhiteR;
        bWhiteR = new AlertDialog.Builder(this);
        bWhiteR.setCancelable(false);

        bWhiteR.setTitle("Background Color");
        bWhiteR.setMessage("Select a background for the screen");
        bWhiteR.setPositiveButton("Random Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                background.setBackgroundColor(randomColor());
            }
        });
        bWhiteR.setNeutralButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                background.setBackgroundColor(Color.alpha(Color.WHITE));
            }
        });
        bWhiteR.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog ad = bWhiteR.create();
        ad.show();
    }

    /**
     * int randomColor:
     * Short description - Color lottery
     * <p>
     *
     * @return color
     */
    public static int randomColor (){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return (color);
    }
}