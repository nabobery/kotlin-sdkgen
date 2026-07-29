package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class DeletedTerminalReaderView(
  public val deleted: Boolean,
  @SerialName("device_type")
  public val deviceType: InlineDeletedTerminalReaderDeviceTypeX5fd400f5,
  public val id: String,
  @SerialName("object")
  public val objectValue: InlineDeletedTerminalReaderObjectValueX92c90936,
  @SerialName("serial_number")
  public val serialNumber: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_terminal.reader
 */
@Serializable(with = DeletedTerminalReader.Serializer::class)
public class DeletedTerminalReader(
  /**
   * Always true for a deleted object
   */
  public val deleted: Boolean,
  /**
   * Device type of the reader.
   */
  public val deviceType: InlineDeletedTerminalReaderDeviceTypeX5fd400f5,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineDeletedTerminalReaderObjectValueX92c90936,
  /**
   * Serial number of the reader.
   */
  public val serialNumber: String,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    private var deviceTypeValue: InlineDeletedTerminalReaderDeviceTypeX5fd400f5? = null

    public var deviceType: InlineDeletedTerminalReaderDeviceTypeX5fd400f5
      get() = requireNotNull(deviceTypeValue) { "deviceType is required" }
      set(`value`) {
        deviceTypeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineDeletedTerminalReaderObjectValueX92c90936? = null

    public var objectValue: InlineDeletedTerminalReaderObjectValueX92c90936
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var serialNumberValue: String? = null

    public var serialNumber: String
      get() = requireNotNull(serialNumberValue) { "serialNumber is required" }
      set(`value`) {
        serialNumberValue = value
      }

    public fun build(): DeletedTerminalReader {
      check(deletedValue != null) { "deleted is required" }
      check(deviceTypeValue != null) { "deviceType is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(serialNumberValue != null) { "serialNumber is required" }
      return DeletedTerminalReader(
        deleted = deleted,
        deviceType = deviceType,
        id = id,
        objectValue = objectValue,
        serialNumber = serialNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedTerminalReader = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeletedTerminalReader> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedTerminalReader {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedTerminalReader")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedTerminalReader must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val deviceType = json.decodeRequired<InlineDeletedTerminalReaderDeviceTypeX5fd400f5>(rawObject, "device_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedTerminalReaderObjectValueX92c90936>(rawObject, "object")
      val serialNumber = json.decodeRequired<String>(rawObject, "serial_number")
      return DeletedTerminalReader(
        deleted = deleted,
        deviceType = deviceType,
        id = id,
        objectValue = objectValue,
        serialNumber = serialNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedTerminalReader) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedTerminalReader")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
        put("device_type", json.encodeToJsonElement(value.deviceType))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("serial_number", value.serialNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deletedTerminalReader(block: DeletedTerminalReader.Builder.() -> Unit): DeletedTerminalReader = DeletedTerminalReader.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedTerminalReader is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
