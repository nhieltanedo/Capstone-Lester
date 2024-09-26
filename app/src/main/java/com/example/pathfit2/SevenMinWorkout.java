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

public class SevenMinWorkout extends AppCompatActivity {


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

        setContentView(R.layout.activity_seven_min_workout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerSevenMinWorkout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        cardAdapter = new pathfitFitnessExerciseAdapter(this, cardItemList);
        recyclerView.setAdapter(cardAdapter);


    }

    public void toolbarIconsAction() {
        ImageButton backIcon, nextIcon;
        toolbar = findViewById(R.id.toolbar);
        backIcon = findViewById(R.id.left_icon);
        nextIcon = findViewById(R.id.right_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SevenMinWorkout.this, TabataWorkOut.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SevenMinWorkout.this, benefitsOfCircuitTraining.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson10_TheSevenMinuteWorkout),
                getString(R.string.lesson10_12Exercise),
                getString(R.string.lesson10_JumpingJacks),
                getString(R.string.lesson10_WallSit),
                getString(R.string.lesson10_PushUps),
                getString(R.string.lesson10_AbdominalCrunch),
                getString(R.string.lesson10_StepUpontoChair),
                getString(R.string.lesson10_Squat),
                getString(R.string.lesson10_TricepDipsonChair),
                getString(R.string.lesson10_Plank),
                getString(R.string.lesson10_HighKneesRunninginPlace),
                getString(R.string.lesson10_Lunge),
                getString(R.string.lesson10_PushUpswithRotation),
                getString(R.string.lesson10_SidePlank),




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
                getString(R.string.lesson10_TheSevenMinuteWorkoutTopic),
                getString(R.string.lesson10_12ExerciseTopic),
                getString(R.string.lesson10_JumpingJacksTopic),
                getString(R.string.lesson10_WallSitTopic),
                getString(R.string.lesson10_PushUpsTopic),
                getString(R.string.lesson10_AbdominalCrunchTopic),
                getString(R.string.lesson10_StepUpontoChairTopic),
                getString(R.string.lesson10_SquatTopic),
                getString(R.string.lesson10_TricepDipsonChairTopic),
                getString(R.string.lesson10_PlankTopic),
                getString(R.string.lesson10_HighKneesRunninginPlaceTopic),
                getString(R.string.lesson10_LungeTopic),
                getString(R.string.lesson10_PushUpswithRotationTopic),
                getString(R.string.lesson10_SidePlankTopic),

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