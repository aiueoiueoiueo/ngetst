package com.example.andhea.martabakyahuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){ //Bila menekan tombol back maka akan kembali ke MainActivity.xml
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickCakes(View view) {
        Intent a = new Intent(this,OrderrActivity.class);
        startActivity(a);
    }

    public void onClickBread(View view) {
        Intent b = new Intent(this,OrderrActivity.class);
        startActivity(b);
    }

    public void onClickCookies(View view) {
        Intent c = new Intent(this,OrderrActivity.class);
        startActivity(c);
    }


    public void onClickChoux(View view) {
        Intent e = new Intent(this,OrderrActivity.class);
        startActivity(e);
    }

    public void onClickCupcake(View view) {
        Intent f = new Intent(this,OrderrActivity.class);
        startActivity(f);
    }
}
