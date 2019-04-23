package com.miaml.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.miaml.wxplayer.WxMediaController;
import com.miaml.wxplayer.WxPlayer;

/**
 * WxPlayer仿微信播放视频
 * https://github.com/maimingliang/App
 */
public class MainActivity extends AppCompatActivity {

    private WxPlayer mWxPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mWxPlayer = (WxPlayer) findViewById(R.id.wx_player);

        String fileName = "https://www.zxpaas.com/qyapp/im/view?id=60d9e29101184461b6acbc864d5e10fe&type=mp4.mp4";
        String path = "http://192.168.0.232:8089/group1/M00/00/90/wKgA6FlI5MqAIQuTAAml3v7Z8Mo830.mp4";

        mWxPlayer.setVideoPath(fileName);

        WxMediaController controller = new WxMediaController(this);
//        controller.setThumbImage("http://192.168.0.232:8089/group1/M00/00/90/wKgA6FlI5MqAJVGlAAAcfondTlY728.jpg").setThumbHeight(640);
//        controller.setThumbImage(R.mipmap.ic_launcher).setThumbHeight(640);
        mWxPlayer.setMediaController(controller);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mWxPlayer != null) {
            mWxPlayer.release();
        }
    }
}
