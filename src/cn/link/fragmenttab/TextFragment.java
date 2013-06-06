package cn.link.fragmenttab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Link
 * Date: 13-6-5
 * Time: PM4:38
 * To change this template use File | Settings | File Templates.
 */
public class TextFragment extends Fragment {


    String mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mText = getArguments().getString("text");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, null);
        TextView tv = (TextView) view.findViewById(R.id.tv);

        if (!TextUtils.isEmpty(mText)) {
            tv.setText(mText);
        }

        return view;
    }
}
