package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodDetailsCardChecksView(
  @SerialName("address_line1_check")
  public val addressLine1Check: String? = null,
  @SerialName("address_postal_code_check")
  public val addressPostalCodeCheck: String? = null,
  @SerialName("cvc_check")
  public val cvcCheck: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_checks
 */
@Serializable(with = PaymentMethodDetailsCardChecks.Serializer::class)
public class PaymentMethodDetailsCardChecks(
  /**
   * If a address line1 was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val addressLine1Check: String? = null,
  /**
   * If a address postal code was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val addressPostalCodeCheck: String? = null,
  /**
   * If a CVC was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val cvcCheck: String? = null,
) {
  public class Builder {
    /**
     * If a address line1 was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var addressLine1Check: String? = null

    /**
     * If a address postal code was provided, results of the check, one of `pass`, `fail`, `unavailable`, or
     * `unchecked`.
     */
    public var addressPostalCodeCheck: String? = null

    /**
     * If a CVC was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var cvcCheck: String? = null

    public fun build(): PaymentMethodDetailsCardChecks = PaymentMethodDetailsCardChecks(
      addressLine1Check = addressLine1Check,
      addressPostalCodeCheck = addressPostalCodeCheck,
      cvcCheck = cvcCheck,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardChecks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsCardChecks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardChecks {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardChecks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCardChecks must be a JSON object")
      return PaymentMethodDetailsCardChecks(
        addressLine1Check = rawObject["address_line1_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressPostalCodeCheck = rawObject["address_postal_code_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cvcCheck = rawObject["cvc_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCardChecks) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardChecks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.addressLine1Check?.let { put("address_line1_check", it) }
        value.addressPostalCodeCheck?.let { put("address_postal_code_check", it) }
        value.cvcCheck?.let { put("cvc_check", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCardChecks(block: PaymentMethodDetailsCardChecks.Builder.() -> Unit): PaymentMethodDetailsCardChecks = PaymentMethodDetailsCardChecks.build(block)
