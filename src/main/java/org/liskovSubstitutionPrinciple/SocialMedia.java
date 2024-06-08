package org.liskovSubstitutionPrinciple;

public abstract class SocialMedia {

    public abstract void chat();

    public abstract void post(Object post);

    public abstract void sendPhotos();

    public abstract void calling(String... users);

}
