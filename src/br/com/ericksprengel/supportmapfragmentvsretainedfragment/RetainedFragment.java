package br.com.ericksprengel.supportmapfragmentvsretainedfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class RetainedFragment extends Fragment {
	
	private String data;

    // this method is only called once for this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }


	public void clearData() {
		setData(null);
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
}
