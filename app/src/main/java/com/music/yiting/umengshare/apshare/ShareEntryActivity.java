package com.music.yiting.umengshare.apshare;

import android.os.Bundle;

import com.music.yiting.umengshare.R;
import com.umeng.socialize.weixin.view.WXCallbackActivity;

/**
 * 支付宝分享
 */

public class ShareEntryActivity extends WXCallbackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wxentry);
    }
}
