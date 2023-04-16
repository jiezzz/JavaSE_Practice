package innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPhone cp1 = new CellPhone();
        cp1.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cp1.alarmclock(new Bell(){
            @Override
            public void ring(){
                System.out.println("小伙伴们上课了");

            }

        });


    }
}

interface Bell{
    void ring();

}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }

}