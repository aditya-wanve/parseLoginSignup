package com.example.parseserversdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.parse.GetCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        //hello this is a test..
        ParseObject score = new ParseObject("Score");
        score.put("username", "Raju");
        score.put("score", 65);
        score.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    // OK
                    Log.i("Success", "Score saved");
                } else {
                    e.printStackTrace();
                }
            }
        });

    //Query
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.getInBackground("goUksCODyS", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null) {

          object.put("score",85);
          object.saveInBackground();

          Log.i("username",object.getString("username"));
          Log.i("score",Integer.toString(object.getInt("score")));
        }
      }
    });

 */




      // Created a tweet class, username, tweet, save it to parse, query it, updated the tweet

        ParseObject tweet = new ParseObject("Tweet");

        tweet.put("username","ramuBhaiya");
        tweet.put("tweet","I like Burgers!");

        tweet.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.i("OK!","Save success");
                } else {
                    e.printStackTrace();
                }
            }
        });
//Query

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");

        query.getInBackground("yGeaouJHLj", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e == null && object != null) {
//Update tweet
                    object.put("tweet","I like fries more");
                    object.saveInBackground();

                    Log.i("username",object.getString("username"));
                    Log.i("tweet",object.getString("tweet"));
                }
            }
        });






        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
