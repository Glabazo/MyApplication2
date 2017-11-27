package com.example.hp1.myapplication;
/*
@author Mich
 */

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.hp1.myapplication.R.id.home;

public class cump1 extends MainActivity{


    ListView PCI;
    ArrayList prgmName;

    public static int [] PCImage={R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,
            R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8,R.drawable.f9};
    public static String [] PCPriceList={"a","b","c","d","e","f","g","h","i"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cump1);
        prgmName=new ArrayList();
        for(int i=0;i<PCImage.length;i++)
            prgmName.add(new Pc(PCPriceList[i],PCImage[i]));

        PCI=(ListView) findViewById(R.id.lvp);
        CustomAdapter adapter = new CustomAdapter(this,R.layout.custom_row2,prgmName);
        PCI.setAdapter(adapter);
    }



    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_setting:

                final AlertDialog.Builder builder = new AlertDialog.Builder(cump1.this);
                builder.setMessage("Are you sure you want to exit?");
                builder.setCancelable(true);
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }
}

