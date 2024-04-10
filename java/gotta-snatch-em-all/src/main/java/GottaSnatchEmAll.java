import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardSet = new HashSet<>();
        for (String card : cards) {
            cardSet.add(card);
        }
        return cardSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> theirUniqueCards = new HashSet<>(theirCollection);
        theirUniqueCards.removeAll(myCollection);

        return !myCollection.isEmpty() && !theirUniqueCards.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> intersection = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            intersection.retainAll(collections.get(i));
        }
        return intersection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>(collections.get(0));
        
        for (int i = 1; i < collections.size(); i++) {
            allCards.addAll(collections.get(i));
        }
        return allCards;
    }
}
