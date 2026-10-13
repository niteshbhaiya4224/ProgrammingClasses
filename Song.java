public class Song {
    String name;
    String creatorName;
    String key;
    
    @Override
    public String toString() {
        return "Song [name=" + name + ", creatorName=" + creatorName + ", key=" + key + "]";
    }
    public Song(String name, String creatorName, String key) {
        this.name = name;
        this.creatorName = creatorName;
        this.key = key;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreatorName() {
        return creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }


}
