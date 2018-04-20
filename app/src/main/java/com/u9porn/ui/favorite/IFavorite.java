package com.u9porn.ui.favorite;

/**
 * @author flymegoc
 * @date 2017/11/28
 * @describe
 */

public interface IFavorite extends IBaseFavorite {

    void loadRemoteFavoriteData(boolean pullToRefresh);

    void deleteFavorite(String rvid);

    void exportData(boolean onlyUrl);

    int getPlayBackEngine();

    boolean isFavoriteNeedRefresh();

    void setFavoriteNeedRefresh(boolean needRefresh);
}
