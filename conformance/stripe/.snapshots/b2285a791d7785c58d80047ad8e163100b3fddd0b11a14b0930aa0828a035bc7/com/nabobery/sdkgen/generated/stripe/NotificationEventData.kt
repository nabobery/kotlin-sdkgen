package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/notification_event_data
 */
@Serializable(with = NotificationEventData.Serializer::class)
public class NotificationEventData(
  /**
   * Object containing the API resource relevant to the event. For example, an `invoice.created` event will have a full
   * [invoice object](https://api.stripe.com#invoice_object) as the value of the object key.
   */
  public val objectValue: JsonObject,
  /**
   * Object containing the names of the updated attributes and their values prior to the event (only included in events
   * of type `*.updated`). If an array attribute has any updated elements, this object contains the entire array. In
   * Stripe API versions 2017-04-06 or earlier, an updated array attribute in this object includes only the updated
   * array elements.
   */
  public val previousAttributes: JsonObject? = null,
) {
  public class Builder {
    private var objectValueValue: JsonObject? = null

    public var objectValue: JsonObject
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Object containing the names of the updated attributes and their values prior to the event (only included in
     * events of type `*.updated`). If an array attribute has any updated elements, this object contains the entire
     * array. In Stripe API versions 2017-04-06 or earlier, an updated array attribute in this object includes only the
     * updated array elements.
     */
    public var previousAttributes: JsonObject? = null

    public fun build(): NotificationEventData {
      check(objectValueValue != null) { "objectValue is required" }
      return NotificationEventData(
        objectValue = objectValue,
        previousAttributes = previousAttributes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NotificationEventData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NotificationEventData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NotificationEventData {
      val jsonDecoder = decoder.requireJsonDecoder("NotificationEventData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NotificationEventData must be a JSON object")
      val objectValue = json.decodeRequired<JsonObject>(rawObject, "object")
      return NotificationEventData(
        objectValue = objectValue,
        previousAttributes = rawObject["previous_attributes"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NotificationEventData) {
      val jsonEncoder = encoder.requireJsonEncoder("NotificationEventData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("object", json.encodeToJsonElement(value.objectValue))
        value.previousAttributes?.let { put("previous_attributes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun notificationEventData(block: NotificationEventData.Builder.() -> Unit): NotificationEventData = NotificationEventData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NotificationEventData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
