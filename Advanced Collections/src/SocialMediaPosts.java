import java.util.*;

public class SocialMediaPosts {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputActionName = console.nextLine();

        Map<String, LinkedHashMap<String, Integer>> postLikesDislikes = new LinkedHashMap<>();
        Map<String, LinkedHashMap<String, LinkedList<String>>> postComments = new LinkedHashMap<>();

        while (!inputActionName.equals("drop the media" )){
            String[] inputParams = inputActionName.split(" ");
            String action = inputParams[0];
            String postName = inputParams[1];

            switch (action){
                case "post":
                    if (!postLikesDislikes.containsKey(postName)){
                        postLikesDislikes.put(postName, new LinkedHashMap<>());
                        postComments.put(postName, new LinkedHashMap<>());
                    }
                    postLikesDislikes.get(postName).put("Likes: ", 0);
                    postLikesDislikes.get(postName).put("Dislikes: ", 0);
                    break;
                case "like":
                    postLikesDislikes.get(postName).put("Likes: ", postLikesDislikes.get(postName).get("Likes: ") + 1);
                    break;
                case "dislike":
                    postLikesDislikes.get(postName).put("Dislikes: ", postLikesDislikes.get(postName).get("Dislikes: ") + 1);
                    break;
                case "comment":
                    String commentatorName = inputParams[2];
                    String comment = inputParams[3];

                    if (!postComments.get(postName).containsKey(commentatorName)){
                        postComments.get(postName).put(commentatorName, new LinkedList<>());
                    }

                    postComments.get(postName).get(commentatorName).add(comment);
                    break;
            }

            inputActionName = console.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> postLikeDislike : postLikesDislikes.entrySet()) {
            String post = postLikeDislike.getKey();
            LinkedHashMap<String, Integer> likeDislikeCount = postLikeDislike.getValue();

            System.out.print("Post: " + post);

            for (Map.Entry<String, Integer> likeDislikePair : likeDislikeCount.entrySet()) {
                String action = likeDislikePair.getKey();
                int count = likeDislikePair.getValue();

                System.out.print(" | " + action + count);
            }

            System.out.println();
            System.out.println("Comments:");

            if (postComments.get(post).size() == 0){
                System.out.println("None");
            }
            else {
                LinkedHashMap<String, LinkedList<String>> nameAndComments = postComments.get(post);

                for (Map.Entry<String, LinkedList<String>> nameCommentsPair : nameAndComments.entrySet()) {
                    String name = nameCommentsPair.getKey();
                    LinkedList<String> comments = nameCommentsPair.getValue();

                    System.out.print("*  " + name + ": " + String.join(" ", comments));
                    System.out.println();
                }
            }
        }
    }
}
