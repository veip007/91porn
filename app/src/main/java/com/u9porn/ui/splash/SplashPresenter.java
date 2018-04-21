package com.u9porn.ui.splash;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.u9porn.data.DataManager;
import com.u9porn.data.model.User;
import com.u9porn.ui.porn9video.user.UserPresenter;
import com.u9porn.utils.UserHelper;

import javax.inject.Inject;

/**
 * @author flymegoc
 * @date 2017/12/21
 */

public class SplashPresenter extends MvpBasePresenter<SplashView> implements ISplash {

    private UserPresenter userPresenter;
    private DataManager dataManager;

    @Inject
    public SplashPresenter(UserPresenter userPresenter, DataManager dataManager) {
        this.userPresenter = userPresenter;
        this.dataManager = dataManager;
    }

    @Override
    public void login(String username, String password, String captcha) {
        userPresenter.login(username, password, captcha, new UserPresenter.LoginListener() {
            @Override
            public void loginSuccess(final User user) {
                ifViewAttached(new ViewAction<SplashView>() {
                    @Override
                    public void run(@NonNull SplashView view) {
                        user.copyProperties(dataManager.getUser());
                        view.loginSuccess(user);
                    }
                });
            }

            @Override
            public void loginFailure(final String message) {
                ifViewAttached(new ViewAction<SplashView>() {
                    @Override
                    public void run(@NonNull SplashView view) {
                        view.loginError(message);
                    }
                });
            }
        });
    }

    @Override
    public boolean isUserLogin() {
        return dataManager.isUserLogin();
    }

    @Override
    public String getPorn9VideoLoginUserName() {
        return dataManager.getPorn9VideoLoginUserName();
    }

    @Override
    public String getPorn9VideoLoginUserPassword() {
        return dataManager.getPorn9VideoLoginUserPassword();
    }

    @Override
    public boolean isPorn9VideoUserAutoLogin() {
        return dataManager.isPorn9VideoUserAutoLogin();
    }
}
