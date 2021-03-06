package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gmrit.dscgmrit.R;

import java.net.URLEncoder;

public class AboutPage extends AppCompatActivity {
    ImageView LinkedIn, Instagram, backbutton, logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        LinkedIn = findViewById(R.id.LinkedIn);
        Instagram = findViewById(R.id.Instagram);
        backbutton = findViewById(R.id.aboutBackButton);
        logo = findViewById(R.id.imgDSCGMRITLogo);

        Glide.with(this).load(R.drawable.dsclogo).into(logo);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        LinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String query = "https://www.linkedin.com/company/developer-student-clubs-gmrit/?viewAsMember=true";
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String query = "https://www.instagram.com/dsc_gmrit/";
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}