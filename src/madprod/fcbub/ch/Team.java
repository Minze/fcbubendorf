package madprod.fcbub.ch;

import madprod.fcbub.ch.R;
import madprod.fcbub.ch.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Team extends Activity {

	private static final int ID_Kader = 1;
	private static final int ID_Stat = 2;
	private static final int ID_Match = 3;
	private static final int ID_Sonstige = 4;
	private static final int ID_Plan = 5;
	private static final int ID_Table = 6;
	private static final int ID_News = 7;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teams);
		
		ActionItem tabelle 	= new ActionItem(ID_Table, "Tabelle", getResources().getDrawable(R.drawable.ic_launcher));
		ActionItem kader 		= new ActionItem(ID_Kader, "Kader", getResources().getDrawable(R.drawable.ic_launcher));
		ActionItem statistik 	= new ActionItem(ID_Stat, "Statistik", getResources().getDrawable(R.drawable.ic_launcher));
        ActionItem matchbericht 	= new ActionItem(ID_Match, "Matchberichte", getResources().getDrawable(R.drawable.ic_launcher));
        ActionItem sonstigeBerichte 	= new ActionItem(ID_Sonstige, "sonstige Berichte", getResources().getDrawable(R.drawable.ic_launcher));
        ActionItem spielplan 	= new ActionItem(ID_Plan, "Spielplan", getResources().getDrawable(R.drawable.ic_launcher));
        ActionItem news 	= new ActionItem(ID_News, "News", getResources().getDrawable(R.drawable.ic_launcher));
		
        //use setSticky(true) to disable QuickAction dialog being dismissed after an item is clicked
        matchbericht.setSticky(true);
        
		final QuickAction mQuickAction 	= new QuickAction(this);
		
		mQuickAction.addActionItem(kader);
		mQuickAction.addActionItem(statistik);
		mQuickAction.addActionItem(matchbericht);
		mQuickAction.addActionItem(sonstigeBerichte);
		mQuickAction.addActionItem(spielplan);
		mQuickAction.addActionItem(tabelle);
		mQuickAction.addActionItem(news);
		
		//setup the action item click listener
		mQuickAction.setOnActionItemClickListener(new QuickAction.OnActionItemClickListener() {
			@Override
			public void onItemClick(QuickAction quickAction, int pos, int actionId) {
				ActionItem actionItem = quickAction.getActionItem(pos);
				
				if (actionId == ID_Kader) {
					Toast.makeText(getApplicationContext(), "Kader", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.KADER"));
				}if (actionId == ID_Match) {
					Toast.makeText(getApplicationContext(), "Matchberichte", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.MATCHBERICHTE"));
				}if (actionId == ID_News) {
					Toast.makeText(getApplicationContext(), "News", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.NEWS"));
				}if (actionId == ID_Plan) {
					Toast.makeText(getApplicationContext(), "Spielplan", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.MSPIELPLAN"));
				}if (actionId == ID_Sonstige) {
					Toast.makeText(getApplicationContext(), "Sonstige Berichte", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.BERICHTE"));
				}if (actionId == ID_Stat) {
					Toast.makeText(getApplicationContext(), "Statistik", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.STATISTIK"));
				}if (actionId == ID_Table) {
					Toast.makeText(getApplicationContext(), "Tabelle", Toast.LENGTH_SHORT).show();
					startActivity(new Intent("madprod.fcbub.ch.TABELLE"));
				} else {
					Toast.makeText(getApplicationContext(), actionItem.getTitle() + " selected", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		mQuickAction.setOnDismissListener(new QuickAction.OnDismissListener() {
			@Override
			public void onDismiss() {
				Toast.makeText(getApplicationContext(), "Ups..dismissed", Toast.LENGTH_SHORT).show();
			}
		});
		
		
		Button btn1 = (Button) this.findViewById(R.id.b1);
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
			}
		});

		Button btn2 = (Button) this.findViewById(R.id.b2);
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btn3 = (Button) this.findViewById(R.id.b3);
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnNachwuchs = (Button) this.findViewById(R.id.bNachwuchs);
		btnNachwuchs.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnFrauen = (Button) this.findViewById(R.id.bFrauen);
		btnFrauen.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnSenioren = (Button) this.findViewById(R.id.bSenioren);
		btnSenioren.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnVeteranen = (Button) this.findViewById(R.id.bVeteranen);
		btnVeteranen.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnBa = (Button) this.findViewById(R.id.bBa);
		btnBa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnBb = (Button) this.findViewById(R.id.bBb);
		btnBb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnCa = (Button) this.findViewById(R.id.bCa);
		btnCa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnDa = (Button) this.findViewById(R.id.bDa);
		btnDa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnDb = (Button) this.findViewById(R.id.bDb);
		btnDb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnDc = (Button) this.findViewById(R.id.bDc);
		btnDc.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnEa = (Button) this.findViewById(R.id.bEa);
		btnEa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnEb = (Button) this.findViewById(R.id.bEb);
		btnEb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnEc = (Button) this.findViewById(R.id.bEc);
		btnEc.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnFa = (Button) this.findViewById(R.id.bFa);
		btnFa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnFb = (Button) this.findViewById(R.id.bFb);
		btnFb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});
		Button btnPiccolos = (Button) this.findViewById(R.id.bPiccolos);
		btnPiccolos.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mQuickAction.show(v);
				mQuickAction.setAnimStyle(QuickAction.ANIM_GROW_FROM_CENTER);
			}
		});	
	}

}