package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    public SpitterController(){}

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid SpitterForm spitterForm, Errors errors) throws IOException {

        if(errors.hasErrors()) {
            return "/registerForm";
        }

        Spitter spitter = spitterForm.toSpitter();
        spitterRepository.save(spitter);

        MultipartFile profilePicture = spitterForm.getProfilePicture();
        if(profilePicture != null) {
            profilePicture.transferTo(new File(spitter.getUsername() + ".jpg"));
        }
        return "redirect:/spitter/" + spitter.getUsername();
    }

    // 用来接受注册成功跳转页面
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        model.addAttribute("spitter", spitterRepository.findByUsername(username));
        return "profile";
    }
}
