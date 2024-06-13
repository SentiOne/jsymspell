package io.gitlab.rxp90.jsymspell.api;

import java.io.Serializable;

/**
 * Extends the strategy for comparing characters
 */
public interface CharComparator extends Serializable {

    default boolean areEqual(char ch1, char ch2) {
        return ch1 == ch2;
    }

    default boolean areDistinct(char ch1, char ch2) {
        return !areEqual(ch1, ch2);
    }
}
