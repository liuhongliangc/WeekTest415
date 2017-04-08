package liuhongliang201745.myslidingmenudemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2017/4/8.
 * author:刘宏亮.
 * function:
 */

public class LeftFragment extends Fragment{
    private ListView mListView;
    private List<Bean> mList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.leftmenu,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        mListView.setAdapter(new CommonAdapter<Bean>(getActivity(),mList) {
            @Override
            public void convert(ViewHolder holder, Bean item) {
                holder.setImageResource(R.id.imageView,item.getImage());
                holder.setText(R.id.textView,item.getName());
            }
        });

    }
    private void initData() {
        mList.add(new Bean(android.R.drawable.ic_menu_search,"搜索"));
        mList.add(new Bean(android.R.drawable.star_big_on,"收藏"));
        mList.add(new Bean(android.R.drawable.sym_action_chat,"收藏"));
        mList.add(new Bean(android.R.drawable.sym_action_chat,"收藏"));
        mList.add(new Bean(android.R.drawable.ic_menu_search,"搜索"));
        mList.add(new Bean(android.R.drawable.star_big_on,"收藏"));
        mList.add(new Bean(android.R.drawable.sym_action_chat,"收藏"));
        mList.add(new Bean(android.R.drawable.sym_action_chat,"收藏"));


    }

    private void initView() {
        mListView = (ListView)getView().findViewById(R.id.main_listview);

    }
}
