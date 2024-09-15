package com.example.pathfit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StretchingAndFlexibility extends AppCompatActivity {

    RecyclerView recyclerView;
    pathfitFitnessExerciseAdapter cardAdapter;
    ArrayList<pathfitCardItem> cardItemList;
    String[] cardTitle;
    int[] imageResource;
    String[] description;
    String[] topic;

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stretching_and_flexibility);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerStretching);
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
                Intent intent =  new Intent(StretchingAndFlexibility.this, safetyConcerns.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(StretchingAndFlexibility.this, TabataWorkOut.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson8_WarmUp),
                getString(R.string.lesson8_Jogging),
                getString(R.string.lesson8_UpperBody),
                getString(R.string.lesson8_UpperBody1),
                getString(R.string.lesson8_ArmCircling),
                getString(R.string.lesson8_UpperBackStretch),
                getString(R.string.lesson8_AbdomenStretch),
                getString(R.string.lesson8_SideStretch),
                getString(R.string.lesson8_LowerBackStretch),
                getString(R.string.lesson8_LowerBody),
                getString(R.string.lesson8_LowerBody1),
                getString(R.string.lesson8_LowerBody2),
                getString(R.string.lesson8_LowerBody3),
                getString(R.string.lesson8_Breathing),



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
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),



        };
        topic = new String[]{
                getString(R.string.lesson8_WarmUpTopic),
                getString(R.string.lesson8_JoggingTopic),
                getString(R.string.lesson8_UpperBodyTopic),
                getString(R.string.lesson8_UpperBody1Topic),
                getString(R.string.lesson8_ArmCirclingTopic),
                getString(R.string.lesson8_UpperBackStretchTopic),
                getString(R.string.lesson8_AbdomenStretchTopic),
                getString(R.string.lesson8_SideStretchTopic),
                getString(R.string.lesson8_LowerBackStretchTopic),
                getString(R.string.lesson8_LowerBodyTopic),
                getString(R.string.lesson8_LowerBody1Topic),
                getString(R.string.lesson8_LowerBody2Topic),
                getString(R.string.lesson8_LowerBody3Topic),
                getString(R.string.lesson8_BreathingTopic),

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
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,


        };

        for (int i = 0; i < cardTitle.length; i++) {
            pathfitCardItem items = new pathfitCardItem(cardTitle[i], description[i], topic[i], imageResource[i]);
            cardItemList.add(items);
        }


    }

}