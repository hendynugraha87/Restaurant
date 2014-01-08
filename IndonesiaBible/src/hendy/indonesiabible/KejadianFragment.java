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

public class KejadianFragment extends Fragment{
	
	@Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.indonesia_bible_fragment, container, false);
		return v;
	}
	
	@Override 
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String kej1_1 = getResources().getString(R.string.app_name);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
 		   strings.add("Kejadian " + (i + 1));
 		}
        ListView lv = (ListView)getActivity().findViewById(R.id.list_bible);
        lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings));
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				switch (pos) {	
				case 0:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 1:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 2:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 3:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 4:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 5:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 6:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 7:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 8:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 9:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 10:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 11:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 12:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 13:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 14:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 15:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 16:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 17:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 18:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 19:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 20:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 21:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 22:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 23:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 24:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 25:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 26:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 27:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 28:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 29:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 30:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 31:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 32:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 33:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 34:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 35:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 36:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 37:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 38:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 39:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 40:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 41:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 42:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 43:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 44:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 45:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 46:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 47:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 48:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
					break;
				case 49:
					MessageIndoBible("Kejadian No." + (pos + 1), "Injil Kejadian");
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
