import java.util.ArrayList;



class Node {
    public Node prev;
    public String word;
    public int depth;
   
 
    public Node(String word, int depth, Node prev){
        this.word=word;
        this.depth=depth;
        this.prev=prev;
    }
}


class ShortestTransformationSequence{

    public static List<List<String>> printSolutions(String beginWord, String endWord, List<String> wordList) {

      return;
    }


    public static void main(String[] args) {
        String  beginWord = "hit";
        String endWord = "cog";
        //List<String> wordList = new List<String>();
        List<String> wordList = new ArrayList<String>();

        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        // for(String str: wordList){
        //     System.out.print(str + " ");
        // }



    }
}