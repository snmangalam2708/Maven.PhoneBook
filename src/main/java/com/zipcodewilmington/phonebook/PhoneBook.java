package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> contacts;
    List<String> phoneNumbers;

    public PhoneBook(Map<String, List<String>> map) {

        this.contacts = new LinkedHashMap<>();
        this.contacts = map;
        this.phoneNumbers = new ArrayList<>();
    }

    public PhoneBook() {

        this(null);
        this.contacts = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {

        this.phoneNumbers.add(phoneNumber);
        this.contacts.put(name, phoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {

        this.phoneNumbers.addAll(Arrays.asList(phoneNumbers));
        this.contacts.put(name, this.phoneNumbers);
    }

    public void remove(String name) {

        this.contacts.remove(name);
    }

    public Boolean hasEntry(String name) {

        return this.phoneNumbers.contains(name);
    }

    public List<String> lookup(String name) {

        List<String> result = new ArrayList<>();
        result = this.contacts.get(name);
        return result;
    }

    public String reverseLookup(String phoneNumber)  {

        String name = "";
        for (Map.Entry<String, List<String>> value : this.contacts.entrySet()) {
            name = value.getKey();
        }
        return name;
    }

    public List<String> getAllContactNames() {

        List<String> names = new ArrayList<>();
        for (Map.Entry<String, List<String>> value : this.contacts.entrySet()) {
            names.add(value.getKey());
        }
        return names;
    }

    public Map<String, List<String>> getMap() {

        return this.contacts;
    }
}
