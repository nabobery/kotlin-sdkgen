package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecksView(
  @SerialName("address_line1_check")
  public val addressLine1Check: InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e? = null,
  @SerialName("address_postal_code_check")
  public val addressPostalCodeCheck:
      InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697? = null,
  @SerialName("cvc_check")
  public val cvcCheck: InlinePaymentsPrimitivesPa4682CvcCheckXfaa08edc? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_checks
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks(
  /**
   * If you provide a value for `address.line1`, the check result is one of `pass`, `fail`, `unavailable`, or
   * `unchecked`.
   */
  public val addressLine1Check: InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e? = null,
  /**
   * If you provide a address postal code, the check result is one of `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val addressPostalCodeCheck:
      InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697? = null,
  /**
   * If you provide a CVC, the check results is one of `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val cvcCheck: InlinePaymentsPrimitivesPa4682CvcCheckXfaa08edc? = null,
) {
  public class Builder {
    /**
     * If you provide a value for `address.line1`, the check result is one of `pass`, `fail`, `unavailable`, or
     * `unchecked`.
     */
    public var addressLine1Check: InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e? = null

    /**
     * If you provide a address postal code, the check result is one of `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var addressPostalCodeCheck:
        InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697? = null

    /**
     * If you provide a CVC, the check results is one of `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var cvcCheck: InlinePaymentsPrimitivesPa4682CvcCheckXfaa08edc? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks(
      addressLine1Check = addressLine1Check,
      addressPostalCodeCheck = addressPostalCodeCheck,
      cvcCheck = cvcCheck,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks(
        addressLine1Check = rawObject["address_line1_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e?>(element) },
        addressPostalCodeCheck = rawObject["address_postal_code_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697?>(element) },
        cvcCheck = rawObject["cvc_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa4682CvcCheckXfaa08edc?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.addressLine1Check?.let { put("address_line1_check", json.encodeToJsonElement(it)) }
        value.addressPostalCodeCheck?.let { put("address_postal_code_check", json.encodeToJsonElement(it)) }
        value.cvcCheck?.let { put("cvc_check", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks.build(block)
