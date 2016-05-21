package manjuu.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class Property {

    @Value("${datagetter.list_file_path}")
    private String list_file_path;

    @Value("${datagetter.slot_dir}")
    private String slot_dir;

    @Value("${datagetter.pachi_dir}")
    private String pachi_dir;

    @Value("${datagetter.hall_url}")
    private String hall_url;

    @Value("${datagetter.graph_color}")
    private String graph_color;

    @Value("${datagetter.medal_px}")
    private String medal_px;

    @Value("${datagetter.closed_px}")
    private String closed_px;

    @Value("${datagetter.zero_px}")
    private String zero_px;

    @Value("${datagetter.height}")
    private String height;

    @Value("${datagetter.width}")
    private String width;

    @Value("${datagetter.sleeptime}")
    private String sleeptime;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public String getList_file_path() {
        return list_file_path;
    }

    public String getSlot_dir() {
        return slot_dir;
    }

    public String getPachi_dir() {
        return pachi_dir;
    }

    public String getHall_url() {
        return hall_url;
    }

    public String getGraph_color() {
        return graph_color;
    }

    public String getMedal_px() {
        return medal_px;
    }

    public String getClosed_px() {
        return closed_px;
    }

    public String getZero_px() {
        return zero_px;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getSleeptime() {
        return sleeptime;
    }
}
