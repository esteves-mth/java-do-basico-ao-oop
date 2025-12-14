public class Image implements Printable{
    private String filename;
    private String resolution;
    private String format;

    public Image(String filename, String resolution, String format) {
        this.filename = filename;
        this.resolution = resolution;
        this.format = format;
    }

    @Override
    public void print() {
        System.out.println("Imagem");
        System.out.println(getFilename() + getFormat());
        System.out.println(getResolution());
    }

    @Override
    public String getContent() {
        return "A imagem " + getFilename() + getFormat() + " tem como resolução " + getResolution();
    }

    @Override
    public String getDocumentType() {
        return "Imagem";
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
