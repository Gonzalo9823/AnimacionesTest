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

public class ZoomActivity extends AppCompatActivity {

    @BindView(R.id.attensionLabel) TextView mAttensionLabel;
    @BindView(R.id.attensionEffectSpeed) EditText mAttensionEffectSpeed;
    private long speedEffect = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        ButterKnife.bind(this);

        Context context = getApplicationContext();
        Toast.makeText(context, speedEffect + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.zoomInButton)
    public void zoomInEffect() {
        playEffect(Techniques.ZoomIn);
    }

    @OnClick(R.id.zoomInDownButton)
    public void zoomInDownEffect() {
        playEffect(Techniques.ZoomInDown);
    }

    @OnClick(R.id.zoomInLeftButton)
    public void zoomInLeftEffect() {
        playEffect(Techniques.ZoomInLeft);
    }

    @OnClick(R.id.zoomInRightButton)
    public void zoomInRightEffect() {
        playEffect(Techniques.ZoomInRight);
    }

    @OnClick(R.id.zoomInUpButton)
    public void zoomInUpEffect() {
        playEffect(Techniques.ZoomInUp);
    }

    @OnClick(R.id.zoomOutButton)
    public void zoomOutEffect() {
        playEffect(Techniques.ZoomOut);
    }

    @OnClick(R.id.zoomOutDownButton)
    public void zoomOutDownEffect() {
        playEffect(Techniques.ZoomOutDown);
    }

    @OnClick(R.id.zoomOutLeftButton)
    public void zoomOutLeftEffect() {
        playEffect(Techniques.ZoomOutLeft);
    }

    @OnClick(R.id.zoomOutRightButton)
    public void zoomOutRightEffect() {
        playEffect(Techniques.ZoomOutRight);
    }

    @OnClick(R.id.zoomOutUpButton)
    public void zoomOutUpButton() {
        playEffect(Techniques.ZoomOutUp);
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
