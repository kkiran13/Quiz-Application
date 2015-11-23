package quiz.application;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QuizApp extends HttpServlet {

    
    String q1, q2, q3,q4, q5,q6,q7,q8,q9,q10 ;
   

    /**
     * Process the HTTP Get request
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sendPage1(response);
    }

    /**
     * Process the HTTP Post request
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String page = request.getParameter("page");
        q1 = request.getParameter("q1");
        q2 = request.getParameter("q2");
        q3 = request.getParameter("q3");
        q4 = request.getParameter("q4");
        q5 = request.getParameter("q5");
        q6 = request.getParameter("q6");
        q7 = request.getParameter("q7");
        q8 = request.getParameter("q8");
        q9 = request.getParameter("q9");
        q10 = request.getParameter("q10");
        if (page == null) {
            sendPage1(response);
            return;
        }
        if (page.equals("1")) {
           
                sendPage2(response);
            
        } else if (page.equals("2")) {
           
                sendPage3(response);
            
        }else if (page.equals("3")) {
           
                sendPage4(response);
            
        }else if (page.equals("4")) {
           
                sendPage5(response);
            
        }else if (page.equals("5")) {
           
                sendPage6(response);
            
        }else if (page.equals("6")) {
           
               sendPage7(response);
            
        }else if (page.equals("7")) {
           
                sendPage8(response);
            
        }else if (page.equals("8")) {
           
                sendPage9(response);
            
        }else if (page.equals("9")) {
           
                sendPage10(response);
            
        }else if (page.equals("10")) {
           
                displayValues(response);
            
        }
    }

    void sendPage1(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quiz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 1 of 10");
        out.println("<BR>");
        out.println("<BR>");
        
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=1>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following is NOT a Java keyword? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q1' value='base'/>base</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q1' value='switch'/>switch</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q1' value='final'/>final</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q1' value='super'/>super</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    void sendPage2(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 2 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=2>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following is a legal modifiers for a method in an interface? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q2' value='protected'/>protected</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q2' value='public'/>public</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q2' value='final'/>final</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q2' value='private'/>private</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage3(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 3 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=3>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following is true for BOTH interfaces and abstract classes?  &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q3' value='They both can contain abstract methods'/>They both can contain abstract methods</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q3' value='They both can contain final methods'/>They both can contain final methods</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q3' value='They both can contain concrete methods'/>They both can contain concrete methods</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q3' value='They both can contain private methods'/>They both can contain private methods</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    void sendPage4(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 4 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=4>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>What Java5 feature results in less casting? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q4' value='Static Imports'/>Static Imports</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q4' value='Enums'/>Enums</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q4' value='AutoBoxing'/>AutoBoxing</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q4' value='Generics'/>Generics</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage5(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 5 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=5>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>In what package will you find JDBC classes and interfaces? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q5' value='java.jdbc'/>java.jdbc</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q5' value='java.sql'/>java.sql</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q5' value='javax.persistence'/>javax.persistence</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q5' value='java.util'/>java.util</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage6(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 6 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=6>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q5 VALUE='" + q5 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following does not inherit from the Collection interface? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q6' value='Queue'/>Queue</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q6' value='Map'/>Map</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q6' value='Set'/>Set</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q6' value='List'/>List</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage7(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 7 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=7>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q5 VALUE='" + q5 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q6 VALUE='" + q6 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>What package is the List interface defined in? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q7' value='java.awt'/>java.awt</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q7' value='java.collection'/>java.collection</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q7' value='java.lang'/>java.lang</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q7' value='java.util'/>java.util</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage8(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 8 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=8>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q5 VALUE='" + q5 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q6 VALUE='" + q6 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q7 VALUE='" + q7 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following methods is defined in the java.lang.Throwable class?  &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q8' value='equals()'/>equals()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q8' value='getMessage()'/>getMessage()</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q8' value='print()'/>print()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q8' value='throw()'/>throw()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
   
    
    void sendPage9(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 9 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=9>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q5 VALUE='" + q5 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q6 VALUE='" + q6 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q7 VALUE='" + q7 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q8 VALUE='" + q8 + "'></TD>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following exceptions is unchecked?  &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q9' value='RuntimeException'/>RuntimeException</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q9' value='IOException'/>IOException</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q9' value='CloneNotSupportedException'/>CloneNotSupportedException</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q9' value='ParseException'/>ParseException</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void sendPage10(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Java Quiz</TITLE>");
        out.println("<script>");
        out.println("function goBack() {");
        out.println("window.history.back()}");
        out.println("</script>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Java Quizz</H2>");
        out.println("<BR>");
        out.println("<BR>");
        out.println("Question 10 of 10");
        out.println("<BR>");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=10>");
        out.println("<INPUT TYPE=HIDDEN NAME=q1 VALUE='" + q1 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q2 VALUE='" + q2 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q3 VALUE='" + q3 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q4 VALUE='" + q4 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q5 VALUE='" + q5 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q6 VALUE='" + q6 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q7 VALUE='" + q7 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q8 VALUE='" + q8 + "'></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=q9 VALUE='" + q9 + "'></TD>");
         
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Which of the following methods are NOT defined in the java.lang.Object class? &nbsp;</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q10' value='finalize()'/>finalize()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q10' value='clone()'/>clone()</TD>");
        out.println("</TR>");
         
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q10' value='equals()'/>equals()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD><input type='radio' name = 'q10' value='toString()'/>toString()</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
         out.println("<TD><input type=\"button\" value=\"Back\" onclick=\"goBack()\"></TD>");
        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Next></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    void displayValues(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Your Answers in the quiz</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Your Answers in the quiz are </H2>");
        out.println("<BR>");
        out.println("<BR>");
        
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Answer 1: &nbsp;</TD>");
        out.println("<TD>" + q1 + "</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD>Answer 2: &nbsp;</TD>");
        out.println("<TD>" + q2 + "</TD>");
        out.println("</TR>");
        
        out.println("<TR>");
        out.println("<TD>Answer 3: &nbsp;</TD>");
        out.println("<TD>" + q3 + "</TD>");
        out.println("</TR>");
        
        out.println("<TR>");      
        out.println("<TD>Answer 4: &nbsp;</TD>");
        out.println("<TD>" + q4 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 5: &nbsp;</TD>");
        out.println("<TD>" + q5 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 6: &nbsp;</TD>");
        out.println("<TD>" + q6 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 7: &nbsp;</TD>");
        out.println("<TD>" + q7 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 8: &nbsp;</TD>");
        out.println("<TD>" + q8 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 9: &nbsp;</TD>");
        out.println("<TD>" + q9 + "</TD>");
        out.println("</TR>");
        
         out.println("<TR>");
        out.println("<TD>Answer 10: &nbsp;</TD>");
        out.println("<TD>" + q10 + "</TD>");
        out.println("</TR>");
        
        
        out.println("</TABLE>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    

}
