package com.example.pathfit2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lessonContents extends AppCompatActivity {
    CardView fitnessExercise, healthRelated, typesWeightTraining, principleAndMethodsOfCardio, muscleFiberTypes, muscoSkeletalSystem, safetyConcerns,
            stretchingAndFlexibility, tabataWorkOut, sevenMinuteWorkOut, benefitsOfCircuitTraining;
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
        muscleFiberTypes = findViewById(R.id.lesson5);
        muscoSkeletalSystem = findViewById(R.id.lesson6);
        safetyConcerns = findViewById(R.id.lesson7);
        stretchingAndFlexibility = findViewById(R.id.lesson8);
        tabataWorkOut = findViewById(R.id.lesson9);
        sevenMinuteWorkOut = findViewById(R.id.lesson10);
        benefitsOfCircuitTraining = findViewById(R.id.lesson11);
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
        muscleFiberTypes.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, muscleFiberTypesActivity.class);
            startActivity(intent);
        });
        muscoSkeletalSystem.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, muscoSkeletal.class);
            startActivity(intent);
        });

        safetyConcerns.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, com.example.pathfit2.safetyConcerns.class);
            startActivity(intent);
        });

        stretchingAndFlexibility.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, com.example.pathfit2.StretchingAndFlexibility.class);
            startActivity(intent);
        });

        tabataWorkOut.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, com.example.pathfit2.TabataWorkOut.class);
            startActivity(intent);
        });
        sevenMinuteWorkOut.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, SevenMinWorkout.class);
            startActivity(intent);
        });
        benefitsOfCircuitTraining.setOnClickListener(v -> {
            Intent intent =  new Intent(lessonContents.this, benefitsOfCircuitTraining.class);
            startActivity(intent);
        });
    }

}