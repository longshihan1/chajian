package com.longshihan.chajian.presenter;

import java.lang.ref.WeakReference;

/**
 * @author Administrator
 * @time 2016-10-25 0025 下午 09:44
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public abstract class BasePresenter<T> {
    //当内存不足，可释放内存
    protected WeakReference<T> mViewRef;

    /**
     * 关联 p和V
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected T getView() {
        return mViewRef.get();
    }

}
