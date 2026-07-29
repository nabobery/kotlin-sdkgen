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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/transfer_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf(
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

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf {
      check(destinationValue != null) { "destination is required" }
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf(
        destination = destination,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf(
        destination = destination,
        amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
