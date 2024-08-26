package com.example.pathfit2;

import android.content.Intent;
import android.hardware.camera2.params.BlackLevelPattern;
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
    CardView fitnessExercise, healthRelated, typesWeightTraining, principleAndMethodsOfCardio;
    Toolbar toolbar;
    ImageButton backIcon;

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

        backIcon = findViewById(R.id.left_icon);
        toolbar = findViewById(R.id.toolbar);




        //for Lessons ID
        fitnessExercise = findViewById(R.id.lesson1);
        healthRelated = findViewById(R.id.lesson2);
        typesWeightTraining = findViewById(R.id.lesson3);
        principleAndMethodsOfCardio = findViewById(R.id.lesson4);
    }

    public void onItemClickedAction(){
        //for toolbar

        backIcon.setOnClickListener(v -> {

            Intent intent =  new Intent(lessonContents.this, Main_module.class);
            startActivity(intent);
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

        typesWeightTraining.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, typesOfWeightTrainingActivity.class);
            startActivity(intent);
        });

        principleAndMethodsOfCardio.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, principlesOfCardio.class);
            startActivity(intent);
        });
    }

}