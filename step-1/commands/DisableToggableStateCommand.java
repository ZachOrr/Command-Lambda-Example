package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

public class DisableToggableStateCommand extends CommandBase {

  private ExampleSubsystem subsystem;

  public DisableToggableStateCommand(ExampleSubsystem subsystem) {
    this.subsystem = subsystem;

    addRequirements(subsystem);
  }

  @Override
  public void execute() {
    subsystem.disableToggableState();
  }

}
