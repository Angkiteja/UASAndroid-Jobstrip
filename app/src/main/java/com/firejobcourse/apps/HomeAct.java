package com.firejobcourse.apps;

import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {

    ImageView recycler_view_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recycler_view_btn = findViewById(R.id.recycler_view_btn);

        recycler_view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotouserlist = new Intent(HomeAct.this,userlist.class);
                startActivity(gotouserlist);
            }
        });
    }
}
