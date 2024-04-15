package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.StringUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Address;
import seedu.address.model.person.Allergies;
import seedu.address.model.person.BloodType;
import seedu.address.model.person.Condition;
import seedu.address.model.person.Country;
import seedu.address.model.person.DateOfAdmission;
import seedu.address.model.person.DateOfBirth;
import seedu.address.model.person.Diagnosis;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Sex;
import seedu.address.model.person.Status;
import seedu.address.model.person.Symptom;
import seedu.address.model.visit.DateOfVisit;

/**
 * Contains utility methods used for parsing strings in the various *Parser classes.
 */
public class ParserUtil {
    //TODO: add parser for new fields

    public static final String MESSAGE_INVALID_INDEX = "Index is not a non-zero unsigned integer.";

    /**
     * Parses {@code oneBasedIndex} into an {@code Index} and returns it. Leading and trailing whitespaces will be
     * trimmed.
     *
     * @throws ParseException if the specified index is invalid (not non-zero unsigned integer).
     */
    public static Index parseIndex(String oneBasedIndex) throws ParseException {
        String trimmedIndex = oneBasedIndex.trim();
        if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
            throw new ParseException(MESSAGE_INVALID_INDEX);
        }
        return Index.fromOneBased(Integer.parseInt(trimmedIndex));
    }

    /**
     * Parses a {@code String nric} into a {@code Nric}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code nric} is invalid.
     */
    //TODO test cases
    public static Nric parseNric(String nric) throws ParseException {
        requireNonNull(nric);
        //Correct implementation for case-insensitive NRIC
        String trimmedNric = nric.trim().toUpperCase();
        if (!Nric.isValidNric(trimmedNric)) {
            throw new ParseException(Nric.MESSAGE_CONSTRAINTS);
        }
        return new Nric(trimmedNric.toUpperCase());
    }

    /**
     * Parses a {@code String name} into a {@code Name}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code name} is invalid.
     */
    public static Name parseName(String name) throws ParseException {
        requireNonNull(name);
        String trimmedName = name.trim();
        if (!Name.isValidName(trimmedName)) {
            throw new ParseException(Name.MESSAGE_CONSTRAINTS);
        }
        return new Name(trimmedName);
    }

    /**
     * Parses a {@code String phone} into a {@code Phone}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code phone} is invalid.
     */
    //TODO test cases
    public static Phone parsePhone(String phone) throws ParseException {
        requireNonNull(phone);
        String trimmedPhone = phone.trim();
        if (!Phone.isValidPhone(trimmedPhone)) {
            throw new ParseException(Phone.MESSAGE_CONSTRAINTS);
        }
        return new Phone(trimmedPhone);
    }

    /**
     * Parses a {@code String address} into an {@code Address}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code address} is invalid.
     */
    public static Address parseAddress(String address) throws ParseException {
        requireNonNull(address);
        String trimmedAddress = address.trim();
        if (!Address.isValidAddress(trimmedAddress)) {
            throw new ParseException(Address.MESSAGE_CONSTRAINTS);
        }
        return new Address(trimmedAddress);
    }

    /**
     * Parses a {@code String dob} into an {@code DateOfBirth}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code dob} is invalid.
     */
    //TODO test cases
    public static DateOfBirth parseDateOfBirth(String dob) throws ParseException {
        requireNonNull(dob);
        String trimmedDob = dob.trim();
        if (!DateOfBirth.isValidDateOfBirth(trimmedDob)) {
            throw new ParseException(DateOfBirth.MESSAGE_CONSTRAINTS);
        }
        return new DateOfBirth(trimmedDob);
    }

    /**
     * Parses a {@code String dov} into an {@code DateOfVisit}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code dov} is invalid.
     */
    //TODO test cases
    public static DateOfVisit parseDateOfVisit(String dov) throws ParseException {
        requireNonNull(dov);
        String trimmedDov = dov.trim();
        if (!DateOfVisit.isValidDateOfVisit(trimmedDov)) {
            throw new ParseException(DateOfVisit.MESSAGE_CONSTRAINTS);
        }
        return new DateOfVisit(trimmedDov);
    }

    /**
     * Parses a {@code String sex} into an {@code Sex sex}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code sex} is invalid.
     */
    //TODO test cases
    public static Sex parseSex(String sex) throws ParseException {
        requireNonNull(sex);
        String trimmedSex = sex.trim();
        if (!Sex.isValidSex(trimmedSex)) {
            throw new ParseException(Sex.MESSAGE_CONSTRAINTS);
        }
        return new Sex(trimmedSex);
    }

    /**
     * Parses a {@code String status} into an {@code Status status}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code sex} is invalid.
     */
    //TODO test cases
    public static Status parseStatus(String status) throws ParseException {
        requireNonNull(status);
        String trimmedStatus = status.trim().toUpperCase();
        if (!Status.isValidStatus(trimmedStatus)) {
            throw new ParseException(Status.MESSAGE_CONSTRAINTS);
        }
        return new Status(trimmedStatus);
    }
    /**
     * Parses a {@code String country} into an {@code Country country}.
     * Leading and trailing whitespaces will be trimmed.
     * @throws ParseException if the given {@code country} is invalid.
     */
    //TODO test cases
    public static Country parseCountry(String country) throws ParseException {
        requireNonNull(country);
        String trimmedCountry = country.trim();
        if (!Country.isValidCountry(trimmedCountry)) {
            throw new ParseException(Country.MESSAGE_CONSTRAINTS);
        }
        return new Country(trimmedCountry);
    }
    /**
     * Parses a {@code String dateOfAdmission} into an {@code DateOfAdmission dateOfAdmission}.
     * Leading and trailing whitespaces will be trimmed.
     * @throws ParseException if the given {@code dateOfAdmission} is invalid.
     */
    //TODO test cases
    public static DateOfAdmission parseDateOfAdmission(String dateOfAdmission) throws ParseException {
        requireNonNull(dateOfAdmission);
        String trimmedDateOfAdmission = dateOfAdmission.trim();
        if (!DateOfAdmission.isValidDateOfAdmission(trimmedDateOfAdmission)) {
            throw new ParseException(DateOfAdmission.MESSAGE_CONSTRAINTS);
        }
        return new DateOfAdmission(trimmedDateOfAdmission);
    }

    /**
     * Parses a {@code String status} into an {@code Status status}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code sex} is invalid.
     */
    //TODO test cases
    public static BloodType parseBloodType(String bloodType) throws ParseException {
        requireNonNull(bloodType);
        String trimmedBloodType = bloodType.trim();
        if (!BloodType.isValidBloodType(trimmedBloodType)) {
            throw new ParseException(BloodType.MESSAGE_CONSTRAINTS);
        }
        return new BloodType(trimmedBloodType);
    }
    /**
     * Parses a {@code String allergies} into an {@code Set<Allergies>}.
     * Leading and trailing whitespaces will be trimmed.
     * @throws ParseException if the given {@code allergies} is invalid.
     */
    //TODO test cases
    public static Allergies parseAllergies(String allergies) throws ParseException {
        requireNonNull(allergies);
        String trimmedAllergies = allergies.trim();
        if (!Allergies.isValidAllergies(trimmedAllergies)) {
            throw new ParseException(Allergies.MESSAGE_CONSTRAINTS);
        }
        return new Allergies(trimmedAllergies);
    }
    /**
     * Parses a {@code String condition} into an {@code Condition}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code condition} is invalid.
     */
    public static Condition parseCondition(String condition) throws ParseException {
        requireNonNull(condition);
        String trimmedCondition = condition.trim();
        if (!Condition.isValidCondition(trimmedCondition)) {
            throw new ParseException(Condition.MESSAGE_CONSTRAINTS);
        }
        return new Condition(trimmedCondition);
    }
    /**
     * Parses a {@code String symptom} into an {@code Symptom}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code symptom} is invalid.
     */
    //TODO test cases
    public static Symptom parseSymptom(String symptom) throws ParseException {
        requireNonNull(symptom);
        String trimmedSymptom = symptom.trim();
        if (!Symptom.isValidSymptom(trimmedSymptom)) {
            throw new ParseException(Symptom.MESSAGE_CONSTRAINTS);
        }
        return new Symptom(trimmedSymptom);
    }
    /**
     * Parses a {@code String diagnosis} into an {@code Diagnosis}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code diagnosis} is invalid.
     */
    //TODO test cases
    public static Diagnosis parseDiagnosis(String diagnosis) throws ParseException {
        requireNonNull(diagnosis);
        String trimmedDiagnosis = diagnosis.trim();
        if (!Diagnosis.isValidDiagnosis(trimmedDiagnosis)) {
            throw new ParseException(Diagnosis.MESSAGE_CONSTRAINTS);
        }
        return new Diagnosis(trimmedDiagnosis);
    }


    /**
     * Parses a {@code String email} into an {@code Email}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code email} is invalid.
     */
    //TODO test cases
    public static Email parseEmail(String email) throws ParseException {
        requireNonNull(email);
        String trimmedEmail = email.trim();
        if (!Email.isValidEmail(trimmedEmail)) {
            throw new ParseException(Email.MESSAGE_CONSTRAINTS);
        }
        return new Email(trimmedEmail);
    }


}
