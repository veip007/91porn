package com.u9porn.ui.splash;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.u9porn.data.model.User;
import com.u9porn.ui.user.UserPresenter;
import com.u9porn.utils.UserHelper;

import javax.inject.Inject;

/**
 * @author flymegoc
 * @date 2017/12/21
 */

public class SplashPresenter extends MvpBasePresenter<SplashView> implements ISplash {

    private UserPresenter userPresenter;
    private User user;

    @Inject
    public SplashPresenter(UserPresenter userPresenter, User user) {
        this.userPresenter = userPresenter;
        this.user = user;
    }

    @Override
    public void login(String username, String password, String captcha) {
        userPresenter.login(username, password, captcha, new UserPresenter.LoginListener() {
            @Override
            public void loginSuccess(final User user) {
                ifViewAttached(new ViewAction<SplashView>() {
                    @Override
                    public void run(@NonNull SplashView view) {
                        user.copyProperties(SplashPresenter.this.user);
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
        return UserHelper.isUserInfoComplete(user);
    }
}
