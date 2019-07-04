class TwelveDays {
    private String baseLyrics1 = "On the ";
    private String baseLyrics2 = " day of Christmas my true love gave to me:";
    private String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
            "tenth", "eleventh", "twelfth" };

    private String[] songLyrics = { " a Partridge in a Pear Tree.", " two Turtle Doves", " three French Hens",
            " four Calling Birds", " five Gold Rings", " six Geese-a-Laying", " seven Swans-a-Swimming",
            " eight Maids-a-Milking", " nine Ladies Dancing", " ten Lords-a-Leaping", " eleven Pipers Piping",
            " twelve Drummers Drumming" };

    String verse(int verseNumber) {
        StringBuilder verseLyrics = new StringBuilder();
        verseLyrics.append(baseLyrics1 + days[verseNumber - 1] + baseLyrics2);
        for (int i = verseNumber - 1; i >= 0; i--) {
            if (verseNumber != 1 && i == 0) {
                verseLyrics.append(" and");
            }
            verseLyrics.append(songLyrics[i]);
            if (i != 0) {
                verseLyrics.append(",");
            }
        }
        verseLyrics.append("\n");
        return verseLyrics.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder resultSong = new StringBuilder();
        for (int i = startVerse - 1; i < endVerse; i++) {
            resultSong.append(verse(i + 1));
            if (i != endVerse - 1) {
                resultSong.append("\n");
            }
        }
        return resultSong.toString();
    }

    String sing() {
        return verses(1, songLyrics.length);
    }
}
