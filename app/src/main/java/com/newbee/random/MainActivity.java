package com.newbee.random;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.newbee.random_lib.RandomUtil;

public class MainActivity extends ComponentActivity {
    private TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv_1);
        tv2=findViewById(R.id.tv_2);
        tv3=findViewById(R.id.tv_3);
        tv4=findViewById(R.id.tv_4);
//        tv1.setText(RandomUtil.getInstance().getRandomInt(2)+"");
//        tv2.setText(RandomUtil.getInstance().getRandomString(13)+"");
//        tv3.setText(RandomUtil.getInstance().getRandomStringUseCustomStrings(44,"lixiao_"));
//        tv4.setText(RandomUtil.getInstance().getRandomLongByLength(10)+"---");
        tv1.setText(RandomUtil.getInstance().getRandomStringUseCustomString(15,"fjsklfjslx20feosfiso"));
        tv2.setText(RandomUtil.getInstance().getRandomStringTitleAddStr("title---",22));
        tv3.setText(RandomUtil.getInstance().getRandomStringUseCustomStrings(3,"lixiao_","haha-"));
        tv4.setText(RandomUtil.getInstance().getRandomStringUseCustomStringsAddBwStr(55,"---","lixiao","lihui","wangjing"));

    }
}
