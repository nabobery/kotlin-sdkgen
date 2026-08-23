package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecureView(
  @SerialName("authentication_flow")
  public val authenticationFlow: InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c? = null,
  public val cryptogram: String? = null,
  @SerialName("electronic_commerce_indicator")
  public val electronicCommerceIndicator:
      InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a? = null,
  @SerialName("exemption_indicator")
  public val exemptionIndicator: InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440? = null,
  @SerialName("exemption_indicator_applied")
  public val exemptionIndicatorApplied: Boolean? = null,
  public val result: InlinePaymentsPrimitivesPabc9bResultX842ca21e? = null,
  @SerialName("result_reason")
  public val resultReason: InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38? = null,
  public val version: InlinePaymentsPrimitivesPabc9bVersionXa265e284? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure(
  /**
   * For authenticated transactions: Indicates how the issuing bank authenticated the customer.
   */
  public val authenticationFlow: InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c? = null,
  /**
   * The 3D Secure cryptogram, also known as the "authentication value" (AAV, CAVV or AEVV).
   */
  public val cryptogram: String? = null,
  /**
   * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of authentication was
   * performed.
   */
  public val electronicCommerceIndicator:
      InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a? = null,
  /**
   * The exemption requested via 3DS and accepted by the issuer at authentication time.
   */
  public val exemptionIndicator: InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440? = null,
  /**
   * Whether Stripe requested the value of `exemption_indicator` in the transaction. This will depend on the outcome of
   * Stripe's internal risk assessment.
   */
  public val exemptionIndicatorApplied: Boolean? = null,
  /**
   * Indicates the outcome of 3D Secure authentication.
   */
  public val result: InlinePaymentsPrimitivesPabc9bResultX842ca21e? = null,
  /**
   * Additional information about why 3D Secure succeeded or failed, based on the `result`.
   */
  public val resultReason: InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38? = null,
  /**
   * The version of 3D Secure that was used.
   */
  public val version: InlinePaymentsPrimitivesPabc9bVersionXa265e284? = null,
) {
  public class Builder {
    /**
     * For authenticated transactions: Indicates how the issuing bank authenticated the customer.
     */
    public var authenticationFlow: InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c? = null

    /**
     * The 3D Secure cryptogram, also known as the "authentication value" (AAV, CAVV or AEVV).
     */
    public var cryptogram: String? = null

    /**
     * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of authentication was
     * performed.
     */
    public var electronicCommerceIndicator:
        InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a? = null

    /**
     * The exemption requested via 3DS and accepted by the issuer at authentication time.
     */
    public var exemptionIndicator: InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440? = null

    /**
     * Whether Stripe requested the value of `exemption_indicator` in the transaction. This will depend on the outcome
     * of Stripe's internal risk assessment.
     */
    public var exemptionIndicatorApplied: Boolean? = null

    /**
     * Indicates the outcome of 3D Secure authentication.
     */
    public var result: InlinePaymentsPrimitivesPabc9bResultX842ca21e? = null

    /**
     * Additional information about why 3D Secure succeeded or failed, based on the `result`.
     */
    public var resultReason: InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38? = null

    /**
     * The version of 3D Secure that was used.
     */
    public var version: InlinePaymentsPrimitivesPabc9bVersionXa265e284? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure(
      authenticationFlow = authenticationFlow,
      cryptogram = cryptogram,
      electronicCommerceIndicator = electronicCommerceIndicator,
      exemptionIndicator = exemptionIndicator,
      exemptionIndicatorApplied = exemptionIndicatorApplied,
      result = result,
      resultReason = resultReason,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure(
        authenticationFlow = rawObject["authentication_flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c?>(element) },
        cryptogram = rawObject["cryptogram"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a?>(element) },
        exemptionIndicator = rawObject["exemption_indicator"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440?>(element) },
        exemptionIndicatorApplied = rawObject["exemption_indicator_applied"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        result = rawObject["result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bResultX842ca21e?>(element) },
        resultReason = rawObject["result_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38?>(element) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPabc9bVersionXa265e284?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authenticationFlow?.let { put("authentication_flow", json.encodeToJsonElement(it)) }
        value.cryptogram?.let { put("cryptogram", it) }
        value.electronicCommerceIndicator?.let { put("electronic_commerce_indicator", json.encodeToJsonElement(it)) }
        value.exemptionIndicator?.let { put("exemption_indicator", json.encodeToJsonElement(it)) }
        value.exemptionIndicatorApplied?.let { put("exemption_indicator_applied", json.encodeToJsonElement(it)) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
        value.resultReason?.let { put("result_reason", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure.build(block)
