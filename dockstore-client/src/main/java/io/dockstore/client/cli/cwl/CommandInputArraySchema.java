package io.dockstore.client.cli.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandInputArraySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandInputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"doc\":\"Salad data types are based on Avro schema declarations.  Refer to the\\n[Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for\\ndetailed information.\\n\\n## Simple types\\n\\n* **null**: no value\\n* **boolean**: a binary value\\n* **int**: 32-bit signed integer\\n* **long**: 64-bit signed integer\\n* **float**: single precision (32-bit) IEEE 754 floating-point number\\n* **double**: double precision (64-bit) IEEE 754 floating-point number\\n* **string**: Unicode character sequence\\n\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"CommandInputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CommandInputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[\"PrimitiveType\",\"CommandInputRecordSchema\",{\"type\":\"record\",\"name\":\"CommandInputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" refers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#file) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the \\\"context\\\" of the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CommandInputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]},\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputRecordField\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"","https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordField\"}]},\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `array` */
  @Deprecated public Array_symbol type;
  /** Defines the type of the array elements. */
  @Deprecated public java.lang.Object items;
  @Deprecated public CommandLineBinding inputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandInputArraySchema() {}

  /**
   * All-args constructor.
   */
  public CommandInputArraySchema(Array_symbol type, java.lang.Object items, CommandLineBinding inputBinding) {
    this.type = type;
    this.items = items;
    this.inputBinding = inputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return items;
    case 2: return inputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Array_symbol)value$; break;
    case 1: items = (java.lang.Object)value$; break;
    case 2: inputBinding = (CommandLineBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `array`   */
  public Array_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `array`   * @param value the value to set.
   */
  public void setType(Array_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'items' field.
   * Defines the type of the array elements.   */
  public java.lang.Object getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * Defines the type of the array elements.   * @param value the value to set.
   */
  public void setItems(java.lang.Object value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'inputBinding' field.
   */
  public CommandLineBinding getInputBinding() {
    return inputBinding;
  }

  /**
   * Sets the value of the 'inputBinding' field.
   * @param value the value to set.
   */
  public void setInputBinding(CommandLineBinding value) {
    this.inputBinding = value;
  }

  /** Creates a new CommandInputArraySchema RecordBuilder */
  public static CommandInputArraySchema.Builder newBuilder() {
    return new CommandInputArraySchema.Builder();
  }
  
  /** Creates a new CommandInputArraySchema RecordBuilder by copying an existing Builder */
  public static CommandInputArraySchema.Builder newBuilder(CommandInputArraySchema.Builder other) {
    return new CommandInputArraySchema.Builder(other);
  }
  
  /** Creates a new CommandInputArraySchema RecordBuilder by copying an existing CommandInputArraySchema instance */
  public static CommandInputArraySchema.Builder newBuilder(CommandInputArraySchema other) {
    return new CommandInputArraySchema.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandInputArraySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandInputArraySchema>
    implements org.apache.avro.data.RecordBuilder<CommandInputArraySchema> {

    private Array_symbol type;
    private java.lang.Object items;
    private CommandLineBinding inputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(CommandInputArraySchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandInputArraySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[2].schema(), other.inputBinding);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandInputArraySchema instance */
    private Builder(CommandInputArraySchema other) {
            super(CommandInputArraySchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[2].schema(), other.inputBinding);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Array_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandInputArraySchema.Builder setType(Array_symbol value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public CommandInputArraySchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'items' field */
    public java.lang.Object getItems() {
      return items;
    }
    
    /** Sets the value of the 'items' field */
    public CommandInputArraySchema.Builder setItems(java.lang.Object value) {
      validate(fields()[1], value);
      this.items = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'items' field has been set */
    public boolean hasItems() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'items' field */
    public CommandInputArraySchema.Builder clearItems() {
      items = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'inputBinding' field */
    public CommandLineBinding getInputBinding() {
      return inputBinding;
    }
    
    /** Sets the value of the 'inputBinding' field */
    public CommandInputArraySchema.Builder setInputBinding(CommandLineBinding value) {
      validate(fields()[2], value);
      this.inputBinding = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'inputBinding' field has been set */
    public boolean hasInputBinding() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'inputBinding' field */
    public CommandInputArraySchema.Builder clearInputBinding() {
      inputBinding = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public CommandInputArraySchema build() {
      try {
        CommandInputArraySchema record = new CommandInputArraySchema();
        record.type = fieldSetFlags()[0] ? this.type : (Array_symbol) defaultValue(fields()[0]);
        record.items = fieldSetFlags()[1] ? this.items : (java.lang.Object) defaultValue(fields()[1]);
        record.inputBinding = fieldSetFlags()[2] ? this.inputBinding : (CommandLineBinding) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
