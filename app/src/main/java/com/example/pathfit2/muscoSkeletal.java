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

public class muscoSkeletal extends AppCompatActivity {

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

        setContentView(R.layout.activity_musco_skeletal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerMuscoSkeletal);
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
                Intent intent =  new Intent(muscoSkeletal.this, lessonContents.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(muscoSkeletal.this, healthRelatedLesson.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson6_musculoskeletalSystem),
                getString(R.string.lesson6_componentsOfMusculesketalSystem),
                getString(R.string.lesson6_bones),
                getString(R.string.lesson6_fiveTypes),
                getString(R.string.lesson6_boneCrucialFunction),
                getString(R.string.lesson6_muscle),
                getString(R.string.lesson6_body3tmaintypesofMuscleTissue),
                getString(R.string.lesson6_functionOfMuscle),
                getString(R.string.lesson6_classifiedintofivetypes),
                getString(R.string.lesson6_bonesServeSeveralCrucialFunction),
                getString(R.string.lesson6_Connectivetissue),
                getString(R.string.lesson6_functionConnectivetissue),
                getString(R.string.lesson6_tendos),
                getString(R.string.lesson6_threeTypesTendons),
                getString(R.string.lesson6_functionOfTendos),
                getString(R.string.lesson6_ligaments),
                getString(R.string.lesson6_AreThereDifferentTypesofLigaments),
                getString(R.string.lesson6_functionOfLigaments),
                getString(R.string.lesson6_joints),
                getString(R.string.lesson6_Whatarefibrousjoints),
                getString(R.string.lesson6_threetypesoffibrousjoints),
                getString(R.string.lesson6_Whatarecartilaginousjoints),
                getString(R.string.lesson6_Whataresynovialjoints),
                getString(R.string.lesson6_Functionsofjoints),
                getString(R.string.lesson6_Cartilage),
                getString(R.string.lesson6_threetypesofcartilageinyourbody),
                getString(R.string.lesson6_Hyalinecartilage),
                getString(R.string.lesson6_Hyalinecartilagelocationsinyourbody),
                getString(R.string.lesson6_Fibrocartilage),
                getString(R.string.lesson6_Fibrocartilagelocationsinyourbody),
                getString(R.string.lesson6_Elasticcartilagelocationsinyourbody),
                getString(R.string.lesson6_WhataretheimportancesofMusculoskeletalsystem),
                getString(R.string.lesson6_StudyingthemusculoskeletalsysteminPATHFIT),
                getString(R.string.lesson6_HowtotakecareofourMusculoskeletalSystem),




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
                getString(R.string.lesson6_musculoskeletalSystemTopic),
                getString(R.string.lesson6_componentsOfMusculesketalSystemTopic),
                getString(R.string.lesson6_bonesTopic),
                getString(R.string.lesson6_fiveTypesTopic),
                getString(R.string.lesson6_boneCrucialFunctionTopic),
                getString(R.string.lesson6_muscleTopic),
                getString(R.string.lesson6_body3tmaintypesofMuscleTissueTopic),
                getString(R.string.lesson6_functionOfMuscleTopic),
                getString(R.string.lesson6_classifiedintofivetypesTopic),
                getString(R.string.lesson6_bonesServeSeveralCrucialFunctionTopic),
                getString(R.string.lesson6_ConnectivetissueTopic),
                getString(R.string.lesson6_functionConnectivetissueTopic),
                getString(R.string.lesson6_tendosTopic),
                getString(R.string.lesson6_threeTypesTendonsTopic),
                getString(R.string.lesson6_functionOfTendosTopic),
                getString(R.string.lesson6_ligamentsTopic),
                getString(R.string.lesson6_AreThereDifferentTypesofLigamentsTopic),
                getString(R.string.lesson6_functionOfLigamentsTopic),
                getString(R.string.lesson6_jointsTopic),
                getString(R.string.lesson6_WhatarefibrousjointsTopic),
                getString(R.string.lesson6_threetypesoffibrousjointsTopic),
                getString(R.string.lesson6_WhatarecartilaginousjointsTopic),
                getString(R.string.lesson6_WhataresynovialjointsTopic),
                getString(R.string.lesson6_FunctionsofjointsTopic),
                getString(R.string.lesson6_CartilageTopic),
                getString(R.string.lesson6_threetypesofcartilageinyourbodyTopic),
                getString(R.string.lesson6_HyalinecartilageTopic),
                getString(R.string.lesson6_HyalinecartilagelocationsinyourbodyTopic),
                getString(R.string.lesson6_FibrocartilageTopic),
                getString(R.string.lesson6_FibrocartilagelocationsinyourbodyTopic),
                getString(R.string.lesson6_ElasticcartilagelocationsinyourbodyTopic),
                getString(R.string.lesson6_WhataretheimportancesofMusculoskeletalsystemTopic),
                getString(R.string.lesson6_StudyingthemusculoskeletalsysteminPATHFITTopic),
                getString(R.string.lesson6_HowtotakecareofourMusculoskeletalSystemTopic),
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
