public class SubmitButton extends HttpServlet{
public void doPost(httpServletRequest request,httpServletResponse response)throws ServletException,IOException{
PrintWriter out=response.getWriter();
String s1=request.getParameter("uname");
String s2=request.getParameter("age");
int age=Integer.parseInt(s2);
if(age<=18){
System.out.println("Welcome to getparameter method 1");
}else{
System.out.println("Welcome to getparameter method 2");
}
}
}