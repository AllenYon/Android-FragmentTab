Android-FragmentTab
===================

Similar to ActionBar ，Simpler

实现管理Fragment的逻辑和UI的分离，适用于底部Tab,分页Tab等场景，内部默认使用的是add(),attach(),detach()操作管理fragment，
也可以继承TabItem自己实现UI逻辑，添加效果。




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
