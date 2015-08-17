package sugarcaneselection.thaib.org.sugarcanselection;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import sugarcaneselection.thaib.org.sugarcanselection.Interface.OnFragmentInteractionListener;
import sugarcaneselection.thaib.org.sugarcanselection.Util.CircleTransfomation;


public class HomeActivity2 extends AppCompatActivity implements OnFragmentInteractionListener{


    private Toolbar toolbar;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity2);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void init() {

    }

    private void createRoundProfilePicture() {
        ImageView view = (ImageView) findViewById(R.id.profile_image);
        Picasso.with(this).load(R.drawable.ic_profile_sample).transform(new CircleTransfomation()).into(view);
    }

    private void setupNavigationMenu() {

        final NavigationView view = (NavigationView) findViewById(R.id.navigation);
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                view.getMenu().findItem(menuItem.getItemId()).setChecked(true);
                Log.d("TAG Debug Application", "MenuSelected");
                drawerLayout.closeDrawers();
                return true;
            }



        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
