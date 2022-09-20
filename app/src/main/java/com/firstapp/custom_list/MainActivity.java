package com.firstapp.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView customlist;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlist = findViewById(R.id.customList1);
        userAdapter = new UserAdapter(this, userPojoList);
        customlist.setAdapter(userAdapter);


        loadUserData();

        customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("namekey",userPojoList.get(i).getName());
                intent.putExtra("mailkey",userPojoList.get(i).getMail());
                intent.putExtra("mobilekey",userPojoList.get(i).getMobile());
                intent.putExtra("imagekey",userPojoList.get(i).getImage());


                startActivity(intent);

            }
        });
            }


    private void loadUserData()
    {
        userPojo=new UserPojo(R.drawable.data1,"Saikrishna","saikrishna@gmail.com","423134321");
        userPojoList.add(userPojo);

        userPojo=new UserPojo(R.drawable.data1,"Srinu","srinu@gmail.com","123465432");
        userPojoList.add(userPojo);

        userPojo=new UserPojo(R.drawable.data1,"Pavan","pavan@gmail.com","123444342");
        userPojoList.add(userPojo);

        userPojo=new UserPojo(R.drawable.data1,"Vinay","vinay@gmail.com","12346765432");
        userPojoList.add(userPojo);

        userAdapter.notifyDataSetChanged();

    }


}


