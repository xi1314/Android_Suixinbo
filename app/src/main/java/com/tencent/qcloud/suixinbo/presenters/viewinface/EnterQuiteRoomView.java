package com.tencent.qcloud.suixinbo.presenters.viewinface;


import com.tencent.qcloud.suixinbo.model.LiveInfoJson;

/**
 * 创建房间回调接口
 */
public interface EnterQuiteRoomView extends MvpView {


    void EnterRoomComplete(int id_status, boolean succ);

    void QuiteRoomComplete(int id_status, boolean succ, LiveInfoJson liveinfo);


}
