public class Stringsanduses {
    // String, String Builder , String Buffer

    // String are Immutable
    // String Builder are mutable but not thread safe
    //String Buffer are thread safe and mutable  

    public static void main(String[] args) {
        String name1 = "Nitesh";
        // String name2 = "Nitesh";
        String name2 = new String("Nitesh");

        boolean result1 =  name1 == name2; // This will compare the address 
        boolean result2 =  name1.equals(name2); // This will compare the values 

        System.out.println(result1);
        System.out.println(result2);


        StringBuffer sb = new StringBuffer(name1);
        System.out.println(sb);

        sb.delete(1,4);
        System.out.println(sb);

        // replaceall and trim

        String book = "                 Harry Potter             ";
        System.out.println(book);

        String trimBook = book.trim();
        System.out.println(trimBook);

        String rep = trimBook.replaceAll("r","a");
        System.out.println(rep);


    }
}
