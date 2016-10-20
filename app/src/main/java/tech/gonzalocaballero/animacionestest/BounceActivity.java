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

public class BounceActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce);

        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.bounceInButton)
    public void bounceInEffect() {
        playEffect(Techniques.BounceIn);
    }

    @OnClick(R.id.bounceInDownButton)
    public void bounceInDonwEffect() {
        playEffect(Techniques.BounceInDown);
    }

    @OnClick(R.id.bounceInLeftButton)
    public void bounceInLeftButton() {
        playEffect(Techniques.BounceInLeft);
    }

    @OnClick(R.id.bounceInRightButton)
    public void bounceInRightEffect() {
        playEffect(Techniques.BounceInRight);
    }

    @OnClick(R.id.bounceInUpButton)
    public void bounceInUpEffect() {
        playEffect(Techniques.BounceInUp);
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
