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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/transfer_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/transfer_data/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec(
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

    public fun build(): InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec {
      check(destinationValue != null) { "destination is required" }
      return InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec(
        destination = destination,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec(
        destination = destination,
        amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec(block: InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec = InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
