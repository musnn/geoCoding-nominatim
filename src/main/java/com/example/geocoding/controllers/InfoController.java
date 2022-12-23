package com.example.geocoding.controllers;

import com.example.geocoding.GeoData;
import com.example.geocoding.services.InfoService;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @GetMapping(path = "search")
    public List<GeoData> getGeoDataStreet(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) String street,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String county,
            @RequestParam(required = false) String country
            ) {
        return infoService.getGeoDataStreet(q, street, city, county, country);
    }

    @GetMapping(path = "reverse")
    public GeoData getReverseGeoData(
            @RequestParam String lat,
            @RequestParam String lon
    ) {
        return infoService.getReverseGeoData("az", "jsonv2", lat, lon);
    }

//    @GetMapping(path = "lookup")
//    public List<GeoData> getReverseGeoData(
//            @RequestParam String osm_ids
//    ) {
//        return infoService.getReverseGeoData(osm_ids);
//    }

//    @GetMapping(path = "search", params = { "city" })
//    public List<GeoData> getGeoDataCity(@RequestParam String city) {
//        return infoService.getGeoDataCity(city);
//    }


}