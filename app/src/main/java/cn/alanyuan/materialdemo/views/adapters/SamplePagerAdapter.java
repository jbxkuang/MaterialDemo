package cn.alanyuan.materialdemo.views.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.alanyuan.materialdemo.R;

public class SamplePagerAdapter extends PagerAdapter {

    private final String[] TITLES = {"聊天", "动态", "我", "任务"};
    private final int FRAGMENT_COUNT = 4;
    private Context context;

    public SamplePagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return o == view;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(
                R.layout.fragment_dialer_sample_page,
                container, false);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}