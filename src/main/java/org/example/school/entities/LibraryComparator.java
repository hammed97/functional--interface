package org.example.school.entities;

import java.util.Comparator;

public class LibraryComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o2.getRole().ordinal() > o1.getRole().ordinal()){
            return 1;
        }else if (o2.getRole().ordinal() < o1.getRole().ordinal()){
            return -1;
        }
        return 0;
    }
}
