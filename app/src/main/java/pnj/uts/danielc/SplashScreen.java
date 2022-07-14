package pnj.uts.danielc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SplashScreen extends AppCompatActivity {
    Integer SplashTimeOut = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .repeat(1)
                .playOn(findViewById(R.id.image));
        YoYo.with(Techniques.ZoomIn)
                .duration(500)
                .repeat(1)
                .playOn(findViewById(R.id.tvAppAlumni));


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        }, 5000L);



    }
}