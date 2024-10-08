package hallpointer.address.logic;

import java.nio.file.Path;

import hallpointer.address.commons.core.GuiSettings;
import hallpointer.address.logic.commands.CommandResult;
import hallpointer.address.logic.commands.exceptions.CommandException;
import hallpointer.address.logic.parser.exceptions.ParseException;
import hallpointer.address.model.ReadOnlyAddressBook;
import hallpointer.address.model.member.Member;
import javafx.collections.ObservableList;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the AddressBook.
     *
     * @see hallpointer.address.model.Model#getAddressBook()
     */
    ReadOnlyAddressBook getAddressBook();

    /** Returns an unmodifiable view of the filtered list of members */
    ObservableList<Member> getFilteredMemberList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);
}
