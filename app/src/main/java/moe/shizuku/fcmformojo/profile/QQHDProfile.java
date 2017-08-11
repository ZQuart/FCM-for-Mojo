package moe.shizuku.fcmformojo.profile;

import android.content.Context;
import android.content.Intent;

import java.io.File;

import moe.shizuku.fcmformojo.R;
import moe.shizuku.fcmformojo.model.Chat;

/**
 * Created by rikka on 2017/7/29.
 */

public class QQHDProfile implements Profile {

    @Override
    public String getPackageName() {
        return "com.tencent.minihd.qq";
    }

    @Override
    public int getDisplayName() {
        return R.string.display_name_qqhd;
    }

    @Override
    public int getNotificationIcon() {
        return R.drawable.ic_noti_qq_24dp;
    }

    @Override
    public int getNotificationColor() {
        return R.color.colorNotification;
    }

    @Override
    public void onStartChatActivity(Context context, Chat chat) {
        ProfileHelper.startActivity(context, this);
    }

    @Override
    public void onStartQrCodeScanActivity(Context context) {
        ProfileHelper.startActivity(context, this);
    }
}