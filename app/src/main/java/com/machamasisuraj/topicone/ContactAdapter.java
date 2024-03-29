package com.machamasisuraj.topicone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter   extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{
    Context mContext;
    List<Contacts> lstContacts;

    public ContactAdapter(Context mContext, List<Contacts> lstContacts) {
        this.mContext = mContext;
        this.lstContacts = lstContacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent,false);
       return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        final Contacts contacts =  lstContacts.get(position);
        holder.img_profile.setImageResource(contacts.getImageId());
        holder.tv_contactname.setText(contacts.getName());
        holder.tv_phonenumber.setText(contacts.getPhoneNo());

        holder.img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext,detailsActivity.class);
                i.putExtra("imageid",contacts.getImageId());
                i.putExtra("name",contacts.getName());
                i.putExtra("num",contacts.getPhoneNo());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstContacts.size();
    }

    //innerclass
    public class ContactViewHolder extends RecyclerView.ViewHolder{
        CircleImageView img_profile;
        TextView tv_contactname, tv_phonenumber;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            img_profile = itemView.findViewById(R.id.img_profile);
            tv_contactname =itemView.findViewById(R.id.tv_contactname);
            tv_phonenumber=itemView.findViewById(R.id.tv_phonenumber);
        }
    }


}
