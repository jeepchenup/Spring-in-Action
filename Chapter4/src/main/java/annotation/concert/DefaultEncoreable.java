package annotation.concert;

public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("This is for the encore performance.");
    }
}
