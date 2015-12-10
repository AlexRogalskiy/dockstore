package io.dockstore.client.cli.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** An output parameter for a CommandLineTool. */
@org.apache.avro.specific.AvroGenerated
public class CommandOutputParameter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOutputParameter\",\"doc\":\"An output parameter for a CommandLineTool.\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"CWLType\",\"symbols\":[\"File\"],\"extends\":\"https://w3id.org/cwl/salad#PrimitiveType\",\"symbol\":[\"https://w3id.org/cwl/salad#null\",\"http://www.w3.org/2001/XMLSchema#boolean\",\"http://www.w3.org/2001/XMLSchema#int\",\"http://www.w3.org/2001/XMLSchema#long\",\"http://www.w3.org/2001/XMLSchema#float\",\"http://www.w3.org/2001/XMLSchema#double\",\"http://www.w3.org/2001/XMLSchema#string\",\"https://w3id.org/cwl/cwl#File\"]},{\"type\":\"record\",\"name\":\"CommandOutputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CommandOutputRecordField\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordField\",\"doc\":\"A field of a record.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"doc\":\"Salad data types are based on Avro schema declarations.  Refer to the\\n[Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for\\ndetailed information.\\n\\n## Simple types\\n\\n* **null**: no value\\n* **boolean**: a binary value\\n* **int**: 32-bit signed integer\\n* **long**: 64-bit signed integer\\n* **float**: single precision (32-bit) IEEE 754 floating-point number\\n* **double**: double precision (64-bit) IEEE 754 floating-point number\\n* **string**: Unicode character sequence\\n\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"RecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"RecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\"}]},{\"type\":\"record\",\"name\":\"EnumSchema\",\"doc\":\"Define an enumerated type.\\n\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true}}]},{\"type\":\"record\",\"name\":\"ArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"}}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"glob\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If provided an array, find files that match any\\npattern in the array.  If provided an expression, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Only files which actually exist will be\\nmatched and returned.\\n\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the script `context` will be an array containing any files that were\\nmatched.  Additionally, if `loadContents` is `true`, the File objects\\nwill include up to the first 64 KiB of file contents in the `contents` field.\\n\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CommandOutputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordField\"}]},{\"type\":\"record\",\"name\":\"CommandOutputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Enum_symbol\",\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"outputBinding\",\"ty","pe\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]},{\"type\":\"record\",\"name\":\"CommandOutputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Array_symbol\",\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]},\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\"]}],\"doc\":\"Specify valid types of data that may be assigned to this parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this parameter object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"A long, human-readable description of this parameter object.\",\"jsonldPredicate\":\"rdfs:comment\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Currently only applies if `type` is `File`.  A value of `true`\\nindicates that the file is read or written sequentially without\\nseeking.  An implementation may use this flag to indicate whether it is\\nvalid to stream file contents using a named pipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"default\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Any\",\"doc\":\"The **Any** type validates for any non-null value.\\n\",\"symbols\":[\"Any\"]}],\"doc\":\"The default value for this parameter if not provided in the input\\nobject.\\n\",\"jsonldPredicate\":\"cwl:default\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The unique identifier for this parameter object.\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputParameter\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"doc\":\"Describes how to handle the outputs of a process.\\n\",\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputParameter\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CommandLineTool\",\"extends\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Specify valid types of data that may be assigned to this parameter.
 */
  @Deprecated public java.lang.Object type;
  /** A short, human-readable label of this parameter object. */
  @Deprecated public java.lang.CharSequence label;
  /** A long, human-readable description of this parameter object. */
  @Deprecated public java.lang.CharSequence description;
  /** Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
 */
  @Deprecated public java.lang.Boolean streamable;
  /** The default value for this parameter if not provided in the input
object.
 */
  @Deprecated public Any default$;
  /** The unique identifier for this parameter object. */
  @Deprecated public java.lang.CharSequence id;
  /** Describes how to handle the outputs of a process.
 */
  @Deprecated public CommandOutputBinding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandOutputParameter() {}

  /**
   * All-args constructor.
   */
  public CommandOutputParameter(java.lang.Object type, java.lang.CharSequence label, java.lang.CharSequence description, java.lang.Boolean streamable, Any default$, java.lang.CharSequence id, CommandOutputBinding outputBinding) {
    this.type = type;
    this.label = label;
    this.description = description;
    this.streamable = streamable;
    this.default$ = default$;
    this.id = id;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return label;
    case 2: return description;
    case 3: return streamable;
    case 4: return default$;
    case 5: return id;
    case 6: return outputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.Object)value$; break;
    case 1: label = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: streamable = (java.lang.Boolean)value$; break;
    case 4: default$ = (Any)value$; break;
    case 5: id = (java.lang.CharSequence)value$; break;
    case 6: outputBinding = (CommandOutputBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Specify valid types of data that may be assigned to this parameter.
   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Specify valid types of data that may be assigned to this parameter.
   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'label' field.
   * A short, human-readable label of this parameter object.   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * A short, human-readable label of this parameter object.   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'description' field.
   * A long, human-readable description of this parameter object.   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * A long, human-readable description of this parameter object.   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'streamable' field.
   * Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
   */
  public java.lang.Boolean getStreamable() {
    return streamable;
  }

  /**
   * Sets the value of the 'streamable' field.
   * Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
   * @param value the value to set.
   */
  public void setStreamable(java.lang.Boolean value) {
    this.streamable = value;
  }

  /**
   * Gets the value of the 'default$' field.
   * The default value for this parameter if not provided in the input
object.
   */
  public Any getDefault$() {
    return default$;
  }

  /**
   * Sets the value of the 'default$' field.
   * The default value for this parameter if not provided in the input
object.
   * @param value the value to set.
   */
  public void setDefault$(Any value) {
    this.default$ = value;
  }

  /**
   * Gets the value of the 'id' field.
   * The unique identifier for this parameter object.   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The unique identifier for this parameter object.   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'outputBinding' field.
   * Describes how to handle the outputs of a process.
   */
  public CommandOutputBinding getOutputBinding() {
    return outputBinding;
  }

  /**
   * Sets the value of the 'outputBinding' field.
   * Describes how to handle the outputs of a process.
   * @param value the value to set.
   */
  public void setOutputBinding(CommandOutputBinding value) {
    this.outputBinding = value;
  }

  /** Creates a new CommandOutputParameter RecordBuilder */
  public static CommandOutputParameter.Builder newBuilder() {
    return new CommandOutputParameter.Builder();
  }
  
  /** Creates a new CommandOutputParameter RecordBuilder by copying an existing Builder */
  public static CommandOutputParameter.Builder newBuilder(CommandOutputParameter.Builder other) {
    return new CommandOutputParameter.Builder(other);
  }
  
  /** Creates a new CommandOutputParameter RecordBuilder by copying an existing CommandOutputParameter instance */
  public static CommandOutputParameter.Builder newBuilder(CommandOutputParameter other) {
    return new CommandOutputParameter.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandOutputParameter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOutputParameter>
    implements org.apache.avro.data.RecordBuilder<CommandOutputParameter> {

    private java.lang.Object type;
    private java.lang.CharSequence label;
    private java.lang.CharSequence description;
    private java.lang.Boolean streamable;
    private Any default$;
    private java.lang.CharSequence id;
    private CommandOutputBinding outputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(CommandOutputParameter.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandOutputParameter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.streamable)) {
        this.streamable = data().deepCopy(fields()[3].schema(), other.streamable);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[6].schema(), other.outputBinding);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandOutputParameter instance */
    private Builder(CommandOutputParameter other) {
            super(CommandOutputParameter.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.streamable)) {
        this.streamable = data().deepCopy(fields()[3].schema(), other.streamable);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[6].schema(), other.outputBinding);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public java.lang.Object getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandOutputParameter.Builder setType(java.lang.Object value) {
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
    public CommandOutputParameter.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public CommandOutputParameter.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'label' field */
    public CommandOutputParameter.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public CommandOutputParameter.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public CommandOutputParameter.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'streamable' field */
    public java.lang.Boolean getStreamable() {
      return streamable;
    }
    
    /** Sets the value of the 'streamable' field */
    public CommandOutputParameter.Builder setStreamable(java.lang.Boolean value) {
      validate(fields()[3], value);
      this.streamable = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'streamable' field has been set */
    public boolean hasStreamable() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'streamable' field */
    public CommandOutputParameter.Builder clearStreamable() {
      streamable = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'default$' field */
    public Any getDefault$() {
      return default$;
    }
    
    /** Sets the value of the 'default$' field */
    public CommandOutputParameter.Builder setDefault$(Any value) {
      validate(fields()[4], value);
      this.default$ = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'default$' field has been set */
    public boolean hasDefault$() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'default$' field */
    public CommandOutputParameter.Builder clearDefault$() {
      default$ = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public CommandOutputParameter.Builder setId(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.id = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'id' field */
    public CommandOutputParameter.Builder clearId() {
      id = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'outputBinding' field */
    public CommandOutputBinding getOutputBinding() {
      return outputBinding;
    }
    
    /** Sets the value of the 'outputBinding' field */
    public CommandOutputParameter.Builder setOutputBinding(CommandOutputBinding value) {
      validate(fields()[6], value);
      this.outputBinding = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'outputBinding' field has been set */
    public boolean hasOutputBinding() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'outputBinding' field */
    public CommandOutputParameter.Builder clearOutputBinding() {
      outputBinding = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public CommandOutputParameter build() {
      try {
        CommandOutputParameter record = new CommandOutputParameter();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.Object) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.streamable = fieldSetFlags()[3] ? this.streamable : (java.lang.Boolean) defaultValue(fields()[3]);
        record.default$ = fieldSetFlags()[4] ? this.default$ : (Any) defaultValue(fields()[4]);
        record.id = fieldSetFlags()[5] ? this.id : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.outputBinding = fieldSetFlags()[6] ? this.outputBinding : (CommandOutputBinding) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
