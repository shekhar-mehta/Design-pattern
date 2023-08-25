package designpattern.builder;

import javax.xml.crypto.Data;

public class DataTree {
    Node node;

    DataTree(Node node){
        this.node = node;
    }

    public Node getRoot(){
        return node;
    }

    public void addChild(String value, Node parent, Node root,String tagName){
        if(root == null)
            return;

        if(root == parent){
            root.childs.add(new Node(value,tagName));
            return;
        }

        for(Node child : root.childs){
            addChild(value,parent,child,tagName);
        }
    }

    public Node getNode(String value,String tagName){
        if(node == null)
            return null;

        if(node.value == value && node.tagName == tagName)
            return node;

        Node temp = node;
        for(Node child : temp.childs){
            return getNode(value,tagName);
        }

        return null;
    }
}
