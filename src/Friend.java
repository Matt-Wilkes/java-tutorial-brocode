public class Friend {
//    Friend class owns numOfFriends and all objects have access to it
    static int numOfFriends;
    String name;


    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
