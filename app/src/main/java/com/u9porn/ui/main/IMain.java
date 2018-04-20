package com.u9porn.ui.main;

import com.u9porn.ui.notice.IBaseNotice;

/**
 * @author flymegoc
 * @date 2017/12/23
 */

public interface IMain extends IBaseNotice {
    void saveNoticeVersionCode(int versionCode);

    int getIgnoreUpdateVersionCode();

    void setIgnoreUpdateVersionCode(int versionCode);

    void setMainSecondTabShow(int tabId);

    int getMainSecondTabShow();

    void setMainFirstTabShow(int tabId);

    int getMainFirstTabShow();

    boolean haveNotSetF9pornAddress();

    boolean haveNotSetV9pronAddress();

    boolean haveNotSetPavAddress();

    boolean isUserLogin();
}
