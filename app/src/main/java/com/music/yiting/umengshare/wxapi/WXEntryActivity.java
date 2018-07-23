package com.music.yiting.umengshare.wxapi;

import android.os.Bundle;

import com.music.yiting.umengshare.R;
import com.umeng.socialize.weixin.view.WXCallbackActivity;

/**
 * 微信分享
 */

public class WXEntryActivity extends WXCallbackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wxentry);
    }
}
