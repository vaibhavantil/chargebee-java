package com.chargebee.models;

import com.chargebee.*;
import com.chargebee.internal.*;
import com.chargebee.internal.HttpUtil.Method;
import com.chargebee.models.enums.*;
import org.json.*;
import java.io.*;
import java.sql.Timestamp;
import java.util.*;

public class Address extends Resource<Address> {

    //Constructors
    //============

    public Address(String jsonStr) {
        super(jsonStr);
    }

    public Address(JSONObject jsonObj) {
        super(jsonObj);
    }

    // Fields
    //=======

    public String label() {
        return reqString("label");
    }

    public String firstName() {
        return optString("first_name");
    }

    public String lastName() {
        return optString("last_name");
    }

    public String addr() {
        return optString("addr");
    }

    public String extendedAddr() {
        return optString("extended_addr");
    }

    public String city() {
        return optString("city");
    }

    public String state() {
        return optString("state");
    }

    public String country() {
        return optString("country");
    }

    public String zip() {
        return optString("zip");
    }

    public String subscriptionId() {
        return reqString("subscription_id");
    }

    // Operations
    //===========

    public static UpdateRequest update() throws IOException {
        String url = url("addresses");
        return new UpdateRequest(Method.POST, url);
    }

    public static RetrieveRequest retrieve() throws IOException {
        String url = url("addresses");
        return new RetrieveRequest(Method.GET, url);
    }


    // Operation Request Classes
    //==========================

    public static class UpdateRequest extends Request {

        private Params params = new Params();

        private UpdateRequest(Method httpMeth, String url) {
            super(httpMeth, url);
        }

        public UpdateRequest subscriptionId(String subscriptionId) {
            params.add("subscription_id", subscriptionId);
            return this;
        }

        public UpdateRequest label(String label) {
            params.add("label", label);
            return this;
        }

        public UpdateRequest firstName(String firstName) {
            params.addOpt("first_name", firstName);
            return this;
        }

        public UpdateRequest lastName(String lastName) {
            params.addOpt("last_name", lastName);
            return this;
        }

        public UpdateRequest addr(String addr) {
            params.addOpt("addr", addr);
            return this;
        }

        public UpdateRequest extendedAddr(String extendedAddr) {
            params.addOpt("extended_addr", extendedAddr);
            return this;
        }

        public UpdateRequest city(String city) {
            params.addOpt("city", city);
            return this;
        }

        public UpdateRequest state(String state) {
            params.addOpt("state", state);
            return this;
        }

        public UpdateRequest zip(String zip) {
            params.addOpt("zip", zip);
            return this;
        }

        public UpdateRequest country(String country) {
            params.addOpt("country", country);
            return this;
        }

        @Override
        public Params params() {
            return params;
        }
    }

    public static class RetrieveRequest extends Request {

        private Params params = new Params();

        private RetrieveRequest(Method httpMeth, String url) {
            super(httpMeth, url);
        }

        public RetrieveRequest subscriptionId(String subscriptionId) {
            params.add("subscription_id", subscriptionId);
            return this;
        }

        public RetrieveRequest label(String label) {
            params.add("label", label);
            return this;
        }

        @Override
        public Params params() {
            return params;
        }
    }

}