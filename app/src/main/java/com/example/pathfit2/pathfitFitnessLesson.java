package com.example.pathfit2;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pathfitFitnessLesson extends AppCompatActivity {
    CardView crdFitnessExercise;
    LinearLayout expandableContent;
    ImageView expandIcon;
    boolean isExpanded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pathfit_fitness_lesson);
//        initViews();
//        crdFitnessExercise.setOnClickListener(v -> {
//            if (isExpanded) {
//                collapse();
//            } else {
//                expand();
//            }
//        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
//    public void initViews() {
//        crdFitnessExercise = findViewById(R.id.crdFitnessExercise);
//        expandableContent = findViewById(R.id.expandable_content);
//        expandIcon = findViewById(R.id.expand_icon);
//    }
//    private void expand() {
//        expandableContent.setVisibility(View.VISIBLE);
//        Animation expandAnimation = AnimationUtils.loadAnimation(this, R.anim.expand_collapse);
//        expandableContent.startAnimation(expandAnimation);
//        expandIcon.setImageResource(R.drawable.arrow_drop_down_24px);
//        isExpanded = true;
//    }
//
//    private void collapse() {
//        Animation collapseAnimation = AnimationUtils.loadAnimation(this, R.anim.collapse_expand);
//        expandableContent.startAnimation(collapseAnimation);
//        expandableContent.setVisibility(View.GONE);
//        expandIcon.setImageResource(R.drawable.arrow_drop_down_24px);
//        isExpanded = false;
//    }

}