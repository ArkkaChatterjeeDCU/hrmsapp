package com.hrms.hrms_app.controller;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hrms.hrms_app.model.Attendance;
import com.hrms.hrms_app.model.Leaves;

@Controller
public class HRMSController {

    private ObjectMapper objectMapper = new ObjectMapper();
    
    @GetMapping("/")
    public String index() {
		return "index";}

    @PostMapping("/submitAttendance")
    public String submitAttendance(@ModelAttribute Attendance attendance) throws IOException {
        String attendanceData = objectMapper.writeValueAsString(attendance);
        writeDataToFile("attendance-data.json", attendanceData);
        return "redirect:/attendance_form";
    }

    @PostMapping("/submitLeave")
    public String submitLeave(@ModelAttribute Leaves leave) throws IOException {
        String leaveData = objectMapper.writeValueAsString(leave);
        writeDataToFile("leave-data.json", leaveData);
        return "redirect:/leave_form";
    }

    private void writeDataToFile(String fileName, String data) throws IOException {
        String filePath = "src/main/resources/" + fileName;
        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(data + "\n");
        }
    }
}
