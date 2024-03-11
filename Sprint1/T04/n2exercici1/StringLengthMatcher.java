package n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

    public StringLengthMatcher(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "Un string con una longitud", "longitud");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }

    public static Matcher<String> hasLength(Matcher<? super Integer> lengthMatcher) {
        return new StringLengthMatcher(lengthMatcher);
    }

    public static void main(String[] args) {
        Matcher<String> longitudDe8 = StringLengthMatcher.hasLength(org.hamcrest.Matchers.is(8));
        org.hamcrest.MatcherAssert.assertThat("Mordor", longitudDe8);
    }
}
