//package test;
//
//public class Mar31 {
//
//	public static void main(String[] args) {
//		Mar29 mar3 = new Mar29();
//        mar3.myVariable = 10;
//        mar3.data=1000;
//        Mar29.data=1100;
//        Mar29 mar4 = new Mar29();
//        System.out.println("Hey"+mar4.myVariable);
//        System.out.println("Hey"+mar4.data);
//       
//
//	}
//
//}


package test;


public class Mar31 {
    
        // Instance Variables
        String name;
        String breed;
        int age;
        String color;
        
        public Mar31(String name, String breed, int age) {
            this(name, breed, age, "black");
            System.out.println("hey");
        }
        
        public Mar31() {
            this("test","test",5);
        }

        // Constructor Declaration of Class
        public Mar31(String name, String breed,int age, String color)
        {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
        }
        
        // method 1
        public String getName()
        {
            return name;
        }

        // method 2
        public String getBreed()
        {
            return breed;
        }

        // method 3
        public int getAge()
        {
            return age;
        }

        // method 4
        public String getColor()
        {
            return color;
        }

        @Override
        public String toString()
        {
            return("Hi my name is "+ this.getName()+".\nMy breed,age and color are " +this.getBreed()+"," + this.getAge()+","+ this.getColor());
        }

 

    public static void main(String[] args) {
        Mar31 tuffy = new Mar31("tuffy","papillon", 5, "white");
        Mar31 tuffy1 = new Mar31("tuffy","papillon", 5);
        Mar31 t = new Mar31();

 

        System.out.println(tuffy.toString());
        System.out.println(tuffy1.toString());
        System.out.println(t.toString());

 


    }
    
    
    // Class Declaration

 


    }