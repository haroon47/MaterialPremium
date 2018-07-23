package haroonstudios.logindesign.com.materialpremium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import haroonstudios.logindesign.com.materialpremium.Dashboard.DashboardOneActivity;
import haroonstudios.logindesign.com.materialpremium.Dashboard.DashboardTwoActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginOneActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginThreeActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginTwoActivity;

public class DashboardActivity extends AppCompatActivity {

    String[] signInStr = {"Dashboard 1", "Dashboard 2"};
    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        listView = (ListView) findViewById(R.id.listView);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Dashboard Templates");
        setSupportActionBar(toolbar);
        listView = (ListView) findViewById(R.id.listView);


        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        Intent myIntent0 = new Intent(DashboardActivity.this, DashboardOneActivity.class);
                        startActivity(myIntent0);


                        break;
                    case 1:
                        Intent myIntent1 = new Intent(DashboardActivity.this, DashboardTwoActivity.class);
                        startActivity(myIntent1);
                        break;

                }


            }

        });
    }


    class CustomAdapter extends BaseAdapter {
        @Override
        public Object getItem(int position) {
            return signInStr[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getCount() {
            return signInStr.length;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            view = getLayoutInflater().inflate(R.layout.custom_row, null);
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(signInStr[position]);
            return view;
        }


    }

}
