package com.example.android.atlantagroupproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.DrawableRes;
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

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
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



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




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
                    imageView.setImageResource(R.drawable.logomakr);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        imageView.getDisplay();
                    }


                    //displays Presentation Name
                    editText = (EditText) findViewById(R.id.presentationName);
                    str = editText.getText().toString();
                    if (str.equals("")) {
                        Toast.makeText(getApplicationContext(), "Please type the Name of the Presentation!", Toast.LENGTH_SHORT).show();
                    }


                    //displays Date
                    dateText = (EditText) findViewById(R.id.date);
                    str = dateText.getText().toString();
                    if (str.equals("")) {
                        Toast.makeText(getApplicationContext(), "Please type in Today's Date!", Toast.LENGTH_SHORT).show();
                    }


                    //displays How would your rate the speaker's TextView
                    textView = (TextView) findViewById(R.id.speaker);
                    str = textView.getText().toString();




                    //displays the Rating Bar below speaker's TextView
                    float ratingValue =  ratingBar.getRating();
                    ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar arg0, float rateValue, boolean arg2) {
                            // TODO Auto-generated method stub
                            Log.d("Rating", "your selected value is :"+rateValue);
                        }
                    });



                    //displays how helpful were the visuals TextView
                    visualsText = (TextView) findViewById(R.id.visuals);
                    str = visualsText.getText().toString();



                    //displays the Rating Bar below visuals TextView
                    float ratValue =  ratBar.getRating();
                    ratBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar arg0, float rateValue, boolean arg2) {
                            // TODO Auto-generated method stub
                            Log.d("Rating", "your selected value is :"+rateValue);
                        }
                    });




                    //displays useful TextView
                    usefulText = (TextView) findViewById(R.id.useful);
                    str = usefulText.getText().toString();



                    //displays the Rating Bar below useful TextView
                    float ratiBarValue =  ratiBar.getRating();
                    ratiBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar arg0, float rateValue, boolean arg2) {
                            // TODO Auto-generated method stub
                            Log.d("Rating", "your selected value is :"+rateValue);
                        }
                    });



                    //displays recommend TextView
                    recommendText = (TextView) findViewById(R.id.recommend);
                    str = recommendText.getText().toString();


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
                    str = suggestText.getText().toString();
                    if (str.equals("")) {
                        Toast.makeText(getApplicationContext(), "Please type in your suggestions!", Toast.LENGTH_SHORT).show();
                    }


                    Toast.makeText(getApplicationContext(), "Thanks "  + " for filling this survey!", Toast.LENGTH_LONG).show();


        }
}