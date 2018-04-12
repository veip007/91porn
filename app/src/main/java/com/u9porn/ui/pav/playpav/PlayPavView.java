package com.u9porn.ui.pav.playpav;

import com.u9porn.data.model.PavModel;
import com.u9porn.data.model.PavVideoParserJsonResult;
import com.u9porn.ui.BaseView;

import java.util.List;

/**
 * @author flymegoc
 * @date 2018/1/30
 */

public interface PlayPavView extends BaseView {
    void playVideo(PavVideoParserJsonResult pavVideoParserJsonResult);

    void listVideo(List<PavModel> pavModelList);
}
