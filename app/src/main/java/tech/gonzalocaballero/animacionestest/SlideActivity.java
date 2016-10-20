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

public class SlideActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.slideInLeftButton)
    public void slideInLeftEffect() {
        playEffect(Techniques.SlideInLeft);
    }

    @OnClick(R.id.slideInRightButton)
    public void slideInRightEffect() {
        playEffect(Techniques.SlideInRight);
    }

    @OnClick(R.id.slideInUpButton)
    public void slideInUpEffect() {
        playEffect(Techniques.SlideInUp);
    }

    @OnClick(R.id.slideInDownButton)
    public void slideIndownEffect() {
        playEffect(Techniques.SlideInDown);
    }

    @OnClick(R.id.slideOutLeftButton)
    public void slideOutLeftEffect() {
        playEffect(Techniques.SlideOutLeft);
    }

    @OnClick(R.id.slideOutRightButton)
    public void slideOutRightEffect() {
        playEffect(Techniques.SlideOutRight);
    }

    @OnClick(R.id.slideOutUpButton)
    public void slideOutUpEffect() {
        playEffect(Techniques.SlideOutUp);
    }

    @OnClick(R.id.slideOutDownButton)
    public void slideOutDownEffect() {
        playEffect(Techniques.SlideOutDown);
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
