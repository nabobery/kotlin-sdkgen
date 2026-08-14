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
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392(
  public val usageGte: Int,
) {
  public class Builder {
    private var usageGteValue: Int? = null

    public var usageGte: Int
      get() = requireNotNull(usageGteValue) { "usageGte is required" }
      set(`value`) {
        usageGteValue = value
      }

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 {
      check(usageGteValue != null) { "usageGte is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392(
        usageGte = usageGte,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 must be a JSON object")
      val usageGte = json.decodeRequired<Int>(rawObject, "usage_gte")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392(
        usageGte = usageGte,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("usage_gte", json.encodeToJsonElement(value.usageGte))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
