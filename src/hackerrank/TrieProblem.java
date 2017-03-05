package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TrieProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie trie = new Trie();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                trie.add(contact);
            }
            else if(op.equals("find")){
                System.out.println(trie.find(contact));
            }
            else{
                // Error
            }
        }
    }
}
class Trie{
    TrieNode root;
    
    public Trie(){
        root = new TrieNode();
    }
    
    public void add(String contact){
        TrieNode cur = this.root;
        for(char c : contact.toCharArray()){
            if(cur.children[c-'a'] == null){
                cur.children[c-'a'] = new TrieNode();
            }
            cur = cur.children[c-'a'];
        }
        cur.isLeaf = true;
    }
    
    public int find(String contact){
        TrieNode cur = this.root;
        int count = 0;
        for(char c : contact.toCharArray()){
            if(cur.children[c-'a'] == null){
                return 0;
            }
            cur = cur.children[c-'a'];
        }
        count = cur.findAllChildren();
        return count;
    }
}
class TrieNode{
    TrieNode[] children;
    boolean isLeaf;
    public TrieNode(){
        this.children = new TrieNode[26];
        this.isLeaf = false;
    }
    public int findAllChildren(){
        int count = 0;
        for(TrieNode n: this.children){
            if(n != null){
            	if(n.isLeaf){
            		count += 1;
            	}
                count += n.findAllChildren();
            }
        }
        return count;
    }
}
