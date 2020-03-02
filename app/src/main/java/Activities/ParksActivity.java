package Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.apextourguide.ParksFragment;
import com.example.android.apextourguide.R;


public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ParksFragment()).commit();
    }

}