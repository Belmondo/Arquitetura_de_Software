import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject{

    List<Observer> observerList = new ArrayList<Observer>();
    private int _flag;

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public int get_flag() {
        return _flag;
    }

    public void set_flag(int _flag) {
        this._flag = _flag;
        notifyObservers();
    }


    @Override
    public void register(Observer o) {

        observerList.add(o);

    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(int i=0;i<observerList.size();i++)
        {
            observerList.get(i).update();
        }

    }
}