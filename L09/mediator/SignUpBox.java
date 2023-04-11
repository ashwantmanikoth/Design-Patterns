package L09.mediator;

import java.util.ArrayList;
import java.util.List;

public class SignUpBox implements Mediator {
  private final TextBox userInput;
  private final TextBox passwordInput;
  private final CheckBox termsCheck;
  private final Button signUpButton;
  private List<Observer> observers = new ArrayList<>();

  public SignUpBox () {
    this.userInput = new TextBox(this);
    this.passwordInput = new TextBox(this);
    this.termsCheck = new CheckBox(this);
    this.signUpButton = new Button(this);

    registerObserver(this.signUpButton);
  }


  private void sendNotification() {
    boolean state = false;
    if(!userInput.getContent().isEmpty() && !passwordInput.getContent().isEmpty() && termsCheck.isChecked()){

      state = true;
    }
    for (Observer observer : observers) {
      observer.update(state);
    }
  }

  private void registerObserver(L09.mediator.Observer observer) {
    observers.add(observer);
  }

  public void run() {
    userInput.setContent("Hello UserInput");
    passwordInput.setContent("Hello Password");
    termsCheck.setChecked(true);

    System.out.println("Sign Up Box Enabled " + signUpButton.isEnabled());
  }

  @Override
  public void changeNow(UIControl uiControl) {
    System.out.println("Value changed " + uiControl.toString());
    sendNotification();
  }
}