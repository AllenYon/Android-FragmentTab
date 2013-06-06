package cn.link.fragmenttab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Link
 * Date: 13-6-5
 * Time: PM4:38
 * To change this template use File | Settings | File Templates.
 */
public class TextListFragment extends ListFragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListAdapter(new ListAdapter());
    }

    class ListAdapter extends BaseAdapter {


        ListAdapter() {

        }

        @Override
        public int getCount() {
            return 100;  //ToDo
        }

        @Override
        public Object getItem(int position) {
            return null;  //ToDo
        }

        @Override
        public long getItemId(int position) {
            return 0;  //ToDo
        }

        class Holder {
            TextView mTv;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = null;
            if (convertView == null) {
                view = View.inflate(getActivity(), R.layout.cell, null);
                Holder holder = new Holder();
                holder.mTv = (TextView) view.findViewById(R.id.tv);
                view.setTag(holder);
            } else {
                view = convertView;
            }
            Holder holder = (Holder) view.getTag();

            holder.mTv.setText("" + position);

            return view;  //ToDo
        }
    }

}
