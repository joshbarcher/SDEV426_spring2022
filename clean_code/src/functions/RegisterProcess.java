package functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterProcess
{
    public void register()
    {
        String name = readString("First name: ");
        String phone = readString("Phone: ");

        //non-empty name
        Pattern check = Pattern.compile("\\w*");
        Matcher matcher = check.matcher(name);
        if (!matcher.matches())
        {
            throw new IllegalStateException("Name cannot be empty");
        }

        //should match 333-444-5555
        check = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        matcher = check.matcher(phone);
        if (!matcher.matches())
        {
            throw new IllegalStateException(
                    "Phone must be the following format: 333-444-5555");
        }

        Registration registration = new Registration(name, phone);
        saveRegistration(registration);

        String htmlSubject = "New Registration: " + name;
        String htmlBody = "Id: " + getGenerateRegistrationId() +
                registration.toString();

        sendEmail(htmlSubject, htmlBody);
    }

    private void sendEmail(String htmlSubject, String htmlBody)
    {
        //do something...
    }

    private String getGenerateRegistrationId()
    {
        return null; //do something...
    }

    private void saveRegistration(Registration registration)
    {
        //do something...
    }

    private String readString(String s)
    {
        return null; //do something...
    }
}
