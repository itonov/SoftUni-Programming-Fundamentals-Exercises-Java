import java.util.*;

public class ForumTopics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputTopicTag = console.nextLine();

        Map<String, LinkedHashSet<String>> topicAndTag = new LinkedHashMap<>();

        while (!inputTopicTag.equals("filter")){
            String[] tokens = inputTopicTag.split("\\W+");
            String topic = tokens[0];

            if (!topicAndTag.containsKey(topic)){
                topicAndTag.put(topic, new LinkedHashSet<>());
            }

            for (int i = 1; i < tokens.length; i++) {
                topicAndTag.get(topic).add(tokens[i]);
            }

            inputTopicTag = console.nextLine();
        }

        String[] tagsToSearch = console.nextLine().split(", ");

        for (Map.Entry<String, LinkedHashSet<String>> topicTagPair : topicAndTag.entrySet()) {
            String topic = topicTagPair.getKey();
            LinkedHashSet<String> tagList = topicTagPair.getValue();

            if (topicAndTag.get(topic).containsAll(Arrays.asList(tagsToSearch))){
                LinkedList<String> tagsToPrint = new LinkedList<>();
                for (String tag : tagList) {
                    tagsToPrint.add("#" + tag);
                }

                System.out.print(topic + " | " + String.join(", ", tagsToPrint));
                System.out.println();

            }
        }


    }
}
