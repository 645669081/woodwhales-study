package org.woodwhale.annotation.code02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@ComponentScans({@ComponentScan("org.woodwhale.king.code01"),
		@ComponentScan("org.woodwhale.king.code03")
})
@ComponentScan(basePackages = {"org.woodwhale.king.code02"},
					includeFilters = {
							@Filter( type=FilterType.ANNOTATION, classes= { Service.class })
					}, useDefaultFilters = false)
@Configuration
public class AppConfig2 {

}
