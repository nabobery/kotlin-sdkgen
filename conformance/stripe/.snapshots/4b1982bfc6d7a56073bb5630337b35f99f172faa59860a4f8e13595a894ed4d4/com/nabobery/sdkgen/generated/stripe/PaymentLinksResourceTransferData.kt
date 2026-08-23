package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentLinksResourceTransferDataView(
  public val amount: Int? = null,
  public val destination: InlinePaymentLinksResourceTransferDataDestinationXc35ed13b,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_transfer_data
 */
@Serializable(with = PaymentLinksResourceTransferData.Serializer::class)
public class PaymentLinksResourceTransferData(
  /**
   * The connected account receiving the transfer.
   */
  public val destination: InlinePaymentLinksResourceTransferDataDestinationXc35ed13b,
  /**
   * The amount in cents (or local equivalent) that will be transferred to the destination account. By default, the
   * entire amount is transferred to the destination.
   */
  public val amount: Int? = null,
) {
  public class Builder {
    private var destinationValue: InlinePaymentLinksResourceTransferDataDestinationXc35ed13b? = null

    public var destination: InlinePaymentLinksResourceTransferDataDestinationXc35ed13b
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * The amount in cents (or local equivalent) that will be transferred to the destination account. By default, the
     * entire amount is transferred to the destination.
     */
    public var amount: Int? = null

    public fun build(): PaymentLinksResourceTransferData {
      check(destinationValue != null) { "destination is required" }
      return PaymentLinksResourceTransferData(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceTransferData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceTransferData must be a JSON object")
      val destination = json.decodeRequired<InlinePaymentLinksResourceTransferDataDestinationXc35ed13b>(rawObject, "destination")
      return PaymentLinksResourceTransferData(
        destination = destination,
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", json.encodeToJsonElement(value.destination))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceTransferData(block: PaymentLinksResourceTransferData.Builder.() -> Unit): PaymentLinksResourceTransferData = PaymentLinksResourceTransferData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceTransferData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
