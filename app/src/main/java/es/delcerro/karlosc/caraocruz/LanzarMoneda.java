package es.delcerro.karlosc.caraocruz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Random;


public class LanzarMoneda extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzar_moneda);
        //Toast toast = Toast.makeText(this, "Hola mundo", Toast.LENGTH_LONG);
        //toast.show();
        String hola = "Hola!!!";
        Random rand = new Random();
        int num ;
        for(int i = 0; i < 10; i++) {
            try {
                num= rand.nextInt(2);
                if (num == 1)
                    Toast.makeText(this, "CARA", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "CRUZ", Toast.LENGTH_LONG).show();

            } catch (Exception e) {

            }
        }
        final  String TAG =
                LanzarMoneda.class.getSimpleName();
        Log.d(TAG, "mensaje de depuracion");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lanzar_moneda, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
