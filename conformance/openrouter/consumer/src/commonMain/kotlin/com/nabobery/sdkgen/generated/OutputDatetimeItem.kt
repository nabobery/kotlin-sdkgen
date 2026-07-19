package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 * An openrouter:datetime server tool output item
 */
@Serializable(with = OutputDatetimeItem.Serializer::class)
public class OutputDatetimeItem(
  /**
   * ISO 8601 datetime string
   */
  public val datetime: String,
  public val status: ToolCallStatus,
  /**
   * IANA timezone name
   */
  public val timezone: String,
  public val type: InlineComponentsSchemasOutputDatetimeItemPropertiesType,
  public val id: String? = null,
) {
  public class Builder {
    private var datetimeValue: String? = null

    public var datetime: String
      get() = requireNotNull(datetimeValue) { "datetime is required" }
      set(`value`) {
        datetimeValue = value
      }

    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var timezoneValue: String? = null

    public var timezone: String
      get() = requireNotNull(timezoneValue) { "timezone is required" }
      set(`value`) {
        timezoneValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputDatetimeItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputDatetimeItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public fun build(): OutputDatetimeItem {
      check(datetimeValue != null) { "datetime is required" }
      check(statusValue != null) { "status is required" }
      check(timezoneValue != null) { "timezone is required" }
      check(typeValue != null) { "type is required" }
      return OutputDatetimeItem(
        datetime = datetime,
        status = status,
        timezone = timezone,
        type = type,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputDatetimeItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputDatetimeItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputDatetimeItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputDatetimeItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputDatetimeItem must be a JSON object")
      val datetime = json.decodeRequired<String>(raw, "datetime")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val timezone = json.decodeRequired<String>(raw, "timezone")
      val type = json.decodeRequired<InlineComponentsSchemasOutputDatetimeItemPropertiesType>(raw, "type")
      return OutputDatetimeItem(
        datetime = datetime,
        status = status,
        timezone = timezone,
        type = type,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputDatetimeItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputDatetimeItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("datetime", value.datetime)
        put("status", json.encodeToJsonElement(value.status))
        put("timezone", value.timezone)
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputDatetimeItem(block: OutputDatetimeItem.Builder.() -> Unit): OutputDatetimeItem = OutputDatetimeItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputDatetimeItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
