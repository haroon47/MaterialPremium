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

import haroonstudios.logindesign.com.materialpremium.SignUp.SignUpActivityOne;
import haroonstudios.logindesign.com.materialpremium.SignUp.SignUpActivityTwo;


public class SignUpActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    String[] signInStr = {"Sign up 1","Sign up 2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

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

                                    Intent myIntent3 = new Intent(SignUpActivity.this, SignUpActivityOne.class);
                                    startActivity(myIntent3);


                        break;
                    case 1:
                        Intent myIntent1 = new Intent(SignUpActivity.this, SignUpActivityTwo.class);
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
            view = getLayoutInflater().inflate(R.layout.custom_row,null);
            TextView textView = (TextView)view.findViewById(R.id.textView);
            textView.setText(signInStr[position]);
            return view;
        }


    }

}
