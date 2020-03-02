package Activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.android.apextourguide.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.beach_menu) {
            // Create a new intent to open the {@link BeachesActivity}
            Intent beachesIntent = new Intent(MainActivity.this, BeachesActivity.class);
            // Start the new activity
            startActivity(beachesIntent);
        } else if (id == R.id.park_menu) {
            // Create a new intent to open the {@link ParksActivity}
            Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
            // Start the new activity
            startActivity(parksIntent);

        } else if (id == R.id.restaurant_menu) {
            // Create a new intent to open the {@link restaurantsActivity}
            Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
            // Start the new activity
            startActivity(restaurantsIntent);
        } else if (id == R.id.bar_menu) {
            // Create a new intent to open the {@link barsActivity}
            Intent barsIntent = new Intent(MainActivity.this, BarsActivity.class);
            // Start the new activity
            startActivity(barsIntent);
        }


        DrawerLayout drawer = findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

