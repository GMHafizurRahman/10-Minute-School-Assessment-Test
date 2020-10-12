package com.example.assessmenttest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context c;
    private ArrayList<Chapter> chapter;
    private LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Chapter> chapter) {
        this.c = c;
        this.chapter = chapter;
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return chapter.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return chapter.get(groupPosition).topics.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return chapter.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return chapter.get(groupPosition).topics.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.chapters, null);
        }

        Chapter t = (Chapter) getGroup(groupPosition);

        TextView nameTv = convertView.findViewById(R.id.textView_team_1);
        ImageView img = convertView.findViewById(R.id.imageView_Team_1);

        String name = t.name;
        nameTv.setText(name);

        if (name == "Chapter 1") {
            img.setImageResource(R.drawable.docs);

        } else if (name == "Chapter 2") {
            img.setImageResource(R.drawable.docs);

        } else if (name == "Chapter 3") {
            img.setImageResource(R.drawable.docs);

        } else if (name == "Chapter 4") {
            img.setImageResource(R.drawable.docs);
        }

        convertView.setBackgroundColor(Color.LTGRAY);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.topics, null);
        }

        String child = (String) getChild(groupPosition, childPosition);
        TextView nameTv = convertView.findViewById(R.id.textView_1);
        ImageView img = convertView.findViewById(R.id.imageView_1);

        nameTv.setText(child);
        //get TEAM Name
        String teamName = getGroup(groupPosition).toString();

        if (teamName == "Chapter 1") {

            if (child == "Video 1_1") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Document 1_1") {
                img.setImageResource(R.drawable.doc_icon);

            } else if (child == "Video 1_2") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Audio 1_1") {
                img.setImageResource(R.drawable.audio_icon);

            }
        } else if (teamName == "Chapter 2") {

            if (child == "Video 2_1") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Document 2_1") {
                img.setImageResource(R.drawable.doc_icon);

            } else if (child == "Video 2_2") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Audio 2_1") {
                img.setImageResource(R.drawable.audio_icon);

            }
        } else if (teamName == "Chapter 3") {

            if (child == "Video 3_1") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Document 3_1") {
                img.setImageResource(R.drawable.doc_icon);

            } else if (child == "Video 3_2") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Audio 3_1") {
                img.setImageResource(R.drawable.audio_icon);
            }
        } else if (teamName == "Chapter 4") {

            if (child == "Video 4_1") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Document 4_1") {
                img.setImageResource(R.drawable.doc_icon);

            } else if (child == "Video 4_2") {
                img.setImageResource(R.drawable.video_icon);

            } else if (child == "Audio 4_1") {
                img.setImageResource(R.drawable.audio_icon);
            }
        }

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
