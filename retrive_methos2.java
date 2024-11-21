protected void doPost(httpServletRequest request,httpServletResponse response)throws IOException,ServletException{
PrintWriter out=response.getWriter();
Enumeration e=request.getPatameterNames();
while(e.hasMoreElements()){
String s=e.nextElemet();
String value=request.getPatameter(s);
System.out.println("<h1>")+value+"</h1>");
}
}