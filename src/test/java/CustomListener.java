import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("Starting All test........." + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("All Tests are finished........." + context.getName());
    }

    public void onTestStart(ITestResult result) {
        System.out.println("All Tests are finished........." + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Successed Test are ........" + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped Test are........" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Failed Test are........" + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("The Test Percentage is........" + result.getName());
    }
}
