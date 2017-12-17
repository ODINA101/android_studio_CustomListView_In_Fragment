package app.samniashvili.irakli.customlistviewinfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by irakli on 12/17/2017.
 */

public class myFragment extends Fragment{
    String[] names = {"irakli","gio","nini","lela","mari","ana"};
    String[] des = {"programer","sachin","tata","driver","xuti","eqvsi"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );
        ListView listView = view.findViewById( R.id.fragment_listView );
        customAdapter cusdapter = new customAdapter();
       listView.setAdapter(cusdapter);
    }



    public class customAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

            @SuppressLint("ViewHolder")
            @Override
            public View getView(int position, View view, ViewGroup parent) {
                view = getLayoutInflater().inflate( R.layout.custom_layout,null );
                TextView mName= view.findViewById( R.id.custom_layout_name );
                TextView mDes= view.findViewById( R.id.custom_layout_des );

              mName.setText(names[position]);
              mDes.setText(des[position]);

            return view;
        }
    }
}
