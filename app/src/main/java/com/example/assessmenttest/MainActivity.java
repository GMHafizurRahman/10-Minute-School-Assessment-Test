package com.example.assessmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        expandableListView = findViewById(R.id.expandableListView_1);
        final ArrayList<Chapter> chapter = getdata();

        adapter = new CustomAdapter(this, chapter);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(MainActivity.this, chapter.get(groupPosition) + " -> " + chapter.get(groupPosition).topics.get(childPosition) + "", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private ArrayList<Chapter> getdata() {

        Chapter t1 = new Chapter("Chapter 1");
        t1.topics.add("Video 1_1");
        t1.topics.add("Document 1_1");
        t1.topics.add("Video 1_2");
        t1.topics.add("Audio 1_1");

        Chapter t2 = new Chapter("Chapter 2");
        t2.topics.add("Video 2_1");
        t2.topics.add("Document 2_1");
        t2.topics.add("Video 2_2");
        t2.topics.add("Audio 2_1");

        Chapter t3 = new Chapter("Chapter 3");
        t3.topics.add("Video 3_1");
        t3.topics.add("Document 3_1");
        t3.topics.add("Video 3_2");
        t3.topics.add("Audio 3_1");

        Chapter t4 = new Chapter("Chapter 4");
        t4.topics.add("Video 4_1");
        t4.topics.add("Document 4_1");
        t4.topics.add("Video 4_2");
        t4.topics.add("Audio 4_1");

        ArrayList<Chapter> allChapters = new ArrayList<Chapter>();

        allChapters.add(t1);
        allChapters.add(t2);
        allChapters.add(t3);
        allChapters.add(t4);

        return allChapters;
    }
}