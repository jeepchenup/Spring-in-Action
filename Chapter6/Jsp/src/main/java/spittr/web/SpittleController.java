package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    /*@RequestMapping(method= RequestMethod.GET)
    public String spittles(Model model) {
        List<Spittle> spittles = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
        // 没有指定参数名称，默认是类型名+容器类名，这里是spittleList
        model.addAttribute(spittles);
        return "spittles";
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                             @RequestParam(value = "count", defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSpittle(@RequestParam("spittle_id") long id, Model model) {
        Spittle spittle = spittleRepository.findOne(id);
        model.addAttribute(spittle);
        return "spittle";
    }

    //下面这种写法要优于上面，通过 '/show' 来加载数据
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId, Model model) {
        Spittle spittle = spittleRepository.findOne(spittleId);
        model.addAttribute("spittle", spittle);
        return "spittle";
    }
}
