package az.company.firstjava.lesson2;

public class Main {

    public static void main(String[] args) {

        /**raper type */
        String string = "9";
        Character[] character = {'H', 'e', 'l'};
        Integer integer = 9;
        Double aDouble = 9d;
        Float aFloat = 9f;

        /**primitive type */
        int a = 5;
        double b = 6.6;
        char c = 'c';

        System.out.println(" String " + string);

        /**
         * ---------- Memory ----------
         * ----String----
         * type
         * --------------
         * ------ Character ---------
         *
         *
         *---------------------------
         *
         * -----Integer ---------
         * 4 byte
         * 9
         * ---------------------------
         * ----------------------
         *
         * --- Double --------
         * 6 byte
         *
         * 9
         * --------------------------------
         *
         * -------------------
         *
         * -----Float --------
         *
         * ---------------------------------
         * -------------------
         *
         *
         * 1 bit= 0 or 1
         * 8 bit=1 byte
         * 1024 byte = 1 KB
         * 1024 kb= 1 MB
         * 1024 mb = 1 GB
         * 1024 GB = 1 TB
         *
         * 01100101=0*2^7+1*2^6+...1*2^0
         * -------- -------- ------
         *
         * ----------------------------
         * */
    }
}