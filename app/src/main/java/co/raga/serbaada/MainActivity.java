package co.raga.serbaada;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {
    private AVLoadingIndicatorView avi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avi= (AVLoadingIndicatorView) findViewById(R.id.avii);
        avi.setIndicator("BallClipRotateMultipleIndicator");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this,IntroSlider.class);
                startActivity(i);

            }
        },10000);

    }

    public void hideClick(View view) {
        avi.hide();
        // or avi.smoothToHide();
    }

    public void showClick(View view) {
        avi.show();
        // or avi.smoothToShow();
    }
}
