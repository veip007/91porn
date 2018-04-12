package com.u9porn.ui.pav;

import com.u9porn.data.db.entity.Category;
import com.u9porn.ui.basemain.BaseMainFragment;

/**
 * @author flymegoc
 * @date 2018/1/29
 */

public class MainPavFragment extends BaseMainFragment {

    public static MainPavFragment getInstance() {
        return new MainPavFragment();
    }

    @Override
    public int getCategoryType() {
        return Category.TYPE_PIG_AV;
    }

    @Override
    public boolean isNeedDestroy() {
        return true;
    }
}
