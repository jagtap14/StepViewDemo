package com.puretech.stepviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.puretech.stepviewdemo.R;
import com.shuhart.stepview.StepView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext, BtnPrev, btnSubmit;
    TextView txtOne, txtTwo, txtThree, txtFour;
    StepView stepView;

    int stepCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
    }

    private void initWidgets() {
        btnNext = findViewById(R.id.btnNext);
        BtnPrev = findViewById(R.id.btnPrev);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtOne = findViewById(R.id.txtOne);
        txtTwo = findViewById(R.id.txtTwo);
        txtThree = findViewById(R.id.txtThree);
        txtFour = findViewById(R.id.txtFour);
        stepView = findViewById(R.id.step_view);
        btnNext.setOnClickListener(this);
        BtnPrev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                doNext();
                break;
            case R.id.btnPrev:
                doPrev();
                break;

        }
    }

    private void doPrev() {

        stepCount--;
        stepView.done(false);

        if (stepCount == 0) {
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.VISIBLE);
            BtnPrev.setVisibility(View.INVISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
            stepView.go(stepCount, true);
        } else if (stepCount == 1) {
            stepView.go(stepCount, true);
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.VISIBLE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
        } else if (stepCount == 2) {
            stepView.go(stepCount, true);
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.VISIBLE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
        } else if (stepCount == 3) {
            stepView.go(stepCount, true);
            txtFour.setVisibility(View.VISIBLE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.GONE);
            btnSubmit.setVisibility(View.VISIBLE);
        }
    }

    private void doNext() {
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        stepCount++;
        if (stepCount == 0) {
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.VISIBLE);
            BtnPrev.setVisibility(View.INVISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
        } else if (stepCount == 1) {
            stepView.go(stepCount, true);
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.VISIBLE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
        } else if (stepCount == 2) {
            stepView.go(stepCount, true);
            txtFour.setVisibility(View.GONE);
            txtThree.setVisibility(View.VISIBLE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
            btnSubmit.setVisibility(View.GONE);
        } else if (stepCount == 3) {

            stepView.go(stepCount, true);
            stepView.done(true);


            txtFour.setVisibility(View.VISIBLE);
            txtThree.setVisibility(View.GONE);
            txtTwo.setVisibility(View.GONE);
            txtOne.setVisibility(View.GONE);
            BtnPrev.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.GONE);
            btnSubmit.setVisibility(View.VISIBLE);
        }
    }
}
