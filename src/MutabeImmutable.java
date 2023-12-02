public class MutabeImmutable {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("chiamaka");//String buffers are mutable objects
        stringBuffer.append(" my baby");//Online the String litreals and Objects they come with mutable ojects
        System.out.println(stringBuffer);
        stringBuffer.insert(9,"fish ");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        String name =stringBuffer.toString();
        stringBuffer.setLength(50);
        stringBuffer.lastIndexOf("amaka",12);//This searches for character form the last index -1 take an optional index and also character to search for with it fields
        System.out.println(stringBuffer);
        stringBuffer.ensureCapacity(21);
    }
}

