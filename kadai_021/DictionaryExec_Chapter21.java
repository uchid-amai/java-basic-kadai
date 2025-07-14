package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
		Dictionary_Chapter211 myDictionary = new Dictionary_Chapter211();

        // 調べる単語を配列にセット
        String[] wordsToSearch = {"apple", "banana", "lemon","orange"};

        // 単語を辞書で調べる
        for (String word : wordsToSearch) {
            String meaning = myDictionary.search(word);
            if (meaning != null) {
                System.out.println(word + "の意味は: " + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません。");
            }
        }
    }
}