package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details
 */
@Serializable(with = DisputePaymentMethodDetails.Serializer::class)
public class DisputePaymentMethodDetails(
  /**
   * Payment method type.
   */
  public val type: InlineDisputePaymentMethodDetailsTypeXf1692f08,
  public val amazonPay: DisputePaymentMethodDetailsAmazonPay? = null,
  public val card: DisputePaymentMethodDetailsCard? = null,
  public val klarna: DisputePaymentMethodDetailsKlarna? = null,
  public val paypal: DisputePaymentMethodDetailsPaypal? = null,
) {
  public class Builder {
    private var typeValue: InlineDisputePaymentMethodDetailsTypeXf1692f08? = null

    public var type: InlineDisputePaymentMethodDetailsTypeXf1692f08
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var amazonPay: DisputePaymentMethodDetailsAmazonPay? = null

    public var card: DisputePaymentMethodDetailsCard? = null

    public var klarna: DisputePaymentMethodDetailsKlarna? = null

    public var paypal: DisputePaymentMethodDetailsPaypal? = null

    public fun build(): DisputePaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return DisputePaymentMethodDetails(
        type = type,
        amazonPay = amazonPay,
        card = card,
        klarna = klarna,
        paypal = paypal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputePaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputePaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputePaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("DisputePaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputePaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<InlineDisputePaymentMethodDetailsTypeXf1692f08>(rawObject, "type")
      return DisputePaymentMethodDetails(
        type = type,
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<DisputePaymentMethodDetailsAmazonPay>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<DisputePaymentMethodDetailsCard>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<DisputePaymentMethodDetailsKlarna>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<DisputePaymentMethodDetailsPaypal>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputePaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputePaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputePaymentMethodDetails(block: DisputePaymentMethodDetails.Builder.() -> Unit): DisputePaymentMethodDetails = DisputePaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputePaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
