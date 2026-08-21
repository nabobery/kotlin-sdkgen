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
public data class ThreeDSecureDetailsChargeView(
  @SerialName("authentication_flow")
  public val authenticationFlow: InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f? = null,
  @SerialName("electronic_commerce_indicator")
  public val electronicCommerceIndicator:
      InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a? = null,
  @SerialName("exemption_indicator")
  public val exemptionIndicator: InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da? = null,
  @SerialName("exemption_indicator_applied")
  public val exemptionIndicatorApplied: Boolean? = null,
  public val result: InlineThreeDSecureDetailsChargeResultX2295bf98? = null,
  @SerialName("result_reason")
  public val resultReason: InlineThreeDSecureDetailsChargeResultReasonX694e3302? = null,
  @SerialName("transaction_id")
  public val transactionId: String? = null,
  public val version: InlineThreeDSecureDetailsChargeVersionX5b322869? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge
 */
@Serializable(with = ThreeDSecureDetailsCharge.Serializer::class)
public class ThreeDSecureDetailsCharge(
  /**
   * For authenticated transactions: how the customer was authenticated by
   * the issuing bank.
   */
  public val authenticationFlow: InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f? = null,
  /**
   * The Electronic Commerce Indicator (ECI). A protocol-level field
   * indicating what degree of authentication was performed.
   */
  public val electronicCommerceIndicator:
      InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a? = null,
  /**
   * The exemption requested via 3DS and accepted by the issuer at authentication time.
   */
  public val exemptionIndicator: InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da? = null,
  /**
   * Whether Stripe requested the value of `exemption_indicator` in the transaction. This will depend on
   * the outcome of Stripe's internal risk assessment.
   */
  public val exemptionIndicatorApplied: Boolean? = null,
  /**
   * Indicates the outcome of 3D Secure authentication.
   */
  public val result: InlineThreeDSecureDetailsChargeResultX2295bf98? = null,
  /**
   * Additional information about why 3D Secure succeeded or failed based
   * on the `result`.
   */
  public val resultReason: InlineThreeDSecureDetailsChargeResultReasonX694e3302? = null,
  /**
   * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID
   * (dsTransId) for this payment.
   */
  public val transactionId: String? = null,
  /**
   * The version of 3D Secure that was used.
   */
  public val version: InlineThreeDSecureDetailsChargeVersionX5b322869? = null,
) {
  public class Builder {
    /**
     * For authenticated transactions: how the customer was authenticated by
     * the issuing bank.
     */
    public var authenticationFlow: InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f? =
        null

    /**
     * The Electronic Commerce Indicator (ECI). A protocol-level field
     * indicating what degree of authentication was performed.
     */
    public var electronicCommerceIndicator:
        InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a? = null

    /**
     * The exemption requested via 3DS and accepted by the issuer at authentication time.
     */
    public var exemptionIndicator: InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da? =
        null

    /**
     * Whether Stripe requested the value of `exemption_indicator` in the transaction. This will depend on
     * the outcome of Stripe's internal risk assessment.
     */
    public var exemptionIndicatorApplied: Boolean? = null

    /**
     * Indicates the outcome of 3D Secure authentication.
     */
    public var result: InlineThreeDSecureDetailsChargeResultX2295bf98? = null

    /**
     * Additional information about why 3D Secure succeeded or failed based
     * on the `result`.
     */
    public var resultReason: InlineThreeDSecureDetailsChargeResultReasonX694e3302? = null

    /**
     * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID
     * (dsTransId) for this payment.
     */
    public var transactionId: String? = null

    /**
     * The version of 3D Secure that was used.
     */
    public var version: InlineThreeDSecureDetailsChargeVersionX5b322869? = null

    public fun build(): ThreeDSecureDetailsCharge = ThreeDSecureDetailsCharge(
      authenticationFlow = authenticationFlow,
      electronicCommerceIndicator = electronicCommerceIndicator,
      exemptionIndicator = exemptionIndicator,
      exemptionIndicatorApplied = exemptionIndicatorApplied,
      result = result,
      resultReason = resultReason,
      transactionId = transactionId,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThreeDSecureDetailsCharge = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ThreeDSecureDetailsCharge> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThreeDSecureDetailsCharge {
      val jsonDecoder = decoder.requireJsonDecoder("ThreeDSecureDetailsCharge")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThreeDSecureDetailsCharge must be a JSON object")
      return ThreeDSecureDetailsCharge(
        authenticationFlow = rawObject["authentication_flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f?>(element) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a?>(element) },
        exemptionIndicator = rawObject["exemption_indicator"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da?>(element) },
        exemptionIndicatorApplied = rawObject["exemption_indicator_applied"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        result = rawObject["result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeResultX2295bf98?>(element) },
        resultReason = rawObject["result_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeResultReasonX694e3302?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsChargeVersionX5b322869?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThreeDSecureDetailsCharge) {
      val jsonEncoder = encoder.requireJsonEncoder("ThreeDSecureDetailsCharge")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authenticationFlow?.let { put("authentication_flow", json.encodeToJsonElement(it)) }
        value.electronicCommerceIndicator?.let { put("electronic_commerce_indicator", json.encodeToJsonElement(it)) }
        value.exemptionIndicator?.let { put("exemption_indicator", json.encodeToJsonElement(it)) }
        value.exemptionIndicatorApplied?.let { put("exemption_indicator_applied", json.encodeToJsonElement(it)) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
        value.resultReason?.let { put("result_reason", json.encodeToJsonElement(it)) }
        value.transactionId?.let { put("transaction_id", it) }
        value.version?.let { put("version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun threeDSecureDetailsCharge(block: ThreeDSecureDetailsCharge.Builder.() -> Unit): ThreeDSecureDetailsCharge = ThreeDSecureDetailsCharge.build(block)
