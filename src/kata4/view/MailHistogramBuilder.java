package kata4.view;

/**
 *
 * @author Fabián B.
 */

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public static Histogram build(List<Mail> mailList) {
        
        Histogram<String> histogram = new Histogram();
        
        for(Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
    
}