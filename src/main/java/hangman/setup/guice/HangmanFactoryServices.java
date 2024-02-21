/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

<<<<<<< HEAD
import hangman.model.BonusScore;
import hangman.model.English;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.Spanish;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

=======
/**
 * @author 2106913
 */

>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
<<<<<<< HEAD
        bind(Language.class).to(French.class);
        bind(GameScore.class).to(BonusScore.class);
        bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
    }

}
=======
    }

}
>>>>>>> 4153f44e1f984dcae826a545f5f385057e944e81
