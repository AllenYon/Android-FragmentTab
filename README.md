Android-FragmentTab
===================

Similar to ActionBar ，Simpler


##Usage

```  
mBtnActive.setOnClickListener(this);
mBtnLike.setOnClickListener(this);
mBtnMessage.setOnClickListener(this);

mFragmentTab = new FragmentTab(getSupportFragmentManager());
mFragmentTab.addTabItem(new TabItemImpl(getThis(), "active", ActiveFragment.class));
mFragmentTab.addTabItem(new TabItemImpl(getThis(), "like", LikeFragment.class));
mFragmentTab.addTabItem(new TabItemImpl(getThis(), "message", MessageFragment.class));
```

```
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
  }
}
```
