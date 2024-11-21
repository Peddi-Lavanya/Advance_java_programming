import javax.naming.*; 
import javax.naming.directory.*; 
public class ReadAttributes { 
 public static void main(String args[]) { 
 try { 
 DirContext ctx = new InitialDirContext();
 Attributes attrs = ctx.getAttributes(args[0]);
 for (NamingEnumeration ne = attrs.getAll(); ne.hasMore();) { 
 Attribute attr = (Attribute)ne.next(); 
 System.out.println("attribute: " + attr.getID());
 for (NamingEnumeration e = attr.getAll(); e.hasMore();) 
 System.out.println("value: " + e.next()); 
 } 
 }catch (Exception e) { e.printStackTrace(); } 
 } 
}
