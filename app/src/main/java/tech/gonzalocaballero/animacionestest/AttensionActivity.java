package tech.gonzalocaballero.animacionestest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.daimajia.androidanimations.library.Techniques.Bounce;
import static com.daimajia.androidanimations.library.Techniques.Flash;
import static com.daimajia.androidanimations.library.Techniques.Pulse;
import static com.daimajia.androidanimations.library.Techniques.RubberBand;
import static com.daimajia.androidanimations.library.Techniques.Shake;
import static com.daimajia.androidanimations.library.Techniques.StandUp;
import static com.daimajia.androidanimations.library.Techniques.Swing;
import static com.daimajia.androidanimations.library.Techniques.Tada;
import static com.daimajia.androidanimations.library.Techniques.Wave;
import static com.daimajia.androidanimations.library.Techniques.Wobble;

public class AttensionActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attension);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.flashButton)
    public void flashEffect() {
        playEffect(Flash);
    }

    @OnClick(R.id.pulseButton)
    public void pulseEffect() {
        playEffect(Pulse);
    }

    @OnClick(R.id.rubberBandButton)
    public void ruubberEffect() {
        playEffect(RubberBand);
    }

    @OnClick(R.id.shakeButton)
    public void shakeEffect() {
        playEffect(Shake);
    }

    @OnClick(R.id.wobbleButton)
    public void wobbleButton() {
        playEffect(Wobble);
    }

    @OnClick(R.id.swingButton)
    public void swingEffect() {
       playEffect(Swing);
    }

    @OnClick(R.id.bounceButton)
    public void bounceEffect() {
        playEffect(Bounce);
    }

    @OnClick(R.id.tadaButton)
    public void tadaEffect() {
        playEffect(Tada);
    }

    @OnClick(R.id.standUpButton)
    public void standUpEffect() {
        playEffect(StandUp);
    }

    @OnClick(R.id.waveButton)
    public void waveButton() {
        playEffect(Wave);
    }

    private void playEffect(Techniques name) {
        getValueForSpeed();
        YoYo.with(name).duration(speedEffect).playOn(mAttensionLabel);
    }

    private void getValueForSpeed() {
        long newLong = Long.parseLong(mAttensionEffectSpeed.getText().toString());

        if (newLong <= 9999 && newLong > -1) {
            speedEffect = newLong;
        } else {
            Context context = getApplicationContext();
            Toast.makeText(context, "Por favor ingresa un numero entre 0 y 9999 (Este se reproducira en 700 por ahora)", Toast.LENGTH_LONG).show();
        }
    }
}
