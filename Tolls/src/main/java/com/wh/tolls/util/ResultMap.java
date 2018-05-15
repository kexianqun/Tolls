package com.wh.tolls.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ResultMap implements Serializable{
    private static final long serialVersionUID = -7677969583641452256L;
    private HashMap<String, Object> tradeMap = new HashMap();
    private LinkedHashMap<String, String> storageMap = new LinkedHashMap();
    private String exception = null;
    private ArrayList<String> errorList = new ArrayList();


    public ResultMap() {
    }

    public ResultMap(HashMap<String, Object> pMap) {
        this.tradeMap.putAll(pMap);
    }

    public ResultMap addError(String error) {
        this.errorList.add(error);
        return this;
    }

    public ResultMap addErrors(Collection<String> errors) {
        this.errorList.addAll(errors);
        return this;
    }

    public ResultMap addData(String key, Object value) {
        this.tradeMap.put(key, value);
        return this;
    }

    public ResultMap addData(Object value) {
        this.tradeMap.put(value.getClass().getName(), value);
        return this;
    }

    public ResultMap addData(HashMap<String, Object> pMap) {
        this.tradeMap.putAll(pMap);
        return this;
    }

    public Object getData(String key) {
        return this.tradeMap.get(key);
    }

    private boolean hasKey(String key) {
        return this.tradeMap.containsKey(key) && this.tradeMap.get(key) != null;
    }

    public void removeData(String key) {
        this.tradeMap.remove(key);
        this.storageMap.remove(key);
    }

    public void removeStorage(String key) {
        this.storageMap.remove(key);
    }

    public void clearData() {
        this.tradeMap.clear();
    }

    public void clearStorage() {
        this.storageMap.clear();
    }

    public void clearTradeInfo() {
        this.tradeMap.clear();
        this.storageMap.clear();
        this.errorList.clear();
        this.exception = null;
    }

    public boolean hasError() {
        return this.exception != null || this.errorList.size() > 0;
    }


    public HashMap<String, Object> getTradeMap() {
        return this.tradeMap;
    }

    public void setTradeMap(HashMap<String, Object> tradeMap) {
        this.tradeMap = tradeMap;
    }

    public LinkedHashMap<String, String> getStorageMap() {
        return this.storageMap;
    }

    public ArrayList<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(ArrayList<String> errorList) {
        this.errorList = errorList;
    }

    public String getException() {
        return this.exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }


    @Override
    public String toString() {
        return "ResultMap{" +
                "tradeMap=" + tradeMap +
                ", storageMap=" + storageMap +
                ", exception='" + exception + '\'' +
                ", errorList=" + errorList +
                '}';
    }
}
