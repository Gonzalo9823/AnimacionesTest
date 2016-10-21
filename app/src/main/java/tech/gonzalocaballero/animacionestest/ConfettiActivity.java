package tech.gonzalocaballero.animacionestest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.plattysoft.leonids.ParticleSystem;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfettiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confetti);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.makeConfetti)
    public void makeConfettiEffect(View arg0) {
        new ParticleSystem(this, 100, R.drawable.star_pink, 100000)
                .setSpeedRange(0.4f, 0.25f)
                .oneShot(arg0, 100);
    }
}
