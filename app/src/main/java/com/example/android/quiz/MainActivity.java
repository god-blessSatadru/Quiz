package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton mBrazil, mGermany, mNigeria, mFrance;
    RadioButton mTokyo, mAthens, mSydney, mRome;
    CheckBox mNadal, mLopez, mMurray, mFedrer;
    EditText mAnswer;
    Button mSubmit;
    int mPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBrazil = (RadioButton) findViewById(R.id.brazil);
        mGermany = (RadioButton) findViewById(R.id.germany);
        mNigeria = (RadioButton) findViewById(R.id.nigeria);
        mFrance = (RadioButton) findViewById(R.id.France);
        mTokyo = (RadioButton) findViewById(R.id.tokyo);
        mAthens = (RadioButton) findViewById(R.id.athens);
        mSydney = (RadioButton) findViewById(R.id.sydney);
        mRome = (RadioButton) findViewById(R.id.rome);
        mNadal = (CheckBox) findViewById(R.id.rafel_nadal);
        mLopez = (CheckBox) findViewById(R.id.Marc_Lopez);
        mMurray = (CheckBox) findViewById(R.id.andy_murray);
        mFedrer = (CheckBox) findViewById(R.id.Roger_Fedrer);
        mAnswer = (EditText) findViewById(R.id.answer);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);
    }

    public void onClick(View view) {
        if ((mNadal.isChecked() && mLopez.isChecked()) && (!mMurray.isChecked() && !mFedrer.isChecked()))
            mPoints++;
        else {
        }
        if (mNigeria.isChecked())
            mPoints++;
        if (mTokyo.isChecked())
            mPoints++;
        if (String.valueOf(mAnswer.getText()).equals(getString(R.string.Women_bdaminton_singles_gold_winner)))
            mPoints++;
        Toast toast = Toast.makeText(this, "You have scored " + mPoints + "points", Toast.LENGTH_SHORT);
        toast.show();
        mReset();

    }

    public void mReset() {
        mPoints = 0;
        mNadal.setChecked(false);
        mFedrer.setChecked(false);
        mLopez.setChecked(false);
        mMurray.setChecked(false);
        mNigeria.setChecked(false);
        mBrazil.setChecked(false);
        mFrance.setChecked(false);
        mGermany.setChecked(false);
        mAthens.setChecked(false);
        mRome.setChecked(false);
        mSydney.setChecked(false);
        mTokyo.setChecked(false);
        mAnswer.setText("");
    }

}
