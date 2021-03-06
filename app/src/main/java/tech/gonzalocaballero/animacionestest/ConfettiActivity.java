package tech.gonzalocaballero.animacionestest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.plattysoft.leonids.ParticleSystem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfettiActivity extends AppCompatActivity {

    @BindView(R.id.awardImageView) ImageView mAwardImageView;
    @BindView(R.id.awardLabel) TextView mAwardLabel;
    @BindView(R.id.centerSpace) Space mCenterSpace;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confetti);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.makeConfetti)
    public void makeConfettiEffect() {

        YoYo.with(Techniques.BounceIn).duration(700).playOn(mAwardImageView);
        YoYo.with(Techniques.BounceIn).duration(700).playOn(mAwardLabel);

        new ParticleSystem(this, 300, R.drawable.star_white, 100000)
                .setSpeedRange(0.4f, 0.25f)
                .oneShot(mCenterSpace, 300);

    }
}
