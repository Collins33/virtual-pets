import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class CommunityTest{
  @Rule
  public DatabaseRule database = new DatabaseRule();
  @Test
  public void community_instantiatesCorrectly_true(){
    Community newCommunity=new Community("water lovers","lovers of all things water monsters");
    assertEquals(true,newCommunity instanceof Community);
  }
  @Test
  public void community_instantiatesWithName(){
    Community newCommunity=new Community("water lovers","lovers of all things water monsters");
    assertEquals("water lovers",newCommunity.getName());
  }
  @Test
  public void community_instantiatesWithDescription(){
    Community newCommunity=new Community("water lovers","lovers of all things water monsters");
    assertEquals("lovers of all things water monsters",newCommunity.getDescription());
  }
  @Test
  public void equals_returnsTrueIfNameAndDescriptionAreSame_true(){
    Community newCommunity=new Community("water lovers","lovers of all things water monsters");
    Community secondCommunity=new Community("water lovers","lovers of all things water monsters");
    assertTrue(newCommunity.equals(secondCommunity));
  }
}
