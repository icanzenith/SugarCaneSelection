package sugarcaneselection.thaib.org.sugarcanselection.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sugarcaneselection.thaib.org.sugarcanselection.R;
import sugarcaneselection.thaib.org.sugarcanselection.newmain.NewsfeedActivityFragment;

/**
 * Created by Jitpakorn on 6/9/15 AD.
 */
public class NewFeedsRecyclerAdapter extends RecyclerView.Adapter<NewFeedsRecyclerAdapter.ViewHolder> {

    List<NewsfeedActivityFragment.SampleCardView> list;

    public NewFeedsRecyclerAdapter(List<NewsfeedActivityFragment.SampleCardView> list) {
        this.list = list;
    }



    @Override
    public NewFeedsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        v.setElevation(20);
        ViewHolder vh = new ViewHolder(v);


        return vh;
    }

    @Override
    public void onBindViewHolder(NewFeedsRecyclerAdapter.ViewHolder holder, int position) {
        holder.tvWorkPlace.setText(list.get(position).WorkPlace);
        holder.tvName.setText(list.get(position).Name);
        holder.userImage.setImageResource(list.get(position).PictureID);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView tvName;
        TextView tvWorkPlace;

        ViewHolder(View itemView) {
            super(itemView);
            userImage = (ImageView) itemView.findViewById(R.id.image_user);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvWorkPlace = (TextView) itemView.findViewById(R.id.tvWorkplace);

        }
    }
}
