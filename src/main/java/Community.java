public class Community {
private String name;
private String description;
private int id;

public Community(String name,String description){
        this.name=name;
        this.description=description;
}
public String getName(){
        return name;
}
public String getDescription(){
        return description;
}

//override equals method
@Override
 public boolean equals(Object otherCommunity){
   if (!(otherCommunity instanceof Community)) {
     return false;
   } else {
   Community newCommunity = (Community) otherCommunity;
   return this.getName().equals(newCommunity.getName()) &&
          this.getDescription().equals(newCommunity.getDescription());
  }
 }
}
