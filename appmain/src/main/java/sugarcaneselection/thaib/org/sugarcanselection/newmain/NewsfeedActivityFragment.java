package sugarcaneselection.thaib.org.sugarcanselection.newmain;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import sugarcaneselection.thaib.org.sugarcanselection.R;
import sugarcaneselection.thaib.org.sugarcanselection.adapter.NewFeedsRecyclerAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class NewsfeedActivityFragment extends Fragment {

    public NewsfeedActivityFragment() {
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_newfeed, container, false);

        //RecyclerView setting up
        RecyclerView  recyclerView = (RecyclerView) v.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        //Create Linear Layout Manager
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.requestSimpleAnimationsInNextLayout();
        recyclerView.setLayoutManager(manager);

        DefaultItemAnimator d = new DefaultItemAnimator();
        d.setAddDuration(1000);
        d.setMoveDuration(1000);
        d.setRemoveDuration(1000);
        d.setChangeDuration(1000);

        recyclerView.setItemAnimator(d);

        initializeData();
        NewFeedsRecyclerAdapter adapter = new NewFeedsRecyclerAdapter(list);
        recyclerView.setAdapter(adapter);



        return v;
    }

    private List<SampleCardView> list ;

    private void initializeData(){
        list = new ArrayList<>();
        for (int i = 0;i<100;i++) {
            list.add(new SampleCardView("Emma Watson", "United State", R.drawable.ic_backup));
            list.add(new SampleCardView("Emma Stone", "United Condom", R.drawable.ic_autorenew));
            list.add(new SampleCardView("Emma Stang", "United Sun Moon WTF", R.drawable.ic_delete));
        }
    }



    public class SampleCardView{
       public String Name;
       public String WorkPlace;
        public Integer PictureID;

        public SampleCardView(String name, String workPlace, Integer pictureID) {
            Name = name;
            WorkPlace = workPlace;
            PictureID = pictureID;
        }

    }
}
