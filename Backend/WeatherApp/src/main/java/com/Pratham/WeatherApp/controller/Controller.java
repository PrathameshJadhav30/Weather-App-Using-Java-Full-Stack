package com.Pratham.WeatherApp.controller;

import com.Pratham.WeatherApp.dto.WeatherForeCast;
import com.Pratham.WeatherApp.dto.WeatherResponse;
import com.Pratham.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class Controller {
    @Autowired
    private WeatherService service;

    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city)
    {
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city)
    {
        return service.getData(city);
    }

    @GetMapping("/forecast")
    public WeatherForeCast getForecast(@RequestParam String city, @RequestParam int days)
    {
        return service.getForeCast(city,days);
    }
}
