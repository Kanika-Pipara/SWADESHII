package servlet;

import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
public class LoginSwadeshi extends HttpServlet 
{
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        User S;
        String u,p;
        UserDao ld=new UserDao();
        u=request.getParameter("user");
        p=request.getParameter("pwd");
        S=ld.loginUser(u, p);
        if(S==null)
        {
            
            
           
            out.println("<html style='font-size: 16px;' lang='en'><head>\n" +
"    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
"    <meta charset='utf-8'>\n" +
"    <meta name='keywords' content='SWADE​SHI&nbsp;​'>\n" +
"    <meta name='description' content=''>\n" +
"    <title>Register</title>\n" +
"    <link rel='stylesheet' href='bunny.css' media='screen'>\n" +
"<link rel='stylesheet' href='Register.css' media='screen'>\n" +
"    <script class='u-script' type='text/javascript' src='jquery.js' defer=''></script>\n" +
"    <script class='u-script' type='text/javascript' src='bunny.js' defer=''></script>\n" +
"    <meta name='generator' content='SWADESHI'>\n" +
"    <meta name='referrer' content='origin'>\n" +
"    <link id='u-theme-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i'>\n" +
"    \n" +
"    \n" +
"    <script type='application/ld+json'>{\n" +
"		'@context': 'http://schema.org',\n" +
"		'@type': 'Organization',\n" +
"		'name': '',\n" +
"		'logo': 'images/IMG_20221109_1831061.png',\n" +
"		'sameAs': [\n" +
"    'www.facebook.com',\n" +
"    'www.twitter.com',\n" +
"    'www.instagram.com',\n" +
"    'www.linkedin.com'\n" +
"		]\n" +
"}</script>\n" +
"    <meta name='theme-color' content='#478ac9'>\n" +
"    <meta name='twitter:site' content='@'>\n" +
"    <meta name='twitter:card' content='summary_large_image'>\n" +
"    <meta name='twitter:title' content='Register'>\n" +
"    <meta name='twitter:description' content=''>\n" +
"    <meta property='og:title' content='Register'>\n" +
"    <meta property='og:type' content='website'>\n" +
"  </head>\n" +
"  <body class='u-body u-xl-mode' data-lang='en'><header class='u-align-center-xs u-gradient u-header u-header' id='sec-73d2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''><div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <h1 class='u-text u-text-default u-text-white u-title u-text-1'>SWADESHI </h1>\n" +
"      </div></header>\n" +
"    <section class='u-clearfix u-gradient u-section-1' id='carousel_8502'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xl u-sheet-1'>\n" +
"        <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1'>\n" +
"          <div class='u-layout'>\n" +
"            <div class='u-layout-row'>\n" +
"              <div class='u-align-center u-container-style u-layout-cell u-right-cell u-shape-rectangle u-size-30 u-layout-cell-1'>\n" +
"                <div class='u-container-layout u-container-layout-1'>\n" +
"                  <img class='u-image u-image-circle u-image-1' src='images/Untitled-3.png' alt='' data-image-width='473' data-image-height='464'><span class='u-icon u-icon-1'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 53 53' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-b623'></use></svg><svg class='u-svg-content' viewBox='0 0 53 53' x='0px' y='0px' id='svg-b623' style='enable-background:new 0 0 53 53;'><rect x='27' y='28' style='fill:#424A60;' width='2' height='18'></rect><rect x='37.5' y='2.893' transform='matrix(0.7071 0.7071 -0.7071 0.7071 20.8223 -23.2696)' style='fill:#424A60;' width='2' height='21.213'></rect><rect x='15' y='21.858' transform='matrix(0.7071 0.7071 -0.7071 0.7071 30.1421 -0.7696)' style='fill:#424A60;' width='2' height='28.284'></rect><rect x='10.722' y='13.5' transform='matrix(0.7071 0.7071 -0.7071 0.7071 15.6716 -8.8345)' style='fill:#424A60;' width='15.556' height='2'></rect><rect x='26.893' y='32.5' transform='matrix(0.7071 0.7071 -0.7071 0.7071 34.6716 -16.7046)' style='fill:#424A60;' width='21.213' height='2'></rect><circle style='fill:#43B05C;' cx='48' cy='5' r='5'></circle><circle style='fill:#7383BF;' cx='28' cy='48' r='5'></circle><circle style='fill:#57D8AB;' cx='5' cy='46' r='5'></circle><circle style='fill:#D75A4A;' cx='12' cy='8' r='3'></circle><circle style='fill:#EBBA16;' cx='44' cy='40' r='3'></circle><circle style='fill:#4B6DAA;' cx='28' cy='24' r='7'></circle></svg></span>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-align-center-lg u-align-center-xl u-align-left-md u-align-left-sm u-align-left-xs u-container-style u-layout-cell u-left-cell u-palette-2-light-3 u-size-30 u-layout-cell-2'>\n" +
"                <div class='u-container-layout u-valign-middle-lg u-valign-middle-xl u-container-layout-2'>\n" +
"                  <div class='u-align-left u-form u-form-1'>\n" +
"                    <form method='post' action='RegisterSwadeshi' class='u-clearfix u-form-custom-backend u-form-spacing-30 u-form-vertical u-inner-form' source='custom' name='form' style='padding: 23px'>\n" +
"                      <div class='u-form-email u-form-group u-form-partition-factor-2'>\n" +
"                        <label for='name-319a' class='u-label u-label-2'>Name</label>\n" +
"                        <input type='text' placeholder='Enter Name' id='name-319a' name='name' class='u-input u-input-rectangle u-white u-input-2' required=''><br>\n" +
"                      </div>\n" +
"                      <div class='u-form-group u-form-name u-form-partition-factor-2'>\n" +
"                        <label for='address-452f' class='u-label u-label-3'>Username</label>\n" +
"                        <input type='text' placeholder='Enter Username' id='address-452f' name='user' class='u-input u-input-rectangle u-white u-input-3' required=''><br>\n" +
"                      </div>\n" +
"                      <div class='u-form-address u-form-group u-form-group-3'>\n" +
"                        <label for='email-319a' class='u-label u-label-1'>Email</label>\n" +
"                        <input type='email' placeholder='Enter Email' id='email-319a' name='email' class='u-input u-input-rectangle u-white u-input-1' required=''><br>\n" +
"                      </div>\n" +
"                      <div class='u-form-group u-form-message'>\n" +
"                        <label for='message-319a' class='u-label u-label-4'>Password</label>\n" +
"                        <input type='password' placeholder='Enter Password' id='message-319a' name='pwd' class='u-input u-input-rectangle u-white u-input-4' required=''><br>\n" +
"                      </div>\n" +
"                      <div class='u-align-left u-form-group u-form-submit'>\n" +
"                        <a class='u-btn u-btn-submit u-button-style u-btn-1'>Register</a>\n" +
"                        <input type='submit' value='submit' class='u-form-control-hidden'><br>\n" +
"                      </div>\n" +
"                      \n" +
"                    </form>\n" +
"                  </div>\n" +
"                  <p class='u-text u-text-1'>\n" +
"                    <a href='index.html' class='u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-border-no-left u-border-no-right u-border-no-top u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-palette-1-base u-btn-2'>Home Page</a><br>\n");
            
            
            //Here The Output Given
            out.println("<a href='#' class='u-border-active-palette-4-base u-border-hover-palette-4-base u-border-none u-btn u-button-link u-button-style u-none u-text-palette-1-base u-btn-2'><font color='red'>You Have'nt Reistered Yet</font></a>\n");
            
                    
                    
                    
                    
             out.println("</p>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    \n" +
"    \n" +
"    <footer class='u-clearfix u-footer u-gradient u-footer' id='sec-e702'><div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1'>\n" +
"          <div class='u-gutter-0 u-layout'>\n" +
"            <div class='u-layout-row'>\n" +
"              <div class='u-align-center-sm u-align-right-md u-container-style u-layout-cell u-shape-rectangle u-size-30 u-layout-cell-1'>\n" +
"                <div class='u-container-layout u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xl u-container-layout-1'>\n" +
"                  <a  class='u-image u-logo u-image-1' data-image-width='1056' data-image-height='396'>\n" +
"                    <img src='images/IMG_20221109_1831061.png' class='u-logo-image u-logo-image-1'>\n" +
"                  </a>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-align-center-sm u-align-center-xs u-align-left-md u-align-right-lg u-align-right-xl u-container-style u-layout-cell u-right-cell u-size-30 u-layout-cell-2'>\n" +
"                <div class='u-container-layout u-container-layout-2'>\n" +
"                  <div class='u-social-icons u-spacing-10 u-social-icons-1'>\n" +
"                    <a class='u-social-url' title='facebook' target='_blank' href='https://www.facebook.com/'><span class='u-icon u-social-facebook u-social-icon u-icon-1'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-6ed5'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-6ed5'><circle fill='currentColor' cx='56.1' cy='56.1' r='55'></circle><path fill='#FFFFFF' d='M73.5,31.6h-9.1c-1.4,0-3.6,0.8-3.6,3.9v8.5h12.6L72,58.3H60.8v40.8H43.9V58.3h-8V43.9h8v-9.2\n" +
"            c0-6.7,3.1-17,17-17h12.5v13.9H73.5z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='twitter' target='_blank' href='https://twitter.com/login'><span class='u-icon u-social-icon u-social-twitter u-icon-2'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-2088'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-2088'><circle fill='currentColor' class='st0' cx='56.1' cy='56.1' r='55'></circle><path fill='#FFFFFF' d='M83.8,47.3c0,0.6,0,1.2,0,1.7c0,17.7-13.5,38.2-38.2,38.2C38,87.2,31,85,25,81.2c1,0.1,2.1,0.2,3.2,0.2\n" +
"            c6.3,0,12.1-2.1,16.7-5.7c-5.9-0.1-10.8-4-12.5-9.3c0.8,0.2,1.7,0.2,2.5,0.2c1.2,0,2.4-0.2,3.5-0.5c-6.1-1.2-10.8-6.7-10.8-13.1\n" +
"            c0-0.1,0-0.1,0-0.2c1.8,1,3.9,1.6,6.1,1.7c-3.6-2.4-6-6.5-6-11.2c0-2.5,0.7-4.8,1.8-6.7c6.6,8.1,16.5,13.5,27.6,14\n" +
"            c-0.2-1-0.3-2-0.3-3.1c0-7.4,6-13.4,13.4-13.4c3.9,0,7.3,1.6,9.8,4.2c3.1-0.6,5.9-1.7,8.5-3.3c-1,3.1-3.1,5.8-5.9,7.4\n" +
"            c2.7-0.3,5.3-1,7.7-2.1C88.7,43,86.4,45.4,83.8,47.3z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='instagram' target='_blank' href='https://www.instagram.com/'><span class='u-icon u-social-icon u-social-instagram u-icon-3'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-d3e4'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-d3e4'><circle fill='currentColor' cx='56.1' cy='56.1' r='55'></circle><path fill='#FFFFFF' d='M55.9,38.2c-9.9,0-17.9,8-17.9,17.9C38,66,46,74,55.9,74c9.9,0,17.9-8,17.9-17.9C73.8,46.2,65.8,38.2,55.9,38.2\n" +
"            z M55.9,66.4c-5.7,0-10.3-4.6-10.3-10.3c-0.1-5.7,4.6-10.3,10.3-10.3c5.7,0,10.3,4.6,10.3,10.3C66.2,61.8,61.6,66.4,55.9,66.4z'></path><path fill='#FFFFFF' d='M74.3,33.5c-2.3,0-4.2,1.9-4.2,4.2s1.9,4.2,4.2,4.2s4.2-1.9,4.2-4.2S76.6,33.5,74.3,33.5z'></path><path fill='#FFFFFF' d='M73.1,21.3H38.6c-9.7,0-17.5,7.9-17.5,17.5v34.5c0,9.7,7.9,17.6,17.5,17.6h34.5c9.7,0,17.5-7.9,17.5-17.5V38.8\n" +
"            C90.6,29.1,82.7,21.3,73.1,21.3z M83,73.3c0,5.5-4.5,9.9-9.9,9.9H38.6c-5.5,0-9.9-4.5-9.9-9.9V38.8c0-5.5,4.5-9.9,9.9-9.9h34.5\n" +
"            c5.5,0,9.9,4.5,9.9,9.9V73.3z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='linkedin' target='_blank' href='https://in.linkedin.com/'><span class='u-icon u-social-icon u-social-linkedin u-icon-4'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-6126'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-6126'><circle fill='currentColor' cx='56.1' cy='56.1' r='55'></circle><path fill='#FFFFFF' d='M41.3,83.7H27.9V43.4h13.4V83.7z M34.6,37.9L34.6,37.9c-4.6,0-7.5-3.1-7.5-7c0-4,3-7,7.6-7s7.4,3,7.5,7\n" +
"            C42.2,34.8,39.2,37.9,34.6,37.9z M89.6,83.7H76.2V62.2c0-5.4-1.9-9.1-6.8-9.1c-3.7,0-5.9,2.5-6.9,4.9c-0.4,0.9-0.4,2.1-0.4,3.3v22.5\n" +
"            H48.7c0,0,0.2-36.5,0-40.3h13.4v5.7c1.8-2.7,5-6.7,12.1-6.7c8.8,0,15.4,5.8,15.4,18.1V83.7z'></path></svg></span>\n" +
"                    </a>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div></footer>\n" +
"\n" +
"</body></html>");
            
            
            
        }
        else
            response.sendRedirect("index.html");
        
    }
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
    {
        PrintWriter out;
        try 
        {
            out = response.getWriter();
            
            out.println(" This is doGet method LoginSwadeshi ");
            response.sendRedirect("index.html");
        } 
        catch (IOException ex) 
        {
            try {
                response.sendRedirect("Error.html");
            } catch (IOException ex1) {
                Logger.getLogger(RegisterSwadeshi.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {    
            processRequest(request,response);
        }
        catch(IOException | SQLException | ServletException e)
        {
            try {
                response.sendRedirect("Error.html");
            } catch (IOException ex) {
                Logger.getLogger(RegisterSwadeshi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
}

