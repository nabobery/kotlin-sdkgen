package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
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
 * www-form-urlencoded/schema/properties/default_settings/properties/transfer_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/transfer_data/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a(
  public val destination: String,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val amountPercent: Double? = null,
) {
  public class Builder {
    private var destinationValue: String? = null

    public var destination: String
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var amountPercent: Double? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a {
      check(destinationValue != null) { "destination is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a(
        destination = destination,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a(
        destination = destination,
        amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a(block: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
