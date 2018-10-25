package vn.linh.androidactivitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.button_start_third_activity).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startThirdActivity();
                    }
                });

        findViewById(R.id.button_finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivity();
            }
        });
    }

    private void finishActivity() {
        finish();
        if (Constant.TRANSITION.equals(Constant.FADE)) {
            this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (Constant.TRANSITION.equals(Constant.SLIDE_UP_DOWN)) {
            this.overridePendingTransition(R.anim.no_animation, R.anim.slide_down);
        }
    }

    private void startThirdActivity() {
        startActivity(new Intent(this, ThirdActivity.class));
        if (Constant.TRANSITION.equals(Constant.FADE)) {
            this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (Constant.TRANSITION.equals(Constant.SLIDE_UP_DOWN)) {
            this.overridePendingTransition(0, R.anim.slide_down);
        }
    }
}
