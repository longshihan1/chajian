package com.longshihan.chajian;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.longshihan.chajian.presenter.GirlPresenterV1;
import com.longshihan.chajian.view.IGirlView;

import java.util.List;

public class MainActivity extends MVPBaseActivity<IGirlView,GirlPresenterV1> implements IGirlView {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
        mPresenter.fetch();

    }

    @Override
    protected GirlPresenterV1 createPresenter() {
        return new GirlPresenterV1();
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    /**
     * 加载进度条
     */
    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this, "加载", Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示数据
     * @param girls
     */
    @Override
    public void showGirls(List<Girl> girls) {


    }
}
