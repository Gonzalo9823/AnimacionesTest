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

public class FlipActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.flipInXButton)
    public void flipInXEffect() {
        playEffect(Techniques.FlipInX);
    }

    @OnClick(R.id.flipOutXButton)
    public void flipOutXEffect() {
        playEffect(Techniques.FlipOutX);
    }

    @OnClick(R.id.flipOutYButton)
    public void flipOutYEffect() {
        playEffect(Techniques.FlipOutY);
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
