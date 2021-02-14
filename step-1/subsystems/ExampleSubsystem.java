package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {

  private boolean toggableState = false;

  public ExampleSubsystem() {}

  public void enableToggableState() {
    toggableState = true;
  }

  public void disableToggableState() {
    toggableState = false;
  }

}
