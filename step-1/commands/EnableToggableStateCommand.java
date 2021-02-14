package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

public class EnableToggableStateCommand extends CommandBase {

  private ExampleSubsystem subsystem;

  public EnableToggableStateCommand(ExampleSubsystem subsystem) {
    this.subsystem = subsystem;

    addRequirements(subsystem);
  }

  @Override
  public void execute() {
    subsystem.enableToggableState();
  }

}
