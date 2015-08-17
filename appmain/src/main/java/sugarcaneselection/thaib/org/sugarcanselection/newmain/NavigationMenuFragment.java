package sugarcaneselection.thaib.org.sugarcanselection.newmain;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sugarcaneselection.thaib.org.sugarcanselection.R;

/**
 * Created by Jitpakorn on 6/9/15 AD.
 */
public class NavigationMenuFragment extends Fragment {

    public NavigationMenuFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_navdrawer, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
