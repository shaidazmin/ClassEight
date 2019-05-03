package com.example.nz.classeight;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {


    Button button;
    DatePickerDialog datePickerDialog;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        button = ( Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePicker datePicker = new DatePicker(SubActivity.this);
                final int currentDay  = datePicker.getDayOfMonth();
                final int currentMount = (datePicker.getMonth())+1;
                final int currentYear = datePicker.getYear();

                final DatePickerDialog datePickerDialog = new DatePickerDialog(SubActivity.this,

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                textView.setText(dayOfMonth+"/"+month+"/"+year);

                            }
                        },currentYear,currentMount,currentDay);

                datePickerDialog.show();



            }
        });


    }
}
