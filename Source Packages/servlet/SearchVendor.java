package servlet;

import dao.VendorDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vendor;


public class SearchVendor extends HttpServlet 
{


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException 
    {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            VendorDao vd=new VendorDao();
            List<Vendor> VC;
            String cate,city;
            cate=request.getParameter("category");
            city=request.getParameter("city");
            VC=vd.searchVendor(cate, city);
            Iterator<Vendor> i=VC.iterator();
            if(i.hasNext())
            {
                
                
                
                out.println("<html style=\"font-size: 16px;\" lang=\"en\"><head>\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <meta name=\"keywords\" content=\"\">\n" +
                        "    <meta name=\"description\" content=\"\">\n" +
                        "    <title>Search Vendor</title>\n" +
                        "    <link rel=\"stylesheet\" href=\"kruti.css\" media=\"screen\">\n" +
                        "<link rel=\"stylesheet\" href=\"Search.css\" media=\"screen\">\n" +
                        "    <script class=\"u-script\" type=\"text/javascript\" src=\"hjquery.js\" defer=\"\"></script>\n" +
                        "    <script class=\"u-script\" type=\"text/javascript\" src=\"kruti.js\" defer=\"\"></script>\n" +
                        "    <meta name=\"generator\" content=\"SADESHI\">\n" +
                        "    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i\">\n" +
                        "    \n" +
                        "    \n" +
                        "    <script type=\"application/ld+json\">{\n" +
                        "		\"@context\": \"http://schema.org\",\n" +
                        "		\"@type\": \"Organization\",\n" +
                        "		\"name\": \"\",\n" +
                        "		\"logo\": \"images/SwadeshiLogo4.png\"\n" +
                        "}</script>\n" +
                        "    <meta name=\"theme-color\" content=\"#f15048\">\n" +
                        "    <meta property=\"og:title\" content=\"Search\">\n" +
                        "    <meta property=\"og:type\" content=\"website\">\n" +
                        "  </head>\n" +
                        "  <body class=\"u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode\" data-lang=\"en\"><header class=\"u-clearfix u-header u-sticky u-sticky-9b5c u-white u-header\" id=\"sec-0bc2\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n" +
                        "        <a href=\"index.html\" class=\"u-image u-logo u-image-1\" data-image-width=\"2000\" data-image-height=\"451\" title=\"Home\">\n" +
                        "          <img src=\"images/SwadeshiLogo4.png\" class=\"u-logo-image u-logo-image-1\">\n" +
                        "        </a>\n" +
                        "        <nav class=\"u-menu u-menu-one-level u-offcanvas u-menu-1\">\n" +
                        "          <div class=\"menu-collapse\" style=\"font-size: 1rem; letter-spacing: 0px;\">\n" +
                        "            <a class=\"u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-black u-text-hover-palette-2-base\" href=\"#\">\n" +
                        "              <svg class=\"u-svg-link\" viewBox=\"0 0 24 24\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#menu-hamburger\"></use></svg>\n" +
                        "              <svg class=\"u-svg-content\" version=\"1.1\" id=\"menu-hamburger\" viewBox=\"0 0 16 16\" x=\"0px\" y=\"0px\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\"><g><rect y=\"1\" width=\"16\" height=\"2\"></rect><rect y=\"7\" width=\"16\" height=\"2\"></rect><rect y=\"13\" width=\"16\" height=\"2\"></rect>\n" +
                        "</g></svg>\n" +
                        "            </a>\n" +
                        "          </div>\n" +
                        "          <div class=\"u-custom-menu u-nav-container\">\n" +
                        "            <ul class=\"u-nav u-spacing-30 u-unstyled u-nav-1\"><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"index.html#carousel_7b55\" style=\"padding: 6px 30px;\">For Vendor</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"About.html\" rel=\"nofollow\" style=\"padding: 6px 30px;\">About Us</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"index.html#carousel_7b55\" style=\"padding: 6px 30px;\">Contact Us</a>\n" +
                        "</li></ul>\n" +
                        "          </div>\n" +
                        "          <div class=\"u-custom-menu u-nav-container-collapse\">\n" +
                        "            <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\n" +
                        "              <div class=\"u-inner-container-layout u-sidenav-overflow\">\n" +
                        "                <div class=\"u-menu-close\"></div>\n" +
                        "                <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"index.html#carousel_7b55\">For Vendor</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"About.html\" rel=\"nofollow\">About Us</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"index.html#carousel_7b55\">Contact Us</a>\n" +
                        "</li></ul>\n" +
                        "              </div>\n" +
                        "            </div>\n" +
                        "            <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\n" +
                        "          </div>\n" +
                        "        </nav>\n" +
                        "        <a href=\"Login.html\" class=\"u-black u-border-2 u-border-hover-black u-btn u-button-style u-hover-white u-text-body-alt-color u-text-hover-black u-btn-1\" rel=\"nofollow\">Login</a>\n" +
                        "        <img class=\"u-image u-image-contain u-image-default u-image-2\" src=\"images/SwadeshiLogo3.png\" alt=\"\" data-image-width=\"1277\" data-image-height=\"1275\">\n" +
                        "      </div><style class=\"u-sticky-style\" data-style-id=\"9b5c\">.u-sticky-fixed.u-sticky-9b5c, .u-body.u-sticky-fixed .u-sticky-9b5c {\n" +
                        "box-shadow: 5px 5px 20px 0 rgba(0,0,0,0.4) !important\n" +
                        "}.u-sticky-fixed.u-sticky-9b5c:before, .u-body.u-sticky-fixed .u-sticky-9b5c:before {\n" +
                        "borders: top right bottom left !important\n" +
                        "}</style></header>\n" +
                        "    <section class=\"u-clearfix u-palette-1-light-3 u-section-1\" id=\"sec-8fb6\">\n" +
                        "      <div class=\"u-clearfix u-sheet u-sheet-1\">\n" +
                        "        <img class=\"u-border-2 u-border-palette-1-light-3 u-hover-feature u-image u-image-round u-radius-42 u-image-1\" src=\"images/Innovative.jpg\" alt=\"\" data-image-width=\"3000\" data-image-height=\"2000\" data-animation-name=\"customAnimationIn\" data-animation-duration=\"1750\">\n" +
                        "        <div class=\"u-expanded-width u-tab-links-align-left u-tabs u-tabs-1\">\n" +
                        "          <ul class=\"u-border-2 u-border-palette-1-base u-spacing-10 u-tab-list u-unstyled\" role=\"tablist\">\n" +
                        "            <li class=\"u-tab-item\" role=\"presentation\">\n" +
                        "              <a class=\"active u-active-palette-1-base u-button-style u-grey-10 u-tab-link u-text-active-white u-text-black u-tab-link-1\" id=\"link-tab-0da5\" href=\"#tab-0da5\" role=\"tab\" aria-controls=\"tab-0da5\" aria-selected=\"true\">VENDOR'S</a>\n" +
                        "            </li>\n" +
                        "          </ul>\n" +
                        "          <div class=\"u-tab-content\">\n" +
                        "            <div class=\"u-container-style u-palette-4-light-3 u-tab-active u-tab-pane u-tab-pane-1\" id=\"tab-0da5\" role=\"tabpanel\" aria-labelledby=\"link-tab-0da5\">\n" +
                        "              <div class=\"u-container-layout u-container-layout-1\">\n" +
                        "                <div class=\"u-expanded-width u-table u-table-responsive u-table-1\">\n" +
                        "                  <table class=\"u-table-entity\">\n" +
                        "                    <colgroup>\n" +
                        "                      <col width=\"21%\">\n" +
                        "                      <col width=\"19%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                    </colgroup>\n" +
                        "                    <thead class=\"u-align-center u-custom-font u-font-merriweather u-table-header u-white u-table-header-1\">\n" +
                        "                      <tr style=\"height: 49px;\">\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-1\">Name<span style=\"font-weight: 700;\"></span>\n" +
                        "                        </th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-2\">CAtegory</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-3\">city</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-4\">contact</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-5\">email</th>\n" +
                        "                      </tr>\n" +
                        "                    </thead>\n" +
                        "                    <tbody class=\"u-custom-font u-palette-4-light-3 u-table-body u-text-font u-table-body-1\">");
                
                
                
                
                //Here Is The Output
                for(Vendor S:VC)
                {
                    
                    out.println("<tr style=\"height: 26px;\">\n" +
                            "                        <td class=\"u-border-5 u-border-white u-table-cell\">"+S.getName()+"</td>\n" +
                            "                        <td class=\"u-border-5 u-border-white u-table-cell\">"+S.getCategory()+"</td>\n" +
                            "                        <td class=\"u-border-5 u-border-white u-table-cell\">"+S.getCity()+"</td>\n" +
                            "                        <td class=\"u-border-5 u-border-white u-table-cell\">"+((long)S.getPhone())+"</td>\n" +
                            "                        <td class=\"u-border-5 u-border-white u-table-cell\">"+S.getEmail()+"</td>\n" +
                            "                      </tr>");
                    
                }
                
                
                
                
                out.println("</tbody>\n" +
                        "                  </table>\n" +
                        "                </div>\n" +
                        "              </div>\n" +
                        "            </div>\n" +
                        "          </div>\n" +
                        "        </div>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "    </section>\n" +
                        "    \n" +
                        "    \n" +
                        "    <footer class=\"u-align-center u-clearfix u-footer u-grey-80 u-footer\" id=\"sec-2030\"><div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\n" +
                        "        <p class=\"u-small-text u-text u-text-variant u-text-1\">THANKYOU FOR VISITING</p>\n" +
                        "      </div></footer>  \n" +
                        "</body></html>");
                
                
                
            }
            
            
            
         
            
            
            
            else
            {                                                                               
                
                
                
                
                out.println("<html style=\"font-size: 16px;\" lang=\"en\"><head>\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <meta name=\"keywords\" content=\"\">\n" +
                        "    <meta name=\"description\" content=\"\">\n" +
                        "    <title>Search Vendor</title>\n" +
                        "    <link rel=\"stylesheet\" href=\"kruti.css\" media=\"screen\">\n" +
                        "<link rel=\"stylesheet\" href=\"Search.css\" media=\"screen\">\n" +
                        "    <script class=\"u-script\" type=\"text/javascript\" src=\"hjquery.js\" defer=\"\"></script>\n" +
                        "    <script class=\"u-script\" type=\"text/javascript\" src=\"kruti.js\" defer=\"\"></script>\n" +
                        "    <meta name=\"generator\" content=\"SADESHI\">\n" +
                        "    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i\">\n" +
                        "    \n" +
                        "    \n" +
                        "    <script type=\"application/ld+json\">{\n" +
                        "		\"@context\": \"http://schema.org\",\n" +
                        "		\"@type\": \"Organization\",\n" +
                        "		\"name\": \"\",\n" +
                        "		\"logo\": \"images/SwadeshiLogo4.png\"\n" +
                        "}</script>\n" +
                        "    <meta name=\"theme-color\" content=\"#f15048\">\n" +
                        "    <meta property=\"og:title\" content=\"Search\">\n" +
                        "    <meta property=\"og:type\" content=\"website\">\n" +
                        "  </head>\n" +
                        "  <body class=\"u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode\" data-lang=\"en\"><header class=\"u-clearfix u-header u-sticky u-sticky-9b5c u-white u-header\" id=\"sec-0bc2\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n" +
                        "        <a href=\"index.html\" class=\"u-image u-logo u-image-1\" data-image-width=\"2000\" data-image-height=\"451\" title=\"Home\">\n" +
                        "          <img src=\"images/SwadeshiLogo4.png\" class=\"u-logo-image u-logo-image-1\">\n" +
                        "        </a>\n" +
                        "        <nav class=\"u-menu u-menu-one-level u-offcanvas u-menu-1\">\n" +
                        "          <div class=\"menu-collapse\" style=\"font-size: 1rem; letter-spacing: 0px;\">\n" +
                        "            <a class=\"u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-black u-text-hover-palette-2-base\" href=\"#\">\n" +
                        "              <svg class=\"u-svg-link\" viewBox=\"0 0 24 24\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#menu-hamburger\"></use></svg>\n" +
                        "              <svg class=\"u-svg-content\" version=\"1.1\" id=\"menu-hamburger\" viewBox=\"0 0 16 16\" x=\"0px\" y=\"0px\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\"><g><rect y=\"1\" width=\"16\" height=\"2\"></rect><rect y=\"7\" width=\"16\" height=\"2\"></rect><rect y=\"13\" width=\"16\" height=\"2\"></rect>\n" +
                        "</g></svg>\n" +
                        "            </a>\n" +
                        "          </div>\n" +
                        "          <div class=\"u-custom-menu u-nav-container\">\n" +
                        "            <ul class=\"u-nav u-spacing-30 u-unstyled u-nav-1\"><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"index.html#carousel_7b55\" style=\"padding: 6px 30px;\">For Vendor</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"About.html\" rel=\"nofollow\" style=\"padding: 6px 30px;\">About Us</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-border-2 u-border-active-palette-5-light-1 u-border-hover-palette-5-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-5-light-1 u-text-grey-90 u-text-hover-grey-90\" href=\"index.html#carousel_7b55\" style=\"padding: 6px 30px;\">Contact Us</a>\n" +
                        "</li></ul>\n" +
                        "          </div>\n" +
                        "          <div class=\"u-custom-menu u-nav-container-collapse\">\n" +
                        "            <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\n" +
                        "              <div class=\"u-inner-container-layout u-sidenav-overflow\">\n" +
                        "                <div class=\"u-menu-close\"></div>\n" +
                        "                <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"index.html#carousel_7b55\">For Vendor</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"About.html\" rel=\"nofollow\">About Us</a>\n" +
                        "</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"index.html#carousel_7b55\">Contact Us</a>\n" +
                        "</li></ul>\n" +
                        "              </div>\n" +
                        "            </div>\n" +
                        "            <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\n" +
                        "          </div>\n" +
                        "        </nav>\n" +
                        "        <a href=\"Login.html\" class=\"u-black u-border-2 u-border-hover-black u-btn u-button-style u-hover-white u-text-body-alt-color u-text-hover-black u-btn-1\" rel=\"nofollow\">Login</a>\n" +
                        "        <img class=\"u-image u-image-contain u-image-default u-image-2\" src=\"images/SwadeshiLogo3.png\" alt=\"\" data-image-width=\"1277\" data-image-height=\"1275\">\n" +
                        "      </div><style class=\"u-sticky-style\" data-style-id=\"9b5c\">.u-sticky-fixed.u-sticky-9b5c, .u-body.u-sticky-fixed .u-sticky-9b5c {\n" +
                        "box-shadow: 5px 5px 20px 0 rgba(0,0,0,0.4) !important\n" +
                        "}.u-sticky-fixed.u-sticky-9b5c:before, .u-body.u-sticky-fixed .u-sticky-9b5c:before {\n" +
                        "borders: top right bottom left !important\n" +
                        "}</style></header>\n" +
                        "    <section class=\"u-clearfix u-palette-1-light-3 u-section-1\" id=\"sec-8fb6\">\n" +
                        "      <div class=\"u-clearfix u-sheet u-sheet-1\">\n" +
                        "        <img class=\"u-border-2 u-border-palette-1-light-3 u-hover-feature u-image u-image-round u-radius-42 u-image-1\" src=\"images/Innovative.jpg\" alt=\"\" data-image-width=\"3000\" data-image-height=\"2000\" data-animation-name=\"customAnimationIn\" data-animation-duration=\"1750\">\n");
                
                
                
                
                
                //Here Is The Output
                out.println("<br><center><h2><p class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-2\"><font color='red'>Sorry There Is No Vendor Regarding This</font></p></h2></center><br>");
                
                
                
                
                out.println("<div class=\"u-expanded-width u-tab-links-align-left u-tabs u-tabs-1\">\n" +
                        "          <ul class=\"u-border-2 u-border-palette-1-base u-spacing-10 u-tab-list u-unstyled\" role=\"tablist\">\n" +
                        "            <li class=\"u-tab-item\" role=\"presentation\">\n" +
                        "              <a class=\"active u-active-palette-1-base u-button-style u-grey-10 u-tab-link u-text-active-white u-text-black u-tab-link-1\" id=\"link-tab-0da5\" href=\"#tab-0da5\" role=\"tab\" aria-controls=\"tab-0da5\" aria-selected=\"true\">VENDOR'S</a>\n" +
                        "            </li>\n" +
                        "          </ul>\n" +
                        "          <div class=\"u-tab-content\">\n" +
                        "            <div class=\"u-container-style u-palette-4-light-3 u-tab-active u-tab-pane u-tab-pane-1\" id=\"tab-0da5\" role=\"tabpanel\" aria-labelledby=\"link-tab-0da5\">\n" +
                        "              <div class=\"u-container-layout u-container-layout-1\">\n" +
                        "                <div class=\"u-expanded-width u-table u-table-responsive u-table-1\">\n" +
                        "                  <table class=\"u-table-entity\">\n" +
                        "                    <colgroup>\n" +
                        "                      <col width=\"21%\">\n" +
                        "                      <col width=\"19%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                      <col width=\"20%\">\n" +
                        "                    </colgroup>\n" +
                        "                    <thead class=\"u-align-center u-custom-font u-font-merriweather u-table-header u-white u-table-header-1\">\n" +
                        "                      <tr style=\"height: 49px;\">\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-1\">Name<span style=\"font-weight: 700;\"></span>\n" +
                        "                        </th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-2\">CAtegory</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-3\">city</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-4\">contact</th>\n" +
                        "                        <th class=\"u-border-5 u-border-no-left u-border-no-right u-border-no-top u-border-palette-2-dark-2 u-table-cell u-table-cell-5\">email</th>\n" +
                        "                      </tr>\n" +
                        "                    </thead>\n" +
                        "                    <tbody class=\"u-custom-font u-palette-4-light-3 u-table-body u-text-font u-table-body-1\">\n"+
                        "                    </tbody>\n" +
                        "                  </table>\n" +
                        "                </div>\n" +
                        "              </div>\n" +
                        "            </div>\n" +
                        "          </div>\n" +
                        "        </div>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "    </section>\n" +
                        "    \n" +
                        "    \n" +
                        "    <footer class=\"u-align-center u-clearfix u-footer u-grey-80 u-footer\" id=\"sec-2030\"><div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\n" +
                        "        <p class=\"u-small-text u-text u-text-variant u-text-1\">THANK YOU FOR VISITING</p>\n" +
                        "      </div></footer>  \n" +
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
        catch (SQLException|ServletException|IOException ex) 
        {
            Logger.getLogger(SearchVendor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try 
        {
            processRequest(request, response);
        } 
        catch (SQLException|ServletException|IOException ex) 
        {
            Logger.getLogger(SearchVendor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}



