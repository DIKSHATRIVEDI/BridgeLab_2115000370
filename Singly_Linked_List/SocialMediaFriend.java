import java.util.ArrayList;
import java.util.List;
class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
public class SocialMediaFriend {
    User head;
    public SocialMediaFriend() {
        head = null;
    }
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        User current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newUser;
    }
    public User searchUser(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public User searchUserByName(String name) {
        User current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = searchUser(userId1);
        User user2 = searchUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1); 
        }
    }
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = searchUser(userId1);
        User user2 = searchUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2)); 
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }
    public List<Integer> findMutualFriends(int userId1, int userId2) {
        List<Integer> mutualFriends = new ArrayList<>();
        User user1 = searchUser(userId1);
        User user2 = searchUser(userId2);
        if (user1 != null && user2 != null) {
            for (int friendId1 : user1.friendIds) {
                for (int friendId2 : user2.friendIds) {
                    if (friendId1 == friendId2) {
                        mutualFriends.add(friendId1);
                    }
                }
            }
        }
        return mutualFriends;
    }
    public void displayFriends(int userId) {
        User user = searchUser(userId);
        if (user != null) {
            System.out.print("Friends of " + user.name + ": ");
            for (int friendId : user.friendIds) {
                User friend = searchUser(friendId);
                if(friend!=null)
                System.out.print(friend.name + ", ");
            }
            System.out.println();
        }
    }
    public int countFriends(int userId) {
        User user = searchUser(userId);
        if (user != null) {
            return user.friendIds.size();
        }
        return 0;
    }
    public void displayAllUsers() {
        User current = head;
        while (current != null) {
            System.out.println("User ID --> " + current.userId + ", Name --> " + current.name + ", Age --> " + current.age);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        SocialMediaFriend socialNetwork = new SocialMediaFriend();
        socialNetwork.addUser(1, "Riya", 25);
        socialNetwork.addUser(2, "Kiya", 30);
        socialNetwork.addUser(3, "Siya", 28);
        socialNetwork.addUser(4, "Jiya", 32);
        socialNetwork.addFriendConnection(1, 2);
        socialNetwork.addFriendConnection(1, 3);
        socialNetwork.addFriendConnection(2, 3);
        socialNetwork.addFriendConnection(2, 4);
        System.out.println("All Users --> ");
        socialNetwork.displayAllUsers();
        System.out.println();
        socialNetwork.displayFriends(1);
        System.out.println("Number of friends of Riya --> " + socialNetwork.countFriends(1));
        System.out.println();
        System.out.println("Mutual friends between Riya and Kiya --> " + socialNetwork.findMutualFriends(1, 2));
        System.out.println();
        socialNetwork.removeFriendConnection(1, 2);
        socialNetwork.displayFriends(1);
        System.out.println();
        User user = socialNetwork.searchUserByName("Siya");
        if (user != null) {
            System.out.println("Found user by name --> " + user.name);
        }
    }
}