package com.example.android.atlantagroupproject;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText presentationName;
    EditText date;
    RatingBar rating_bar;
    RatingBar rating_bar2;
    RatingBar rating_bar3;
    RadioButton yes;
    RadioButton no;
    EditText suggestions;
  /*  private ImageView imageView;
    private EditText editText;
    private EditText dateText;
    private TextView textView;
    private RatingBar ratingBar;
    private TextView visualsText;
    private RatingBar ratBar;
    private TextView usefulText;
    private RatingBar ratiBar;
    private TextView recommendText;
    private RadioGroup radioGroup;
    private RadioButton yesButton;
    private RadioButton noButton;
    private EditText suggestText;
    private Button submitButton;
    private String str;
    int count;


*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(View view) {
        EditText presentationName = findViewById(R.id.presentationName);
        String presentation = presentationName.getText().toString();


    }
/*

        //Initializing the views


        imageView = (ImageView) findViewById(R.id.logo);
        editText = (EditText) findViewById(R.id.presentationName);
        dateText = (EditText) findViewById(R.id.date);
        textView = (TextView) findViewById(R.id.speaker);
        ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        visualsText = (TextView) findViewById(R.id.visuals);
        ratBar = (RatingBar) findViewById(R.id.rating_bar2);
        usefulText = (TextView) findViewById(R.id.useful);
        ratiBar = (RatingBar) findViewById(R.id.rating_bar3);
        recommendText = (TextView) findViewById(R.id.recommend);
        radioGroup = (RadioGroup) findViewById(R.id.rg);
        yesButton = (RadioButton) findViewById(R.id.yes_radio_button);
        noButton = (RadioButton) findViewById(R.id.no_radio_button);
        suggestText = (EditText) findViewById(R.id.suggestions);
        submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

            }
        });

        //displays Logo
        imageView = (ImageView) findViewById(R.id.logo);
        imageView.setImageResource(R.drawable.logoconf);
        String logo= imageView.getRootView().toString();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            imageView.getDisplay();
        }

        //displays Presentation Name
        editText = (EditText) findViewById(R.id.presentationName);
        String name = editText.getText().toString();
        if (name.equals("")) {
            Toast.makeText(getApplicationContext(), "Please type the Name of the Presentation!", Toast.LENGTH_SHORT).show();
        }
        else{
            editText.setText(name);
        }


        //displays Date
        dateText = (EditText) findViewById(R.id.date);
        String rec = dateText.getText().toString();
        if (rec.equals("")) {
            Toast.makeText(getApplicationContext(), "Please type in Today's Date!", Toast.LENGTH_SHORT).show();
        }
        else{
            dateText.setText(rec);
        }


        //displays How would your rate the speaker's TextView
        textView = (TextView) findViewById(R.id.speaker);
        String speaker = textView.getText().toString();
        textView.setText(speaker);






        //displays the Rating Bar below speaker's TextView

        submitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                String rating=String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }

        });



        //displays how helpful were the visuals TextView
        visualsText = (TextView) findViewById(R.id.visuals);
        String visual = visualsText.getText().toString();
        visualsText.setText(visual);




        //displays the Rating Bar below visuals TextView
        submitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                String ratingTwo=String.valueOf(ratBar.getRating());
                Toast.makeText(getApplicationContext(), ratingTwo, Toast.LENGTH_LONG).show();
            }

        });




        //displays useful TextView
        usefulText = (TextView) findViewById(R.id.useful);
        String use = usefulText.getText().toString();
        usefulText.setText(use);



        //displays the Rating Bar below useful TextView
        submitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                String ratingThree=String.valueOf(ratiBar.getRating());
                Toast.makeText(getApplicationContext(), ratingThree, Toast.LENGTH_LONG).show();
            }

        });



        //displays recommend TextView
        recommendText = (TextView) findViewById(R.id.recommend);
        String reccom = recommendText.getText().toString();
        recommendText.setText(reccom);

        //checks radiobutton for recommend TextView
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(getApplicationContext(), "Please choose one!", Toast.LENGTH_SHORT).show();
        }
        else {
            yesButton = (RadioButton) findViewById(selectedId);
            if (yesButton.getId() == R.id.yes_radio_button) {
            }

            noButton = (RadioButton) findViewById(selectedId);
            if (noButton.getId()  == R.id.no_radio_button){
            }
        }


        //displays  additional suggestions
        suggestText = (EditText) findViewById(R.id.suggestions);
        String sugg = suggestText.getText().toString();
        if (sugg.equals("")) {
            Toast.makeText(getApplicationContext(), "Please type in your suggestions!", Toast.LENGTH_SHORT).show();
        }
        else{
            suggestText.setText(sugg);
        }


        Toast.makeText(getApplicationContext(), "Thanks "  + " for filling this survey!", Toast.LENGTH_LONG).show();

    }*/
}
