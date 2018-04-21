package com.u9porn.di.component;

import com.u9porn.di.PerActivity;
import com.u9porn.di.module.ActivityModule;
import com.u9porn.ui.about.AboutActivity;
import com.u9porn.ui.basemain.BaseMainFragment;
import com.u9porn.ui.download.DownloadActivity;
import com.u9porn.ui.download.DownloadingFragment;
import com.u9porn.ui.download.FinishedFragment;
import com.u9porn.ui.porn9video.favorite.FavoriteActivity;
import com.u9porn.ui.porn9video.history.HistoryActivity;
import com.u9porn.ui.images.meizitu.MeiZiTuFragment;
import com.u9porn.ui.images.mm99.Mm99Fragment;
import com.u9porn.ui.images.viewimage.PictureViewerActivity;
import com.u9porn.ui.main.MainActivity;
import com.u9porn.ui.mine.MineFragment;
import com.u9porn.ui.pav.PavFragment;
import com.u9porn.ui.pav.playpav.PlayPavActivity;
import com.u9porn.ui.porn9forum.Forum9IndexFragment;
import com.u9porn.ui.porn9forum.ForumFragment;
import com.u9porn.ui.porn9forum.browse9forum.Browse9PForumActivity;
import com.u9porn.ui.porn9video.author.AuthorActivity;
import com.u9porn.ui.porn9video.index.IndexFragment;
import com.u9porn.ui.porn9video.play.BasePlayVideo;
import com.u9porn.ui.porn9video.search.SearchActivity;
import com.u9porn.ui.porn9video.videolist.VideoListFragment;
import com.u9porn.ui.proxy.ProxySettingActivity;
import com.u9porn.ui.setting.SettingActivity;
import com.u9porn.ui.splash.SplashActivity;
import com.u9porn.ui.porn9video.user.UserLoginActivity;
import com.u9porn.ui.porn9video.user.UserRegisterActivity;

import dagger.Component;

/**
 * @author flymegoc
 * @date 2018/2/4
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity splashActivity);

    void inject(MainActivity mainActivity);

    void inject(DownloadActivity downloadActivity);

    void inject(SettingActivity settingActivity);

    void inject(AboutActivity aboutActivity);

    void inject(FavoriteActivity favoriteActivity);

    void inject(SearchActivity searchActivity);

    void inject(BasePlayVideo basePlayVideo);

    void inject(UserLoginActivity userLoginActivity);

    void inject(UserRegisterActivity userRegisterActivity);

    void inject(AuthorActivity authorActivity);

    void inject(ProxySettingActivity proxySettingActivity);

    void inject(PlayPavActivity playPigAvActivity);

    void inject(PictureViewerActivity pictureViewerActivity);

    void inject(Browse9PForumActivity browse9PForumActivity);

    void inject(HistoryActivity historyActivity);

    void inject(VideoListFragment videoListFragment);

    void inject(PavFragment pigAvFragment);

    void inject(IndexFragment indexFragment);

    void inject(MeiZiTuFragment meiZiTuFragment);

    void inject(Mm99Fragment mm99Fragment);

    void inject(DownloadingFragment downloadingFragment);

    void inject(FinishedFragment finishedFragment);

    void inject(BaseMainFragment baseMainFragment);

    void inject(MineFragment mineFragment);

    void inject(ForumFragment forumFragment);

    void inject(Forum9IndexFragment forum9IndexFragment);
}
