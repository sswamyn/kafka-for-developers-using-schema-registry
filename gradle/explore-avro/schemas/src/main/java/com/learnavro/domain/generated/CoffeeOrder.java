/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.learnavro.domain.generated;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CoffeeOrder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7702509105332806328L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CoffeeOrder\",\"namespace\":\"com.learnavro.domain.generated\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"record\",\"name\":\"OrderId\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}},{\"name\":\"orderLineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderLineItem\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"Size\",\"symbols\":[\"SMALL\",\"MEDIUM\",\"LARGE\"]}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"cost\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":3,\"scale\":2}}]}}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"NEW\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CoffeeOrder> ENCODER =
      new BinaryMessageEncoder<CoffeeOrder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CoffeeOrder> DECODER =
      new BinaryMessageDecoder<CoffeeOrder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CoffeeOrder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CoffeeOrder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CoffeeOrder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CoffeeOrder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CoffeeOrder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CoffeeOrder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CoffeeOrder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CoffeeOrder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.learnavro.domain.generated.OrderId id;
  @Deprecated public java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;
  @Deprecated public java.lang.String status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CoffeeOrder() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param orderLineItems The new value for orderLineItems
   * @param status The new value for status
   */
  public CoffeeOrder(com.learnavro.domain.generated.OrderId id, java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems, java.lang.String status) {
    this.id = id;
    this.orderLineItems = orderLineItems;
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return orderLineItems;
    case 2: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (com.learnavro.domain.generated.OrderId)value$; break;
    case 1: orderLineItems = (java.util.List<com.learnavro.domain.generated.OrderLineItem>)value$; break;
    case 2: status = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public com.learnavro.domain.generated.OrderId getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(com.learnavro.domain.generated.OrderId value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'orderLineItems' field.
   * @return The value of the 'orderLineItems' field.
   */
  public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
    return orderLineItems;
  }


  /**
   * Sets the value of the 'orderLineItems' field.
   * @param value the value to set.
   */
  public void setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
    this.orderLineItems = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.String getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder() {
    return new com.learnavro.domain.generated.CoffeeOrder.Builder();
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrder.Builder other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder(other);
    }
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder by copying an existing CoffeeOrder instance.
   * @param other The existing instance to copy.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrder other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder(other);
    }
  }

  /**
   * RecordBuilder for CoffeeOrder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CoffeeOrder>
    implements org.apache.avro.data.RecordBuilder<CoffeeOrder> {

    private com.learnavro.domain.generated.OrderId id;
    private com.learnavro.domain.generated.OrderId.Builder idBuilder;
    private java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;
    private java.lang.String status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasIdBuilder()) {
        this.idBuilder = com.learnavro.domain.generated.OrderId.newBuilder(other.getIdBuilder());
      }
      if (isValidValue(fields()[1], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[1].schema(), other.orderLineItems);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CoffeeOrder instance
     * @param other The existing instance to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      this.idBuilder = null;
      if (isValidValue(fields()[1], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[1].schema(), other.orderLineItems);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public com.learnavro.domain.generated.OrderId getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setId(com.learnavro.domain.generated.OrderId value) {
      validate(fields()[0], value);
      this.idBuilder = null;
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'id' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.learnavro.domain.generated.OrderId.Builder getIdBuilder() {
      if (idBuilder == null) {
        if (hasId()) {
          setIdBuilder(com.learnavro.domain.generated.OrderId.newBuilder(id));
        } else {
          setIdBuilder(com.learnavro.domain.generated.OrderId.newBuilder());
        }
      }
      return idBuilder;
    }

    /**
     * Sets the Builder instance for the 'id' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.learnavro.domain.generated.CoffeeOrder.Builder setIdBuilder(com.learnavro.domain.generated.OrderId.Builder value) {
      clearId();
      idBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'id' field has an active Builder instance
     * @return True if the 'id' field has an active Builder instance
     */
    public boolean hasIdBuilder() {
      return idBuilder != null;
    }

    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearId() {
      id = null;
      idBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderLineItems' field.
      * @return The value.
      */
    public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
      return orderLineItems;
    }


    /**
      * Sets the value of the 'orderLineItems' field.
      * @param value The value of 'orderLineItems'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
      validate(fields()[1], value);
      this.orderLineItems = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderLineItems' field has been set.
      * @return True if the 'orderLineItems' field has been set, false otherwise.
      */
    public boolean hasOrderLineItems() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderLineItems' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearOrderLineItems() {
      orderLineItems = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setStatus(java.lang.String value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CoffeeOrder build() {
      try {
        CoffeeOrder record = new CoffeeOrder();
        if (idBuilder != null) {
          try {
            record.id = this.idBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("id"));
            throw e;
          }
        } else {
          record.id = fieldSetFlags()[0] ? this.id : (com.learnavro.domain.generated.OrderId) defaultValue(fields()[0]);
        }
        record.orderLineItems = fieldSetFlags()[1] ? this.orderLineItems : (java.util.List<com.learnavro.domain.generated.OrderLineItem>) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CoffeeOrder>
    WRITER$ = (org.apache.avro.io.DatumWriter<CoffeeOrder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CoffeeOrder>
    READER$ = (org.apache.avro.io.DatumReader<CoffeeOrder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










