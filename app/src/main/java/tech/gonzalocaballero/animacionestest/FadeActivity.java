package tech.gonzalocaballero.animacionestest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FadeActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade);

        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.fadeInButton)
    public void fadeInEffect() {
        playEffect(Techniques.FadeIn);
    }

    @OnClick(R.id.fadeInUpButton)
    public void fadeInUpEffect() {
        playEffect(Techniques.FadeInUp);
    }

    @OnClick(R.id.fadeInDownButton)
    public void fadeInDownEffect() {
        playEffect(Techniques.FadeInDown);
    }

    @OnClick(R.id.fadeInLeftButton)
    public void fadeInLeftEffect() {
        playEffect(Techniques.FadeInLeft);
    }

    @OnClick(R.id.fadeInRightButton)
    public void fadeInRightEffect() {
        playEffect(Techniques.FadeInRight);
    }

    @OnClick(R.id.fadeOutButton)
    public void fadeOutEffect() {
        playEffect(Techniques.FadeOut);
    }

    @OnClick(R.id.fadeOutDownButton)
    public void fadeOutDownEffect() {
        playEffect(Techniques.FadeOutDown);
    }

    @OnClick(R.id.fadeOutLeftButton)
    public void fadeOutLeftEffect() {
        playEffect(Techniques.FadeOutLeft);
    }

    @OnClick(R.id.fadeOutRightButton)
    public void fadeOutRightEffect() {
        playEffect(Techniques.FadeOutRight);
    }

    @OnClick(R.id.fadeOutUpButton)
    public void fadeOutUpEffect() {
        playEffect(Techniques.FadeOutUp);
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
