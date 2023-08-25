package designpattern.builder;

public class XMLBuilder {
    DataTree dataTree;
    XMLBuilder(DataTree dataTree){
        this.dataTree = dataTree;
    }

    XMLBuilder(){
        this.dataTree = new DataTree(new Node("Root","root"));
    }

    //Builder pattern
    public XMLBuilder build(String value,String tagName){
        Node parent = findNode(value,tagName);
        if(parent != null){
            dataTree.addChild(value,parent,dataTree.node,tagName);
        }
        else{
            Node root = new Node(value,tagName);
            dataTree.addChild(value,parent,root,tagName);
        }
        return this;
    }

    public Node findNode(String value,String tagName){
        return dataTree.getNode(value,tagName);
    }

    public String buildXML(Node node){
        String finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        return traverseTree(finalXML,node);
    }

    public String traverseTree(String xml, Node node){
        if(node != null){
            xml += "<" + node.tagName + ">"  + node.value;
            for(Node child : node.childs){
                traverseTree(xml,child);
            }
            xml += "<" + node.tagName + "/>";
        }
        return xml;
    }
}
