package com.youku.player.plugin.model;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

/**
 * Created by Tramp on 2016/9/8.
 */
public class InnerHandler extends Handler {
    private WeakReference<InnerMessage> ref;

    public InnerHandler(InnerMessage innerMessage) {
        ref = new WeakReference<InnerMessage>(innerMessage);
    }

    @Override
    public void handleMessage(Message msg) {
        if(ref != null){
            InnerMessage innerMessage = ref.get();
            if(innerMessage != null){
                innerMessage.innerHandleMessage(msg);
            }
        }
    }

    public interface InnerMessage {
        void innerHandleMessage(Message msg);
    }
}
