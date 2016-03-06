package jp.numero.designdemoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import jp.numero.designdemoapplication.ListView.ListActivity;
import jp.numero.designdemoapplication.NavigationDrawer.NavigationActivity;
import jp.numero.designdemoapplication.Tab.ViewPagerWithTabActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button navigationNormal = (Button)findViewById(R.id.navigation_normal);
        navigationNormal.setOnClickListener(this);
        Button tabWithViewpager = (Button)findViewById(R.id.viewpager_with_tab);
        tabWithViewpager.setOnClickListener(this);
        Button listRefresh = (Button)findViewById(R.id.list_refresh);
        listRefresh.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.navigation_normal:
                intent = new Intent(this, NavigationActivity.class);
                break;
            case R.id.viewpager_with_tab:
                intent = new Intent(this, ViewPagerWithTabActivity.class);
                break;
            case R.id.list_refresh:
                intent = new Intent(this, ListActivity.class);
                break;
        }
        startActivity(intent);
    }
}
