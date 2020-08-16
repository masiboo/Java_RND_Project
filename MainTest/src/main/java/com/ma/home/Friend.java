package com.ma.home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class Friend
{

    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        if(friend.getFriends().size() == 0){
            return false;
        }
        for(Friend f : friend.getFriends()){
            for(Friend f2 : this.friends){
                    if(f2.email.equals(f.email)){
                        return  true;
                    }
            }
        }
      return false;
    }


    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }

}
