package com.example.geocoding;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
public class GeoData {

    @JsonProperty("place_id")
    public Long placeId;
    @JsonProperty("licence")
    public String licence;
    @JsonProperty("osm_type")
    public String osmType;
    @JsonProperty("osm_id")
    public Long osmId;
    @JsonProperty("boundingbox")
    public List<String> boundingbox = null;
    @JsonProperty("lat")
    public String lat;
    @JsonProperty("lon")
    public String lon;
    @JsonProperty("display_name")
    public String displayName;
    @JsonProperty("place_rank")
    public Long placeRank;
    @JsonProperty("category")
    public String category;
    @JsonProperty("type")
    public String type;
    @JsonProperty("importance")
    public Double importance;

}