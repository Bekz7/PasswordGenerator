package pl.bekz.view;

public class GeneratorView {

    public void showBanner(){
        StringBuilder sb = new StringBuilder(  );
        sb.append(
                "\n ::::::::::::     :::      :::::::: ::::::::           ::::::::: ::::::::: ::::::     ::: ::::::::: :::::::::        :::  ::::::::::: ::::::::   :::::::::" +
                "\n :+:      :+:   :+: :+:     :+:      :+:               :+:       :+:       :+: :+:    :+: :+:       :+:   :+:      :+: :+:    :+:    :+:    :+:  :+:   :+:" +
                "\n +:+      +:+  +:+   +:+     +:+      +:+              +:+       +:+       +:+  +:+   +:+ +:+       +:+   +:+     +:+   +:+   +:+    +:+    +:+  +:+   +:+" +
                "\n +#++#++#++#+ +#++#++#++#+    +#+      +#+             +#++#++#+ +#++#++#+ +#+   +#+  +#+ +#++#++#+ +#++#++#+    +#++#++#++#+ +#+    +#+    +#+  +#++#++#+" +
                "\n +#+          +#+      +#+    +#+      +#+             +#+   +#+ +#+       +#+    +#+ +#+ +#+       +#+    +#+   +#+      +#+ +#+    +#+    +#+  +#+    +#+" +
                "\n #+#          #+#      #+#     #+#      #+#            #+#   #+# #+#       #+#     #+##+# #+#       #+#     #+#  #+#      #+# #+#    #+#    #+#  #+#     #+#" +
                "\n ###          ###      ### #######  #######             ######## ######### ###      ##### ######### ###      ### ###      ### ###     ########   ###      ###"
        );
        sb.append("\n----------------");
        sb.append("\nCreated by Dawid Belkiewicz 2018");
        sb.append("\n----------------\n\n");

        show(sb.toString());
    }
    public void showPasswordLength(){
        System.out.println("Point your password length: ");
    }

    public void showChosePassElements(){
        StringBuilder sb = new StringBuilder(  );
        sb.append(
                "\n What the password can contain (enter letters without a comma e.g. 'sln'): " +
                        "\n [S]ymbols" +
                        "\n [L]owercase Character" +
                        "\n [U]ppercase Character" +
                        "\n [N]umbers"
        );

        show(sb.toString());
    }

    private static void show(String s) {
        System.out.println(s);
    }

}
