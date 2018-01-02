package credit.sina.com.trackedview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = (RecyclerView) findViewById(R.id.reyc);
        DividerLine dividerLine = new DividerLine(DividerLine.VERTICAL);
        dividerLine.setSize(0);
        dividerLine.setColor(ContextCompat.getColor(this, R.color.tv_white));
        recy.addItemDecoration(dividerLine);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recy.setLayoutManager(manager);
        TrackRecycleViewAdapter itemactivityrecyAdapter = new TrackRecycleViewAdapter(this);
        recy.setAdapter(itemactivityrecyAdapter);

    }
}
