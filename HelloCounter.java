public class HelloCounter{
    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("Error: Se requiere un nombre como parámetro");
            System.exit(1);
        }


        String name = args[0];


        for( int i = 1; i <= 15; i++){

            System.out.println("Hello I am " + name + " and I am printing the number " + i);

            if(i<15) {
                try {
                    

                    int waitTime = 1000 + (int)(Math.random()*4000);
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }

        }




    }
}