package com.u9porn.ui.splash;

import com.u9porn.ui.porn9video.user.IBaseUser;

/**
 *
 * @author flymegoc
 * @date 2017/12/21
 */

public interface ISplash extends IBaseUser{
    boolean isUserLogin();

    String getPorn9VideoLoginUserName();

    String getPorn9VideoLoginUserPassword();

    boolean isPorn9VideoUserAutoLogin();
}
