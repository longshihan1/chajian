package com.longshihan.chajian.model;

import com.longshihan.chajian.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @time 2016-10-25 0025 下午 08:48
 * @des girl model implement
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class GirlModelImplv1 implements IGirlMOdel {


    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        //网络加载数据

        List<Girl> list=new ArrayList<>();
        //回调
        if(listener!=null){
            listener.complete(list);
        }


    }
}
