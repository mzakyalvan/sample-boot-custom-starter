package sample;

import com.tiket.poc.starter.bean.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequireSampleBean {
  @Autowired
  private SampleBean sampleBean;

  public SampleBean getSampleBean() {
    return sampleBean;
  }
}
