package com.lv.test;

import android.app.Application;

import com.mcxiaoke.packer.helper.PackerNg;
import com.umeng.analytics.MobclickAgent;

/**
 * User: 吕勇
 * Date: 2016-06-23
 * Time: 09:14
 * Description:
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        String market = PackerNg.getMarket(this,"defaul_channel");
        MobclickAgent.startWithConfigure(new MobclickAgent.UMAnalyticsConfig(this,"576b3779e0f55af1b80041ae",market));
    }
}
