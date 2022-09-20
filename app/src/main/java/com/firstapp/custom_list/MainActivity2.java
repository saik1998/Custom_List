package com.firstapp.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,mail,mobile,address;
    ImageView image;

    String nameStr,mailStr,mobileStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name);
        mail=findViewById(R.id.mail);
        mobile=findViewById(R.id.mobile);
        image=findViewById(R.id.imgid);
//        address=findViewById(R.id.user_addr);

        nameStr=getIntent().getStringExtra("namekey");
        mailStr=getIntent().getStringExtra("mailkey");
        mobileStr=getIntent().getStringExtra("mobilekey");

        int img=getIntent().getIntExtra("imagekey",0);
        image.setImageResource(img);
//        addressStr=getIntent().getStringExtra("addresskey");


        name.setText(""+nameStr);
        mail.setText(""+mailStr);
        mobile.setText(""+mobileStr);




    }
}