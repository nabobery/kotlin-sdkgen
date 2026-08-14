package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/st
 * art.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/st
 * art
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616(
  public val type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX299b76a6,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX299b76a6? =
        null

    public var type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX299b76a6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX299b76a6>(rawObject, "type")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartXf9c77616 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
