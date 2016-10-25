package com.longshihan.chajian.model;

import com.longshihan.chajian.Girl;

import java.util.List;

/**
 * @author Administrator
 * @time 2016-10-25 0025 下午 08:31
 * @des Girl（数据的model）
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public interface IGirlMOdel {
    /**
     * 加载数据
     *
     * @param listener 回调接口
     */
    void loadGirl(GirlOnLoadListener listener);

    interface GirlOnLoadListener {
        void complete(List<Girl> girls);
    }
}
