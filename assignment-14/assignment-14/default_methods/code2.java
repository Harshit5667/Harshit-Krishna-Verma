interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    // New feature added as default method
    default void exportToJSON() {
        System.out.println("JSON export not supported in this version.");
    }
}

class CSVExporter implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Exporting report to CSV...");
    }
    public void exportToPDF() {
        System.out.println("CSV exporter doesn't support PDF.");
    }
}

class PDFExporter implements ReportExporter {
    public void exportToCSV() {
        System.out.println("PDF exporter doesn't support CSV.");
    }
    public void exportToPDF() {
        System.out.println("Exporting report to PDF...");
    }
}

// New exporter that overrides default JSON export
class JSONExporter implements ReportExporter {
    public void exportToCSV() {}
    public void exportToPDF() {}
    public void exportToJSON() {
        System.out.println("Exporting report to JSON...");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();
        ReportExporter json = new JSONExporter();

        csv.exportToCSV();
        csv.exportToJSON();

        pdf.exportToPDF();
        pdf.exportToJSON();

        json.exportToJSON();
    }
}
