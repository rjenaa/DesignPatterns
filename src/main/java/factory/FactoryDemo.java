package factory;

import jdk.swing.interop.SwingInterOpUtils;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site);
    }



}
