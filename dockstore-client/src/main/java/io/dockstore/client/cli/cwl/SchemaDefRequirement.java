package io.dockstore.client.cli.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** This field consists of an
array of type definitions which must be used when interpreting the `inputs` and
`outputs` fields.  When a symbolic type is encountered that is not in
[`Datatype`](#datatype), the implementation must check if
the type is defined in `schemaDefs` and use that definition.  If the type is not
found in `schemaDefs`, it is an error.  The entries in `schemaDefs` must be
processed in the order listed such that later schema definitions may refer to
earlier schema definitions.
 */
@org.apache.avro.specific.AvroGenerated
public class SchemaDefRequirement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SchemaDefRequirement\",\"doc\":\"This field consists of an\\narray of type definitions which must be used when interpreting the `inputs` and\\n`outputs` fields.  When a symbolic type is encountered that is not in\\n[`Datatype`](#datatype), the implementation must check if\\nthe type is defined in `schemaDefs` and use that definition.  If the type is not\\nfound in `schemaDefs`, it is an error.  The entries in `schemaDefs` must be\\nprocessed in the order listed such that later schema definitions may refer to\\nearlier schema definitions.\\n\",\"fields\":[{\"name\":\"class\",\"type\":\"string\",\"doc\":\"The specific requirement type.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"@type\"},\"inherited_from\":\"https://w3id.org/cwl/cwl#ProcessRequirement\"},{\"name\":\"types\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"InputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"InputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"doc\":\"Salad data types are based on Avro schema declarations.  Refer to the\\n[Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for\\ndetailed information.\\n\\n## Simple types\\n\\n* **null**: no value\\n* **boolean**: a binary value\\n* **int**: 32-bit signed integer\\n* **long**: 64-bit signed integer\\n* **float**: single precision (32-bit) IEEE 754 floating-point number\\n* **double**: double precision (64-bit) IEEE 754 floating-point number\\n* **string**: Unicode character sequence\\n\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},\"InputRecordSchema\",{\"type\":\"record\",\"name\":\"InputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Binding\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\"}],\"docParent\":\"https://w3id.org/cwl/cwl#Parameter\"}],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"type\":\"record\",\"name\":\"InputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#RecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordField\"}]},\"InputEnumSchema\",\"InputArraySchema\",{\"type\":\"record\",\"name\":\"CommandInputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CommandInputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[\"PrimitiveType\",\"CommandInputRecordSchema\",{\"type\":\"record\",\"name\":\"CommandInputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Enum_symbol\",\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" re","fers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#file) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the \\\"context\\\" of the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CommandInputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]},{\"type\":\"record\",\"name\":\"CommandInputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Array_symbol\",\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputRecordField\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordField\"}]},\"CommandInputEnumSchema\",\"CommandInputArraySchema\"]},\"doc\":\"The list of type definitions.\"}],\"extends\":\"https://w3id.org/cwl/cwl#ProcessRequirement\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The specific requirement type. */
  @Deprecated public java.lang.CharSequence class$;
  /** The list of type definitions. */
  @Deprecated public java.util.List<java.lang.Object> types;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SchemaDefRequirement() {}

  /**
   * All-args constructor.
   */
  public SchemaDefRequirement(java.lang.CharSequence class$, java.util.List<java.lang.Object> types) {
    this.class$ = class$;
    this.types = types;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return class$;
    case 1: return types;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: class$ = (java.lang.CharSequence)value$; break;
    case 1: types = (java.util.List<java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'class$' field.
   * The specific requirement type.   */
  public java.lang.CharSequence getClass$() {
    return class$;
  }

  /**
   * Sets the value of the 'class$' field.
   * The specific requirement type.   * @param value the value to set.
   */
  public void setClass$(java.lang.CharSequence value) {
    this.class$ = value;
  }

  /**
   * Gets the value of the 'types' field.
   * The list of type definitions.   */
  public java.util.List<java.lang.Object> getTypes() {
    return types;
  }

  /**
   * Sets the value of the 'types' field.
   * The list of type definitions.   * @param value the value to set.
   */
  public void setTypes(java.util.List<java.lang.Object> value) {
    this.types = value;
  }

  /** Creates a new SchemaDefRequirement RecordBuilder */
  public static SchemaDefRequirement.Builder newBuilder() {
    return new SchemaDefRequirement.Builder();
  }
  
  /** Creates a new SchemaDefRequirement RecordBuilder by copying an existing Builder */
  public static SchemaDefRequirement.Builder newBuilder(SchemaDefRequirement.Builder other) {
    return new SchemaDefRequirement.Builder(other);
  }
  
  /** Creates a new SchemaDefRequirement RecordBuilder by copying an existing SchemaDefRequirement instance */
  public static SchemaDefRequirement.Builder newBuilder(SchemaDefRequirement other) {
    return new SchemaDefRequirement.Builder(other);
  }
  
  /**
   * RecordBuilder for SchemaDefRequirement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SchemaDefRequirement>
    implements org.apache.avro.data.RecordBuilder<SchemaDefRequirement> {

    private java.lang.CharSequence class$;
    private java.util.List<java.lang.Object> types;

    /** Creates a new Builder */
    private Builder() {
      super(SchemaDefRequirement.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(SchemaDefRequirement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.types)) {
        this.types = data().deepCopy(fields()[1].schema(), other.types);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SchemaDefRequirement instance */
    private Builder(SchemaDefRequirement other) {
            super(SchemaDefRequirement.SCHEMA$);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.types)) {
        this.types = data().deepCopy(fields()[1].schema(), other.types);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'class$' field */
    public java.lang.CharSequence getClass$() {
      return class$;
    }
    
    /** Sets the value of the 'class$' field */
    public SchemaDefRequirement.Builder setClass$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.class$ = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'class$' field has been set */
    public boolean hasClass$() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'class$' field */
    public SchemaDefRequirement.Builder clearClass$() {
      class$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'types' field */
    public java.util.List<java.lang.Object> getTypes() {
      return types;
    }
    
    /** Sets the value of the 'types' field */
    public SchemaDefRequirement.Builder setTypes(java.util.List<java.lang.Object> value) {
      validate(fields()[1], value);
      this.types = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'types' field has been set */
    public boolean hasTypes() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'types' field */
    public SchemaDefRequirement.Builder clearTypes() {
      types = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SchemaDefRequirement build() {
      try {
        SchemaDefRequirement record = new SchemaDefRequirement();
        record.class$ = fieldSetFlags()[0] ? this.class$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.types = fieldSetFlags()[1] ? this.types : (java.util.List<java.lang.Object>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
