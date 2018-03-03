package com.chumak.util;

import com.chumak.model.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BooksUtil {
    List<Book> booksList = Arrays.asList(
            new Book("Fundamentals of Wavelets", "Goswami, Jaideva", "signal_processing", 228, "Wiley"),
            new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley"),
            new Book("God Created the Integers", "Hawking, Stephen", "mathematics", 197, "Penguin"),
            new Book("Superfreakonomics", "Dubner, Stephen", "economics", 179, "HarperCollins"),
            new Book("Orientalism", "Said, Edward", "history", 197, "Penguin"),
            new Book("Nature of Statistical Learning Theory, The", "Vapnik, Vladimir", "data_science", 230, "Springer"),
            new Book("Integration of the Indian States", "Menon, V P", "history", 217, "Orient Blackswan"),
            new Book("Drunkard's Walk, The", "Mlodinow, Leonard", "science", 197, "Penguin"),
            new Book("Image Processing & Mathematical Morphology", "Shih, Frank", "signal_processing", 241, "CRC"),
            new Book("How to Think Like Sherlock Holmes", "Konnikova, Maria", "psychology", 240, "Penguin"),
            new Book("Data Scientists at Work", "Sebastian Gutierrez", "data_science", 230, "Apress"),
            new Book("Slaughterhouse Five", "Vonnegut, Kurt", "fiction", 198, "Random House"),
            new Book("Birth of a Theorem", "Villani, Cedric", "mathematics", 234, "Bodley Head"),
            new Book("Structure & Interpretation of Computer Programs", "Sussman, Gerald", "computer_science", 240, "MIT Press"),
            new Book("Age of Wrath, The", "Eraly, Abraham", "history", 238, "Penguin"),
            new Book("Trial, The", "Kafka, Frank", "fiction", 198, "Random House"),
            new Book("Statistical Decision Theory", "Pratt, John", "data_science", 236, "MIT Press"),
            new Book("Data Mining Handbook", "Nisbet, Robert", "data_science", 242, "Apress"),
            new Book("New Machiavelli, The", "Wells, H.G.", "fiction", 180, "Penguin"),
            new Book("Physics & Philosophy", "Heisenberg, Werner", "science", 197, "Penguin"),
            new Book("Making Software", "Oram, Andy", "computer_science", 232, "O 'Reilly"),
            new Book("Analysis, Vol I", "Tao, Terence", "mathematics", 248, "HBA"),
            new Book("Machine Learning for Hackers", "Conway, Drew", "data_science", 233, "O 'Reilly"),
            new Book("Signal and the Noise, The", "Silver, Nate", "data_science", 233, "Penguin"),
            new Book("Python for Data Analysis", "McKinney, Wes", "data_science", 233, "O 'Reilly"),
            new Book("Introduction to Algorithms", "Cormen, Thomas", "computer_science", 234, "MIT Press"),
            new Book("Beautiful and the Damned, The", "Deb, Siddhartha", "nonfiction", 198, "Penguin"),
            new Book("Outsider, The", "Camus, Albert", "fiction", 198, "Penguin"),
            new Book("Complete Sherlock Holmes, The - Vol I", "Doyle, Arthur Conan", "fiction", 176, "Random House"),
            new Book("Complete Sherlock Holmes, The - Vol II", "Doyle, Arthur Conan", "fiction", 176, "Random House"),
            new Book("Wealth of Nations, The", "Smith, Adam", "economics", 175, "Random House"),
            new Book("Pillars of the Earth, The", "Follett, Ken", "fiction", 176, "Random House"),
            new Book("Mein Kampf", "Hitler, Adolf", "nonfiction", 212, "Rupa"),
            new Book("Tao of Physics, The", "Capra, Fritjof", "science", 179, "Penguin"),
            new Book("Surely You 're Joking Mr Feynman", "Feynman, Richard", "science", 198, "Random House"),
            new Book("Farewell to Arms, A", "Hemingway, Ernest", "fiction", 179, "Rupa"),
            new Book("Veteran, The", "Forsyth, Frederick", "fiction", 177, "Transworld"),
            new Book("False Impressions", "Archer, Jeffery", "fiction", 177, "Pan"),
            new Book("Last Lecture, The", "Pausch, Randy", "nonfiction", 197, "Hyperion"),
            new Book("Return of the Primitive", "Rand, Ayn", "philosophy", 202, "Penguin"),
            new Book("Jurassic Park", "Crichton, Michael", "fiction", 174, "Random House"),
            new Book("Russian Journal, A", "Steinbeck, John", "nonfiction", 196, "Penguin"),
            new Book("Tales of Mystery and Imagination", "Poe, Edgar Allen", "fiction", 172, "HarperCollins"),
            new Book("Freakonomics", "Dubner, Stephen", "economics", 197, "Penguin"),
            new Book("Hidden Connections, The", "Capra, Fritjof", "science", 197, "HarperCollins"),
            new Book("Story of Philosophy, The", "Durant, Will", "philosophy", 170, "Pocket"),
            new Book("Asami Asami", "Deshpande, P L", "fiction", 205, "Mauj"),
            new Book("Journal of a Novel", "Steinbeck, John", "fiction", 196, "Penguin"),
            new Book("Once There Was a War", "Steinbeck, John", "nonfiction", 196, "Penguin"),
            new Book("Moon is Down, The", "Steinbeck, John", "fiction", 196, "Penguin"),
            new Book("Brethren, The", "Grisham, John", "fiction", 174, "Random House"),
            new Book("In a Free State", "Naipaul, V.S.", "fiction", 196, "Rupa"),
            new Book("Catch 22", "Heller, Joseph", "fiction", 178, "Random House"),
            new Book("Complete Mastermind, The", "BBC", "nonfiction", 178, "BBC"),
            new Book("Dylan on Dylan", "Dylan, Bob", "nonfiction", 197, "Random House"),
            new Book("Soft Computing & Intelligent Systems", "Gupta, Madan", "data_science", 242, "Elsevier"),
            new Book("Textbook of Economic Theory", "Stonier, Alfred", "economics", 242, "Pearson"),
            new Book("Econometric Analysis", "Greene, W.H.", "economics", 242, "Pearson"),
            new Book("Learning OpenCV", "Bradsky, Gary", "data_science", 232, "O 'Reilly"),
            new Book("Data Structures Using C & C++", "Tanenbaum, Andrew", "computer_science", 235, "Prentice Hall"),
            new Book("Computer Vision, A Modern Approach", "Forsyth, David", "data_science", 255, "Pearson"),
            new Book("Principles of Communication Systems", "Taub, Schilling", "computer_science", 240, "TMH"),
            new Book("Let Us C", "Kanetkar, Yashwant", "computer_science", 213, "Prentice Hall"),
            new Book("Amulet of Samarkand, The", "Stroud, Jonathan", "fiction", 179, "Random House"),
            new Book("Crime and Punishment", "Dostoevsky, Fyodor", "fiction", 180, "Penguin"),
            new Book("Angels & Demons", "Brown, Dan", "fiction", 178, "Random House"),
            new Book("Argumentative Indian, The", "Sen, Amartya", "nonfiction", 209, "Picador"),
            new Book("Sea of Poppies", "Ghosh, Amitav", "fiction", 197, "Penguin"),
            new Book("Idea of Justice, The", "Sen, Amartya", "nonfiction", 212, "Penguin"),
            new Book("Raisin in the Sun, A", "Hansberry, Lorraine", "fiction", 175, "Penguin"),
            new Book("All the President 's Men", "Woodward, Bob", "history", 177, "Random House"),
            new Book("Prisoner of Birth, A", "Archer, Jeffery", "fiction", 176, "Pan"),
            new Book("Scoop !", "Nayar, Kuldip", "history", 216, "HarperCollins"),
            new Book("Ahe Manohar Tari", "Deshpande, Sunita", "nonfiction", 213, "Mauj"),
            new Book("Last Mughal, The", "Dalrymple, William", "history", 199, "Penguin"),
            new Book("Social Choice & Welfare, Vol 39No. 1", "Various", "economics", 235, "Springer"),
            new Book("Radiowaril Bhashane & Shrutika", "Deshpande, P L", "nonfiction", 213, "Mauj"),
            new Book("Gun Gayin Awadi", "Deshpande, P L", "nonfiction", 212, "Mauj"),
            new Book("Aghal Paghal", "Deshpande, P L", "nonfiction", 212, "Mauj"),
            new Book("Maqta - e - Ghalib", "Garg, Sanjay", "fiction", 221, "Mauj"),
            new Book("Beyond Degrees", "", "nonfiction", 222, "HarperCollins"),
            new Book("Manasa", "Kale, V P", "nonfiction", 213, "Mauj"),
            new Book("India from Midnight to Milennium", "Tharoor, Shashi", "history", 198, "Penguin"),
            new Book("World 's Greatest Trials, The", "", "history", 210, ""),
            new Book("Great Indian Novel, The", "Tharoor, Shashi", "fiction", 198, "Penguin"),
            new Book("O Jerusalem !", "Lapierre, Dominique", "history", 217, "vikas"),
            new Book("City of Joy, The", "Lapierre, Dominique", "fiction", 177, "vikas"),
            new Book("Freedom at Midnight", "Lapierre, Dominique", "history", 167, "vikas"),
            new Book("Winter of Our Discontent, The", "Steinbeck, John", "fiction", 196, "Penguin"),
            new Book("On Education", "Russell, Bertrand", "philosophy", 203, "Routledge"),
            new Book("Free Will", "Harris, Sam", "philosophy", 203, "FreePress"),
            new Book("Bookless in Baghdad", "Tharoor, Shashi", "nonfiction", 206, "Penguin"),
            new Book("Case of the Lame Canary, The", "Gardner, Earle Stanley", "fiction", 179, ""),
            new Book("Theory of Everything, The", "Hawking, Stephen", "science", 217, "Jaico"),
            new Book("New Markets & Other Essays", "Drucker, Peter", "economics", 176, "Penguin"),
            new Book("Electric Universe", "Bodanis, David", "science", 201, "Penguin"),
            new Book("Hunchback of Notre Dame, The", "Hugo, Victor", "fiction", 175, "Random House"),
            new Book("Burning Bright", "Steinbeck, John", "fiction", 175, "Penguin"),
            new Book("Age of Discontuinity, The", "Drucker, Peter", "economics", 178, "Random House"),
            new Book("Doctor in the Nude", "Gordon, Richard", "fiction", 179, "Penguin"),
            new Book("Down and Out in Paris & London", "Orwell, George", "nonfiction", 179, "Penguin"),
            new Book("Identity & Violence", "Sen, Amartya", "philosophy", 219, "Penguin"),
            new Book("Beyond the Three Seas", "Dalrymple, William", "history", 197, "Random House"),
            new Book("World 's Greatest Short Stories, The", "", "fiction", 217, "Jaico"),
            new Book("Talking Straight", "Iacoca, Lee", "nonfiction", 175, ""),
            new Book("Maugham's Collected Short Stories, Vol 3", "Maugham, William S", "fiction", 171, "Vintage"),
            new Book("Phantom of Manhattan, The", "Forsyth, Frederick", "fiction", 180, ""),
            new Book("Ashenden of The British Agent", "Maugham, William S", "fiction", 160, "Vintage"),
            new Book("Zen & The Art of Motorcycle Maintenance", "Pirsig, Robert", "philosophy", 172, "Vintage"),
            new Book("Great War for Civilization, The", "Fisk, Robert", "history", 197, "HarperCollins"),
            new Book("We the Living", "Rand, Ayn", "fiction", 178, "Penguin"),
            new Book("Artist and the Mathematician, The", "Aczel, Amir", "science", 186, "HighStakes"),
            new Book("History of Western Philosophy", "Russell, Bertrand", "philosophy", 213, "Routledge"),
            new Book("Selected Short Stories", "", "fiction", 215, "Jaico"),
            new Book("Rationality & Freedom", "Sen, Amartya", "economics", 213, "Springer"),
            new Book("Clash of Civilizations and Remaking of the World Order", "Huntington, Samuel", "history", 228, "Simon & Schuster"),
            new Book("Uncommon Wisdom", "Capra, Fritjof", "nonfiction", 197, "Fontana"),
            new Book("One", "Bach, Richard", "nonfiction", 172, "Dell"),
            new Book("Karl Marx Biography", "", "nonfiction", 162, ""),
            new Book("To Sir With Love", "Braithwaite", "fiction", 197, "Penguin"),
            new Book("Half A Life", "Naipaul, V S", "fiction", 196, ""),
            new Book("Discovery of India, The", "Nehru, Jawaharlal", "history", 230, ""),
            new Book("Apulki", "Deshpande, P L", "nonfiction", 211, ""),
            new Book("Unpopular Essays", "Russell, Bertrand", "philosophy", 198, ""),
            new Book("Deceiver, The", "Forsyth, Frederick", "fiction", 178, ""),
            new Book("Veil:Secret Wars of the CIA", "Woodward, Bob", "history", 171, ""),
            new Book("Char Shabda", "Deshpande, P L", "nonfiction", 214, ""),
            new Book("Rosy is My Relative", "Durrell, Gerald", "fiction", 176, ""),
            new Book("Moon and Sixpence, The", "Maugham, William S", "fiction", 180, ""),
            new Book("Political Philosophers", "", "philosophy", 162, ""),
            new Book("Short History of the World, A", "Wells, H G", "history", 197, ""),
            new Book("Trembling of a Leaf, The", "Maugham, William S", "fiction", 205, ""),
            new Book("Doctor on the Brain", "Gordon, Richard", "fiction", 204, ""),
            new Book("Simpsons & Their Mathematical Secrets", "Singh, Simon", "science", 233, ""),
            new Book("Pattern Classification", "Duda, Hart", "data_science", 241, ""),
            new Book("From Beirut to Jerusalem", "Friedman, Thomas", "history", 202, ""),
            new Book("Code Book, The", "Singh, Simon", "science", 197, ""),
            new Book("Age of the Warrior, The", "Fisk, Robert", "history", 197, ""),
            new Book("Final Crisis", "", "comic", 257, ""),
            new Book("Killing Joke, The", "", "comic", 283, ""),
            new Book("Flashpoint", "", "comic", 265, ""),
            new Book("Batman Earth One", "", "comic", 265, ""),
            new Book("Crisis on Infinite Earths", "", "comic", 258, ""),
            new Book("Numbers Behind Numbers, The", "Devlin, Keith", "science", 202, ""),
            new Book("Superman Earth One - 1", "", "comic", 259, ""),
            new Book("Superman Earth One - 2", "", "comic", 258, ""),
            new Book("Justice League: Throne of Atlantis", "", "comic", 258, ""),
            new Book("Justice League: The Villain's Journey", "", "comic", 258, ""),
            new Book("Death of Superman, The", "", "comic", 258, ""),
            new Book("History of the DC Universe", "", "comic", 258, ""),
            new Book("Batman: The Long Halloween", "", "comic", 258, ""),
            new Book("Life in Letters, A", "Steinbeck, John", "nonfiction", 196, ""),
            new Book("Information, The", "Gleick, James", "science", 233, ""),
            new Book("Journal of Economics, vol 106 No 3", "", "economics", 235, ""),
            new Book("Elements of Information Theory", "Thomas, Joy", "data_science", 229, ""),
            new Book("Power Electronics - Rashid", "Rashid, Muhammad", "computer_science", 235, ""),
            new Book("Power Electronics - Mohan", "Mohan, Ned", "computer_science", 237, ""),
            new Book("Neural Networks", "Haykin, Simon", "data_science", 240, ""),
            new Book("Grapes of Wrath, The", "Steinbeck, John", "fiction", 196, ""),
            new Book("Vyakti ani Valli", "Deshpande, P L", "nonfiction", 211, ""),
            new Book("Statistical Learning Theory", "Vapnik, Vladimir", "data_science", 228, ""),
            new Book("Empire of the Mughal - The Tainted Throne", "Rutherford, Alex", "history", 180, ""),
            new Book("Empire of the Mughal - Brothers at War", "Rutherford, Alex", "history", 180, ""),
            new Book("Empire of the Mughal - Ruler of the World", "Rutherford, Alex", "history", 180, ""),
            new Book("Empire of the Mughal - The Serpent's Tooth", "Rutherford, Alex", "history", 180, ""),
            new Book("Empire of the Mughal - Raiders from the North", "Rutherford, Alex", "history", 180, ""),
            new Book("Mossad", "Baz - Zohar, Michael", "history", 236, ""),
            new Book("Jim Corbett Omnibus", "Corbett, Jim", "nonfiction", 223, ""),
            new Book("20000 Leagues Under the Sea", "Verne, Jules", "fiction", 190, ""),
            new Book("Batatyachi Chal", "Deshpande P L", "fiction", 200, ""),
            new Book("Hafasavnuk", "Deshpande P L", "fiction", 211, ""),
            new Book("Urlasurla", "Deshpande P L", "fiction", 211, ""),
            new Book("Pointers in C", "Kanetkar, Yashwant", "computer_science", 213, ""),
            new Book("Cathedral and the Bazaar, The", "Raymond, Eric", "computer_science", 217, ""),
            new Book("Design with OpAmps", "Franco, Sergio", "computer_science", 240, ""),
            new Book("Think Complexity", "Downey, Allen", "data_science", 230, ""),
            new Book("Devil's Advocate, The", "West, Morris", "fiction", 178, ""),
            new Book("Ayn Rand Answers", "Rand, Ayn", "philosophy", 203, ""),
            new Book("Philosophy: Who Needs It", "Rand, Ayn", "philosophy", 171, ""),
            new Book("World's Great Thinkers, The", "", "philosophy", 189, ""),
            new Book("Data Analysis with Open Source Tools", "Janert, Phillip", "data_science", 230, ""),
            new Book("Broca's Brain", "Sagan, Carl", "science", 174, ""),
            new Book("Men of Mathematics", "Bell, E T", "mathematics", 217, ""),
            new Book("Oxford book of Modern Science Writing", "Dawkins, Richard", "science", 240, ""),
            new Book("Justice, Judiciary and Democracy", "Ranjan, Sudhanshu", "philosophy", 224, ""),
            new Book("Arthashastra, The", "Kautiyla", "philosophy", 214, ""),
            new Book("We the People", "Palkhivala", "philosophy", 216, ""),
            new Book("We the Nation", "Palkhivala", "philosophy", 216, ""),
            new Book("Courtroom Genius, The", "Sorabjee", "nonfiction", 217, ""),
            new Book("Dongri to Dubai", "Zaidi, Hussain", "nonfiction", 216, ""),
            new Book("History of England, Foundation", "Ackroyd, Peter", "history", 197, ""),
            new Book("City of Djinns", "Dalrymple, William", "history", 198, ""),
            new Book("India's Legal System", "Nariman", "nonfiction", 177, ""),
            new Book("More Tears to Cry", "Sassoon, Jean", "fiction", 235, ""),
            new Book("Ropemaker, The", "Dickinson, Peter", "fiction", 196, ""),
            new Book("Angels & Demons", "Brown, Dan", "fiction", 170, ""),
            new Book("Judge, The", "", "fiction", 170, ""),
            new Book("Attorney, The", "", "fiction", 170, ""),
            new Book("Prince, The", "Machiavelli", "philosophy", 173, ""),
            new Book("Eyeless in Gaza", "Huxley, Aldous", "fiction", 180, ""),
            new Book("Tales of Beedle the Bard", "Rowling, J K", "fiction", 184, ""),
            new Book("Girl with the Dragon Tattoo", "Larsson, Steig", "fiction", 179, ""),
            new Book("Girl who kicked the Hornet's Nest", "Larsson, Steig", "fiction", 179, ""),
            new Book("Girl who played with Fire", "Larsson, Steig", "fiction", 179, ""),
            new Book("Batman Handbook", "", "comic", 270, ""),
            new Book("Murphy's Law", "", "nonfiction", 178, ""),
            new Book("Structure and Randomness", "Tao, Terence", "mathematics", 252, ""),
            new Book("Image Processing with MATLAB", "Eddins, Steve", "signal_processing", 241, ""),
            new Book("Animal Farm", "Orwell, George", "fiction", 180, ""),
            new Book("Idiot, The", "Dostoevsky, Fyodor", "fiction", 197, ""),
            new Book("Christmas Carol, A", "Dickens, Charles", "fiction", 196, "")
    );

    //    Returns total number of books
    public long getTotal() {
        return booksList.stream().count();
    }

    //Returns true if any book with specified author exists
    public boolean getExistByAuthor(String author) {
        return booksList.stream().anyMatch(book -> book.getAuthor().equals(author));
    }

    //Returns number of books with specified author
    public long getBooksCountByAuthor(String author) {
        return booksList.stream().filter(book -> book.getAuthor().equals(author)).count();
    }

    //Returns number of books with specified genre
    public long getBooksCountByGenre(String genre) {
        return booksList.stream().filter(book -> book.getGenre().equals(genre)).count();
    }

    //filtering distinct by object property utility function
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    //Returns number of authors published by specified publisher
    public long getAuthorsCountByPublisher(String publisher) {
        return booksList.stream().filter(book -> book.getPublisher().equals(publisher)).filter(distinctByKey(Book::getAuthor)).count();

    }

    //Returns list of books with specified genre and height
    public List<Book> getBooksByGenreAndHeight(String genre, int height) {
        return booksList.stream().filter(book -> book.getGenre().equals(genre) & book.getHeight() == height).collect(Collectors.toList());
    }

    //Returns the number of genres in which the author wrote
    public long getGenreCountByAuthor(String author) {
        return booksList.stream().filter(book -> book.getAuthor().equals(author)).filter(distinctByKey(Book::getGenre)).count();

    }
}
