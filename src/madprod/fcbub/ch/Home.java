package madprod.fcbub.ch;
import madprod.fcbub.ch.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends Activity {
    /** Called when the activity is first created. */
    MediaPlayer mpButtonClick;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		mpButtonClick = MediaPlayer.create(this, R.raw.button_click);
		
		ImageButton ibSpielplan = (ImageButton) findViewById(R.id.ibSpielplan);
		ibSpielplan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.SPIELPLAN"));
				mpButtonClick.start();
			}
		});
		ImageButton ibContact = (ImageButton) findViewById(R.id.ibContact);
		ibContact.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.ADRESSEN"));
				mpButtonClick.start();
			}
		});
		ImageButton ibTermine = (ImageButton) findViewById(R.id.ibTermine);
		ibTermine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.TERMINE"));
				mpButtonClick.start();
			}
		});
		ImageButton ibLiveticker = (ImageButton) findViewById(R.id.ibLiveticker);
		ibLiveticker.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.LIVETICKER"));
				mpButtonClick.start();
			}
		});
		ImageButton ibGrumpeli = (ImageButton) findViewById(R.id.ibGrumpeli);
		ibGrumpeli.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.GRUMPELI"));
				mpButtonClick.start();
			}
		});
		ImageButton ibClubhaus = (ImageButton) findViewById(R.id.ibClubhaus);
		ibClubhaus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.CLUBHAUS"));
				mpButtonClick.start();
			}
		});
		ImageButton ibVerschiedenes = (ImageButton) findViewById(R.id.ibStuff);
		ibVerschiedenes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.VERSCHIEDENES"));
				mpButtonClick.start();
			}
		});
		
		ImageButton ibTeam = (ImageButton) findViewById(R.id.ibTeams);
		ibTeam.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("madprod.fcbub.ch.TEAM"));
				mpButtonClick.start();
			}
		});
		
	}
}