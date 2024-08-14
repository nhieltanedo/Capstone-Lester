package com.example.pathfit2;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lessonContents extends AppCompatActivity {
    CardView fitnessExercise, healthRelated;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson_contents);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getItemId();
        onItemClickedAction();
    }

    public void getItemId(){
        //for toolbar ID
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back);


        //for Lessons ID
        fitnessExercise = findViewById(R.id.lesson1);
        healthRelated = findViewById(R.id.lesson2);
    }

    public void onItemClickedAction(){
        //for toolbar
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //for Lessons
        fitnessExercise.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, pathfitFitnessLesson.class);
            startActivity(intent);
        });

        healthRelated.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, healthRelatedLesson.class);
            startActivity(intent);
        });
    }

}