package hendy.indonesiabible;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class BilanganFragment extends Fragment{

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {  
		super.onActivityCreated(savedInstanceState);

		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 36; i++) {
			strings.add("Bilangan " + (i + 1));
		}
		ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
			case 0:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 1:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 2:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 3:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 4:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 5:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 6:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 7:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 8:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 9:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 10:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 11:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 12:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 13:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 14:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 15:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 16:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 17:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 18:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 19:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 20:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 21:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 22:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 23:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 24:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 25:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 26:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 27:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 28:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 29:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 30:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 31:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 32:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 33:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 34:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
			case 35:
				MessageIndoBible("Bilangan No." + (pos + 1), "Injil Bilangan");
				break;
				default:
					break;
				}
			}
		});
	}

	private void MessageIndoBible(String title, String message){
		AlertDialog.Builder alert = new AlertDialog.Builder(getActivity(), AlertDialog.THEME_HOLO_DARK);
		alert.setTitle(title)
		.setIcon(R.drawable.ic_launcher)
		.setMessage(message)
		.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		}).show();
	}
	
	
}
