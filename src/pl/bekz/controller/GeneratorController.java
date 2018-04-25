package pl.bekz.controller;

import pl.bekz.model.CopyToClipboard;
import pl.bekz.model.PasswordSetting;
import pl.bekz.model.imp.PasswordGenerator;
import pl.bekz.view.GeneratorView;

public class GeneratorController {
    private PasswordGenerator generator = new PasswordGenerator();
    private GeneratorView view = new GeneratorView();
    private PasswordSetting set = new PasswordSetting();
    private CopyToClipboard toClipboard = new CopyToClipboard();

    public void introduction() {
        view.showBanner();
    }

    public void passwordCointon() {
        view.showChosePassElements();
        set.passwordCharacters();
    }

    public void passwordLength() {
        view.showPasswordLength();
        set.passwordLength();
    }

    public void generatePassword() {
        generator.generatePassword( set.getPassLength(), set.getPassComponent() );
    }

    public void copyToClipboardPassword() {
        toClipboard.copyToClip( generator.printPassword() );
    }
}
