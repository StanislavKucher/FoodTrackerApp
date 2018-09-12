package com.foodTrackerApp.command.factory;

import com.foodTrackerApp.command.*;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final CommandFactory instance = new CommandFactory();
    private final Map<String, Command> commandMap;

    private CommandFactory() {
        commandMap = new HashMap<>();
        commandMap.put("/login", new LoginCommand());
        commandMap.put("/logout", new LogoutCommand());
        commandMap.put("/registration", new RegistrationCommand());
        commandMap.put("/admin/editFood", new EditFoodCommand());
        commandMap.put("/admin/editUserList", new EditUserListCommand());
        commandMap.put("/lookupRecordHistory", new LookupRecordHistoryCommand());
        commandMap.put("/fillinRecord", new FillinRecordCommand());
        commandMap.put("/chooseFood", new ChooseFoodCommand());
    }


    public static CommandFactory getInstance() {
        return instance;
    }

    public Command getCommand(String command) {
        return commandMap.get(command);
    }
}
