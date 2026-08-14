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
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/en
 * d.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/en
 * d
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2(
  public val type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467? =
        null

    public var type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467>(rawObject, "type")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndX3ee152e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
