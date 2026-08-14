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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ThreeDSecureDetailsView(
  @SerialName("authentication_flow")
  public val authenticationFlow: InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0? = null,
  @SerialName("electronic_commerce_indicator")
  public val electronicCommerceIndicator:
      InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0? = null,
  public val result: InlineThreeDSecureDetailsResultXd3f6595d? = null,
  @SerialName("result_reason")
  public val resultReason: InlineThreeDSecureDetailsResultReasonX97352a26? = null,
  @SerialName("transaction_id")
  public val transactionId: String? = null,
  public val version: InlineThreeDSecureDetailsVersionX2c2943f6? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details
 */
@Serializable(with = ThreeDSecureDetails.Serializer::class)
public class ThreeDSecureDetails(
  /**
   * For authenticated transactions: how the customer was authenticated by
   * the issuing bank.
   */
  public val authenticationFlow: InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0? = null,
  /**
   * The Electronic Commerce Indicator (ECI). A protocol-level field
   * indicating what degree of authentication was performed.
   */
  public val electronicCommerceIndicator:
      InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0? = null,
  /**
   * Indicates the outcome of 3D Secure authentication.
   */
  public val result: InlineThreeDSecureDetailsResultXd3f6595d? = null,
  /**
   * Additional information about why 3D Secure succeeded or failed based
   * on the `result`.
   */
  public val resultReason: InlineThreeDSecureDetailsResultReasonX97352a26? = null,
  /**
   * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID
   * (dsTransId) for this payment.
   */
  public val transactionId: String? = null,
  /**
   * The version of 3D Secure that was used.
   */
  public val version: InlineThreeDSecureDetailsVersionX2c2943f6? = null,
) {
  public class Builder {
    /**
     * For authenticated transactions: how the customer was authenticated by
     * the issuing bank.
     */
    public var authenticationFlow: InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0? = null

    /**
     * The Electronic Commerce Indicator (ECI). A protocol-level field
     * indicating what degree of authentication was performed.
     */
    public var electronicCommerceIndicator:
        InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0? = null

    /**
     * Indicates the outcome of 3D Secure authentication.
     */
    public var result: InlineThreeDSecureDetailsResultXd3f6595d? = null

    /**
     * Additional information about why 3D Secure succeeded or failed based
     * on the `result`.
     */
    public var resultReason: InlineThreeDSecureDetailsResultReasonX97352a26? = null

    /**
     * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID
     * (dsTransId) for this payment.
     */
    public var transactionId: String? = null

    /**
     * The version of 3D Secure that was used.
     */
    public var version: InlineThreeDSecureDetailsVersionX2c2943f6? = null

    public fun build(): ThreeDSecureDetails = ThreeDSecureDetails(
      authenticationFlow = authenticationFlow,
      electronicCommerceIndicator = electronicCommerceIndicator,
      result = result,
      resultReason = resultReason,
      transactionId = transactionId,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThreeDSecureDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ThreeDSecureDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThreeDSecureDetails {
      val jsonDecoder = decoder.requireJsonDecoder("ThreeDSecureDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThreeDSecureDetails must be a JSON object")
      return ThreeDSecureDetails(
        authenticationFlow = rawObject["authentication_flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0?>(element) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0?>(element) },
        result = rawObject["result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsResultXd3f6595d?>(element) },
        resultReason = rawObject["result_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsResultReasonX97352a26?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThreeDSecureDetailsVersionX2c2943f6?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThreeDSecureDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("ThreeDSecureDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authenticationFlow?.let { put("authentication_flow", json.encodeToJsonElement(it)) }
        value.electronicCommerceIndicator?.let { put("electronic_commerce_indicator", json.encodeToJsonElement(it)) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
        value.resultReason?.let { put("result_reason", json.encodeToJsonElement(it)) }
        value.transactionId?.let { put("transaction_id", it) }
        value.version?.let { put("version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun threeDSecureDetails(block: ThreeDSecureDetails.Builder.() -> Unit): ThreeDSecureDetails = ThreeDSecureDetails.build(block)
