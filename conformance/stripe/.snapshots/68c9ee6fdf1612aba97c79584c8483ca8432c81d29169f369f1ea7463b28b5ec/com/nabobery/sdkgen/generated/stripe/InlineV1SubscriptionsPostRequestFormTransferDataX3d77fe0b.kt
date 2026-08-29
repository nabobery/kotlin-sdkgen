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
 * If specified, the funds from the subscription's invoices will be transferred to the destination and the ID of the
 * resulting transfers will be found on the resulting charges.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/transfer_data
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b(
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

    public fun build(): InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b {
      check(destinationValue != null) { "destination is required" }
      return InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b(
        destination = destination,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b(
        destination = destination,
        amountPercent = rawObject["amount_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b(block: InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b = InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
