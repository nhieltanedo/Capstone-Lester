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

public class muscleFiberTypesActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_muscle_fiber_types);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataInitialized();
        toolbarIconsAction();

        recyclerView = findViewById(R.id.recyclerMuscleFiberTypes);
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
                Intent intent =  new Intent(muscleFiberTypesActivity.this, lessonContents.class);
                startActivity(intent);
            }
        });
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(muscleFiberTypesActivity.this, healthRelatedLesson.class);
                startActivity(intent);
            }
        });


    }


    private void dataInitialized() {
        cardItemList = new ArrayList<>();
        cardTitle = new String[]{
                getString(R.string.lesson5_muscleFiber),
                getString(R.string.lesson5_twoFormFiber),
                getString(R.string.lesson5_collagenFiber),
                getString(R.string.lesson5_elasticFiber),
                getString(R.string.lesson5_threeTypesMuscleFiber),
                getString(R.string.lesson5_slowOxidative),
                getString(R.string.lesson5_fastOxidative),
                getString(R.string.lesson5_fastGlycolytic),
                getString(R.string.lesson5_typeIFiber),
                getString(R.string.lesson5_type2Afiber),
                getString(R.string.lesson5_type2BFibers),
                getString(R.string.lesson5_speedOfConstraction),
                getString(R.string.lesson5_numberOfSlowFastTwitchFiber),
                getString(R.string.lesson5_ageing),
                getString(R.string.lesson5_muscleMetabolism),
                getString(R.string.lesson5_physio),

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
                getString(R.string.lesson5_muscleFiberTopic),
                getString(R.string.lesson5_twoFormFiberTopic),
                getString(R.string.lesson5_collagenFiberTopic),
                getString(R.string.lesson5_elasticFiberTopic),
                getString(R.string.lesson5_threeTypesMuscleFiberTopic),
                getString(R.string.lesson5_slowOxidativeTopic),
                getString(R.string.lesson5_fastOxidativeTopic),
                getString(R.string.lesson5_fastGlycolyticTopic),
                getString(R.string.lesson5_typeIFiberTopic),
                getString(R.string.lesson5_type2AfiberTopic),
                getString(R.string.lesson5_type2BFibersTopic),
                getString(R.string.lesson5_speedOfConstractionTopic),
                getString(R.string.lesson5_numberOfSlowFastTwitchFiberTopic),
                getString(R.string.lesson5_ageingTopic),
                getString(R.string.lesson5_muscleMetabolismTopic),
                getString(R.string.lesson5_physioTopic),
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
