package csvtoxml.entities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XStreamAlias("test-case")
public class TestCase {
    @XStreamAlias("start")
    @XStreamAsAttribute
    private String start;

    @XStreamAlias("status")
    @XStreamAsAttribute
    private String status;

    @XStreamAlias("stop")
    @XStreamAsAttribute
    private String stop;

    @XmlElement(name = "funcion")
    private String funcion;

    @XmlElement(name = "tipo")
    private String tipo;

    @XmlElement(name = "script")
    private String script;

    @XmlElement(name = "prueba")
    private String prueba;

    @XmlElement(name = "resultado")
    private String resultado;

    @XmlElement(name = "formato")
    private String formato;

    @XmlElement(name = "ambiente")
    private String ambiente;

    @XmlElement(name = "evidencia")
    private String evidencia;

    @XStreamAlias("labels")
    @XStreamImplicit
    private List<Label> labels;

    @XStreamImplicit(itemFieldName = "parameter")
    List<Parameter> parameters;
    public TestCase() {
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setScript(String script) {
        this.script = script;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
