/***************************************************************
<<<<<<< HEAD
* file: GameModel.java
* author:   Christopher Santos
*           Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the model component for the game screen
*
****************************************************************/ 
package hangman.model;

import hangman.model.dictionary.HangmanDictionary;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.google.inject.Inject;
=======
 * file: GameModel.java
 * author:   Christopher Santos
 *           Omar Rodriguez
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Swing Project v1.0
 * date last modified: 10/11/2016
 *
 * purpose: This is the model component for the game screen
 *
 ****************************************************************/
package hangman.model;

import hangman.model.dictionary.HangmanDictionary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81


public class GameModel {
    private int incorrectCount;
    private int correctCount;
    private LocalDateTime dateTime;
    private int gameScore;
    private int[] lettersUsed;
<<<<<<< HEAD
    
    private HangmanDictionary dictionary;
    
    private Scanner scan;
    private String randomWord;
    private char[] randomWordCharArray;
    
    @Inject
    private GameScore gameS;

   
    public GameModel(HangmanDictionary dictionary, GameScore gameS){
        //this.dictionary = new EnglishDictionaryDataSource();
        this.dictionary=dictionary;
        this.gameS = gameS;
=======


    private HangmanDictionary dictionary;

    private Scanner scan;
    private String randomWord;
    private char[] randomWordCharArray;


    public GameModel(HangmanDictionary dictionary) {
        //this.dictionary = new EnglishDictionaryDataSource();
        this.dictionary = dictionary;
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
        randomWord = selectRandomWord();
        randomWordCharArray = randomWord.toCharArray();
        incorrectCount = 0;
        correctCount = 0;
<<<<<<< HEAD
        gameScore = gameS.initialScore();
        
    }
    
    //method: reset
    //purpose: reset this game model for a new game
    public void reset(){
=======
        gameScore = 100;

    }

    //method: reset
    //purpose: reset this game model for a new game
    public void reset() {
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
        randomWord = selectRandomWord();
        randomWordCharArray = randomWord.toCharArray();
        incorrectCount = 0;
        correctCount = 0;
<<<<<<< HEAD
        gameScore = gameS.initialScore();
=======
        gameScore = 100;
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
    }

    //setDateTime
    //purpose: sets game date/time to system date/time
    public void setDateTime() {
        this.dateTime = LocalDateTime.now();
    }
<<<<<<< HEAD
    
    //method: makeGuess
    //purpose: check if user guess is in string. Return a
    // list of positions if character is found in string
    public ArrayList<Integer> makeGuess(String guess){
        char guessChar = guess.charAt(0);
        ArrayList<Integer> positions = new ArrayList<>();
        for(int i = 0; i < randomWordCharArray.length; i++){
            if(randomWordCharArray[i] == guessChar){
                positions.add(i);
            }
        }
        if(positions.size() == 0){
            incorrectCount++;
        } else {
            correctCount += positions.size();
        }
        gameScore = gameS.calculateScore(correctCount, incorrectCount);
        return positions;
        
    }
    
=======

    //method: makeGuess
    //purpose: check if user guess is in string. Return a
    // list of positions if character is found in string
    public ArrayList<Integer> makeGuess(String guess) {
        char guessChar = guess.charAt(0);
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < randomWordCharArray.length; i++) {
            if (randomWordCharArray[i] == guessChar) {
                positions.add(i);
            }
        }
        if (positions.size() == 0) {
            incorrectCount++;
            gameScore -= 10;
        } else {
            correctCount += positions.size();
        }
        return positions;

    }

>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
    //getDateTime
    //purpose: returns current displayed date/time
    public String getDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-uuuu hh:mm:ss a");
        return dtf.format(dateTime);
    }

<<<<<<< HEAD
    //setScore
    //purpose: sets score value to points
    public void setScore(int score) {
        this.gameScore = score;
    }
    
=======
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
    //getScore
    //purpose: returns current score value
    public int getScore() {
        return gameScore;
    }

<<<<<<< HEAD
=======
    //setScore
    //purpose: sets score value to points
    public void setScore(int score) {
        this.gameScore = score;
    }

>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
    //name: selectRandomWord()
    //purpose: selects random word from dictionary
    private String selectRandomWord() {
        Random rand = new Random();
        List<String> words = dictionary.getAvailableWords();
        return words.get(rand.nextInt(words.size()));
    }

    //method: getIncorrectCount
    //purpose: return number of incorrect guesses made so far
    public int getIncorrectCount() {
        return incorrectCount;
    }

    //method: getCorrectCount
    //purpose: return number of correct guesses made so far
    public int getCorrectCount() {
        return correctCount;
    }

    //method: getGameScore
    //purpose: return current score
    public int getGameScore() {
        return gameScore;
    }

    //method: setGameScore
    //purpose: set current game score
    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }
<<<<<<< HEAD
    
    //method: getWordLength
    //purpose: return length of current word
    public int getWordLength(){
=======

    //method: getWordLength
    //purpose: return length of current word
    public int getWordLength() {
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
        return randomWord.length();
    }

    public List<Character> getCharacterSet() {
        return new ArrayList<>(dictionary.getCharacterSet());
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
