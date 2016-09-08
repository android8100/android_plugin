package com.youku.player.plugin.interf;

/**
 * Created by Tramp on 2016/9/8.
 */
public interface InnerCallback {
    void onCallSuccess(String tag, Object... object);
    void onCallFailed(String tag, Object... object);
    void onCancel(String tag, Object... object);
}
