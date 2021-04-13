public class NodeClass<K> implements ParentNode<K> {
    public K key;
    public ParentNode nextNode;


    public NodeClass(K value) {
        this.key = value;
        this.nextNode = null;
    }

    public ParentNode getNextNode() {
        return nextNode;
    }


    public void setNextNode(ParentNode nextNode) {
        this.nextNode = nextNode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K value) {
        this.key = value;
    }
}

