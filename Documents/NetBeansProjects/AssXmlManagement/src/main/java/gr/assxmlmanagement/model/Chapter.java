package gr.assxmlmanagement.model;

import jakarta.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

import jakarta.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chapter implements Serializable{
    private String title;

    @XmlElement(name = "paragraph")
    private List<Paragraph> paragraphs;
}
