package com.politecnico.mapunto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    /** Duracion de espera **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /* Nuevo handle(identificador) para iniciar DashBoardActivity
         * y cerrar este Splashscreen despues de unos segundos. */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*Crea an Intent que iniciara DashboardActivity(SplashScreen)*/
                Intent intent = new Intent(SplashScreen.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}