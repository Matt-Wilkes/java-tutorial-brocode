public class Box<T> {
//  <T> = we won't always know what the data type we're storing in Box is going to be

    T item;

    public void setItem(T item){
        this.item = item;
    };

    public T getItem(){
        return this.item;
    }
}
