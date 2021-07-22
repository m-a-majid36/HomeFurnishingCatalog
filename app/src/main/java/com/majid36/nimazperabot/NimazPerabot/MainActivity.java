package com.majid36.nimazperabot.NimazPerabot;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.user.NimazPerabot.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcview = findViewById(R.id.rcList);

        // menset recycle view masukkan nyadari data user
        MyAdapterListHome myAdapterListHome = new MyAdapterListHome(this, DataUser.namaArray, DataUser.hargaArray, DataUser.logoArray, DataUser.deskripsiArray);
        rcview.setAdapter(myAdapterListHome);
        rcview.setLayoutManager(new LinearLayoutManager(this));
    }

    //Membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //Membuat pilihan menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.aboutme)
        {
            startActivity(new Intent(MainActivity.this, AboutMeActivity.class));
        }
        return true;
    }
}