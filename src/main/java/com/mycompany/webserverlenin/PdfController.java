///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.webserverlenin;
//
//import java.io.File;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.io.IOException;
//import org.bson.Document;
///**
// *
// * @author predator 300
// */
//@Controller
//public class PdfController {
//    private final PdfService pdfService;
//
//    @Autowired
//    public PdfController(PdfService pdfService) {
//        this.pdfService = pdfService;
//    }
//
////    @GetMapping("/download-pdf/{jobCode}")
////    public ResponseEntity<byte[]> downloadPdf(@PathVariable String jobCode) {
////        
////                MangoDBConnection mangoDBConnection = new MangoDBConnection();
//////        List<Document> projectData = mangoDBConnection.getProjectData();
////        Document doc = mangoDBConnection.getProjectDataByJobCode(jobCode);
////        
////        // Get the path to the user's Documents folder
////        String userHome = System.getProperty("user.home");
////        File documentsFolder = new File(userHome, "Documents");
////        if (!documentsFolder.exists()) {
////            documentsFolder.mkdirs();
////        }
////        
////        String pdfPath = new File (documentsFolder, "project_data" + jobCode + ".pdf").getAbsolutePath();
////        try {
////            byte[] pdfContents = pdfService.generatePdf(jobCode);
////            HttpHeaders headers = new HttpHeaders();
////            headers.setContentType(MediaType.APPLICATION_PDF);
////            headers.setContentDispositionFormData("attachment", "job_" + jobCode + ".pdf");
////            return ResponseEntity.ok()
////                    .headers(headers)
////                    .body(pdfContents);
////        } catch (IOException e) {
////            e.printStackTrace();
////            return ResponseEntity.status(500).body(null);
////        }
////    }
//    @GetMapping("/download-pdf/{jobCode}")
//    public ResponseEntity<byte[]> downloadPdf(@PathVariable String jobCode) {
//        try {
//            byte[] pdfContents = pdfService.generatePdf(jobCode);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_PDF);
//            headers.setContentDispositionFormData("attachment", "job_" + jobCode + ".pdf");
//            return ResponseEntity.ok()
//                    .headers(headers)
//                    .body(pdfContents);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body(null);
//        }
//    }
//}
