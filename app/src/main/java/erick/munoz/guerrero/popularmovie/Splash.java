package erick.munoz.guerrero.popularmovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(2500);
                }catch (InterruptedException e){
                    //sj
                }finally{
                    Intent j = new Intent(Splash.this,MainActivity.class);
                    startActivity(j);
                    finish();
                }
            }
        };
        t.start();
    }
}
