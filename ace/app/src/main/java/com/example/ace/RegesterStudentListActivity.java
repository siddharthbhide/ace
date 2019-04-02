package com.example.ace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class RegesterStudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester_student_list);

        LinearLayout objLinearLayout = findViewById(R.id.RegesterStudentListActivity);
        LayoutInflater inflater = (LayoutInflater) getSystemService(this.LAYOUT_INFLATER_SERVICE);
        for(int nIndex=0; nIndex < 5; nIndex++) {

            final View rowView = inflater.inflate(R.layout.register_student_layout, null);

            TextView studentName = (TextView) rowView.findViewById(R.id.studentName);
            TextView studentStd= (TextView) rowView.findViewById(R.id.studentStd);
            studentName.setText(String.valueOf(nIndex));
            studentStd.setText("Student_" + String.valueOf(nIndex));

            objLinearLayout.addView(rowView);
        }
    }
}
