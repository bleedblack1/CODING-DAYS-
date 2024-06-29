public class DAY2oop {
    public static void main(String[] args) {
        
        Bankaccount MYACC = new Bankaccount();
        MYACC.username ="NISHANT DIXIT" ;
        MYACC.setPassword("ABC");
        System.out.println(MYACC.username);

    }
}

    class Bankaccount{
        public String username ;
        private String password ;
        public void setPassword( String pwd){
            password = pwd;
        }
    }

