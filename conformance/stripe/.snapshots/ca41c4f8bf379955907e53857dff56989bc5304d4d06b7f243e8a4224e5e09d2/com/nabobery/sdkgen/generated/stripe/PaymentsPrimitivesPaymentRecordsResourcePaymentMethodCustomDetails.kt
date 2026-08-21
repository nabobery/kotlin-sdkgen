package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Custom Payment Methods represent Payment Method types not modeled directly in
 * the Stripe API. This resource consists of details about the custom payment method
 * used for this payment attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_custom_d
 * etails
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails(
  /**
   * Display name for the custom (user-defined) payment method type used to make this payment.
   */
  public val displayName: String,
  /**
   * The custom payment method type associated with this payment.
   */
  public val type: String? = null,
) {
  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    /**
     * The custom payment method type associated with this payment.
     */
    public var type: String? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails {
      check(displayNameValue != null) { "displayName is required" }
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails(
        displayName = displayName,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails(
        displayName = displayName,
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
