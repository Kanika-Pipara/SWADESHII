package servlet;

import dao.VendorDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vendor;


public class VendorRequest extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException ,SQLException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Vendor S=new Vendor();
        VendorDao vd=new VendorDao();
        S.setName(request.getParameter("name"));
        S.setEmail(request.getParameter("email"));
        S.setPhone(Double.parseDouble(request.getParameter("phone")));
        S.setCategory(request.getParameter("category"));
        S.setCity(request.getParameter("city"));
        if(vd.vendorRequest(S))
        {
            
        
            out.println("<html style='font-size: 16px;' lang='en'><head>\n" +
"    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
"    <meta charset='utf-8'>\n" +
"    <meta name='keywords' content='​We create online shops, ​Everything you needto sell products online, ​Our way, 2019, 2020, 2021, 2022, ​Get Free Consultation, Building Beautiful, Functional eCommerce Websites, Get yours today, ​Our clients love the we build stores experience, ​Choose your paymonthly website plan, $ 29, $ 59, $ 119, ​When working with us, you’re in good company:, Get in Touch, ​Level up your brand'>\n" +
"    <meta name='description' content=''>\n" +
"    <title>Home</title>\n" +
"    <link rel='stylesheet' href='kruti.css' media='screen'>\n" +
"<link rel='stylesheet' href='Home.css' media='screen'>\n" +
"    <script class='u-script' type='text/javascript' src='hjquery.js' defer=''></script>\n" +
"    <script class='u-script' type='text/javascript' src='kruti.js' defer=''></script>\n" +
"    <meta name='generator' content='SWADESHI'>\n" +
"    <meta name='referrer' content='origin'>\n" +
"    <link id='u-theme-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i'>\n" +
"    <link id='u-page-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto+Slab:100,200,300,400,500,600,700,800,900|Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Merriweather:300,300i,400,400i,700,700i,900,900i'>\n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    <script type='application/ld+json'>{\n" +
"		'@context': 'http://schema.org',\n" +
"		'@type': 'Organization',\n" +
"		'name': '',\n" +
"		'logo': 'images/SwadeshiLogo4.png'\n" +
"}</script>\n" +
"    <meta name='theme-color' content='#f15048'>\n" +
"    <meta property='og:title' content='Home'>\n" +
"    <meta property='og:type' content='website'>\n" +
"  </head>\n" +
"  <body data-home-page='index.html' data-home-page-title='Home' class='u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode' data-lang='en'><header class='u-clearfix u-header u-sticky u-sticky-9b5c u-white u-header' id='sec-0bc2'><div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <a href='index.html' class='u-image u-logo u-image-1' data-image-width='2000' data-image-height='451' title='Home'>\n" +
"          <img src='images/SwadeshiLogo4.png' class='u-logo-image u-logo-image-1'>\n" +
"        </a>\n" +
"        <nav class='u-menu u-menu-one-level u-offcanvas u-menu-1'>\n" +
"          <div class='menu-collapse' style='font-size: 1rem; letter-spacing: 0px;'>\n" +
"            <a class='u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-black u-text-hover-palette-2-base' href='#'>\n" +
"              <svg class='u-svg-link' viewBox='0 0 24 24'><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#menu-hamburger'></use></svg>\n" +
"              <svg class='u-svg-content' version='1.1' id='menu-hamburger' viewBox='0 0 16 16' x='0px' y='0px' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns='http://www.w3.org/2000/svg'><g><rect y='1' width='16' height='2'></rect><rect y='7' width='16' height='2'></rect><rect y='13' width='16' height='2'></rect>\n" +
"</g></svg>\n" +
"            </a>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container'>\n" +
"            <ul class='u-nav u-spacing-30 u-unstyled u-nav-1'><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='About.html' rel='nofollow' style='padding: 6px 30px;'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>Contact Us</a>\n" +
"</li></ul>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container-collapse'>\n" +
"            <div class='u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav'>\n" +
"              <div class='u-inner-container-layout u-sidenav-overflow'>\n" +
"                <div class='u-menu-close'></div>\n" +
"                <ul class='u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2'><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='About.html' rel='nofollow'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>Contact Us</a>\n" +
"</li></ul>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-black u-menu-overlay u-opacity u-opacity-70'></div>\n" +
"          </div>\n" +
"        </nav>\n" +
"        <a href='Login.html' class='u-black u-border-2 u-border-hover-black u-btn u-button-style u-hover-white u-text-body-alt-color u-text-hover-black u-btn-1' rel='nofollow'>Login</a>\n" +
"        <img class='u-image u-image-contain u-image-default u-image-2' src='images/SwadeshiLogo3.png' alt='' data-image-width='1277' data-image-height='1275'>\n" +
"      </div><style class='u-sticky-style' data-style-id='9b5c'>.u-sticky-fixed.u-sticky-9b5c, .u-body.u-sticky-fixed .u-sticky-9b5c {\n" +
"box-shadow: 5px 5px 20px 0 rgba(0,0,0,0.4) !important\n" +
"}.u-sticky-fixed.u-sticky-9b5c:before, .u-body.u-sticky-fixed .u-sticky-9b5c:before {\n" +
"borders: top right bottom left !important\n" +
"}</style></header>\n" +
"    <section class='u-align-left u-clearfix u-image u-section-1' id='carousel_b9a0' data-image-width='3388' data-image-height='2000'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <p class='u-custom-font u-font-georgia u-text u-text-palette-2-dark-1 u-text-1' data-animation-name='' data-animation-duration='2000' data-animation-direction=''>Search Vendor</p>\n" +
"        <div class='u-border-2 u-border-palette-1-light-3 u-form u-palette-1-light-3 u-form-1'>\n" +
"            <form action='SearchVendor' method='post' class='u-clearfix u-form-spacing-15 u-inner-form' style='padding: 15px' source='submit' id='send'>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"              <label for='select-3fa2' class='u-label'>Category</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-3fa2' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                  <option value='Handmade'>Handmade</option>\n" +
"                  <option value='Paintings'>Paintings</option>\n" +
"                  <option value='Pottery'>Pottery</option>\n" +
"                  <option value='Jewellery'>Jewellery</option>\n" +
"                  <option value='Antiques'>Antiques</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"              <label for='select-dc8a' class='u-label'>City</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                  <option value='Indore'>Indore</option>\n" +
"                  <option value='Bhopal'>Bhopal</option>\n" +
"                  <option value='Delhi'>Delhi</option>\n" +
"                  <option value='Mumbai'>Mumbai</option>\n" +
"                  <option value='Banglore'>Banglore</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-submit u-label-top'>\n" +
"              <input type='submit' value='SUBMIT' class='u-border-none u-btn u-btn-submit u-button-style u-hover-custom-color-2 u-text-hover-black' for='send'>\n" +
"            </div>\n" +
"            <div class='u-form-send-message u-form-send-success'>Thank you! Your message has been sent.</div>\n" +
"            <div class='u-form-send-error u-form-send-message'>Unable to send your message. Please fix errors then try again.</div>\n" +
"            <input type='hidden' value='' name='recaptchaResponse'>\n" +
"            <input type='hidden' name='formServices' value='52122c4348a491264f7f6a71a37cb3f4'>\n" );
                    
                    
                    
        out.println("<center><p  ><h3><b><font color='green'>Register Successfully</font></h3></b></p></center>\n");
            
            
            
        out.println("          </form>\n" +
"        </div>"+
"      </div>\n" +
"    </section>\n" +
"    <section class='u-clearfix u-image u-valign-bottom-xl u-section-2' id='carousel_0d8f' data-image-width='1980' data-image-height='1429'>\n" +
"      <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-palette-1-base u-layout-wrap-1'>\n" +
"        <div class='u-layout' style=''>\n" +
"          <div class='u-layout-row' style=''>\n" +
"            <div class='u-container-style u-layout-cell u-right-cell u-size-60 u-layout-cell-1'>\n" +
"              <div class='u-container-layout u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-container-layout-1'>\n" +
"                <div data-interval='3000' data-u-ride='carousel' class='u-carousel u-carousel-fade u-expanded-width u-slider u-slider-1' id='carousel-55a5' data-pause='hover'>\n" +
"                  <ol class='u-absolute-hcenter u-carousel-indicators u-carousel-indicators-1'>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='0' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='1' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='2' style='width: 30px; height: 3px;'></li>\n" +
"                  </ol>\n" +
"                  <div class='u-carousel-inner' role='listbox'>\n" +
"                    <div class='u-active u-align-center u-carousel-item u-container-style u-image u-slide u-image-1' data-image-width='1024' data-image-height='576'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-2'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-1'>handpaint</p>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-2'>handcraft</p>\n" +
"                        <p class='u-custom-font u-font-roboto-slab u-text u-text-body-alt-color u-text-3'>The best handcrafted things are not always made by some brands its a talent of th​e Local person so promoting some of them by our plaform </p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-image u-shape-rectangle u-slide u-image-2' data-image-width='717' data-image-height='480'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-3'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-4'>jewellery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-expanded-width u-image u-slide u-image-3' data-image-width='685' data-image-height='550'>\n" +
"                      <div class='u-container-layout u-container-layout-4'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-5'>pottery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-prev u-spacing-5 u-text-body-alt-color u-carousel-control-1' href='#carousel-55a5' role='button' data-u-slide='prev'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-next u-spacing-5 u-text-body-alt-color u-carousel-control-2' href='#carousel-55a5' role='button' data-u-slide='next'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-image u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-section-3' id='sec-956c' data-image-width='2000' data-image-height='1333'>\n" +
"      <div class='u-align-center u-container-style u-expanded-width u-grey-15 u-group u-shape-rectangle u-group-1'>\n" +
"        <div class='u-container-layout u-container-layout-1'>\n" +
"          <h2 class='u-text u-text-1'> Everything you need<br><b>there is a vendor you find</b>\n" +
"          </h2>\n" +
"          <div class='u-layout-grid u-list u-list-1'>\n" +
"            <div class='u-repeater u-repeater-1'>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-1' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-1' src='images/Vendor10.jpg' alt='' data-image-width='1405' data-image-height='1405'>\n" +
"                  <h4 class='u-align-center u-text u-text-2'> Customize your online store</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-3'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-2' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-2' src='images/Vendor14.jpg' alt='' data-image-width='1474' data-image-height='1474'>\n" +
"                  <h4 class='u-align-center u-text u-text-4'> Run your ecommerce website</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-5'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-3' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-4'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-3' src='images/Vendor16.jpg' alt='' data-image-width='1479' data-image-height='1480'>\n" +
"                  <h4 class='u-align-center u-text u-text-6'> Grow your revenue</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-7'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-4' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-5'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-4' src='images/Vendor17.jpg' alt='' data-image-width='1399' data-image-height='1399'>\n" +
"                  <h4 class='u-align-center u-text u-text-8'>Team</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-9'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-4' id='carousel_3697'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h2 class='u-text u-text-default u-text-1'> Our Vision</h2>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-3-base u-radius-24 u-shape-round u-group-1' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-1'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-2'>2022</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-3'>Build a good UI/UX patform for our users.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-5-base u-radius-24 u-shape-round u-group-2' data-animation-name='flipIn' data-animation-duration='750' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-2'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-4'>2023</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-5'> Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-4-base u-radius-24 u-shape-round u-group-3' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-container-layout-3'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-6'>2024</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-7'> Podcasting operational change management inside of workflows to establish a framework. Expand this business as per our research. By&nbsp;<br>expanding our fields.<br>\n" +
"              <br>\n" +
"            </p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-grey-80 u-group u-hover-feature u-radius-24 u-shape-round u-group-4' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-4'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-8'>2025</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-9'>Keep promoting the art of india and add more vendor to promote locals</p>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-5' id='carousel_05dd'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <h2 class='u-custom-font u-font-georgia u-text u-text-1'> Our&nbsp; Vendors<b>&nbsp;<span style='font-weight: 400;'> Feedback<span style='font-weight: 700;'></span>\n" +
"            </span></b>\n" +
"        </h2>\n" +
"        <div class='u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-list-item u-palette-4-base u-repeater-item u-shape-round u-list-item-1'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-1'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-contain u-image-1' data-image-width='1515' data-image-height='1316'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-2'>Swati jaiswal</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-3'>Its a good platform to boost our buisness..</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-container-style u-custom-item u-list-item u-palette-5-base u-repeater-item u-shape-rectangle u-list-item-2'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-2' data-image-width='1474' data-image-height='1405'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-4'>Tejas singh</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-5'>You guys are really doing well by promoting locals</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-hover-feature u-list-item u-palette-3-base u-repeater-item u-shape-round u-list-item-3'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-3' data-image-width='1537' data-image-height='1503'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-6'>Arti khushwah</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-7'>After Lockdown the local business were affected badly so thanks for promote</p>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-palette-3-base u-section-6' id='carousel_b8e1'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h1 class='u-text u-text-1'>\n" +
"          <span style='font-weight: 700;'> &nbsp;AD Campaigns</span>\n" +
"        </h1>\n" +
"        <div class='u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-1'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-1' data-image-width='300' data-image-height='90' src='images/logo-amazon.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-2'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-2' data-image-width='300' data-image-height='90' src='images/1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-3'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-3' data-image-width='300' data-image-height='63' src='images/evga.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-4'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-4' data-image-width='300' data-image-height='39' src='images/tesla-9.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-5'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-5' data-image-width='300' data-image-height='54' src='images/sony-logo.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-6'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-6' data-image-width='300' data-image-height='65' src='images/crocs-wordmark.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-7'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-7' data-image-width='300' data-image-height='90' src='images/logo-amazon1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-8'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-8' data-image-width='300' data-image-height='87' src='images/asos-1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-clearfix u-grey-15 u-section-7' id='carousel_7b55'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1'>\n" +
"          <div class='u-layout'>\n" +
"            <div class='u-layout-row'>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-palette-5-dark-3 u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-layout-cell-1'>\n" +
"                <div class='u-container-layout u-valign-bottom-lg u-valign-bottom-md u-valign-bottom-sm u-valign-bottom-xl u-container-layout-1'>\n" +
"                  <h2 class='u-text u-text-default u-text-1'>Get in Touch</h2>\n" +
"                  <p class='u-text u-text-default u-text-2'>For any feedback or any suggestion contact us.<br>\n" +
"                  </p>\n" +
"                  <div class='u-list u-list-1'>\n" +
"                    <div class='u-repeater u-repeater-1'>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-2'><span class='u-file-icon u-icon u-text-white u-icon-1'><img src='images/646094-23388df3.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-3'>Chat with us</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-4'>Our friendly team is here to help.<br>dosomthingdesi.com\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-3'><span class='u-file-icon u-icon u-text-white u-icon-2'><img src='images/2838912-49358f0d.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-5'>Office</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-6'>Swadeshi Head Office Branch,<br>Apollo Tower , Indore<br>Pin Code : 452006&nbsp;\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-4'><span class='u-file-icon u-icon u-text-white u-icon-3'><img src='images/8066424-eec24b29.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-7'>Phone</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-8'> Mon-Fri from 8am to 5am<br>\n" +
"                            <a href='#' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-white u-text-palette-3-base u-btn-1' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>+91 982-632-8844</a>\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <div class='u-social-icons u-spacing-17 u-social-icons-1'>\n" +
"                    <a class='u-social-url' title='facebook' target='_blank' href='https://facebook.com/name'><span class='u-icon u-social-facebook u-social-icon u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-2e4f'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-2e4f'><path fill='currentColor' d='M75.5,28.8H65.4c-1.5,0-4,0.9-4,4.3v9.4h13.9l-1.5,15.8H61.4v45.1H42.8V58.3h-8.8V42.4h8.8V32.2\n" +
"c0-7.4,3.4-18.8,18.8-18.8h13.8v15.4H75.5z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='twitter' target='_blank' href='https://twitter.com/name'><span class='u-icon u-social-icon u-social-twitter u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-c508'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-c508'><path fill='currentColor' d='M92.2,38.2c0,0.8,0,1.6,0,2.3c0,24.3-18.6,52.4-52.6,52.4c-10.6,0.1-20.2-2.9-28.5-8.2\n" +
"	c1.4,0.2,2.9,0.2,4.4,0.2c8.7,0,16.7-2.9,23-7.9c-8.1-0.2-14.9-5.5-17.3-12.8c1.1,0.2,2.4,0.2,3.4,0.2c1.6,0,3.3-0.2,4.8-0.7\n" +
"	c-8.4-1.6-14.9-9.2-14.9-18c0-0.2,0-0.2,0-0.2c2.5,1.4,5.4,2.2,8.4,2.3c-5-3.3-8.3-8.9-8.3-15.4c0-3.4,1-6.5,2.5-9.2\n" +
"	c9.1,11.1,22.7,18.5,38,19.2c-0.2-1.4-0.4-2.8-0.4-4.3c0.1-10,8.3-18.2,18.5-18.2c5.4,0,10.1,2.2,13.5,5.7c4.3-0.8,8.1-2.3,11.7-4.5\n" +
"	c-1.4,4.3-4.3,7.9-8.1,10.1c3.7-0.4,7.3-1.4,10.6-2.9C98.9,32.3,95.7,35.5,92.2,38.2z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='instagram' target='_blank' href='https://instagram.com/name'><span class='u-icon u-social-icon u-social-instagram u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-9d85'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-9d85'><path fill='currentColor' d='M55.9,32.9c-12.8,0-23.2,10.4-23.2,23.2s10.4,23.2,23.2,23.2s23.2-10.4,23.2-23.2S68.7,32.9,55.9,32.9z\n" +
"	 M55.9,69.4c-7.4,0-13.3-6-13.3-13.3c-0.1-7.4,6-13.3,13.3-13.3s13.3,6,13.3,13.3C69.3,63.5,63.3,69.4,55.9,69.4z'></path><path fill='#FFFFFF' d='M79.7,26.8c-3,0-5.4,2.5-5.4,5.4s2.5,5.4,5.4,5.4c3,0,5.4-2.5,5.4-5.4S82.7,26.8,79.7,26.8z'></path><path fill='currentColor' d='M78.2,11H33.5C21,11,10.8,21.3,10.8,33.7v44.7c0,12.6,10.2,22.8,22.7,22.8h44.7c12.6,0,22.7-10.2,22.7-22.7\n" +
"	V33.7C100.8,21.1,90.6,11,78.2,11z M91,78.4c0,7.1-5.8,12.8-12.8,12.8H33.5c-7.1,0-12.8-5.8-12.8-12.8V33.7\n" +
"	c0-7.1,5.8-12.8,12.8-12.8h44.7c7.1,0,12.8,5.8,12.8,12.8V78.4z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='LinkedIn' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-7'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 512 512' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-ff0d'></use></svg><svg class='u-svg-content' viewBox='0 0 512 512' x='0px' y='0px' id='svg-ff0d' style='enable-background:new 0 0 512 512;'><g><g><rect y='160' width='114.496' height='352'></rect>\n" +
"</g>\n" +
"</g><g><g><path d='M426.368,164.128c-1.216-0.384-2.368-0.8-3.648-1.152c-1.536-0.352-3.072-0.64-4.64-0.896    c-6.08-1.216-12.736-2.08-20.544-2.08c-66.752,0-109.088,48.544-123.04,67.296V160H160v352h114.496V320    c0,0,86.528-120.512,123.04-32c0,79.008,0,224,0,224H512V274.464C512,221.28,475.552,176.96,426.368,164.128z'></path>\n" +
"</g>\n" +
"</g><g><g><circle cx='56' cy='56' r='56'></circle>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='Pinerest' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-8'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 511.977 511.977' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-a3cb'></use></svg><svg class='u-svg-content' viewBox='0 0 511.977 511.977' x='0px' y='0px' id='svg-a3cb' style='enable-background:new 0 0 511.977 511.977;'><g><g><path d='M262.948,0C122.628,0,48.004,89.92,48.004,187.968c0,45.472,25.408,102.176,66.08,120.16    c6.176,2.784,9.536,1.6,10.912-4.128c1.216-4.352,6.56-25.312,9.152-35.2c0.8-3.168,0.384-5.92-2.176-8.896    c-13.504-15.616-24.224-44.064-24.224-70.752c0-68.384,54.368-134.784,146.88-134.784c80,0,135.968,51.968,135.968,126.304    c0,84-44.448,142.112-102.208,142.112c-31.968,0-55.776-25.088-48.224-56.128c9.12-36.96,27.008-76.704,27.008-103.36    c0-23.904-13.504-43.68-41.088-43.68c-32.544,0-58.944,32.224-58.944,75.488c0,27.488,9.728,46.048,9.728,46.048    S144.676,371.2,138.692,395.488c-10.112,41.12,1.376,107.712,2.368,113.44c0.608,3.168,4.16,4.16,6.144,1.568    c3.168-4.16,42.08-59.68,52.992-99.808c3.968-14.624,20.256-73.92,20.256-73.92c10.72,19.36,41.664,35.584,74.624,35.584    c98.048,0,168.896-86.176,168.896-193.12C463.62,76.704,375.876,0,262.948,0z'></path>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-white u-layout-cell-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-valign-top u-container-layout-5'>\n" +
"                  <h2 class='u-text u-text-9'> For Vendor's :</h2>\n" +
"                  <p class='u-text u-text-10'> You can reach us anytime via <a href='gmail.com' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-black u-text-palette-3-base u-btn-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction='' rel='nofollow'>hi@swadeshi.com</a>\n" +
"                  </p>\n" +
"                  <div class='u-align-left u-expanded-width u-form u-form-1'>\n" +
"                    <form action='VendorRequest' method='post' class='u-clearfix u-form-spacing-28  u-inner-form' style='padding: 0px;' source='submit' name='form' id='vend'>\n" +
"                      <div class='u-form-group u-form-name u-label-top'>\n" +
"                        <label for='name-5a14' class='u-label'>Name</label>\n" +
"                        <input type='text' placeholder='Enter your Name' id='name-5a14' name='name' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-email u-form-group u-label-top'>\n" +
"                        <label for='email-5a14' class='u-label'>Email</label>\n" +
"                        <input type='email' placeholder='Enter a valid email address' id='email-5a14' name='email' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-phone u-label-top u-form-group-3'>\n" +
"                        <label for='phone-5e95' class='u-label'>Phone</label>\n" +
"                        <input type='tel'  placeholder='Enter your phone (e.g. +91-8155552675)' id='phone-5e95' name='phone' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"                        <label for='select-3fa2' class='u-label'>Category</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-3fb3' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                            <option value='Handmade'>Handmade</option>\n" +
"                            <option value='Paintings'>Paintings</option>\n" +
"                            <option value='Pottery'>Pottery</option>\n" +
"                            <option value='Jewellery'>Jewellery</option>\n" +
"                            <option value='Antiques'>Antiques</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"                        <label for='select-dc9a' class='u-label'>City</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                            <option value='Indore'>Indore</option>\n" +
"                            <option value='Bhopal'>Bhopal</option>\n" +
"                            <option value='Delhi'>Delhi</option>\n" +
"                            <option value='Mumbai'>Mumbai</option>\n" +
"                            <option value='Banglore'>Banglore</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>                      \n" +
"                      <div class='u-align-right u-form-group u-form-submit u-label-top'>\n" +
"                        <input type='submit' value='submit' class='u-active-palette-5-dark-3 u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-5-dark-3 u-palette-3-base u-radius-5 u-text-active-white u-text-body-alt-color u-text-hover-white u-btn-3' for='vend'>\n" +
"                      </div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    \n" +
"    \n" +
"    <footer class='u-align-center u-clearfix u-footer u-grey-80 u-footer' id='sec-2030'><div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <p class='u-small-text u-text u-text-variant u-text-1'>THANK YOU FOR VISITING</p>\n" +
"      </div></footer>\n" +
"  \n" +
"</body></html>");
            
            
            
            
 
        
        }
        
        
        
        
        
        
        
        //else starts
        
        else
        {
            
            
           out.println("<html style='font-size: 16px;' lang='en'><head>\n" +
"    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
"    <meta charset='utf-8'>\n" +
"    <meta name='keywords' content='​We create online shops, ​Everything you needto sell products online, ​Our way, 2019, 2020, 2021, 2022, ​Get Free Consultation, Building Beautiful, Functional eCommerce Websites, Get yours today, ​Our clients love the we build stores experience, ​Choose your paymonthly website plan, $ 29, $ 59, $ 119, ​When working with us, you’re in good company:, Get in Touch, ​Level up your brand'>\n" +
"    <meta name='description' content=''>\n" +
"    <title>Home</title>\n" +
"    <link rel='stylesheet' href='kruti.css' media='screen'>\n" +
"<link rel='stylesheet' href='Home.css' media='screen'>\n" +
"    <script class='u-script' type='text/javascript' src='hjquery.js' defer=''></script>\n" +
"    <script class='u-script' type='text/javascript' src='kruti.js' defer=''></script>\n" +
"    <meta name='generator' content='SWADESHI'>\n" +
"    <meta name='referrer' content='origin'>\n" +
"    <link id='u-theme-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i'>\n" +
"    <link id='u-page-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto+Slab:100,200,300,400,500,600,700,800,900|Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Merriweather:300,300i,400,400i,700,700i,900,900i'>\n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    <script type='application/ld+json'>{\n" +
"		'@context': 'http://schema.org',\n" +
"		'@type': 'Organization',\n" +
"		'name': '',\n" +
"		'logo': 'images/SwadeshiLogo4.png'\n" +
"}</script>\n" +
"    <meta name='theme-color' content='#f15048'>\n" +
"    <meta property='og:title' content='Home'>\n" +
"    <meta property='og:type' content='website'>\n" +
"  </head>\n" +
"  <body data-home-page='index.html' data-home-page-title='Home' class='u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode' data-lang='en'><header class='u-clearfix u-header u-sticky u-sticky-9b5c u-white u-header' id='sec-0bc2'><div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <a href='index.html' class='u-image u-logo u-image-1' data-image-width='2000' data-image-height='451' title='Home'>\n" +
"          <img src='images/SwadeshiLogo4.png' class='u-logo-image u-logo-image-1'>\n" +
"        </a>\n" +
"        <nav class='u-menu u-menu-one-level u-offcanvas u-menu-1'>\n" +
"          <div class='menu-collapse' style='font-size: 1rem; letter-spacing: 0px;'>\n" +
"            <a class='u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-black u-text-hover-palette-2-base' href='#'>\n" +
"              <svg class='u-svg-link' viewBox='0 0 24 24'><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#menu-hamburger'></use></svg>\n" +
"              <svg class='u-svg-content' version='1.1' id='menu-hamburger' viewBox='0 0 16 16' x='0px' y='0px' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns='http://www.w3.org/2000/svg'><g><rect y='1' width='16' height='2'></rect><rect y='7' width='16' height='2'></rect><rect y='13' width='16' height='2'></rect>\n" +
"</g></svg>\n" +
"            </a>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container'>\n" +
"            <ul class='u-nav u-spacing-30 u-unstyled u-nav-1'><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='About.html' rel='nofollow' style='padding: 6px 30px;'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>Contact Us</a>\n" +
"</li></ul>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container-collapse'>\n" +
"            <div class='u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav'>\n" +
"              <div class='u-inner-container-layout u-sidenav-overflow'>\n" +
"                <div class='u-menu-close'></div>\n" +
"                <ul class='u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2'><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='About.html' rel='nofollow'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>Contact Us</a>\n" +
"</li></ul>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-black u-menu-overlay u-opacity u-opacity-70'></div>\n" +
"          </div>\n" +
"        </nav>\n" +
"        <a href='Login.html' class='u-black u-border-2 u-border-hover-black u-btn u-button-style u-hover-white u-text-body-alt-color u-text-hover-black u-btn-1' rel='nofollow'>Login</a>\n" +
"        <img class='u-image u-image-contain u-image-default u-image-2' src='images/SwadeshiLogo3.png' alt='' data-image-width='1277' data-image-height='1275'>\n" +
"      </div><style class='u-sticky-style' data-style-id='9b5c'>.u-sticky-fixed.u-sticky-9b5c, .u-body.u-sticky-fixed .u-sticky-9b5c {\n" +
"box-shadow: 5px 5px 20px 0 rgba(0,0,0,0.4) !important\n" +
"}.u-sticky-fixed.u-sticky-9b5c:before, .u-body.u-sticky-fixed .u-sticky-9b5c:before {\n" +
"borders: top right bottom left !important\n" +
"}</style></header>\n" +
"    <section class='u-align-left u-clearfix u-image u-section-1' id='carousel_b9a0' data-image-width='3388' data-image-height='2000'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <p class='u-custom-font u-font-georgia u-text u-text-palette-2-dark-1 u-text-1' data-animation-name='' data-animation-duration='2000' data-animation-direction=''>Search Vendor</p>\n" +
"        <div class='u-border-2 u-border-palette-1-light-3 u-form u-palette-1-light-3 u-form-1'>\n" +
"            <form action='SearchVendor' method='post' class='u-clearfix u-form-spacing-15 u-inner-form' style='padding: 15px' source='submit' id='send'>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"              <label for='select-3fa2' class='u-label'>Category</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-3fa2' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                  <option value='Handmade'>Handmade</option>\n" +
"                  <option value='Paintings'>Paintings</option>\n" +
"                  <option value='Pottery'>Pottery</option>\n" +
"                  <option value='Jewellery'>Jewellery</option>\n" +
"                  <option value='Antiques'>Antiques</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"              <label for='select-dc8a' class='u-label'>City</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                  <option value='Indore'>Indore</option>\n" +
"                  <option value='Bhopal'>Bhopal</option>\n" +
"                  <option value='Delhi'>Delhi</option>\n" +
"                  <option value='Mumbai'>Mumbai</option>\n" +
"                  <option value='Banglore'>Banglore</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-submit u-label-top'>\n" +
"              <input type='submit' value='SUBMIT' class='u-border-none u-btn u-btn-submit u-button-style u-hover-custom-color-2 u-text-hover-black' for='send'>\n" +
"            </div>\n" +
"            <div class='u-form-send-message u-form-send-success'>Thank you! Your message has been sent.</div>\n" +
"            <div class='u-form-send-error u-form-send-message'>Unable to send your message. Please fix errors then try again.</div>\n" +
"            <input type='hidden' value='' name='recaptchaResponse'>\n" +
"            <input type='hidden' name='formServices' value='52122c4348a491264f7f6a71a37cb3f4'>\n");
                    
                    
                    
        out.println("<center><p ><h3><b><font color='black'>Email Or Contact Already Exists</font></h3></b></p></center>\n");
            
            
            
        out.println("          </form>\n" +
"        </div>" +
"      </div>\n" +
"    </section>\n" +
"    <section class='u-clearfix u-image u-valign-bottom-xl u-section-2' id='carousel_0d8f' data-image-width='1980' data-image-height='1429'>\n" +
"      <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-palette-1-base u-layout-wrap-1'>\n" +
"        <div class='u-layout' style=''>\n" +
"          <div class='u-layout-row' style=''>\n" +
"            <div class='u-container-style u-layout-cell u-right-cell u-size-60 u-layout-cell-1'>\n" +
"              <div class='u-container-layout u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-container-layout-1'>\n" +
"                <div data-interval='3000' data-u-ride='carousel' class='u-carousel u-carousel-fade u-expanded-width u-slider u-slider-1' id='carousel-55a5' data-pause='hover'>\n" +
"                  <ol class='u-absolute-hcenter u-carousel-indicators u-carousel-indicators-1'>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='0' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='1' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='2' style='width: 30px; height: 3px;'></li>\n" +
"                  </ol>\n" +
"                  <div class='u-carousel-inner' role='listbox'>\n" +
"                    <div class='u-active u-align-center u-carousel-item u-container-style u-image u-slide u-image-1' data-image-width='1024' data-image-height='576'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-2'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-1'>handpaint</p>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-2'>handcraft</p>\n" +
"                        <p class='u-custom-font u-font-roboto-slab u-text u-text-body-alt-color u-text-3'>The best handcrafted things are not always made by some brands its a talent of th​e Local person so promoting some of them by our plaform </p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-image u-shape-rectangle u-slide u-image-2' data-image-width='717' data-image-height='480'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-3'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-4'>jewellery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-expanded-width u-image u-slide u-image-3' data-image-width='685' data-image-height='550'>\n" +
"                      <div class='u-container-layout u-container-layout-4'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-5'>pottery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-prev u-spacing-5 u-text-body-alt-color u-carousel-control-1' href='#carousel-55a5' role='button' data-u-slide='prev'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-next u-spacing-5 u-text-body-alt-color u-carousel-control-2' href='#carousel-55a5' role='button' data-u-slide='next'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-image u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-section-3' id='sec-956c' data-image-width='2000' data-image-height='1333'>\n" +
"      <div class='u-align-center u-container-style u-expanded-width u-grey-15 u-group u-shape-rectangle u-group-1'>\n" +
"        <div class='u-container-layout u-container-layout-1'>\n" +
"          <h2 class='u-text u-text-1'> Everything you need<br><b>there is a vendor you find</b>\n" +
"          </h2>\n" +
"          <div class='u-layout-grid u-list u-list-1'>\n" +
"            <div class='u-repeater u-repeater-1'>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-1' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-1' src='images/Vendor10.jpg' alt='' data-image-width='1405' data-image-height='1405'>\n" +
"                  <h4 class='u-align-center u-text u-text-2'> Customize your online store</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-3'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-2' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-2' src='images/Vendor14.jpg' alt='' data-image-width='1474' data-image-height='1474'>\n" +
"                  <h4 class='u-align-center u-text u-text-4'> Run your ecommerce website</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-5'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-3' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-4'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-3' src='images/Vendor16.jpg' alt='' data-image-width='1479' data-image-height='1480'>\n" +
"                  <h4 class='u-align-center u-text u-text-6'> Grow your revenue</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-7'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-4' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-5'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-4' src='images/Vendor17.jpg' alt='' data-image-width='1399' data-image-height='1399'>\n" +
"                  <h4 class='u-align-center u-text u-text-8'>Team</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-9'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-4' id='carousel_3697'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h2 class='u-text u-text-default u-text-1'> Our Vision</h2>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-3-base u-radius-24 u-shape-round u-group-1' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-1'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-2'>2022</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-3'>Build a good UI/UX patform for our users.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-5-base u-radius-24 u-shape-round u-group-2' data-animation-name='flipIn' data-animation-duration='750' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-2'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-4'>2023</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-5'> Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-4-base u-radius-24 u-shape-round u-group-3' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-container-layout-3'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-6'>2024</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-7'> Podcasting operational change management inside of workflows to establish a framework. Expand this buisness as per our research. By&nbsp;<br>expanding our fields.<br>\n" +
"              <br>\n" +
"            </p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-grey-80 u-group u-hover-feature u-radius-24 u-shape-round u-group-4' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-4'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-8'>2025</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-9'>Keep promoting the art of india and add more vendor to promote locals</p>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-5' id='carousel_05dd'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <h2 class='u-custom-font u-font-georgia u-text u-text-1'> Our&nbsp; Vendors<b>&nbsp;<span style='font-weight: 400;'> Feedback<span style='font-weight: 700;'></span>\n" +
"            </span></b>\n" +
"        </h2>\n" +
"        <div class='u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-list-item u-palette-4-base u-repeater-item u-shape-round u-list-item-1'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-1'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-contain u-image-1' data-image-width='1515' data-image-height='1316'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-2'>Swati jaiswal</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-3'>Its a good platform to boost our business..</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-container-style u-custom-item u-list-item u-palette-5-base u-repeater-item u-shape-rectangle u-list-item-2'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-2' data-image-width='1474' data-image-height='1405'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-4'>Tejas singh</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-5'>You guys are really doing well by promoting locals</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-hover-feature u-list-item u-palette-3-base u-repeater-item u-shape-round u-list-item-3'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-3' data-image-width='1537' data-image-height='1503'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-6'>Arti khushwah</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-7'>After Lockdown the local business were affected badly so thanks for promote</p>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-palette-3-base u-section-6' id='carousel_b8e1'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h1 class='u-text u-text-1'>\n" +
"          <span style='font-weight: 700;'> &nbsp;AD Campaigns</span>\n" +
"        </h1>\n" +
"        <div class='u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-1'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-1' data-image-width='300' data-image-height='90' src='images/logo-amazon.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-2'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-2' data-image-width='300' data-image-height='90' src='images/1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-3'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-3' data-image-width='300' data-image-height='63' src='images/evga.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-4'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-4' data-image-width='300' data-image-height='39' src='images/tesla-9.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-5'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-5' data-image-width='300' data-image-height='54' src='images/sony-logo.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-6'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-6' data-image-width='300' data-image-height='65' src='images/crocs-wordmark.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-7'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-7' data-image-width='300' data-image-height='90' src='images/logo-amazon1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-8'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-8' data-image-width='300' data-image-height='87' src='images/asos-1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-clearfix u-grey-15 u-section-7' id='carousel_7b55'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1'>\n" +
"          <div class='u-layout'>\n" +
"            <div class='u-layout-row'>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-palette-5-dark-3 u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-layout-cell-1'>\n" +
"                <div class='u-container-layout u-valign-bottom-lg u-valign-bottom-md u-valign-bottom-sm u-valign-bottom-xl u-container-layout-1'>\n" +
"                  <h2 class='u-text u-text-default u-text-1'>Get in Touch</h2>\n" +
"                  <p class='u-text u-text-default u-text-2'>For any feedback or any suggestion contact us.<br>\n" +
"                  </p>\n" +
"                  <div class='u-list u-list-1'>\n" +
"                    <div class='u-repeater u-repeater-1'>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-2'><span class='u-file-icon u-icon u-text-white u-icon-1'><img src='images/646094-23388df3.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-3'>Chat with us</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-4'>Our friendly team is here to help.<br>dosomthingdesi.com\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-3'><span class='u-file-icon u-icon u-text-white u-icon-2'><img src='images/2838912-49358f0d.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-5'>Office</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-6'>Swadeshi Head Office Branch,<br>Apollo Tower , Indore<br>Pin Code : 452006&nbsp;\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-4'><span class='u-file-icon u-icon u-text-white u-icon-3'><img src='images/8066424-eec24b29.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-7'>Phone</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-8'> Mon-Fri from 8am to 5am<br>\n" +
"                            <a href='#' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-white u-text-palette-3-base u-btn-1' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>+91 982-632-8844</a>\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <div class='u-social-icons u-spacing-17 u-social-icons-1'>\n" +
"                    <a class='u-social-url' title='facebook' target='_blank' href='https://facebook.com/name'><span class='u-icon u-social-facebook u-social-icon u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-2e4f'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-2e4f'><path fill='currentColor' d='M75.5,28.8H65.4c-1.5,0-4,0.9-4,4.3v9.4h13.9l-1.5,15.8H61.4v45.1H42.8V58.3h-8.8V42.4h8.8V32.2\n" +
"c0-7.4,3.4-18.8,18.8-18.8h13.8v15.4H75.5z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='twitter' target='_blank' href='https://twitter.com/name'><span class='u-icon u-social-icon u-social-twitter u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-c508'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-c508'><path fill='currentColor' d='M92.2,38.2c0,0.8,0,1.6,0,2.3c0,24.3-18.6,52.4-52.6,52.4c-10.6,0.1-20.2-2.9-28.5-8.2\n" +
"	c1.4,0.2,2.9,0.2,4.4,0.2c8.7,0,16.7-2.9,23-7.9c-8.1-0.2-14.9-5.5-17.3-12.8c1.1,0.2,2.4,0.2,3.4,0.2c1.6,0,3.3-0.2,4.8-0.7\n" +
"	c-8.4-1.6-14.9-9.2-14.9-18c0-0.2,0-0.2,0-0.2c2.5,1.4,5.4,2.2,8.4,2.3c-5-3.3-8.3-8.9-8.3-15.4c0-3.4,1-6.5,2.5-9.2\n" +
"	c9.1,11.1,22.7,18.5,38,19.2c-0.2-1.4-0.4-2.8-0.4-4.3c0.1-10,8.3-18.2,18.5-18.2c5.4,0,10.1,2.2,13.5,5.7c4.3-0.8,8.1-2.3,11.7-4.5\n" +
"	c-1.4,4.3-4.3,7.9-8.1,10.1c3.7-0.4,7.3-1.4,10.6-2.9C98.9,32.3,95.7,35.5,92.2,38.2z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='instagram' target='_blank' href='https://instagram.com/name'><span class='u-icon u-social-icon u-social-instagram u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-9d85'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-9d85'><path fill='currentColor' d='M55.9,32.9c-12.8,0-23.2,10.4-23.2,23.2s10.4,23.2,23.2,23.2s23.2-10.4,23.2-23.2S68.7,32.9,55.9,32.9z\n" +
"	 M55.9,69.4c-7.4,0-13.3-6-13.3-13.3c-0.1-7.4,6-13.3,13.3-13.3s13.3,6,13.3,13.3C69.3,63.5,63.3,69.4,55.9,69.4z'></path><path fill='#FFFFFF' d='M79.7,26.8c-3,0-5.4,2.5-5.4,5.4s2.5,5.4,5.4,5.4c3,0,5.4-2.5,5.4-5.4S82.7,26.8,79.7,26.8z'></path><path fill='currentColor' d='M78.2,11H33.5C21,11,10.8,21.3,10.8,33.7v44.7c0,12.6,10.2,22.8,22.7,22.8h44.7c12.6,0,22.7-10.2,22.7-22.7\n" +
"	V33.7C100.8,21.1,90.6,11,78.2,11z M91,78.4c0,7.1-5.8,12.8-12.8,12.8H33.5c-7.1,0-12.8-5.8-12.8-12.8V33.7\n" +
"	c0-7.1,5.8-12.8,12.8-12.8h44.7c7.1,0,12.8,5.8,12.8,12.8V78.4z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='LinkedIn' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-7'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 512 512' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-ff0d'></use></svg><svg class='u-svg-content' viewBox='0 0 512 512' x='0px' y='0px' id='svg-ff0d' style='enable-background:new 0 0 512 512;'><g><g><rect y='160' width='114.496' height='352'></rect>\n" +
"</g>\n" +
"</g><g><g><path d='M426.368,164.128c-1.216-0.384-2.368-0.8-3.648-1.152c-1.536-0.352-3.072-0.64-4.64-0.896    c-6.08-1.216-12.736-2.08-20.544-2.08c-66.752,0-109.088,48.544-123.04,67.296V160H160v352h114.496V320    c0,0,86.528-120.512,123.04-32c0,79.008,0,224,0,224H512V274.464C512,221.28,475.552,176.96,426.368,164.128z'></path>\n" +
"</g>\n" +
"</g><g><g><circle cx='56' cy='56' r='56'></circle>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='Pinerest' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-8'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 511.977 511.977' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-a3cb'></use></svg><svg class='u-svg-content' viewBox='0 0 511.977 511.977' x='0px' y='0px' id='svg-a3cb' style='enable-background:new 0 0 511.977 511.977;'><g><g><path d='M262.948,0C122.628,0,48.004,89.92,48.004,187.968c0,45.472,25.408,102.176,66.08,120.16    c6.176,2.784,9.536,1.6,10.912-4.128c1.216-4.352,6.56-25.312,9.152-35.2c0.8-3.168,0.384-5.92-2.176-8.896    c-13.504-15.616-24.224-44.064-24.224-70.752c0-68.384,54.368-134.784,146.88-134.784c80,0,135.968,51.968,135.968,126.304    c0,84-44.448,142.112-102.208,142.112c-31.968,0-55.776-25.088-48.224-56.128c9.12-36.96,27.008-76.704,27.008-103.36    c0-23.904-13.504-43.68-41.088-43.68c-32.544,0-58.944,32.224-58.944,75.488c0,27.488,9.728,46.048,9.728,46.048    S144.676,371.2,138.692,395.488c-10.112,41.12,1.376,107.712,2.368,113.44c0.608,3.168,4.16,4.16,6.144,1.568    c3.168-4.16,42.08-59.68,52.992-99.808c3.968-14.624,20.256-73.92,20.256-73.92c10.72,19.36,41.664,35.584,74.624,35.584    c98.048,0,168.896-86.176,168.896-193.12C463.62,76.704,375.876,0,262.948,0z'></path>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-white u-layout-cell-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-valign-top u-container-layout-5'>\n" +
"                  <h2 class='u-text u-text-9'> For Vendor's :</h2>\n" +
"                  <p class='u-text u-text-10'> You can reach us anytime via <a href='gmail.com' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-black u-text-palette-3-base u-btn-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction='' rel='nofollow'>hi@swadeshi.com</a>\n" +
"                  </p>\n" +
"                  <div class='u-align-left u-expanded-width u-form u-form-1'>\n" +
"                    <form action='VendorRequest' method='post' class='u-clearfix u-form-spacing-28  u-inner-form' style='padding: 0px;' source='submit' name='form' id='vend'>\n" +
"                      <div class='u-form-group u-form-name u-label-top'>\n" +
"                        <label for='name-5a14' class='u-label'>Name</label>\n" +
"                        <input type='text' placeholder='Enter your Name' id='name-5a14' name='name' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-email u-form-group u-label-top'>\n" +
"                        <label for='email-5a14' class='u-label'>Email</label>\n" +
"                        <input type='email' placeholder='Enter a valid email address' id='email-5a14' name='email' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-phone u-label-top u-form-group-3'>\n" +
"                        <label for='phone-5e95' class='u-label'>Phone</label>\n" +
"                        <input type='tel'  placeholder='Enter your phone (e.g. +91-8155552675)' id='phone-5e95' name='phone' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"                        <label for='select-3fa2' class='u-label'>Category</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-3fb3' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                            <option value='Handmade'>Handmade</option>\n" +
"                            <option value='Paintings'>Paintings</option>\n" +
"                            <option value='Pottery'>Pottery</option>\n" +
"                            <option value='Jewellery'>Jewellery</option>\n" +
"                            <option value='Antiques'>Antiques</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"                        <label for='select-dc9a' class='u-label'>City</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                            <option value='Indore'>Indore</option>\n" +
"                            <option value='Bhopal'>Bhopal</option>\n" +
"                            <option value='Delhi'>Delhi</option>\n" +
"                            <option value='Mumbai'>Mumbai</option>\n" +
"                            <option value='Banglore'>Banglore</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>                      \n" +
"                      <div class='u-align-right u-form-group u-form-submit u-label-top'>\n" +
"                        <input type='submit' value='submit' class='u-active-palette-5-dark-3 u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-5-dark-3 u-palette-3-base u-radius-5 u-text-active-white u-text-body-alt-color u-text-hover-white u-btn-3' for='vend'>\n" +
"                      </div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    \n" +
"    \n" +
"    <footer class='u-align-center u-clearfix u-footer u-grey-80 u-footer' id='sec-2030'><div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <p class='u-small-text u-text u-text-variant u-text-1'>THANK YOU FOR VISITING</p>\n" +
"      </div></footer>\n" +
"  \n" +
"</body></html>");
            
            
            
            
            
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try 
        {
            processRequest(request, response);
        } 
        catch (ServletException|SQLException|IOException ex) 
        {
            try 
            {
                response.sendRedirect("Error.html");
            } 
            catch (IOException ex1) 
            {
                Logger.getLogger(VendorRequest.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try 
        {
            processRequest(request, response);
        }        
        catch (ServletException|IOException ex) 
        {
            try {
                response.sendRedirect("Error.html");
            } catch (IOException ex1) {
                Logger.getLogger(VendorRequest.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
        }
        
        
        
        
        
        
        catch(SQLException ex)
        {
          try
          {
            PrintWriter out=response.getWriter();
        
            out.println("<html style='font-size: 16px;' lang='en'><head>\n" +
"    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
"    <meta charset='utf-8'>\n" +
"    <meta name='keywords' content='​We create online shops, ​Everything you needto sell products online, ​Our way, 2019, 2020, 2021, 2022, ​Get Free Consultation, Building Beautiful, Functional eCommerce Websites, Get yours today, ​Our clients love the we build stores experience, ​Choose your paymonthly website plan, $ 29, $ 59, $ 119, ​When working with us, you’re in good company:, Get in Touch, ​Level up your brand'>\n" +
"    <meta name='description' content=''>\n" +
"    <title>Home</title>\n" +
"    <link rel='stylesheet' href='kruti.css' media='screen'>\n" +
"<link rel='stylesheet' href='Home.css' media='screen'>\n" +
"    <script class='u-script' type='text/javascript' src='hjquery.js' defer=''></script>\n" +
"    <script class='u-script' type='text/javascript' src='kruti.js' defer=''></script>\n" +
"    <meta name='generator' content='SWADESHI'>\n" +
"    <meta name='referrer' content='origin'>\n" +
"    <link id='u-theme-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i'>\n" +
"    <link id='u-page-google-font' rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto+Slab:100,200,300,400,500,600,700,800,900|Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Merriweather:300,300i,400,400i,700,700i,900,900i'>\n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    <script type='application/ld+json'>{\n" +
"		'@context': 'http://schema.org',\n" +
"		'@type': 'Organization',\n" +
"		'name': '',\n" +
"		'logo': 'images/SwadeshiLogo4.png'\n" +
"}</script>\n" +
"    <meta name='theme-color' content='#f15048'>\n" +
"    <meta property='og:title' content='Home'>\n" +
"    <meta property='og:type' content='website'>\n" +
"  </head>\n" +
"  <body data-home-page='index.html' data-home-page-title='Home' class='u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode' data-lang='en'><header class='u-clearfix u-header u-sticky u-sticky-9b5c u-white u-header' id='sec-0bc2'><div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <a href='index.html' class='u-image u-logo u-image-1' data-image-width='2000' data-image-height='451' title='Home'>\n" +
"          <img src='images/SwadeshiLogo4.png' class='u-logo-image u-logo-image-1'>\n" +
"        </a>\n" +
"        <nav class='u-menu u-menu-one-level u-offcanvas u-menu-1'>\n" +
"          <div class='menu-collapse' style='font-size: 1rem; letter-spacing: 0px;'>\n" +
"            <a class='u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-black u-text-hover-palette-2-base' href='#'>\n" +
"              <svg class='u-svg-link' viewBox='0 0 24 24'><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#menu-hamburger'></use></svg>\n" +
"              <svg class='u-svg-content' version='1.1' id='menu-hamburger' viewBox='0 0 16 16' x='0px' y='0px' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns='http://www.w3.org/2000/svg'><g><rect y='1' width='16' height='2'></rect><rect y='7' width='16' height='2'></rect><rect y='13' width='16' height='2'></rect>\n" +
"</g></svg>\n" +
"            </a>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container'>\n" +
"            <ul class='u-nav u-spacing-30 u-unstyled u-nav-1'><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='About.html' rel='nofollow' style='padding: 6px 30px;'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90' href='index.html#carousel_7b55' style='padding: 6px 30px;'>Contact Us</a>\n" +
"</li></ul>\n" +
"          </div>\n" +
"          <div class='u-custom-menu u-nav-container-collapse'>\n" +
"            <div class='u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav'>\n" +
"              <div class='u-inner-container-layout u-sidenav-overflow'>\n" +
"                <div class='u-menu-close'></div>\n" +
"                <ul class='u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2'><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>For Vendor</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='About.html' rel='nofollow'>About Us</a>\n" +
"</li><li class='u-nav-item'><a class='u-button-style u-nav-link' href='index.html#carousel_7b55'>Contact Us</a>\n" +
"</li></ul>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-black u-menu-overlay u-opacity u-opacity-70'></div>\n" +
"          </div>\n" +
"        </nav>\n" +
"        <a href='Login.html' class='u-black u-border-2 u-border-hover-black u-btn u-button-style u-hover-white u-text-body-alt-color u-text-hover-black u-btn-1' rel='nofollow'>Login</a>\n" +
"        <img class='u-image u-image-contain u-image-default u-image-2' src='images/SwadeshiLogo3.png' alt='' data-image-width='1277' data-image-height='1275'>\n" +
"      </div><style class='u-sticky-style' data-style-id='9b5c'>.u-sticky-fixed.u-sticky-9b5c, .u-body.u-sticky-fixed .u-sticky-9b5c {\n" +
"box-shadow: 5px 5px 20px 0 rgba(0,0,0,0.4) !important\n" +
"}.u-sticky-fixed.u-sticky-9b5c:before, .u-body.u-sticky-fixed .u-sticky-9b5c:before {\n" +
"borders: top right bottom left !important\n" +
"}</style></header>\n" +
"    <section class='u-align-left u-clearfix u-image u-section-1' id='carousel_b9a0' data-image-width='3388' data-image-height='2000'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <p class='u-custom-font u-font-georgia u-text u-text-palette-2-dark-1 u-text-1' data-animation-name='' data-animation-duration='2000' data-animation-direction=''>Search Vendor</p>\n" +
"        <div class='u-border-2 u-border-palette-1-light-3 u-form u-palette-1-light-3 u-form-1'>\n" +
"            <form action='SearchVendor' method='post' class='u-clearfix u-form-spacing-15 u-inner-form' style='padding: 15px' source='submit' id='send'>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"              <label for='select-3fa2' class='u-label'>Category</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-3fa2' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                  <option value='Handmade'>Handmade</option>\n" +
"                  <option value='Paintings'>Paintings</option>\n" +
"                  <option value='Pottery'>Pottery</option>\n" +
"                  <option value='Jewellery'>Jewellery</option>\n" +
"                  <option value='Antiques'>Antiques</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"              <label for='select-dc8a' class='u-label'>City</label>\n" +
"              <div class='u-form-select-wrapper'>\n" +
"                <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                  <option value='Indore'>Indore</option>\n" +
"                  <option value='Bhopal'>Bhopal</option>\n" +
"                  <option value='Delhi'>Delhi</option>\n" +
"                  <option value='Mumbai'>Mumbai</option>\n" +
"                  <option value='Banglore'>Banglore</option>\n" +
"                </select>\n" +
"                <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-form-group u-form-submit u-label-top'>\n" +
"              <input type='submit' value='SUBMIT' class='u-border-none u-btn u-btn-submit u-button-style u-hover-custom-color-2 u-text-hover-black' for='send'>\n" +
"            </div>\n" +
"            <div class='u-form-send-message u-form-send-success'>Thank you! Your message has been sent.</div>\n" +
"            <div class='u-form-send-error u-form-send-message'>Unable to send your message. Please fix errors then try again.</div>\n" +
"            <input type='hidden' value='' name='recaptchaResponse'>\n" +
"            <input type='hidden' name='formServices' value='52122c4348a491264f7f6a71a37cb3f4'>\n" +
"          </form>\n" +
"        </div>" );
                    
                    
                    
        out.println("<center><p class='u-custom-font  u-text u-text-palette-2-dark-1 u-text-1' ><h3><b><font color='red'>Entered Wrong Details</font></h3></b></p></center>\n");
            
            
            
        out.println("</div>\n" +
"    </section>\n" +
"    <section class='u-clearfix u-image u-valign-bottom-xl u-section-2' id='carousel_0d8f' data-image-width='1980' data-image-height='1429'>\n" +
"      <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-palette-1-base u-layout-wrap-1'>\n" +
"        <div class='u-layout' style=''>\n" +
"          <div class='u-layout-row' style=''>\n" +
"            <div class='u-container-style u-layout-cell u-right-cell u-size-60 u-layout-cell-1'>\n" +
"              <div class='u-container-layout u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-container-layout-1'>\n" +
"                <div data-interval='3000' data-u-ride='carousel' class='u-carousel u-carousel-fade u-expanded-width u-slider u-slider-1' id='carousel-55a5' data-pause='hover'>\n" +
"                  <ol class='u-absolute-hcenter u-carousel-indicators u-carousel-indicators-1'>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='0' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='1' style='width: 30px; height: 3px;'></li>\n" +
"                    <li data-u-target='#carousel-55a5' class='u-active-grey-10 u-grey-30 u-shape-rectangle' data-u-slide-to='2' style='width: 30px; height: 3px;'></li>\n" +
"                  </ol>\n" +
"                  <div class='u-carousel-inner' role='listbox'>\n" +
"                    <div class='u-active u-align-center u-carousel-item u-container-style u-image u-slide u-image-1' data-image-width='1024' data-image-height='576'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-2'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-1'>handpaint</p>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-2'>handcraft</p>\n" +
"                        <p class='u-custom-font u-font-roboto-slab u-text u-text-body-alt-color u-text-3'>The best handcrafted things are not always made by some brands its a talent of th​e Local person so promoting some of them by our plaform </p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-image u-shape-rectangle u-slide u-image-2' data-image-width='717' data-image-height='480'>\n" +
"                      <div class='u-container-layout u-valign-top u-container-layout-3'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-4'>jewellery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                    <div class='u-carousel-item u-container-style u-expanded-width u-image u-slide u-image-3' data-image-width='685' data-image-height='550'>\n" +
"                      <div class='u-container-layout u-container-layout-4'>\n" +
"                        <p class='u-custom-font u-font-georgia u-text u-text-body-alt-color u-text-5'>pottery</p>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-prev u-spacing-5 u-text-body-alt-color u-carousel-control-1' href='#carousel-55a5' role='button' data-u-slide='prev'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.847 451.847'><path d='M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n" +
"c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n" +
"c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                  <a class='u-absolute-vcenter u-carousel-control u-carousel-control-next u-spacing-5 u-text-body-alt-color u-carousel-control-2' href='#carousel-55a5' role='button' data-u-slide='next'>\n" +
"                    <span aria-hidden='true'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                    <span class='sr-only'>\n" +
"                      <svg viewBox='0 0 451.846 451.847'><path d='M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n" +
"L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n" +
"c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z'></path></svg>\n" +
"                    </span>\n" +
"                  </a>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-image u-valign-top-lg u-valign-top-md u-valign-top-sm u-valign-top-xs u-section-3' id='sec-956c' data-image-width='2000' data-image-height='1333'>\n" +
"      <div class='u-align-center u-container-style u-expanded-width u-grey-15 u-group u-shape-rectangle u-group-1'>\n" +
"        <div class='u-container-layout u-container-layout-1'>\n" +
"          <h2 class='u-text u-text-1'> Everything you need<br><b>there is a vendor you find</b>\n" +
"          </h2>\n" +
"          <div class='u-layout-grid u-list u-list-1'>\n" +
"            <div class='u-repeater u-repeater-1'>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-1' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-1' src='images/Vendor10.jpg' alt='' data-image-width='1405' data-image-height='1405'>\n" +
"                  <h4 class='u-align-center u-text u-text-2'> Customize your online store</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-3'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-2' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-2' src='images/Vendor14.jpg' alt='' data-image-width='1474' data-image-height='1474'>\n" +
"                  <h4 class='u-align-center u-text u-text-4'> Run your ecommerce website</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-5'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-3' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-4'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-3' src='images/Vendor16.jpg' alt='' data-image-width='1479' data-image-height='1480'>\n" +
"                  <h4 class='u-align-center u-text u-text-6'> Grow your revenue</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-7'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-container-style u-hover-feature u-list-item u-radius-30 u-repeater-item u-shape-round u-white u-list-item-4' data-animation-name='customAnimationIn' data-animation-duration='1250' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-similar-container u-container-layout-5'>\n" +
"                  <img class='u-border-1 u-border-black u-border-no-left u-border-no-right u-border-no-top u-expanded-width u-image u-image-contain u-image-round u-radius-10 u-image-4' src='images/Vendor17.jpg' alt='' data-image-width='1399' data-image-height='1399'>\n" +
"                  <h4 class='u-align-center u-text u-text-8'>Team</h4>\n" +
"                  <p class='u-align-center u-text u-text-grey-50 u-text-9'>Lorem ipsum dolor sit amet, consectetur adipiscing elit nullam nunc justo sagittis suscipit ultrices.</p>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-4' id='carousel_3697'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h2 class='u-text u-text-default u-text-1'> Our Vision</h2>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-3-base u-radius-24 u-shape-round u-group-1' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-1'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-2'>2022</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-3'>Build a good UI/UX patform for our users.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-5-base u-radius-24 u-shape-round u-group-2' data-animation-name='flipIn' data-animation-duration='750' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-2'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-4'>2023</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-5'> Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail.</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-group u-hover-feature u-palette-4-base u-radius-24 u-shape-round u-group-3' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-container-layout-3'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-6'>2024</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-7'> Podcasting operational change management inside of workflows to establish a framework. Expand this buisness as per our research. By&nbsp;<br>expanding our fields.<br>\n" +
"              <br>\n" +
"            </p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class='u-align-center u-container-style u-expanded-width-xs u-grey-80 u-group u-hover-feature u-radius-24 u-shape-round u-group-4' data-animation-name='flipIn' data-animation-duration='750' data-animation-delay='0' data-animation-direction='X'>\n" +
"          <div class='u-container-layout u-valign-middle u-container-layout-4'>\n" +
"            <h2 class='u-custom-font u-font-montserrat u-text u-text-default u-text-8'>2025</h2>\n" +
"            <p class='u-custom-font u-font-merriweather u-text u-text-default u-text-9'>Keep promoting the art of india and add more vendor to promote locals</p>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-section-5' id='carousel_05dd'>\n" +
"      <div class='u-clearfix u-sheet u-sheet-1'>\n" +
"        <h2 class='u-custom-font u-font-georgia u-text u-text-1'> Our&nbsp; Vendors<b>&nbsp;<span style='font-weight: 400;'> Feedback<span style='font-weight: 700;'></span>\n" +
"            </span></b>\n" +
"        </h2>\n" +
"        <div class='u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-list-item u-palette-4-base u-repeater-item u-shape-round u-list-item-1'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-1'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-contain u-image-1' data-image-width='1515' data-image-height='1316'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-2'>Swati jaiswal</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-3'>Its a good platform to boost our business..</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-container-style u-custom-item u-list-item u-palette-5-base u-repeater-item u-shape-rectangle u-list-item-2'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-2'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-2' data-image-width='1474' data-image-height='1405'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-4'>Tejas singh</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-5'>You guys are really doing well by promoting locals</p>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center u-bottom-left-radius-20 u-bottom-right-radius-20 u-container-style u-custom-item u-hover-feature u-list-item u-palette-3-base u-repeater-item u-shape-round u-list-item-3'>\n" +
"              <div class='u-container-layout u-similar-container u-container-layout-3'>\n" +
"                <div alt='' class='u-border-20 u-border-white u-image u-image-circle u-image-3' data-image-width='1537' data-image-height='1503'></div>\n" +
"                <h6 class='u-hover-feature u-text u-text-body-color u-text-default u-text-6'>Arti khushwah</h6>\n" +
"                <p class='u-hover-feature u-text u-text-white u-text-7'>After Lockdown the local business were affected badly so thanks for promote</p>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-align-center u-clearfix u-palette-3-base u-section-6' id='carousel_b8e1'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1'>\n" +
"        <h1 class='u-text u-text-1'>\n" +
"          <span style='font-weight: 700;'> &nbsp;AD Campaigns</span>\n" +
"        </h1>\n" +
"        <div class='u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-list u-list-1'>\n" +
"          <div class='u-repeater u-repeater-1'>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-1'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-1' data-image-width='300' data-image-height='90' src='images/logo-amazon.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-2'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-2' data-image-width='300' data-image-height='90' src='images/1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-3'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-3' data-image-width='300' data-image-height='63' src='images/evga.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-4'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-4' data-image-width='300' data-image-height='39' src='images/tesla-9.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-5'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-5' data-image-width='300' data-image-height='54' src='images/sony-logo.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-6'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-6' data-image-width='300' data-image-height='65' src='images/crocs-wordmark.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-7'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-7' data-image-width='300' data-image-height='90' src='images/logo-amazon1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"            <div class='u-align-center-md u-align-center-sm u-align-center-xs u-container-style u-list-item u-repeater-item'>\n" +
"              <div class='u-container-layout u-similar-container u-valign-middle u-container-layout-8'>\n" +
"                <img alt='' class='u-expanded-width-lg u-expanded-width-xl u-hover-feature u-image u-image-contain u-image-round u-image-8' data-image-width='300' data-image-height='87' src='images/asos-1.svg'>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"      \n" +
"    </section>\n" +
"    <section class='u-clearfix u-grey-15 u-section-7' id='carousel_7b55'>\n" +
"      <div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <div class='u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1'>\n" +
"          <div class='u-layout'>\n" +
"            <div class='u-layout-row'>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-palette-5-dark-3 u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-layout-cell-1'>\n" +
"                <div class='u-container-layout u-valign-bottom-lg u-valign-bottom-md u-valign-bottom-sm u-valign-bottom-xl u-container-layout-1'>\n" +
"                  <h2 class='u-text u-text-default u-text-1'>Get in Touch</h2>\n" +
"                  <p class='u-text u-text-default u-text-2'>For any feedback or any suggestion contact us.<br>\n" +
"                  </p>\n" +
"                  <div class='u-list u-list-1'>\n" +
"                    <div class='u-repeater u-repeater-1'>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-2'><span class='u-file-icon u-icon u-text-white u-icon-1'><img src='images/646094-23388df3.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-3'>Chat with us</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-4'>Our friendly team is here to help.<br>dosomthingdesi.com\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-3'><span class='u-file-icon u-icon u-text-white u-icon-2'><img src='images/2838912-49358f0d.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-5'>Office</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-6'>Swadeshi Head Office Branch,<br>Apollo Tower , Indore<br>Pin Code : 452006&nbsp;\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                      <div class='u-container-style u-list-item u-repeater-item u-shape-rectangle'>\n" +
"                        <div class='u-container-layout u-similar-container u-valign-top-xl u-container-layout-4'><span class='u-file-icon u-icon u-text-white u-icon-3'><img src='images/8066424-eec24b29.png' alt=''></span>\n" +
"                          <h5 class='u-text u-text-7'>Phone</h5>\n" +
"                          <p class='u-text u-text-grey-10 u-text-8'> Mon-Fri from 8am to 5am<br>\n" +
"                            <a href='#' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-white u-text-palette-3-base u-btn-1' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>+91 982-632-8844</a>\n" +
"                          </p>\n" +
"                        </div>\n" +
"                      </div>\n" +
"                    </div>\n" +
"                  </div>\n" +
"                  <div class='u-social-icons u-spacing-17 u-social-icons-1'>\n" +
"                    <a class='u-social-url' title='facebook' target='_blank' href='https://facebook.com/name'><span class='u-icon u-social-facebook u-social-icon u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-2e4f'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-2e4f'><path fill='currentColor' d='M75.5,28.8H65.4c-1.5,0-4,0.9-4,4.3v9.4h13.9l-1.5,15.8H61.4v45.1H42.8V58.3h-8.8V42.4h8.8V32.2\n" +
"c0-7.4,3.4-18.8,18.8-18.8h13.8v15.4H75.5z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='twitter' target='_blank' href='https://twitter.com/name'><span class='u-icon u-social-icon u-social-twitter u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-c508'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-c508'><path fill='currentColor' d='M92.2,38.2c0,0.8,0,1.6,0,2.3c0,24.3-18.6,52.4-52.6,52.4c-10.6,0.1-20.2-2.9-28.5-8.2\n" +
"	c1.4,0.2,2.9,0.2,4.4,0.2c8.7,0,16.7-2.9,23-7.9c-8.1-0.2-14.9-5.5-17.3-12.8c1.1,0.2,2.4,0.2,3.4,0.2c1.6,0,3.3-0.2,4.8-0.7\n" +
"	c-8.4-1.6-14.9-9.2-14.9-18c0-0.2,0-0.2,0-0.2c2.5,1.4,5.4,2.2,8.4,2.3c-5-3.3-8.3-8.9-8.3-15.4c0-3.4,1-6.5,2.5-9.2\n" +
"	c9.1,11.1,22.7,18.5,38,19.2c-0.2-1.4-0.4-2.8-0.4-4.3c0.1-10,8.3-18.2,18.5-18.2c5.4,0,10.1,2.2,13.5,5.7c4.3-0.8,8.1-2.3,11.7-4.5\n" +
"	c-1.4,4.3-4.3,7.9-8.1,10.1c3.7-0.4,7.3-1.4,10.6-2.9C98.9,32.3,95.7,35.5,92.2,38.2z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' title='instagram' target='_blank' href='https://instagram.com/name'><span class='u-icon u-social-icon u-social-instagram u-text-white'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 112 112' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-9d85'></use></svg><svg class='u-svg-content' viewBox='0 0 112 112' x='0' y='0' id='svg-9d85'><path fill='currentColor' d='M55.9,32.9c-12.8,0-23.2,10.4-23.2,23.2s10.4,23.2,23.2,23.2s23.2-10.4,23.2-23.2S68.7,32.9,55.9,32.9z\n" +
"	 M55.9,69.4c-7.4,0-13.3-6-13.3-13.3c-0.1-7.4,6-13.3,13.3-13.3s13.3,6,13.3,13.3C69.3,63.5,63.3,69.4,55.9,69.4z'></path><path fill='#FFFFFF' d='M79.7,26.8c-3,0-5.4,2.5-5.4,5.4s2.5,5.4,5.4,5.4c3,0,5.4-2.5,5.4-5.4S82.7,26.8,79.7,26.8z'></path><path fill='currentColor' d='M78.2,11H33.5C21,11,10.8,21.3,10.8,33.7v44.7c0,12.6,10.2,22.8,22.7,22.8h44.7c12.6,0,22.7-10.2,22.7-22.7\n" +
"	V33.7C100.8,21.1,90.6,11,78.2,11z M91,78.4c0,7.1-5.8,12.8-12.8,12.8H33.5c-7.1,0-12.8-5.8-12.8-12.8V33.7\n" +
"	c0-7.1,5.8-12.8,12.8-12.8h44.7c7.1,0,12.8,5.8,12.8,12.8V78.4z'></path></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='LinkedIn' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-7'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 512 512' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-ff0d'></use></svg><svg class='u-svg-content' viewBox='0 0 512 512' x='0px' y='0px' id='svg-ff0d' style='enable-background:new 0 0 512 512;'><g><g><rect y='160' width='114.496' height='352'></rect>\n" +
"</g>\n" +
"</g><g><g><path d='M426.368,164.128c-1.216-0.384-2.368-0.8-3.648-1.152c-1.536-0.352-3.072-0.64-4.64-0.896    c-6.08-1.216-12.736-2.08-20.544-2.08c-66.752,0-109.088,48.544-123.04,67.296V160H160v352h114.496V320    c0,0,86.528-120.512,123.04-32c0,79.008,0,224,0,224H512V274.464C512,221.28,475.552,176.96,426.368,164.128z'></path>\n" +
"</g>\n" +
"</g><g><g><circle cx='56' cy='56' r='56'></circle>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                    <a class='u-social-url' target='_blank' data-type='Custom' title='Pinerest' href=''><span class='u-icon u-social-custom u-social-icon u-text-white u-icon-8'><svg class='u-svg-link' preserveAspectRatio='xMidYMin slice' viewBox='0 0 511.977 511.977' style=''><use xmlns:xlink='http://www.w3.org/1999/xlink' xlink:href='#svg-a3cb'></use></svg><svg class='u-svg-content' viewBox='0 0 511.977 511.977' x='0px' y='0px' id='svg-a3cb' style='enable-background:new 0 0 511.977 511.977;'><g><g><path d='M262.948,0C122.628,0,48.004,89.92,48.004,187.968c0,45.472,25.408,102.176,66.08,120.16    c6.176,2.784,9.536,1.6,10.912-4.128c1.216-4.352,6.56-25.312,9.152-35.2c0.8-3.168,0.384-5.92-2.176-8.896    c-13.504-15.616-24.224-44.064-24.224-70.752c0-68.384,54.368-134.784,146.88-134.784c80,0,135.968,51.968,135.968,126.304    c0,84-44.448,142.112-102.208,142.112c-31.968,0-55.776-25.088-48.224-56.128c9.12-36.96,27.008-76.704,27.008-103.36    c0-23.904-13.504-43.68-41.088-43.68c-32.544,0-58.944,32.224-58.944,75.488c0,27.488,9.728,46.048,9.728,46.048    S144.676,371.2,138.692,395.488c-10.112,41.12,1.376,107.712,2.368,113.44c0.608,3.168,4.16,4.16,6.144,1.568    c3.168-4.16,42.08-59.68,52.992-99.808c3.968-14.624,20.256-73.92,20.256-73.92c10.72,19.36,41.664,35.584,74.624,35.584    c98.048,0,168.896-86.176,168.896-193.12C463.62,76.704,375.876,0,262.948,0z'></path>\n" +
"</g>\n" +
"</g></svg></span>\n" +
"                    </a>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class='u-align-left u-container-style u-layout-cell u-size-30-lg u-size-30-xl u-size-60-md u-size-60-sm u-size-60-xs u-white u-layout-cell-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction=''>\n" +
"                <div class='u-container-layout u-valign-top u-container-layout-5'>\n" +
"                  <h2 class='u-text u-text-9'> For Vendor's :</h2>\n" +
"                  <p class='u-text u-text-10'> You can reach us anytime via <a href='gmail.com' class='u-active-none u-border-1 u-border-active-white u-border-hover-white u-border-no-left u-border-no-right u-border-no-top u-border-palette-3-base u-btn u-button-link u-button-style u-hover-none u-none u-text-active-white u-text-hover-black u-text-palette-3-base u-btn-2' data-animation-name='' data-animation-duration='0' data-animation-delay='0' data-animation-direction='' rel='nofollow'>hi@swadeshi.com</a>\n" +
"                  </p>\n" +
"                  <div class='u-align-left u-expanded-width u-form u-form-1'>\n" +
"                    <form action='VendorRequest' method='post' class='u-clearfix u-form-spacing-28  u-inner-form' style='padding: 0px;' source='submit' name='form' id='vend'>\n" +
"                      <div class='u-form-group u-form-name u-label-top'>\n" +
"                        <label for='name-5a14' class='u-label'>Name</label>\n" +
"                        <input type='text' placeholder='Enter your Name' id='name-5a14' name='name' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-email u-form-group u-label-top'>\n" +
"                        <label for='email-5a14' class='u-label'>Email</label>\n" +
"                        <input type='email' placeholder='Enter a valid email address' id='email-5a14' name='email' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-phone u-label-top u-form-group-3'>\n" +
"                        <label for='phone-5e95' class='u-label'>Phone</label>\n" +
"                        <input type='tel'  placeholder='Enter your phone (e.g. +91-8155552675)' id='phone-5e95' name='phone' class='u-border-1 u-border-grey-10 u-grey-5 u-input u-input-rectangle u-radius-5' required=''>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-1'>\n" +
"                        <label for='select-3fa2' class='u-label'>Category</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-3fb3' name='category' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-1' required='required' autofocus='autofocus'>\n" +
"                            <option value='Handmade'>Handmade</option>\n" +
"                            <option value='Paintings'>Paintings</option>\n" +
"                            <option value='Pottery'>Pottery</option>\n" +
"                            <option value='Jewellery'>Jewellery</option>\n" +
"                            <option value='Antiques'>Antiques</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>\n" +
"                      <div class='u-form-group u-form-select u-label-top u-form-group-2'>\n" +
"                        <label for='select-dc9a' class='u-label'>City</label>\n" +
"                        <div class='u-form-select-wrapper'>\n" +
"                          <select id='select-dc8a' name='city' class='u-border-1 u-border-grey-30 u-input u-input-rectangle u-white u-input-2' required='required' autofocus='autofocus'>\n" +
"                            <option value='Indore'>Indore</option>\n" +
"                            <option value='Bhopal'>Bhopal</option>\n" +
"                            <option value='Delhi'>Delhi</option>\n" +
"                            <option value='Mumbai'>Mumbai</option>\n" +
"                            <option value='Banglore'>Banglore</option>\n" +
"                          </select>\n" +
"                          <svg class='u-caret u-caret-svg' version='1.1' id='Layer_1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='16px' height='16px' viewBox='0 0 16 16' style='fill:currentColor;' xml:space='preserve'><polygon class='st0' points='8,12 2,4 14,4 '></polygon></svg>\n" +
"                        </div>\n" +
"                      </div><br>                      \n" +
"                      <div class='u-align-right u-form-group u-form-submit u-label-top'>\n" +
"                        <input type='submit' value='submit' class='u-active-palette-5-dark-3 u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-5-dark-3 u-palette-3-base u-radius-5 u-text-active-white u-text-body-alt-color u-text-hover-white u-btn-3' for='vend'>\n" +
"                      </div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    \n" +
"    \n" +
"    <footer class='u-align-center u-clearfix u-footer u-grey-80 u-footer' id='sec-2030'><div class='u-clearfix u-sheet u-valign-middle u-sheet-1'>\n" +
"        <p class='u-small-text u-text u-text-variant u-text-1'>THANK YOU FOR VISITING</p>\n" +
"      </div></footer>\n" +
"  \n" +
"</body></html>");
          }
          catch(IOException ex1)
          {
              Logger.getLogger(VendorRequest.class.getName()).log(Level.SEVERE, null, ex1);
          }
        
            
        }
    }


    
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }

}
