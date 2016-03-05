package jp.numero.designdemoapplication.Tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import jp.numero.designdemoapplication.R;

public class TabFragment extends Fragment {

    public TabFragment() {
    }

    public static TabFragment newInstance(int sectionNumber) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putInt("section", sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_viewpager, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section);
        textView.setText("Section " + String.valueOf(getArguments().getInt("section")));
        return rootView;
    }
}
