package com.geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {
    static ArrayList<String> JokesList = new ArrayList<>();
    @PostMapping(value="/Jokes")
    public static String saveJokes(@RequestBody String jokes){
        JokesList.add(jokes);
        return "Joke saved";
    }

    @GetMapping(value="/Jokes")
    public String getJokes(){

//        ArrayList<String> JokesList = new ArrayList<>();

        JokesList.add("एक बच्चे ने दूसरे बच्चे से कहा :- क्या आप चाइनीज भाषा पढ सकते है \n" +
                "\n" +
                "दूसरे बच्चे ने जबाब दिया :- हां, मैं पढ़ सकता हूँ अगर वह हिंदी में लिखा हो तो…");
        JokesList.add("एक तोता रोड पर उड़ रहा था वह एक ऑटो से टकरा गया, " +
                "तो उस ऑटो वाले ने उसे उठआ कर अपने घर ले जा कर पिन्जरा मे डल दिया । " +
                "जब तोते को दूसरे दिन होश आया, तो वह बोला, आईला मैं तो जेल, मैं आ गया लगता है मुझसे ऑटो वाला मर गया…");
        JokesList.add("एक छोटा बच्चा अपना रिजल्ट आया और पिता को दिखाते हुये बोला, पापा आप बहुत नसीब वाले हो\n" +
                "पिता :- को गुस्सा आया और बोले कैसे बेटा \n" +
                "\n" +
                "बच्चा :- पापा मैं फेल हो गया हूं, अब आपको मेरे लिए नयी किताबें नहीं लानी पड़ेगी…");
        JokesList.add("बच्चा अपनी मम्मी से :- माँ क्या मैं भगवान की तरह दिखता हूं \n" +
                "मम्मी :- नहीं, बिल्कुल नही पर तुम ऐसा क्यों पूछ रहे हो मेरे बेटे\n" +
                "\n" +
                "बच्चा :- क्योंकि मैं किसी दोस्त के घर जाऊ तो सब यही कहते हैं कि हे भगवान फिर आ गया…");
        JokesList.add("बच्चे ने डॉक्टर से बोला :-  कि डॉक्टर साहब, कल आप हमारे यहां दावत खाने नहीं आए |\n" +
                "\n" +
                "डॉक्टर :-  बेटा मै नही आया तो अच्छा ही रहा\n" +
                "\n" +
                "बच्चे ने पूछा :- क्यों, डॉक्टर साहब\n" +
                "\n" +
                "डॉक्टर :- जो दावत खाकर लौट रहे थे उन मरीजों को कौन देखता…");
        JokesList.add("बच्चा :- पापा-2, मुझे पेंसिल नहीं पेन दिलाओ ना\n" +
                "पिता :- लेकिन तुम्हारी मैडम तो पेंसिल से लिखने को बोलती है \n" +
                "\n" +
                "बच्चा :- हां, पर जब वो हमे पीटती है तो पिटते वक्त हमारे पेंसिल की नोंक हमेशा टूट जाती है…");

        int randomNumber = 0 + (int)(Math.random() * (JokesList.size()-1 - 0)+1);
        return JokesList.get(randomNumber);

    }
}