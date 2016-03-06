package jp.numero.designdemoapplication.ListView;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import jp.numero.designdemoapplication.R;

public class ListActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.list_view);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, new String[]{"item1", "item2", "item3"});
        listView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void onRefresh() {
//        swipeRefreshLayout.setRefreshing(true);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                function();
//            }
//        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                function();
            }
        }, 2000);
    }
    private void function(){
        swipeRefreshLayout.setRefreshing(false);
    }
}
