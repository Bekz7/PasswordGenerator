package pl.bekz.controller;

import pl.bekz.model.AppClipboard;
import pl.bekz.model.PasswordSetting;
import pl.bekz.model.impl.PasswordGenerator;
import pl.bekz.view.GeneratorView;

public class GeneratorController {
    private PasswordGenerator generator = new PasswordGenerator();
    private GeneratorView view = new GeneratorView();
    private PasswordSetting settings = new PasswordSetting();

    private AppClipboard clipboard = new AppClipboard();

    public void introduction() {
        view.showBanner();
    }

    public void choosePatternsForPassword() {
        view.showChosePassElements();
        settings.readSignsFromInput();
    }

    public void choosePasswordLength() {
        view.showPasswordLength();
        settings.readPasswordLengthFromInput();
    }

    public void generatePassword() {
        generator.generatePassword( settings );
    }

    public void copyToClipboardPassword() {
        clipboard.copyToClip( generator.printPassword() );
    }
}
