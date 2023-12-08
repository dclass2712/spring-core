package org.springcore.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String name1;
    private List<String> nameList;
    private Set<String> nameSet;
    private Map<String, String> nameMap;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public Set<String> getNameSet() {
        return nameSet;
    }

    public void setNameSet(Set<String> nameSet) {
        this.nameSet = nameSet;
    }

    public Map<String, String> getNameMap() {
        return nameMap;
    }

    public void setNameMap(Map<String, String> nameMap) {
        this.nameMap = nameMap;
    }
}
