package com.udacity.musicstructure;

import com.udacity.musicstructure.model.Music;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MusicstructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicstructureApplication.class, args);
	}

	@RequestMapping("/musics")
	@ResponseBody
	List<Music> getMusics(){
		List<Music> musicsList = new ArrayList<>();
		musicsList.add(new Music("Mutter","Mutter","Rammstein"));
		musicsList.add(new Music("Sonne","Mutter","Rammstein"));
		musicsList.add(new Music("Rammlied","Liebe ist für Alle da","Rammstein"));
		musicsList.add(new Music("Fix You","X & Y","Cold Play"));
		musicsList.add(new Music("Talk","X & Y","Cold Play"));
		musicsList.add(new Music("Paradise","Mylo Xyloto","Cold Play"));
		musicsList.add(new Music("One","Achtung Baby","U2"));
		musicsList.add(new Music("The Fly","Achtung Baby","U2"));
		musicsList.add(new Music("Kite","All That You Can't Leave Behind","U2"));
		return musicsList;
	}
}
