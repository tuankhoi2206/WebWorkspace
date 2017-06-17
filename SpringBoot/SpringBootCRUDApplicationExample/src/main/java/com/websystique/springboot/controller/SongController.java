package com.websystique.springboot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.model.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoang yen on 10/06/2017.
 */

@RestController
@RequestMapping("/api")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SongController {

	@RequestMapping(value = "/song", method = RequestMethod.GET)
    public ResponseEntity<List<Song>> listAllSongs() {
        List<Song> users = new ArrayList<Song>();
        users.add(new Song("1","test1","test2"));
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Song>>(users, HttpStatus.OK);
    }
	
	private List<Song> generatorSongs()
	{
		List<Song> lstSong=new ArrayList<Song>();
		
		return lstSong;
	}
	
	// -------------------Create a User-------------------------------------------
	 
//    @RequestMapping(value = "/song/", method = RequestMethod.POST)
//    public ResponseEntity<?> createSong(@RequestBody Song song) {
//        return new ResponseEntity<String>(HttpStatus.CREATED);
//    }
// 

}