package com.camnter.newlife.views.fragment.easyslidingtabsfragment;

import android.os.Bundle;
import android.view.View;

import com.camnter.newlife.R;
import com.camnter.newlife.core.BaseFragment;

/**
 * Description：EasyThirdFragment
 * Created by：CaMnter
 * Time：2015-10-17 12:15
 */
public class EasyThirdFragment extends BaseFragment {

    private static EasyThirdFragment instance;

    private EasyThirdFragment() {
    }

    public static EasyThirdFragment getInstance() {
        if (instance == null) instance = new EasyThirdFragment();
        return instance;
    }

    /**
     * Fill in layout id
     *
     * @return layout id
     */
    @Override
    protected int getLayoutId() {
        return R.layout.easy_third_fragment;
    }

    /**
     * Initialize the view in the layout
     *
     * @param self               self
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void initViews(View self, Bundle savedInstanceState) {

    }

    /**
     * Initialize the View of the listener
     */
    @Override
    protected void initListeners() {

    }

    /**
     * Initialize the Activity data
     */
    @Override
    protected void initData() {

    }

}
