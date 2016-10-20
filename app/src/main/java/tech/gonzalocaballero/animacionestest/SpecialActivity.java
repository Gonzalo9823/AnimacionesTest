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

public class SpecialActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.hingeButton)
    public void hingeEffect() {
        playEffect(Techniques.Hinge);
    }

    @OnClick(R.id.rollInButton)
    public void rollInEffect() {
        playEffect(Techniques.RollIn);
    }

    @OnClick(R.id.rollOutButton)
    public void rollOutEffect() {
        playEffect(Techniques.RollOut);
    }

    @OnClick(R.id.landingButton)
    public void landingEffect() {
        playEffect(Techniques.Landing);
    }

    @OnClick(R.id.takingOffButton)
    public void takingOffEffect() {
        playEffect(Techniques.TakingOff);
    }

    @OnClick(R.id.dropOutButton)
    public void dropOutEffect() {
        playEffect(Techniques.DropOut);
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
