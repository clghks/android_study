package com.clghks.onboardertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jrejaud.onboarder.OnboardingActivity;
import com.jrejaud.onboarder.OnboardingPage;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnboardingPage page1 = new OnboardingPage("First screen title","This is important information, pay attention",R.mipmap.ic_launcher);
        OnboardingPage page2 = new OnboardingPage(null,"This is a robut.",R.mipmap.ic_launcher,"Okay, tell me more");
        OnboardingPage page3 = new OnboardingPage("The Robot again!","Hey look, it's the robot again! \nMaybe he wants to be your friend.",R.mipmap.ic_launcher,"We're done here");

        page1.setTitleTextColor(R.color.white);
        page1.setBodyTextColor(R.color.white);

        page2.setBodyTextColor(R.color.white);

        page3.setTitleTextColor(R.color.white);
        page3.setBodyTextColor(R.color.white);

        List<OnboardingPage> onboardingPages = new LinkedList<>();
        onboardingPages.add(page1);
        onboardingPages.add(page2);
        onboardingPages.add(page3);

        Bundle onboardingActivityBundle = OnboardingActivity.newBundleColorBackground(R.color.greenBackground, onboardingPages);

        Intent intent = new Intent(this,MyOnboardingActivity.class);
        intent.putExtras(onboardingActivityBundle);
        startActivity(intent);
    }
}
