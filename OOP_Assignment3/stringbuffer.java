public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Buffer: "+ sb);
        System.out.println("Length: "+sb.length());
        System.out.println("Capacity: "+sb.capacity());
        System.out.println("charAt(1)=" +sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("Buffer after=" +sb);
        System.out.println("charAt(1)=" +sb.charAt(1));
        sb.append("llo");
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println("After Deleting character from 1: "+sb);
        sb.insert(1, "e");
        System.out.println("After inserting e at index 1: "+sb);
        System.out.println("Reverse: "+sb.reverse());
        sb.replace(0, sb.length(), "World");
        System.out.println("Replacing Hello with World: "+sb);
        System.out.println("Index of l: "+sb.indexOf("l"));
    }
}
