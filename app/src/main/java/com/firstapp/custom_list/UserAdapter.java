package com.firstapp.custom_list;

import static androidx.core.util.Preconditions.checkState;

import static java.nio.charset.StandardCharsets.UTF_8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UserAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userPojoList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public UserAdapter(Context context,List<UserPojo> userPojoList){
        this.context=context;
        this.userPojoList=userPojoList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {

        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {

        return i;
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root=layoutInflater.inflate(R.layout.custom_user,null);
        ImageView imageView=root.findViewById(R.id.user_image);
        TextView name=root.findViewById(R.id.user_name);
        TextView mail=root.findViewById(R.id.user_mail);
        TextView mobile=root.findViewById(R.id.user_mobile);


        name.setText(userPojoList.get(i).getName());
        mail.setText(userPojoList.get(i).getMail());
        mobile.setText(userPojoList.get(i).getMobile());



        imageView.setImageResource(userPojoList.get(i).getImage());
        return root;

    }

}
