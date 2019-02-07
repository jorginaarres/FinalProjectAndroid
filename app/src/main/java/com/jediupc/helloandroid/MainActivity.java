package com.jediupc.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button NovaAssignatura;
    Button ConsultaAssignatures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NovaAssignatura = findViewById(R.id.NovaAssig);
        ConsultaAssignatures =findViewById(R.id.ConsultaAssigs);

        NovaAssignatura.setOnClickListener(this);
        ConsultaAssignatures.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.NovaAssig:
                i = new Intent(this, NewAssigActivity.class);
                startActivity(i);
                break;
            case R.id.ConsultaAssigs:
                i = new Intent(this, ListAssigsActivity.class);
                startActivity(i);
                break;

        }
    }
}
