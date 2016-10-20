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

public class RotateActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.rotateInButton)
    public void rotateInEffect() {
        playEffect(Techniques.RotateIn);
    }

    @OnClick(R.id.rotateInDownLeftButton)
    public void rotateInDownLeftEffect() {
        playEffect(Techniques.RotateInDownLeft);
    }

    @OnClick(R.id.rotateInDownRightButton)
    public void rotateInDownRightEffect() {
        playEffect(Techniques.RotateInDownRight);
    }

    @OnClick(R.id.rotateInUpLeftButton)
    public void rotateInUpLeft() {
        playEffect(Techniques.RotateInUpLeft);
    }

    @OnClick(R.id.rotateInUpRightButton)
    public void rotateInUpRightEffect() {
        playEffect(Techniques.RotateInUpRight);
    }

    @OnClick(R.id.rotateOutButton)
    public void rotateOutEffect() {
        playEffect(Techniques.RotateOut);
    }

    @OnClick(R.id.rotateOutDownLeftButton)
    public void rotateOutDownLeftEffect() {
        playEffect(Techniques.RotateOutDownLeft);
    }

    @OnClick(R.id.rotateOutDownRightButton)
    public void rotateOutDownRightEffect() {
        playEffect(Techniques.RotateOutDownRight);
    }

    @OnClick(R.id.rotateOutUpLeftButton)
    public void rotateOutUpLeftEffect() {
        playEffect(Techniques.RotateOutUpLeft);
    }

    @OnClick(R.id.rotateOutUpRightButton)
    public void rotateOutUpRightEffect() {
        playEffect(Techniques.RotateOutUpRight);
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
