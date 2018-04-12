package com.u9porn.ui.setting;

import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;

/**
 * @author flymegoc
 * @date 2018/2/6
 */

public interface ISetting {

    void test9PornVideo(String baseUrl, QMUICommonListItemView qmuiCommonListItemView, String key);

    void test9PornForum(String baseUrl, QMUICommonListItemView qmuiCommonListItemView, String key);

    void testPav(String baseUrl, QMUICommonListItemView qmuiCommonListItemView, String key);

    boolean isHaveUnFinishDownloadVideo();

    boolean isHaveFinishDownloadVideoFile();

    void moveOldDownloadVideoToNewDir(String newDirPath, QMUICommonListItemView qmuiCommonListItemView);
}
