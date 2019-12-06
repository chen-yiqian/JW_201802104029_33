import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showcookies")
public class ShowCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //得到所有cookies信息
        Cookie[] allCookies=request.getCookies();
        if(allCookies==null){
            response.getWriter().println("no cookies");
        }else {
            for(Cookie cookie : allCookies){
                response.getWriter().println(cookie.getName()+"="+cookie.getValue());
            }
        }
    }
}
