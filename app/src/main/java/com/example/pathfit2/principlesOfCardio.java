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

public class principlesOfCardio extends AppCompatActivity {
    RecyclerView recyclerView;
    pathfitAdapter cardAdapter;
    ArrayList<pathfitCardItem> cardItemList;
    String[] cardTitle;
    int[] imageResource;
    String[] description;
    String[] topic;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principles_of_cardio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerPrinciplesCardio);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        cardAdapter = new pathfitAdapter(this, cardItemList);
        recyclerView.setAdapter(cardAdapter);
    }
    public void toolbarIconsAction(){
        ImageButton backIcon, nextIcon;
        toolbar = findViewById(R.id.toolbar);
        backIcon = findViewById(R.id.left_icon);
        nextIcon = findViewById(R.id.right_icon);
        backIcon.setOnClickListener(v -> {

            Intent intent =  new Intent(principlesOfCardio.this, typesOfWeightTrainingActivity.class);
            startActivity(intent);
        });
        nextIcon.setOnClickListener(v -> {
            Intent intent =  new Intent(principlesOfCardio.this, principlesOfCardio.class);
            startActivity(intent);
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                //add yung title ng lesson 2
                getString(R.string.lesson3_training),
                getString(R.string.lesson3_specificity),
                getString(R.string.lesson3_SportSpecificTraining),
                getString(R.string.lesson3_highIntensity),
                getString(R.string.lesson3_overload),
                getString(R.string.lesson3_Adaptation),
                getString(R.string.lesson3_Progression),

        };
        description = new String[]{
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),
                getString(R.string.context),


        };
        topic = new String[]{
                //add yung topic ng lesson 2 na nakapaloob sa title
                getString(R.string.lesson3_trainingTopic),
                getString(R.string.lesson3_specificityTopic),
                getString(R.string.lesson3_SportSpecificTrainingTopic),
                getString(R.string.lesson3_highIntensityTopic),
                getString(R.string.lesson3_overloadTopic),
                getString(R.string.lesson3_AdaptationTopic),
                getString(R.string.lesson3_ProgressionTopic),



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


        };

        for (int i = 0; i < cardTitle.length; i++) {
            //dito nag add ng item
            pathfitCardItem items = new pathfitCardItem(cardTitle[i], description[i], topic[i], imageResource[i]);
            cardItemList.add(items);
        }


    }

}