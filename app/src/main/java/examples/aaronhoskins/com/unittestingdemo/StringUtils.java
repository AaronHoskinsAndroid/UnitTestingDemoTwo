package examples.aaronhoskins.com.unittestingdemo;

public class StringUtils {
    URLUtils utils;

    public StringUtils() {
    }

    public StringUtils(URLUtils utils) {
        this.utils = utils;
    }

    public String concatTwoStrings(String s1, String s2) {
        return String.format("%s %s", s1, s2);
    }

    public boolean isStringProperLength(String s1) {
        return s1.length() > 4;
    }

    public String getQueryUrl
            (String queryParam, String schema, String baseUrl, String path) {

        return String
                .format("%s/?%s",
                        utils.makeUrl(schema, baseUrl, path),
                        queryParam);
    }

    public void printURLToConsole(String url, int timesToRun) {
        for(int i = 0 ; i < timesToRun ; i++) {
            utils.displayURL(url);
        }
    }
}
