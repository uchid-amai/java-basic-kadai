package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter211 {
	
	private HashMap<String, String> dictionary;

	public Dictionary_Chapter211() {
        // 辞書として機能するHashMapを初期化
        dictionary = new HashMap<String, String>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String search(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return null;
        }
    }
}