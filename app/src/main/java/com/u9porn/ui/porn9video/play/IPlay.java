package com.u9porn.ui.porn9video.play;

import com.u9porn.data.db.entity.V9PornItem;

/**
 * @author flymegoc
 * @date 2017/11/27
 * @describe
 */

public interface IPlay extends IBasePlay {
    void loadVideoUrl(V9PornItem v9PornItem);

    void loadVideoComment(String videoId, String viewKey,boolean pullToRefresh);

    void commentVideo(String comment, String uid, String vid,String viewKey);

    void replyComment(String comment, String username, String vid, String commentId,String viewKey);
}
