package se.team11.studentprofile.domain.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import se.team11.studentprofile.domain.HistoryInActivity;

@RequestMapping("/historyinactivitys")
@Controller
@RooWebScaffold(path = "historyinactivitys", formBackingObject = HistoryInActivity.class)
public class HistoryInActivityController {
}
