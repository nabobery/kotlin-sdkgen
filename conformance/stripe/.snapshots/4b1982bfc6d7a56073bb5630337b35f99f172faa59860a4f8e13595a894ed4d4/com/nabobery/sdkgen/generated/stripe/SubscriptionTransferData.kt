package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SubscriptionTransferDataView(
  @SerialName("amount_percent")
  public val amountPercent: Double? = null,
  public val destination: InlineSubscriptionTransferDataDestinationXf63f04cd,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_transfer_data
 */
@Serializable(with = SubscriptionTransferData.Serializer::class)
public class SubscriptionTransferData(
  /**
   * The account where funds from the payment will be transferred to upon payment success.
   */
  public val destination: InlineSubscriptionTransferDataDestinationXf63f04cd,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the destination account. By default, the entire amount is
   * transferred to the destination.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val amountPercent: Double? = null,
) {
  public class Builder {
    private var destinationValue: InlineSubscriptionTransferDataDestinationXf63f04cd? = null

    public var destination: InlineSubscriptionTransferDataDestinationXf63f04cd
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the destination account. By default, the entire amount is
     * transferred to the destination.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var amountPercent: Double? = null

    public fun build(): SubscriptionTransferData {
      check(destinationValue != null) { "destination is required" }
      return SubscriptionTransferData(
        destination = destination,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionTransferData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionTransferData must be a JSON object")
      val destination = json.decodeRequired<InlineSubscriptionTransferDataDestinationXf63f04cd>(rawObject, "destination")
      return SubscriptionTransferData(
        destination = destination,
        amountPercent = rawObject["amount_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", json.encodeToJsonElement(value.destination))
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionTransferData(block: SubscriptionTransferData.Builder.() -> Unit): SubscriptionTransferData = SubscriptionTransferData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionTransferData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
