/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.globalization.browser;

import com.googlecode.gwtphonegap.client.globalization.CLocale;
import com.googlecode.gwtphonegap.client.globalization.CNumberPattern;
import com.googlecode.gwtphonegap.client.globalization.DateNameOptions;
import com.googlecode.gwtphonegap.client.globalization.DateOptions;
import com.googlecode.gwtphonegap.client.globalization.DatePattern;
import com.googlecode.gwtphonegap.client.globalization.DateValue;
import com.googlecode.gwtphonegap.client.globalization.Globalization;
import com.googlecode.gwtphonegap.client.globalization.GlobalizationCallback;
import com.googlecode.gwtphonegap.client.globalization.GlobalizationError;
import com.googlecode.gwtphonegap.client.globalization.Language;
import com.googlecode.gwtphonegap.client.globalization.NumberOptions;
import com.googlecode.gwtphonegap.collection.shared.CollectionFactory;
import com.googlecode.gwtphonegap.collection.shared.LightArray;

import java.util.Date;

public class GlobalizationBrowserImpl implements Globalization {

  @Override
  public void getPreferredLanguage(GlobalizationCallback<Language, GlobalizationError> callback) {
    callback.onSuccess(new Language() {

      @Override
      public String getValue() {
        return "English";
      }
    });

  }

  @Override
  public void getLocaleName(GlobalizationCallback<CLocale, GlobalizationError> callback) {
    callback.onSuccess(new CLocale() {

      @Override
      public String getValue() {
        return "en_US";
      }
    });

  }

  @Override
  public void convertDateToString(Date date,
      GlobalizationCallback<DateValue, GlobalizationError> callback) {
    convertDateToString(date, new DateOptions(DateOptions.LENGTH_SHORT,
        DateOptions.SELECTOR_DATE_AND_TIME), callback);

  }

  @Override
  public void convertDateToString(Date date, DateOptions options,
      GlobalizationCallback<DateValue, GlobalizationError> callback) {

    callback.onFailure(new GlobalizationError() {

      @Override
      public String getMessage() {
        return "";
      }

      @Override
      public int getCode() {
        return GlobalizationError.FORMATTING_ERROR;
      }
    });

  }

  @Override
  public void convertStringToDate(String dateString,
      GlobalizationCallback<Date, GlobalizationError> callback) {
    convertStringToDate(dateString, new DateOptions(DateOptions.LENGTH_SHORT,
        DateOptions.SELECTOR_DATE_AND_TIME), callback);

  }

  @Override
  public void convertStringToDate(String dateString, DateOptions options,
      GlobalizationCallback<Date, GlobalizationError> callback) {
    callback.onFailure(new GlobalizationError() {

      @Override
      public String getMessage() {
        return "";
      }

      @Override
      public int getCode() {
        return GlobalizationError.FORMATTING_ERROR;
      }
    });

  }

  @Override
  public void getDatePattern(GlobalizationCallback<DatePattern, GlobalizationError> callback) {
    callback.onSuccess(new DatePattern() {

      @Override
      public String getPattern() {
        return "MM/dd/yyyy";
      }
    });

  }

  @Override
  public void getDatePattern(DateOptions options,
      GlobalizationCallback<DatePattern, GlobalizationError> callback) {
    callback.onSuccess(new DatePattern() {

      @Override
      public String getPattern() {
        return "MM/dd/yyyy";
      }
    });

  }

  @Override
  public void getDateNames(GlobalizationCallback<LightArray<String>, GlobalizationError> callback) {
    LightArray<String> months = CollectionFactory.constructArray();
    months.push("Jan");
    months.push("Feb");
    months.push("Mar");
    months.push("Apr");
    months.push("May");
    months.push("Jun");
    months.push("Jul");
    months.push("Aug");
    months.push("Sep");
    months.push("Oct");
    months.push("Nov");
    months.push("Dec");

    callback.onSuccess(months);

  }

  @Override
  public void getDateNames(DateNameOptions options,
      GlobalizationCallback<LightArray<String>, GlobalizationError> callback) {
    getDateNames(callback);

  }

  @Override
  public void isDayLightSavingsTime(Date date,
      GlobalizationCallback<Boolean, GlobalizationError> callback) {
    callback.onSuccess(true);

  }

  @Override
  public void getFirstDayOfWeek(GlobalizationCallback<Integer, GlobalizationError> callback) {
    callback.onSuccess(1);

  }

  @Override
  public void numberToString(double number, NumberOptions options,
      GlobalizationCallback<String, GlobalizationError> callback) {
    callback.onSuccess("" + number);

  }

  @Override
  public void numberToString(double number,
      GlobalizationCallback<String, GlobalizationError> callback) {
    callback.onSuccess("" + number);

  }

  @Override
  public void stringToNumber(String stringToFormat, NumberOptions options,
      GlobalizationCallback<Number, GlobalizationError> callback) {
    callback.onSuccess(Double.parseDouble(stringToFormat));

  }

  @Override
  public void stringToNumber(String stringToFormat,
      GlobalizationCallback<Number, GlobalizationError> callback) {
    callback.onSuccess(Double.parseDouble(stringToFormat));

  }

  @Override
  public void getNumberPattern(NumberOptions options,
      GlobalizationCallback<CNumberPattern, GlobalizationError> callback) {
    callback.onFailure(new GlobalizationError() {

      @Override
      public String getMessage() {
        return "";
      }

      @Override
      public int getCode() {
        return GlobalizationError.PATTERN_ERROR;
      }
    });

  }

  @Override
  public void getNumberPattern(GlobalizationCallback<CNumberPattern, GlobalizationError> callback) {
    callback.onFailure(new GlobalizationError() {

      @Override
      public String getMessage() {
        return "";
      }

      @Override
      public int getCode() {
        return GlobalizationError.PATTERN_ERROR;
      }
    });

  }

  @Override
  public void getCurrencyPattern(String currencyCode,
      GlobalizationCallback<CNumberPattern, GlobalizationError> callback) {
    callback.onFailure(new GlobalizationError() {

      @Override
      public String getMessage() {
        return "";
      }

      @Override
      public int getCode() {
        return GlobalizationError.PATTERN_ERROR;
      }
    });

  }

}
