package br.com.tcc_20;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderImageAdapter>{

    private List<Slider> sliders;

    public SliderAdapter(List<Slider> sliders) {
        this.sliders = sliders;
    }

    @NonNull
    @Override
    public SliderImageAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderImageAdapter(
        LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_container_locatiion,
                parent,
                false
        )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderImageAdapter holder, int position) {
        holder.setLocation(sliders.get(position));
    }

    @Override
    public int getItemCount() {
        return sliders.size();
    }

    static class SliderImageAdapter extends RecyclerView.ViewHolder{


        private KenBurnsView kbvLocation;
        private TextView textStartRating;

         SliderImageAdapter(@NonNull View itemView) {
            super(itemView);
            kbvLocation = itemView.findViewById(R.id.kbvLocation);
           // StartRating = itemView.findViewById(R.id.) ;
        }

        void setLocation(Slider slider){
            Picasso.get().load(Slider.imageUrl).into(kbvLocation);
            textStartRating.setText(String.valueOf(Slider.startRating));
        }
    }
}
