package com.mambodata.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IText;

import java.util.ArrayList;

@Controller
public class GreetingController {
    ArrayList<Album> albumList = new ArrayList<>();	

    @GetMapping("/hello")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
//Capitalize Stuff
// create mapping/route
    // path variable text
    // perform capitalization before sending to model
    // return template
    // model in template

//capitalization
//capitalize/Text

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable(name="text") String text, Model model) {
        model.addAttribute("text", text.toUpperCase());
        return "capitalize";
    }
//Splash Stuff
// get mapping map route "/"
// html template with CSS

    @GetMapping("/")
    public String splash(){
        return "splash";
    }
/*
    Artist: Kendrick Lamar
    Title: Damn.
            songCount: 14
    Length: 54:54 in minutes


    https://images-na.ssl-images-amazon.com/images/I/A1AMeOSldQL._SL1500_.jpg

    Artist: Sir
    Title: Chasing Summer
    songCount: 14
    Length: 45 in minutes


    https://m.media-amazon.com/images/I/814+RZcGxZL._SS500_.jpg

Artist: Dawit Getachew
 Title: Etebikihalew


 */
// Album Stuff
// Album Object: Title, Artist, SongCount, Length, ImageURL
    @GetMapping("/albums")
    public String albums(Model model){

        Album album1 = new Album("Damn.","Kendrick Lamar",12,3600,"https://images-na.ssl-images-amazon.com/images/I/A1AMeOSldQL._SL1500_.jpg");
        Album album2 = new Album("Chasing Summer","Sir",13,3700,"https://m.media-amazon.com/images/I/814+RZcGxZL._SS500_.jpg");
       Album album3 = new Album("title","artist",14,3800,"https://img.wynk.in/unsafe/275x275/filters:no_upscale():format(webp)/http://s3-ap-south-1.amazonaws.com/wynk-music-cms/srch_hungama/music/859718345268/1605347422/srch_hungama_56875331.jpg");

        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);

        model.addAttribute("albumList",albumList);
    return "albums";
    }
    
    @GetMapping("/index")
    public String index() {
    	 
    	return "index";
    }
// Create Object /Create Route
// ArrayList for albums
// Function albums, need imgUrl,
// add Array to Model
// call template albums
// build template called albums




}