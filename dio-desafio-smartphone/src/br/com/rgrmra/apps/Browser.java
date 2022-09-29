package br.com.rgrmra.apps;

public class Browser {
    protected void showPage(String url) {
        System.out.println("Showing page: " + url);
    }

    protected void newTab() {
        System.out.println("Openning a new tab");
    }

    protected void updatePage() {
        System.out.println("Updating page...");
    }
}
