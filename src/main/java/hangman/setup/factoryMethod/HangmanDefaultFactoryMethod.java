package hangman.setup.factoryMethod;

import hangman.model.English;
<<<<<<< HEAD
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
=======
import hangman.model.Language;
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        return new HangmanStickmanPanel();
    }
<<<<<<< HEAD

    @Override
    public GameScore createGameScore() {
        return new OriginalScore();
    }
=======
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
}
