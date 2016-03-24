package com.novelot.gridlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i < 8; i++) {
            Button itemView = new Button(this);
            itemView.setText("ITEM-" + i);

            GridLayout.Spec rowSpec = GridLayout.spec((i + 4) / 4, 1.f);
            GridLayout.Spec columnSped = GridLayout.spec(i % 4, 1.f);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSped);
            params.width = 0;
            params.height = 0;
            gridLayout.addView(itemView, params);
        }
    }

}
