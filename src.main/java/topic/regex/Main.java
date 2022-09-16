package topic.regex;

import java.util.regex.Pattern;

public class Main {
    public static Pattern koreanPattern = Pattern.compile("^[가-힣]+$");

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(".xx.");
//        Matcher matcher = pattern.matcher("AxxB");
//
//        System.out.println(matcher.matches());

        checkName3upTo256("s");
        checkName3upTo256("564*/");
        checkName3upTo256("фігма");
        checkName3upTo256("фыгма");
        checkName3upTo256("sonya");

        System.out.println();

        checkNumber("1234567");
        checkNumber(".35sd98452");
        checkNumber("+380685510900");
        checkNumber("+38 068 551 09 00");
        checkNumber("068 551 09 00");
        checkNumber("+38(068)551-09-00");
        checkNumber("1380685510900");

        System.out.println();

        checkEmail("asdgkjn12");
        checkEmail("a@a");
        checkEmail("a@a.com");
        checkEmail("a@.c");
        checkEmail("shevaoksa596@gmail.com");
        checkEmail("123456789123456789123456789123456789123456789123456789123456789123456789@gmail.com");
        checkEmail("123456@fmjppnrzjdamukdcbefrhgcxwbotfwxrppznwqfuuhiblezbxfvshkihlwacmvyainhxanpzgczctctkzsjegppgtmehcijtkcptskkpewmxzgiztbpiwomhcytueduohkcrsjuqgtnldyydoujxwamjcjgqrkhexegkbgvhdxfdsasrnuyreemhiavclbzrxuhxshdqotfyzhbhuzdkimlwvvskdezlbqbvidzmnnbxywwrmogqfbufzsipfznzdnmt.com");
        System.out.println();

        checkPassword("123ds");
        checkPassword("12345678");
        checkPassword("123456.8");
        checkPassword("123s4.K678");

    }

    private static void checkNumber(String s) {
        String number = s.replaceAll(" ", "");

        Pattern pattern = Pattern.compile(
                "^(\\+\\d{1,2}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{2}[\\s.-]?\\d{2}$"
        );
        System.out.printf("%20s is %3s a number\n", s, getIs(number, pattern));

    }

    private static void checkIP(String s) {
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        System.out.printf("%20s is %3s a name\n", s, getIs(s, pattern));

    }


    private static void checkName3upTo256(String s) {
        Pattern pattern = Pattern.compile("^[А-ЩЬЮЯҐЄІЇа-щьюяґєіїA-Za-z]{3,256}$");
        System.out.printf("%20s is %3s a name\n", s, getIs(s, pattern));

    }

    //https://help.returnpath.com/hc/en-us/articles/220560587-What-are-the-rules-for-email-address-syntax-
    private static void checkEmail(String s) {
        Pattern pattern = Pattern.compile("^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$");

        System.out.printf("%64s is %3s an email\n", s, getIs(s, pattern));


    }

    private static void checkPassword(String s) {
        Pattern pattern = Pattern.compile(
                "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_<>?,./+=-])[A-Za-z\\d!@#$%^&*()_+=,./<>?-]{8,}$"
        );

        System.out.printf("%50s is %3s a password\n", s, getIs(s, pattern));
    }

    private static String getIs(String s, Pattern pattern) {
        String is = "";
        if (!pattern.matcher(s).matches()) {
            is = "not";
        }
        return is;
    }
}
