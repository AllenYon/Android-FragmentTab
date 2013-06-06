package cn.link.fragmenttab;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import cn.link.fragmenttab.lib.FragmentTab;
import cn.link.fragmenttab.lib.TabItemImpl;

public class MyActivity extends FragmentActivity implements View.OnClickListener {
    Button mBtnActive;
    Button mBtnLike;
    Button mBtnMessage;
    Button mBtnList;
    FragmentTab mFragmentTab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mBtnActive = (Button) findViewById(R.id.btn_active);
        mBtnLike = (Button) findViewById(R.id.btn_like);
        mBtnMessage = (Button) findViewById(R.id.btn_message);
        mBtnList= (Button) findViewById(R.id.btn_list);


        mBtnActive.setOnClickListener(this);
        mBtnLike.setOnClickListener(this);
        mBtnMessage.setOnClickListener(this);
        mBtnList.setOnClickListener(this);

        mFragmentTab = new FragmentTab(getSupportFragmentManager());
        mFragmentTab.addTabItem(new TabItemImpl(this, "active", TextFragment.class));

        Bundle likeBundle = new Bundle();
        likeBundle.putString("text", "like");
        mFragmentTab.addTabItem(new TabItemImpl(this, "like", TextFragment.class, likeBundle));

        Bundle messageBundle = new Bundle();
        messageBundle.putString("text", "message");
        mFragmentTab.addTabItem(new TabItemImpl(this, "message", TextFragment.class, messageBundle));

        mFragmentTab.addTabItem(new TabItemImpl(this, "list", TextListFragment.class));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_active:
                mFragmentTab.selectTab("active");
                break;
            case R.id.btn_like:
                mFragmentTab.selectTab("like");
                break;
            case R.id.btn_message:
                mFragmentTab.selectTab("message");
                break;
            case R.id.btn_list:
                mFragmentTab.selectTab("list");
                break;

        }
    }

}
