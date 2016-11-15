/*
 * Copyright 2015 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.vmware.photon.controller.api.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Step API representation.
 */
public class Step {
  public static final String KIND = "step";

  private int sequence;

  private String state;

  private List<ApiError> errors = new ArrayList<>();

  private List<ApiError> warnings = new ArrayList<>();

  private String operation;

  private Date startedTime;

  private Date queuedTime;

  private Date endTime;

  private Map<String, String> options;

  public String getKind() {
    return KIND;
  }

  public int getSequence() {
    return sequence;
  }

  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public List<ApiError> getErrors() {
    return errors;
  }

  public void addError(ApiError apiError) {
    errors.add(apiError);
  }

  public List<ApiError> getWarnings() {
    return warnings;
  }

  public void addWarning(ApiError apiWarning) {
    warnings.add(apiWarning);
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Date getStartedTime() {
    return startedTime;
  }

  public void setStartedTime(Date startedTime) {
    this.startedTime = startedTime;
  }

  public Date getQueuedTime() {
    return queuedTime;
  }

  public void setQueuedTime(Date queuedTime) {
    this.queuedTime = queuedTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Step other = (Step) o;

    if (!this.getKind().equals(other.getKind())) {
      return false;
    }

    return Objects.equals(operation, other.operation) &&
        Objects.equals(sequence, other.sequence) &&
        Objects.equals(state, other.state) &&
        Objects.equals(errors, other.errors) &&
        Objects.equals(warnings, other.warnings) &&
        Objects.equals(startedTime, other.startedTime) &&
        Objects.equals(queuedTime, other.queuedTime) &&
        Objects.equals(endTime, other.endTime) &&
        Objects.equals(options, other.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, sequence, state, errors, warnings, startedTime, queuedTime, endTime, options);
  }

}
