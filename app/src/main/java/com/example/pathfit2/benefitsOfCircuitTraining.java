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

public class benefitsOfCircuitTraining extends AppCompatActivity {


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

        setContentView(R.layout.activity_benefits_of_circuit_training);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerBenefitsOfCircuitTraining);
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
                Intent intent = new Intent(benefitsOfCircuitTraining.this, TabataWorkOut.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(benefitsOfCircuitTraining.this, Main_module.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson11_whatIsCircuitTraining),
                getString(R.string.lesson11_StrengthCircuits),
                getString(R.string.lesson11_SportSpecific),
                getString(R.string.lesson11_CardioCircuits),
                getString(R.string.lesson11_Totalexercise),
                getString(R.string.lesson11_CompetitionCircuit),
                getString(R.string.lesson11_timedCircuits),
                getString(R.string.lesson11_RepetitionCircuits),
                getString(R.string.lesson11_StageCircuits),
                getString(R.string.lesson11_Benefitsofcircuittraining),
                getString(R.string.lesson11_Improvesmuscularendurance),
                getString(R.string.lesson11_Increasesstrengthandmusclegrowth),
                getString(R.string.lesson11_Improveshearthealth),
                getString(R.string.lesson11_Offersafullbodyworkout),
                getString(R.string.lesson11_Istimeefficient),
                getString(R.string.lesson11_Improvesexerciseadherence),
                getString(R.string.lesson11_Maypromoteweightloss),
                getString(R.string.lesson11_Mayimproveyourmood),




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
                getString(R.string.context),
                getString(R.string.context),


        };
        topic = new String[]{
                getString(R.string.lesson11_whatIsCircuitTrainingTopic),
                getString(R.string.lesson11_StrengthCircuitsTopic),
                getString(R.string.lesson11_SportSpecificTopic),
                getString(R.string.lesson11_CardioCircuitsTopic),
                getString(R.string.lesson11_TotalexerciseTopic),
                getString(R.string.lesson11_CompetitionCircuitTopic),
                getString(R.string.lesson11_timedCircuitsTopic),
                getString(R.string.lesson11_RepetitionCircuitsTopic),
                getString(R.string.lesson11_StageCircuitsTopic),
                getString(R.string.lesson11_BenefitsofcircuittrainingTopic),
                getString(R.string.lesson11_ImprovesmuscularenduranceTopic),
                getString(R.string.lesson11_IncreasesstrengthandmusclegrowthTopic),
                getString(R.string.lesson11_ImproveshearthealthTopic),
                getString(R.string.lesson11_OffersafullbodyworkoutTopic),
                getString(R.string.lesson11_IstimeefficientTopic),
                getString(R.string.lesson11_ImprovesexerciseadherenceTopic),
                getString(R.string.lesson11_MaypromoteweightlossTopic),
                getString(R.string.lesson11_MayimproveyourmoodTopic),

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
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,


        };

        for (int i = 0; i < cardTitle.length; i++) {
            pathfitCardItem items = new pathfitCardItem(cardTitle[i], description[i], topic[i], imageResource[i]);
            cardItemList.add(items);
        }

    }
}