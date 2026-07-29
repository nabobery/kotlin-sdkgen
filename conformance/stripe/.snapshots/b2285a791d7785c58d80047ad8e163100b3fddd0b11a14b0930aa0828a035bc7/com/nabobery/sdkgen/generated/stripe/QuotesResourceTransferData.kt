package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.Int
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
public data class QuotesResourceTransferDataView(
  public val amount: Int? = null,
  @SerialName("amount_percent")
  public val amountPercent: Double? = null,
  public val destination: InlineQuotesResourceTransferDataDestinationX471ac850,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_transfer_data
 */
@Serializable(with = QuotesResourceTransferData.Serializer::class)
public class QuotesResourceTransferData(
  /**
   * The account where funds from the payment will be transferred to upon payment success.
   */
  public val destination: InlineQuotesResourceTransferDataDestinationX471ac850,
  /**
   * The amount in cents (or local equivalent) that will be transferred to the destination account when the invoice is
   * paid. By default, the entire amount is transferred to the destination.
   */
  public val amount: Int? = null,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the destination account. By default, the entire amount will
   * be transferred to the destination.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val amountPercent: Double? = null,
) {
  public class Builder {
    private var destinationValue: InlineQuotesResourceTransferDataDestinationX471ac850? = null

    public var destination: InlineQuotesResourceTransferDataDestinationX471ac850
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * The amount in cents (or local equivalent) that will be transferred to the destination account when the invoice is
     * paid. By default, the entire amount is transferred to the destination.
     */
    public var amount: Int? = null

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the destination account. By default, the entire amount
     * will be transferred to the destination.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var amountPercent: Double? = null

    public fun build(): QuotesResourceTransferData {
      check(destinationValue != null) { "destination is required" }
      return QuotesResourceTransferData(
        destination = destination,
        amount = amount,
        amountPercent = amountPercent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceTransferData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<QuotesResourceTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceTransferData must be a JSON object")
      val destination = json.decodeRequired<InlineQuotesResourceTransferDataDestinationX471ac850>(rawObject, "destination")
      return QuotesResourceTransferData(
        destination = destination,
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountPercent = rawObject["amount_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", json.encodeToJsonElement(value.destination))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountPercent?.let { put("amount_percent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceTransferData(block: QuotesResourceTransferData.Builder.() -> Unit): QuotesResourceTransferData = QuotesResourceTransferData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceTransferData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
