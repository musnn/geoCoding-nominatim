package com.example.geocoding.services;


import com.example.geocoding.GeoData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="city", url="localhost:8080")
@Service
public interface InfoService {

    @GetMapping(path = "search")
    List<GeoData> getGeoDataStreet(@RequestParam(value = "q", required = false) String q,
                                           @RequestParam(value = "street", required = false) String street,
                                           @RequestParam(value = "city", required = false) String city,
                                           @RequestParam(value = "county", required = false) String county,
                                           @RequestParam(value = "country", required = false) String country);
    @GetMapping(path = "reverse")
    GeoData getReverseGeoData(
            @RequestParam(value = "accept-language", required = false, defaultValue = "az,en") String language,
            @RequestParam(value = "format", required = false, defaultValue = "jsonv2") String format,
            @RequestParam(value = "lat") String lat,
                                   @RequestParam(value = "lon") String lon);
//    @GetMapping(path = "lookup")
//    List<GeoData> getReverseGeoData(@RequestParam(value = "osm_ids") String osm_ids);
}
