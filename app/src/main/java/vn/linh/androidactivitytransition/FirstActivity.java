package vn.linh.androidactivitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_start_second_activity).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startSecondActivity();
                    }
                });

        findViewById(R.id.button_finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void startSecondActivity() {

        startActivity(new Intent(this, SecondActivity.class));
        if (Constant.TRANSITION.equals(Constant.FADE)) {
            overridePendingTransition(android.R.anim.fade_in, R.anim.no_animation);
        } else if (Constant.TRANSITION.equals(Constant.SLIDE_UP_DOWN)){
            overridePendingTransition(R.anim.slide_up,  R.anim.no_animation);
        }

    }
}
