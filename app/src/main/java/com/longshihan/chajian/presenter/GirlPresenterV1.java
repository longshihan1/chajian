package com.longshihan.chajian.presenter;

import com.longshihan.chajian.Girl;
import com.longshihan.chajian.model.GirlModelImplv1;
import com.longshihan.chajian.model.IGirlMOdel;
import com.longshihan.chajian.view.IGirlView;

import java.util.List;

/**
 * @author Administrator
 * @time 2016-10-25 0025 下午 08:45
 * @des girl presenter
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class GirlPresenterV1 extends BasePresenter<IGirlView>{

    //model
    IGirlMOdel mIGirlMOdel=new GirlModelImplv1();


    /**
     * 绑定
     */
    public void fetch(){
        //加载进度条
        getView().showLoading();
        //获取数据
        if (mIGirlMOdel!=null){
            mIGirlMOdel.loadGirl(new IGirlMOdel.GirlOnLoadListener() {
                @Override
                public void complete(List<Girl> girls) {
                    //加载得到数据
                    //给view显示
                    getView().showGirls(girls);
                }
            });
        }
    }


}
