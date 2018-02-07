package chapterone;

import annotation.GuardedBy;
import annotation.ThreadSafe;

/**
 * @author Yuicon
 */
@ThreadSafe
public class Sequence {

    @GuardedBy("this") private int value;

    public synchronized int getNext() {
        return value++;
    }
}
