package ch.friedli.infosystem.admin.servlet;

import ch.friedli.infosystem.business.impl.ContentLoaderImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet(name = "ConfigurationFileUploadServlet", urlPatterns = {"/app/saveConfigFormData"})
@MultipartConfig
public class ConfigurationFileUploadServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(ConfigurationFileUploadServlet.class.getName());
    private static final String CONFIG_FILE_DIR = "c:/infomonitor/config/";
    @EJB
    ContentLoaderImpl contentLoader;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        for (Part part : request.getParts()) {
            String param = part.getName();
            LOGGER.log(Level.FINE, param);
            if ("fileToBeUploaded".equals(param)) {
                InputStream is = request.getPart(param).getInputStream();
                int i = is.available();
                byte[] b = new byte[i];
                is.read(b);
                LOGGER.log(Level.FINE, "Length : " + b.length);
                File directory = new File(CONFIG_FILE_DIR);

                if (!directory.exists()) {
                    directory.mkdirs();
                    directory.setWritable(true);
                    directory.setReadable(true);
                }
                FileOutputStream os = new FileOutputStream(CONFIG_FILE_DIR + "IHS_CONFIG.xlsx");
                os.write(b);
                is.close();
            }
        }
        
        // redirect
        response.sendRedirect("/InfoMonitor-web/app/admin.html#/uploadconfig");
    }

    private String getFileName(Part part) {
        String partHeader = part.getHeader("content-disposition");
        LOGGER.log(Level.FINE, "Part Header = " + partHeader);
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                return cd.substring(cd.indexOf('=') + 1).trim()
                        .replace("\"", "");
            }
        }
        return null;

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
