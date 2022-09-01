package com.example.qrcodeexample.controller;

import com.example.qrcodeexample.util.QRCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QRCodeController {

    @RequestMapping(value = "/code")
    public String getCode(Model model, String url) throws Exception {
        String qrCodeImage = QRCodeUtil.getQRCodeImage(url, 200, 200);
        model.addAttribute("qrCode", qrCodeImage);
        return "index";
    }
}
