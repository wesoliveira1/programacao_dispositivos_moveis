package com.example.wesley.tela_botao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button buttonIr1 = (Button)findViewById(R.id.buttonIr1);
    Button buttonIr2 = (Button)findViewById(R.id.buttonIr2);
    Button buttonIr3 = (Button)findViewById(R.id.buttonIr3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIr1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(MainActivity.this,activity_tela_1.class);
                startActivity(it);
            }
        });
        buttonIr2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(MainActivity.this,activity_tela_1.class);
                startActivity(it);
            }
        });
        buttonIr2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(MainActivity.this,activity_tela_1.class);
                startActivity(it);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
