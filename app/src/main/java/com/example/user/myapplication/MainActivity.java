package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener,View.OnKeyListener {
    String name,age,gender,career;
    EditText editText1,editText2;
    RadioGroup radioGroup1,radioGroup2;
    RadioButton female,male,student,officer;
    TextView textView5;
    Button button1,button2,button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setOnKeyListener(this);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setOnKeyListener(this);

        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(this);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(this);
        female = (RadioButton)findViewById(R.id.female);
        male = (RadioButton)findViewById(R.id.male);
        student = (RadioButton)findViewById(R.id.student);
        officer = (RadioButton)findViewById(R.id.officer);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        textView5 = (TextView)findViewById(R.id.textView5);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                textView5.setText("이름은 "+name+", 나이는 "+age+", 성별은 "+gender+", 직업은 "+career+"입니다.");
                break;
            case R.id.button2:
                textView5.setText("당신의 이름은 "+name+" 입니다.");
                break;
            case R.id.button3:
                textView5.setText("당신의 나이는 "+age+" 입니다.");
                break;

        }


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.female:
                gender = female.getText().toString();
                break;
            case R.id.male:
                gender = male.getText().toString();
                break;
            case R.id.student:
                career = student.getText().toString();
                break;
            case R.id.officer:
                career = officer.getText().toString();
                break;
        }

    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        switch (v.getId()){
            case R.id.editText1:
                name = ((EditText)v).getText().toString();
                break;
            case R.id.editText2:
                age = ((EditText)v).getText().toString();
                break;
        }
        return false;
    }
}
