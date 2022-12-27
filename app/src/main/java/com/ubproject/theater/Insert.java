package com.ubproject.theater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Insert extends AppCompatActivity {

    EditText movietxt;
    EditText banner_img_url;
    EditText coverimgUrl;
    EditText lang;
    EditText duration;
    EditText mname;
    EditText rating;
    EditText rdate;


    Button btnInsertData;
    DatabaseReference movieDbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        movietxt = findViewById(R.id.movietxt);
        banner_img_url = findViewById(R.id.imgUrl);
        coverimgUrl = findViewById(R.id.coverimgUrl);
        lang = findViewById(R.id.lang);
        duration = findViewById(R.id.duration);
        mname = findViewById(R.id.mname);
        rating = findViewById(R.id.rating);
        rdate = findViewById(R.id.rdate);

        btnInsertData = findViewById(R.id.btnInsertData);
        movieDbref = FirebaseDatabase.getInstance().getReference("Movie");
        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertMovieData();
            }
        });
    }
    private void insertMovieData(){
        
        String about_movie = movietxt.getText().toString();
        String banner_image_url = banner_img_url.getText().toString();
        String cover_image_url = coverimgUrl.getText().toString();
        String languages = lang.getText().toString();
        String movie_duration = duration.getText().toString();
        String movie_name = mname.getText().toString();
        String no_of_ratings = rating.getText().toString();
        String release_date = rdate.getText().toString();

        //Validation required fields
        if(movietxt.getText().toString().length() == 0){
            movietxt.setError( "Required!" );
            banner_img_url.setError( "Banner image url is required!" );
            coverimgUrl.setError( "Cover image url is required!" );
            lang.setError( "Required!");
            duration.setError( "Required!");
            mname.setError( "Movie name is required!");
            rating.setError( "Required!");
            rdate.setError( "Required!");

            }else{
            String movieId = movieDbref.push().getKey();

            Movie movie = new Movie(movieId,about_movie,banner_image_url,cover_image_url,languages,movie_duration,movie_name,no_of_ratings,release_date);
            assert movieId != null;
            movieDbref.child(movieId).setValue(movie);
            Toast.makeText(Insert.this,"New Movie Added!",Toast.LENGTH_SHORT).show();
        }

    }
}