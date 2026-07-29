package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * Value list items allow you to add specific values to a given Radar value list, which can then be used in rules.
 *
 * Related guide: [Managing list items](https://docs.stripe.com/radar/lists#managing-list-items)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list_item
 */
@Serializable(with = RadarValueListItem.Serializer::class)
public class RadarValueListItem(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The name or email address of the user who added this item to the value list.
   */
  public val createdBy: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineRadarValueListItemObjectValueX0f6091f8,
  /**
   * The value of the item.
   */
  public val `value`: String,
  /**
   * The identifier of the value list this item belongs to.
   */
  public val valueList: String,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var createdByValue: String? = null

    public var createdBy: String
      get() = requireNotNull(createdByValue) { "createdBy is required" }
      set(`value`) {
        createdByValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineRadarValueListItemObjectValueX0f6091f8? = null

    public var objectValue: InlineRadarValueListItemObjectValueX0f6091f8
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    private var valueListValue: String? = null

    public var valueList: String
      get() = requireNotNull(valueListValue) { "valueList is required" }
      set(`value`) {
        valueListValue = value
      }

    public fun build(): RadarValueListItem {
      check(createdValue != null) { "created is required" }
      check(createdByValue != null) { "createdBy is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(valueValue != null) { "value is required" }
      check(valueListValue != null) { "valueList is required" }
      return RadarValueListItem(
        created = created,
        createdBy = createdBy,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        value = value,
        valueList = valueList,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarValueListItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RadarValueListItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarValueListItem {
      val jsonDecoder = decoder.requireJsonDecoder("RadarValueListItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarValueListItem must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val createdBy = json.decodeRequired<String>(rawObject, "created_by")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineRadarValueListItemObjectValueX0f6091f8>(rawObject, "object")
      val value = json.decodeRequired<String>(rawObject, "value")
      val valueList = json.decodeRequired<String>(rawObject, "value_list")
      return RadarValueListItem(
        created = created,
        createdBy = createdBy,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        value = value,
        valueList = valueList,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarValueListItem) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarValueListItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("created_by", value.createdBy)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("value", value.value)
        put("value_list", value.valueList)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarValueListItem(block: RadarValueListItem.Builder.() -> Unit): RadarValueListItem = RadarValueListItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RadarValueListItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
