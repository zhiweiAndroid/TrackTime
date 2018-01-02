package credit.sina.com.trackedview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Administrator on 2017/11/1 0001.
 */
public class TrackRecycleViewAdapter extends RecyclerView.Adapter<TrackRecycleViewAdapter.ItemRecycleHolder> {

    private Context context;


    public TrackRecycleViewAdapter(Context context) {
        this.context = context;

    }

    @Override
    public ItemRecycleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemRecycleHolder holder = new ItemRecycleHolder(LayoutInflater.from(context).inflate(R.layout.item_apply_recode, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemRecycleHolder holder, int position) {
     if (position==0){
         holder.tracktimeView1.setVisibility(View.INVISIBLE);
     }else if (position==10-1){
         holder.tracktimeView2.setVisibility(View.INVISIBLE);
     }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ItemRecycleHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tracktime_view1)
        View tracktimeView1;
        @BindView(R.id.tracktime_image)
        TextView tracktimeImage;
        @BindView(R.id.tracktime_view2)
        View tracktimeView2;
        public ItemRecycleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }

}
