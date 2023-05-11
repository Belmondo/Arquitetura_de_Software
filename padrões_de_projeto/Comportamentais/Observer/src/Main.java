public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer(subject);
        Observer observer2 = new Observer(subject);

        subject.set_flag(5);
    }
}