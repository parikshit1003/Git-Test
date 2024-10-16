public class GitTestMain {

    public static void main(String[] args){

        Test01 test01 = new Test01();

        System.out.println("Git Test !!!!!");

        test01.testMethod();

        System.out.println(Data.DATA);

        System.out.println(Constants.GIT_TEST);

        System.out.println(Constants.GIT_CHECKOUT);

        Test02 test02 = new Test02();

        test02.testMethod();
      
    }

}
