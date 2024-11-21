public class Method3 extends HttpServlet{
protected void doPost(httpServletRequest request,httpServletResponse response)throws ServletException,IOException{
PrintWriter out=response.getWriter();
String name=request.getParameter("name");
String[]s1=request.getParameterValues("c1");
System.out.println("hello"+name+"your hobbies are");
for(String(val:s1)){
Systrem.out.println(val);
System.out.println("Thank you");
}
}
}