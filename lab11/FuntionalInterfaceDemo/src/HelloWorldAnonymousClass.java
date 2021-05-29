public class HelloWorldAnonymousClass {
    interface HelloWorld{
        public void greet();
        public void greetSomeOne(String name);
    }

   

    public static void main(String[] args) {
        class EnglishGreet implements HelloWorld{

        @Override
        public void greet() {
            // TODO Auto-generated method stub
            greetSomeOne("John");
        }

        @Override
        public void greetSomeOne(String namePerson) {
            // TODO Auto-generated method stub
            namePerson = namePerson;
            System.out.println("Hello "+namePerson);
        }
        
    }

    EnglishGreet englishGreet = new EnglishGreet();

    //Su dung anonymous inner class
    HelloWorld spanishGreet = new HelloWorld(){
        String name;
        @Override
        public void greet() {
            // TODO Auto-generated method stub
            greetSomeOne("Mando");
        }

        @Override
        public void greetSomeOne(String nameSomeOne) {
            // TODO Auto-generated method stub
            name = nameSomeOne;
            System.out.println("Hola "+name);
            method();
            
        }

        public void method(){
            System.out.println("aaa");
        }
        
    };
    spanishGreet.greet();
    }

}
