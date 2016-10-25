package com.longshihan.chajian.view;

import com.longshihan.chajian.Girl;

import java.util.List;

/**
 * @author Administrator
 * @time 2016-10-25 0025 下午 08:39
 * @des girlview interface
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public interface IGirlView {
    /**
     * 显示进度条
     */
    void showLoading();

    /**
     * 显示girl
     * @param girls
     */
    void showGirls(List<Girl> girls);

}
