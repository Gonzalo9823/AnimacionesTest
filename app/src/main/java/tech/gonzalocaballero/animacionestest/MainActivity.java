package tech.gonzalocaballero.animacionestest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = R.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.attensionButton)
    public void goToAttension () {
        Log.e(TAG, "Go to attension");
        Intent intent = new Intent(MainActivity.this, AttensionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.specialButton)
    public void goToSpecial() {
        Log.e(TAG, "Go to special");
        Intent intent = new Intent(MainActivity.this, SpecialActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.bounceButton)
    public void goToBounce() {
        Log.e(TAG, "Go to bounce");
        Intent intent = new Intent(MainActivity.this, BounceActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.fadeButton)
    public void goToFade() {
        Log.e(TAG, "Go to fade");
        Intent intent = new Intent(MainActivity.this, FadeActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.flipButton)
    public void goToFlip() {
        Log.e(TAG, "Go to flip");
        Intent intent = new Intent(MainActivity.this, FlipActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.rotateButton)
    public void goToRotate() {
        Log.e(TAG, "Go to rotate");
        Intent intent = new Intent(MainActivity.this, RotateActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.slideButton)
    public void goToSlide() {
        Log.e(TAG, "Go to slide");
        Intent intent = new Intent(MainActivity.this, SlideActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.zoomButton)
    public void goToZoom() {
        Log.e(TAG, "Go to zoom");
        Intent intent = new Intent(MainActivity.this, ZoomActivity.class);
        startActivity(intent);
    }
}
