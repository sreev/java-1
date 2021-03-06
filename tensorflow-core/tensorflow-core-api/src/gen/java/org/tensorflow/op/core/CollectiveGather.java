/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.tools.Shape;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Mutually accumulates multiple tensors of identical type and shape.
 * 
 * @param <T> data type for {@code output()} output
 */
public final class CollectiveGather<T extends TNumber> extends RawOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.CollectiveGather}
   */
  public static class Options {
    
    /**
     * @param communicationHint 
     */
    public Options communicationHint(String communicationHint) {
      this.communicationHint = communicationHint;
      return this;
    }
    
    private String communicationHint;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new CollectiveGather operation.
   * 
   * @param scope current scope
   * @param input 
   * @param groupSize 
   * @param groupKey 
   * @param instanceKey 
   * @param shape 
   * @param options carries optional attributes values
   * @return a new instance of CollectiveGather
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> CollectiveGather<T> create(Scope scope, Operand<T> input, Long groupSize, Long groupKey, Long instanceKey, Shape shape, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("CollectiveGather", scope.makeOpName("CollectiveGather"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("group_size", groupSize);
    opBuilder.setAttr("group_key", groupKey);
    opBuilder.setAttr("instance_key", instanceKey);
    opBuilder.setAttr("shape", shape);
    if (options != null) {
      for (Options opts : options) {
        if (opts.communicationHint != null) {
          opBuilder.setAttr("communication_hint", opts.communicationHint);
        }
      }
    }
    return new CollectiveGather<T>(opBuilder.build());
  }
  
  /**
   * @param communicationHint 
   */
  public static Options communicationHint(String communicationHint) {
    return new Options().communicationHint(communicationHint);
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private CollectiveGather(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
