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

public class safetyConcerns extends AppCompatActivity {

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

        setContentView(R.layout.activity_safety_concerns);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerSafetyConcerns);
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
                Intent intent =  new Intent(safetyConcerns.this, lessonContents.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(safetyConcerns.this, healthRelatedLesson.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson7_whatAreSafetyConcerns),
                getString(R.string.lesson7_whyAreSafetyConcernsImportant),
                getString(R.string.lesson7_safetyConcernsInExercising),
                getString(R.string.lesson7_Overexertion),
                getString(R.string.lesson7_someCausesOfOverexertion),
                getString(R.string.lesson7_inadequateWarmUp),
                getString(R.string.lesson7_ImproperEquipmentUse),
                getString(R.string.lesson7_IgnoringPainorDiscomfort),
                getString(R.string.lesson7_LackofRestandRecovery),
                getString(R.string.lesson7_SafetyConcernTipsforExercising),
                getString(R.string.lesson7_SafetyConcernsinWeightLifting),
                getString(R.string.lesson7_IncorrectLiftingTechnique),
                getString(R.string.lesson7_Overloading),
                getString(R.string.lesson7_lackOfSpotter),
                getString(R.string.lesson7_FailuretoWarmup),
                getString(R.string.lesson7_SafetyConcernTipsforWeightLifting),


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
                getString(R.string.context),
                getString(R.string.context),

        };
        topic = new String[]{
                getString(R.string.lesson7_whatAreSafetyConcernsTopic),
                getString(R.string.lesson7_whyAreSafetyConcernsImportantTopic),
                getString(R.string.lesson7_safetyConcernsInExercisingTopic),
                getString(R.string.lesson7_OverexertionTopic),
                getString(R.string.lesson7_someCausesOfOverexertionTopic),
                getString(R.string.lesson7_inadequateWarmUpTopic),
                getString(R.string.lesson7_ImproperEquipmentUseTopic),
                getString(R.string.lesson7_IgnoringPainorDiscomfortTopic),
                getString(R.string.lesson7_LackofRestandRecoveryTopic),
                getString(R.string.lesson7_SafetyConcernTipsforExercising),
                getString(R.string.lesson7_SafetyConcernsinWeightLiftingTopic),
                getString(R.string.lesson7_IncorrectLiftingTechniqueTopic),
                getString(R.string.lesson7_OverloadingTopic),
                getString(R.string.lesson7_lackOfSpotterTopic),
                getString(R.string.lesson7_FailuretoWarmupTopic),
                getString(R.string.lesson7_SafetyConcernTipsforExercisingTopic),

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
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,

        };

        for (int i = 0; i < cardTitle.length; i++) {
            pathfitCardItem items = new pathfitCardItem(cardTitle[i], description[i], topic[i], imageResource[i]);
            cardItemList.add(items);
        }


    }

}
