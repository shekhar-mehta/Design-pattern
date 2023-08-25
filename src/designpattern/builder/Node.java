package designpattern.builder;

import java.util.List;

public class Node {
    Node root;
    public String value;

    public String tagName;
    public List<Node> childs;

    Node(String value, String tagName){
        this.value = value;
        this.tagName = tagName;
    }
}
