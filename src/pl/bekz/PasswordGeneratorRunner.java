package pl.bekz;


import pl.bekz.controller.GeneratorController;

public class PasswordGeneratorRunner {

    public static void main(String[] args) {
        GeneratorController controller = new GeneratorController();

        //1. Introduction
        controller.introduction();

        //2. Choose what to include the password
        controller.passwordCointon();

        //3. Choose password length
        controller.passwordLength();

        //4.Generate password
        controller.generatePassword();

        //5. Copy the generated password to the clipboard
        controller.copyToClipboardPassword();

    }


}
