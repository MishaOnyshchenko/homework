import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    Validator validator = new Validator();

    //Номер должен начинаться с “+”.
    //После “+” НЕ может быть букв или каких либо других символов кроме цифр от 0 до 9.
    @org.junit.jupiter.api.Test
    void prepareForChecking() {
        String actual = validator.prepareForChecking("+R2d2-AK-47 M16-245-854");
        String expected = "+224716245854";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validateNumber() {

        boolean expected = false;// testing mistakes

        //Номер должен начинаться с “+”.
        //После “+” НЕ может быть букв или каких либо других символов кроме цифр от 0 до 9.
        //После “+” может быть максимум 13 цифр.
        boolean actual = validator.validateNumber("+12345678911234");//false because of 14 digits
        assertEquals(expected, actual);

        //Номер НЕ может начинаться с “+0”
        actual = validator.validateNumber("+023456789");//false because of +0
        assertEquals(expected, actual);

        //Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
        //“+48”, "+61" тогда количество всех символов в номере должно быть ровно 12.
        actual = validator.validateNumber("+3715678911");//+371 false because of 11 symbols
        assertEquals(expected, actual);
        actual = validator.validateNumber("+314567891123");//+31 false because of 13 symbols
        assertEquals(expected, actual);
        actual = validator.validateNumber("+7345678911");//+7 false because of 13 symbols
        assertEquals(expected, actual);

        //Если номер начинается с “+380”, “+351”, “+30”, "+966", "+420", "+375"
        //количество всех символов в номере должно быть ровно 13.
        actual = validator.validateNumber("+3805678911234");//+380 false because of 14 symbols
        assertEquals(expected, actual);
        actual = validator.validateNumber("+3045678911234");//+30 false because of 14 symbols
        assertEquals(expected, actual);

        // Если номер начинается с “+995” тогда в номере количество всех символов
        // должно быть от 12 до 14 включительно.
        actual = validator.validateNumber("+9955678911");//+995 false because of 11 symbols
        assertEquals(expected, actual);

        //Если номер начинается с “+49”, "+353", “+358” тогда количество всех
        //символов в номере должно быть от 9 до 13 включительно.
        actual = validator.validateNumber("+4945678");//+49 false because of 8 symbols
        assertEquals(expected, actual);
        actual = validator.validateNumber("+3535678911234");//+353 false because of 14 symbols
        assertEquals(expected, actual);

        //Если номер начинается с “+44” тогда количество всех символов в номере
        //должно быть от 11 до 13 включительно.
        actual = validator.validateNumber("+444567891");//+44 false because of 10 symbols
        assertEquals(expected, actual);

        //Если номер начинается с “+32”, “+36”, “+372” тогда количество всех
        //символов в номере должно быть от 10 до 11 включительно.
        actual = validator.validateNumber("+37256789");//+372 false because of 9 symbols
        assertEquals(expected, actual);
        actual = validator.validateNumber("+36456789112");//+372 false because of 12 symbols
        assertEquals(expected, actual);

        //Если номер начинается с "+39" тогда количество всех символов в номере
        //должно быть от 11 до 12 включительно.
        actual = validator.validateNumber("+394567891123");//+39 false because of 13 symbols
        assertEquals(expected, actual);

        //Если номер начинается с "+961" тогда количество всех символов в номере
        //должно быть от 9 до 11 включительно.
        actual = validator.validateNumber("+96156789112");//+961 false because of 12 symbols
        assertEquals(expected, actual);

        //Если номер начинается с "+971" тогда количество всех символов в номере
        //должно быть от 9 до 12 включительно.
        actual = validator.validateNumber("+971567891123");//+971 false because of 13 symbols
        assertEquals(expected, actual);

        //Если номер начинается с “+43” количество всех символов в номере должно
        //быть от 7 до 14 включительно.
        actual = validator.validateNumber("+43456789112345");//+43 false because of 15 symbols
        assertEquals(expected, actual);
    }
}