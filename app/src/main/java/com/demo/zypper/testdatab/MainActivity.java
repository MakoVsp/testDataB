package com.demo.zypper.testdatab;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.zypper.testdatab.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("zhangp");
        user.setNickName("zypper");
        user.setEmail("zhangpeng@syberos.com");
        user.setVip(true);
        user.setLevel(5);
        user.setIcon("http://v1.qzone.cc/avatar/201507/03/12/09/55960b1135ab7551.jpg%21200x200.jpg");

        User user1 = new User();
        user1.setName("tool");
        user1.setNickName("toolNickname");
        user1.setEmail("tool@syberos.com");
        user1.setVip(false);
        user1.setLevel(2);
        user1.setIcon("http://g.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=3e91b8ca2ff5e0feee4d81056950189e/d62a6059252dd42ae6bab678013b5bb5c8eab8b6.jpg");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        binding.setUsers(users);
    }
}
