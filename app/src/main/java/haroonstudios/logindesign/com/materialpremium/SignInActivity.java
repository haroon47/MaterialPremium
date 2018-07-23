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

import haroonstudios.logindesign.com.materialpremium.SignIn.LoginEightActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginElevenActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginFiveActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginFourActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginNineActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginOneActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginSevenActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginSixActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginTenActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginThreeActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginTwelveActivity;
import haroonstudios.logindesign.com.materialpremium.SignIn.LoginTwoActivity;

public class SignInActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    String[] signInStr = {"Login 1","Login 2","Login 3","Login 4","Login 5","Login 6","Login 7","Login 8","Login 9","Login 10","Login 11","Login 12"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
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

                                   Intent myIntent0 = new Intent(SignInActivity.this, LoginOneActivity.class);
                                   startActivity(myIntent0);


                       break;
                   case 1:
                       Intent myIntent1 = new Intent(SignInActivity.this, LoginTwoActivity.class);
                       startActivity(myIntent1);
                       break;
                   case 2:

                                   Intent myIntent2 = new Intent(SignInActivity.this, LoginThreeActivity.class);
                                   startActivity(myIntent2);

                       break;
                   case 3:


                                 Intent myIntent3 = new Intent(SignInActivity.this, LoginFourActivity.class);
                                 startActivity(myIntent3);



                       break;
                   case 4:
                       Intent myIntent4 = new Intent(SignInActivity.this, LoginFiveActivity.class);
                       startActivity(myIntent4);

                       break;
                   case 5:
                       Intent myIntent5 = new Intent(SignInActivity.this, LoginSixActivity.class);
                       startActivity(myIntent5);

                       break;
                   case 6:

                                   Intent myIntent6 = new Intent(SignInActivity.this, LoginSevenActivity.class);
                                   startActivity(myIntent6);

                       break;
                   case 7:
                       Intent myIntent7 = new Intent(SignInActivity.this, LoginEightActivity.class);
                       startActivity(myIntent7);

                       break;
                   case 8:

                                   Intent myIntent8 = new Intent(SignInActivity.this, LoginNineActivity.class);
                                   startActivity(myIntent8);

                       break;
                   case 9:

                                   Intent myIntent9 = new Intent(SignInActivity.this, LoginTenActivity.class);
                                   startActivity(myIntent9);

                       break;
                   case 10:
                       Intent myIntent10= new Intent(SignInActivity.this, LoginElevenActivity.class);
                       startActivity(myIntent10);

                       break;

                   case 11:

                                   Intent myIntent11 = new Intent(SignInActivity.this, LoginTwelveActivity.class);
                                   startActivity(myIntent11);


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
