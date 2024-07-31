/////*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
////package com.mycompany.webserverlenin;
////
////import com.itextpdf.kernel.pdf.PdfDocument;
////import com.itextpdf.kernel.pdf.PdfWriter;
//////import com.itextpdf.layout.Document;
////import com.itextpdf.layout.element.Paragraph;
////import org.bson.Document;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import java.io.ByteArrayOutputStream;
////import java.io.IOException;
/////**
//// *
//// * @author predator 300
//// */
////@Service
////public class PdfService {
////        private final ViewingService viewingService;
////
////    @Autowired
////    public PdfService(ViewingService viewingService) {
////        this.viewingService = viewingService;
////    }
////
////    public byte[] generatePdf(String jobCode) throws IOException {
////        Document project = viewingService.getProjectDetail(jobCode).get(0);
////
////        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
////        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
////        PdfDocument pdfDoc = new PdfDocument(writer);
////        com.itextpdf.layout.Document document = new com.itextpdf.layout.Document(pdfDoc);
////        
////        
////        document.add(new Paragraph("Job Code: " + project.getString("job_code")));
////        document.add(new Paragraph("Client Name: " + project.getString("client_name")));
////        document.add(new Paragraph("Status: " + project.getString("status")));
////        document.add(new Paragraph("Date Issued: " + project.getString("date_issued")));
////        document.add(new Paragraph("Date Confirmed: " + project.getString("date_confirmed")));
////        document.add(new Paragraph("Running Days: " + project.getString("running_days")));
////        document.add(new Paragraph("Warranty: " + project.getString("warranty")));
////
////        document.close();
////        return byteArrayOutputStream.toByteArray();
////    }
////}
////
////
//
//package com.mycompany.webserverlenin;
//
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfWriter;
////import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
//import org.bson.Document;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class PdfService {
//
//    private final ViewingService viewingService;
//
//    @Autowired
//    public PdfService(ViewingService viewingService) {
//        this.viewingService = viewingService;
//    }
//
//    public byte[] generatePdf(String jobCode) throws IOException {
//        List<Document> projectDetails = viewingService.getProjectDetail(jobCode);
//        if (projectDetails.isEmpty()) {
//            throw new IOException("Project not found");
//        }
//        
//        MangoDBConnection mangoDBConnection = new MangoDBConnection();
////        List<Document> projectData = mangoDBConnection.getProjectData();
//        Document doc = mangoDBConnection.getProjectDataByJobCode(jobCode);
//
//        // Get the path to the user's Documents folder
//        String userHome = System.getProperty("user.home");
//        File documentsFolder = new File(userHome, "Documents");
//        if (!documentsFolder.exists()) {
//            documentsFolder.mkdirs();
//        }
//
//        Document project = projectDetails.get(0);
//        String pdfPath = new File(documentsFolder, "project_data" + jobCode + ".pdf").getAbsolutePath();
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
//        
////        PdfWriter writer = new PdfWriter(pdfPath);
//        PdfDocument pdfDoc = new PdfDocument(writer);
//        com.itextpdf.layout.Document document = new com.itextpdf.layout.Document(pdfDoc);
//
//
//
//        document.add(new Paragraph("Job Code: " + project.getString("job_code")));
//        document.add(new Paragraph("Client Name: " + project.getString("client_name")));
//        document.add(new Paragraph("Status: " + project.getString("status")));
//        document.add(new Paragraph("Date Issued: " + project.getString("date_issued")));
//        document.add(new Paragraph("Date Confirmed: " + project.getString("date_confirmed")));
//        document.add(new Paragraph("Running Days: " + project.getString("running_days")));
//        document.add(new Paragraph("Warranty: " + project.getString("warranty")));
//
//        document.close();
//        return byteArrayOutputStream.toByteArray();
//    }
//}
//
