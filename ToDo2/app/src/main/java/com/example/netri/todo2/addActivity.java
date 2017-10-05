package com.example.netri.todo2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;

public class addActivity extends AppCompatActivity {

    EditText editTitle;
    EditText editDescription;
    EditText editDate;
    EditText editListSelector;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editTitle=(EditText) findViewById(R.id.Title);
        editDescription=(EditText) findViewById(R.id.description);
//        editListSelector= (EditText) findViewById(R.id.ListSelector);

        editDate = (EditText) findViewById(R.id.date);
        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog= new DatePickerDialog(addActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date=""+dayOfMonth+"/"+month+"/"+year;

                    }
                },2016,1,1);
                datePickerDialog.show();
            }
        });
        spinner=(Spinner)findViewById(R.id.spinner);
        editListSelector.setText("Default");
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Lists,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String Title= editTitle.getText().toString();
                String Description= editDescription.getText().toString();
                String Date=editDate.getText().toString();
                String List=editListSelector.getText().toString();

                if(Title.trim().isEmpty())
                {
                    editTitle.setError("Title can not be empty");
                    return;
                }
//                if(List.trim().isEmpty())
//                {
//                    editListSelector.setText("Default");
//                }


            }
        });
    }
}
