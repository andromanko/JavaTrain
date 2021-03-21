package space.androma.ita.rest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.androma.ita.api.dto.DevDto;
import space.androma.ita.api.services.IDevService;

@RestController
@RequestMapping("/devs")
public class DevController {

    @Autowired
    private IDevService devService;

    @GetMapping
    public List<DevDto> findDevs() {
        return devService.getDevs();
    }

    @GetMapping(value = "/{id}")
    public DevDto findDev(@PathVariable int id) {
        return devService.findDev(id);
    }

    @PostMapping
    public DevDto createDev(@RequestBody DevDto dev) {
        return this.devService.createDev(dev);
    }

    @PutMapping(value = "/{id}")
    public void updateDev(@PathVariable int id, @RequestBody DevDto dev) {
        this.devService.updateDev(id, dev);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDev(@PathVariable int id) {
        this.devService.deleteDev(id);
    }
}
