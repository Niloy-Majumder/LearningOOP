public class wrapperclass {

    public static void main(String args[]){
        Integer i= Integer.valueOf(9);
        Float f= Float.valueOf(2.0F);
        Double d= Double.valueOf(65.0D);
        Long l= Long.valueOf(900);
        System.out.println("Printing objects: ");
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);

        int i1=i.intValue();
        float f1=f.floatValue();
        double d1= d.doubleValue();
        long l1=l.longValue();
        System.out.println("Printing primitives: ");
        System.out.println(i1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(l1);

        String str;
        str= Integer.toString(i)+1;
        System.out.println("Primitive to String and adding 1: "+str);
        Integer intval= Integer.valueOf(str)+1;
        System.out.println("String to Integer Object and adding 1: "+intval);
        int i3 = Integer.parseInt(str)+1;
        System.out.println("String to Primitive Integer and adding 1: "+i3);  
    }
}  
