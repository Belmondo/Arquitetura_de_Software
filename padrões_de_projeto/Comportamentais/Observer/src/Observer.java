public class Observer
{
    private ISubject subject;

    public Observer(ISubject subject){
        this.subject = subject;
        this.subject.register(this);
    }
    public void update()
    {
        System.out.println("flag value changed in Subject");
        System.out.println("State updated to: " + subject.get_flag());
    }
}