package br.com.rgrmra.apps;

public class Home {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.newTab();
        browser.showPage("http://dio.me");
        browser.updatePage();

        Music music = new Music();
        music.doPlay();
        music.changeMusic();
        music.doPause();

        Phone phone = new Phone();
        phone.rejectCall();
        phone.doCall("+55 11 9 0000-0000");
        phone.acceptCall();
        phone.callVoiceMail();
    }
}
