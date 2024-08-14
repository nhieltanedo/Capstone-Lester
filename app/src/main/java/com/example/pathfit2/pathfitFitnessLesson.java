package com.example.pathfit2;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class pathfitFitnessLesson extends AppCompatActivity {

     RecyclerView recyclerView;
     pathfitFitnessExerciseAdapter cardAdapter;
     ArrayList<fitnessExerciseCardItem> cardItemList;
     String[] cardTitle;
     int[] imageResource;
     String[] description;
     String[] topic;

     Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pathfit_fitness_lesson);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerFitnessLesson);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        cardAdapter = new pathfitFitnessExerciseAdapter(this, cardItemList);
        recyclerView.setAdapter(cardAdapter);



    }
    public void toolbarIconsAction(){
        ImageButton backIcon, nextIcon;
        toolbar = findViewById(R.id.toolbar);
        backIcon = findViewById(R.id.left_icon);
        nextIcon = findViewById(R.id.right_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(pathfitFitnessLesson.this, healthRelatedLesson.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson1_cardioVascular),
                getString(R.string.lesson1_muscularStrength),
                getString(R.string.lesson1_bodyComposition),
                getString(R.string.lesson1_muscularEndurance),
                getString(R.string.lesson1_Flexibility),
                getString(R.string.lesson1_skillRelated),
                getString(R.string.lesson1_benefitsOfPE),
                getString(R.string.lesson1_typesOfPE),
                getString(R.string.lesson1_obesity),

        };
        description = new String[]{
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),

        };
        topic = new String[]{
                getString(R.string.lesson1_cardioVascularTopic),
                getString(R.string.lesson1_muscularStrengthTopic),
                getString(R.string.lesson1_bodyCompositionTopic),
                getString(R.string.lesson1_muscularEnduranceTopic),
                getString(R.string.lesson1_FlexibilityTopic),
                getString(R.string.lesson1_skillRelatedTopic),
                getString(R.string.lesson1_benefitsOfPEtopic),
                getString(R.string.lesson1_typesOfPETopic),
                getString(R.string.lesson1_obesityTopic),

        };

        imageResource = new int[]{
                //need palitan ng image na tugma sa lesson topic
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,

        };

        for (int i = 0; i < cardTitle.length; i++) {
            fitnessExerciseCardItem items = new fitnessExerciseCardItem(cardTitle[i], description[i], topic[i], imageResource[i]);
            cardItemList.add(items);
        }


    }

}
