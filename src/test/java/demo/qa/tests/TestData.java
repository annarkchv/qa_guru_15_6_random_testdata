package demo.qa.tests;

import com.github.javafaker.Faker;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Random;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class TestData {

    static Random random = new Random();

    //    Methods
    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        int randomIndex = random.nextInt(genders.length);

        return genders[randomIndex];

    }

    public static String getRandomNumber(int length) {
        String SALTCHARS = "1234567890";
        StringBuilder result = new StringBuilder();
        while (result.length() < length) {
            int index = (int) (random.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }

        return result.toString();
    }

    public static String getRandomDayOfMonth() {
        int dayOfMonth = nextInt(1, 29);

        if (dayOfMonth < 10) return "0" + dayOfMonth;
        return Integer.toString(dayOfMonth);

    }

    public static String getRandomMonth() {
        OptionalInt randomNumberMonth = random.ints(1, 13).findFirst();

        return Month.of(randomNumberMonth.getAsInt()).getDisplayName(TextStyle.FULL, Locale.US);

    }

    public static String getRandomYear() {
        return Integer.toString(nextInt(1950, 2004));

    }

    public static String getRandomSubject() {
        String[] subjects = {"English", "Computer Science", "Biology", "Physics", "Social Studies"};
        int randomIndex = random.nextInt(subjects.length);

        return subjects[randomIndex];

    }

    public static String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int randomIndex = random.nextInt(hobbies.length);

        return hobbies[randomIndex];

    }

    public static String getRandomStateAndCity() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        int randomState = random.nextInt(states.length);

        String state = states[randomState];
        String city;

        switch (state) {
            case "NCR": {
                String[] cities = {"Delhi", "Gurgaon", "Noida"};
                int randomCity = random.nextInt(cities.length);
                city = cities[randomCity];

                return state + " " + city;

            }
            case "Uttar Pradesh": {
                String[] cities = {"Agra", "Lucknow", "Merrut"};
                int randomCity = random.nextInt(cities.length);
                city = cities[randomCity];

                return state + " " + city;

            }
            case "Haryana": {
                String[] cities = {"Karnal", "Panipat"};
                int randomCity = random.nextInt(cities.length);
                city = cities[randomCity];

                return state + " " + city;

            }
            case "Rajasthan": {
                String[] cities = {"Jaipur", "Jaiselmer"};
                int randomCity = random.nextInt(cities.length);
                city = cities[randomCity];

                return state + " " + city;

            }
            default:
                return "Unknown state and city";

        }

    }

    static Faker faker = new Faker();

    static String userFile = "cat.jpg";

    //    First user data
    static String firstUserFirstName = faker.name().firstName(),
            firstUserLastName = faker.name().lastName(),
            firstUserGender = getRandomGender(),
            firstUserMail = faker.internet().emailAddress(),
            firstUserNumber = getRandomNumber(10),
            firstUserDayOfMonth = getRandomDayOfMonth(),
            firstUserMonth = getRandomMonth(),
            firstUserYear = getRandomYear(),
            firstUserSubject = getRandomSubject(),
            firstUserHobby = getRandomHobby(),
            firstUserAddress = faker.address().fullAddress();
    static String firstUserStateAndCity = getRandomStateAndCity(),
            firstUserState = firstUserStateAndCity.split(" ")[0],
            firstUserCity = firstUserStateAndCity.split(" ")[1];


    //    Second user data
    static String secondUserFirstName = faker.name().firstName(),
            secondUserLastName = faker.name().lastName(),
            secondUserGender = getRandomGender(),
            secondUserNumber = getRandomNumber(10);

}
