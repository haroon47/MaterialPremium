package haroonstudios.logindesign.com.materialpremium;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;



import haroonstudios.logindesign.com.materialpremium.Profile.ProfileOneActivity;
import haroonstudios.logindesign.com.materialpremium.Profile.ProfileTwoActivity;

public class ProfileActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    //String[] signInStr = {"Login 1","Login 2","Login 3","Login 4","Login 5","Login 6","Login 7","Login 8","Login 9","Login 10","Login 11"};
        String[] profileStr = {"Profile 1","Profile 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Login Templates");
        setSupportActionBar(toolbar);
        listView = (ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent myIntent0 = new Intent(ProfileActivity.this, ProfileOneActivity.class);
                        startActivity(myIntent0);
                        break;
                    case 1:
                        Intent myIntent1 = new Intent(ProfileActivity.this, ProfileTwoActivity.class);
                        startActivity(myIntent1);
                        break;

                }
            }
        });

    }


    class CustomAdapter extends BaseAdapter
    {
        @Override
        public Object getItem(int position) {
            return profileStr[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getCount() {
            return profileStr.length;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            view = getLayoutInflater().inflate(R.layout.custom_row,null);
            TextView textView = (TextView)view.findViewById(R.id.textView);
            textView.setText(profileStr[position]);
            return view;
        }


    }

}
