package com.example.galib.assessment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Galib on 12/31/2017.
 */

class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<ClientsData> clientsDataList = null;
    private ArrayList<ClientsData> arraylist;

    public ListViewAdapter(Context context, List<ClientsData> clientsDataList) {
        mContext = context;
        this.clientsDataList = clientsDataList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<ClientsData>();
        this.arraylist.addAll(clientsDataList);
    }

    public class ViewHolder {
        TextView id;
        TextView name;
        TextView dob;
        TextView address;
        TextView gender;
        TextView email;
        TextView password;
        TextView contact;
        TextView emergencycontact;
    }

    @Override
    public int getCount() {
        return clientsDataList.size();
    }

    @Override
    public ClientsData getItem(int position) {
        return clientsDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            holder.id = (TextView) view.findViewById(R.id.id);
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.dob = (TextView) view.findViewById(R.id.dob);
            holder.address = (TextView) view.findViewById(R.id.address);
            holder.gender = (TextView) view.findViewById(R.id.gender);
            holder.email = (TextView) view.findViewById(R.id.email);
            holder.password = (TextView) view.findViewById(R.id.password);
            holder.contact = (TextView) view.findViewById(R.id.contact);
            holder.emergencycontact = (TextView) view.findViewById(R.id.emergencycontact);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.id.setText(clientsDataList.get(position).getId());
        holder.name.setText(clientsDataList.get(position).getName());
        holder.dob.setText(clientsDataList.get(position).getDob());
        holder.address.setText(clientsDataList.get(position).getAddress());
        holder.gender.setText(clientsDataList.get(position).getGender());
        holder.email.setText(clientsDataList.get(position).getEmail());
        holder.password.setText(clientsDataList.get(position).getPassword());
        holder.contact.setText(clientsDataList.get(position).getContact());
        holder.emergencycontact.setText(clientsDataList.get(position).getEmergencycontact());
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(mContext, Main5Activity.class);
                intent.putExtra("id",(clientsDataList.get(position).getId()));
                intent.putExtra("name",(clientsDataList.get(position).getName()));
                intent.putExtra("dob",(clientsDataList.get(position).getDob()));
                intent.putExtra("address",(clientsDataList.get(position).getAddress()));
                intent.putExtra("gender",(clientsDataList.get(position).getGender()));
                intent.putExtra("email",(clientsDataList.get(position).getEmail()));
                intent.putExtra("password",(clientsDataList.get(position).getPassword()));
                intent.putExtra("contact",(clientsDataList.get(position).getContact()));
                intent.putExtra("emergencycontact",(clientsDataList.get(position).getEmergencycontact()));
                mContext.startActivity(intent);
            }
        });
        return view;
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        clientsDataList.clear();
        if (charText.length() == 0) {
            clientsDataList.addAll(arraylist);
        } else {
            for (ClientsData cd : arraylist) {
                if (cd.getName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    clientsDataList.add(cd);
                }
            }
        }
        notifyDataSetChanged();
    }
}
