package haroonstudios.logindesign.com.materialpremium.Profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import haroonstudios.logindesign.com.materialpremium.R;


public class ProfileOneActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_one);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Profile Dashboard");
        setSupportActionBar(toolbar);
    }
}
