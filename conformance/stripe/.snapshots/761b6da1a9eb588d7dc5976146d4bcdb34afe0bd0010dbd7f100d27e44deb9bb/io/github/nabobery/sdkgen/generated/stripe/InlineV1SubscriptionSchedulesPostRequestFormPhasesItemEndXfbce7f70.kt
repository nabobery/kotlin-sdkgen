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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/end
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70(
  public val type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX716fa27f,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX716fa27f? =
        null

    public var type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX716fa27f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX716fa27f>(rawObject, "type")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndXfbce7f70 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
