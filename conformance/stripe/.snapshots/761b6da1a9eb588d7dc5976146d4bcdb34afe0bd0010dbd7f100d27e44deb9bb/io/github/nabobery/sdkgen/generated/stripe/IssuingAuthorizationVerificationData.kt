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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data
 */
@Serializable(with = IssuingAuthorizationVerificationData.Serializer::class)
public class IssuingAuthorizationVerificationData(
  /**
   * Whether the cardholder provided an address first line and if it matched the cardholder’s `billing.address.line1`.
   */
  public val addressLine1Check:
      InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368,
  /**
   * Whether the cardholder provided a postal code and if it matched the cardholder’s `billing.address.postal_code`.
   */
  public val addressPostalCodeCheck:
      InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b,
  /**
   * Whether the cardholder provided a CVC and if it matched Stripe’s record.
   */
  public val cvcCheck: InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d,
  /**
   * Whether the cardholder provided an expiry date and if it matched Stripe’s record.
   */
  public val expiryCheck: InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f,
  /**
   * The exemption applied to this authorization.
   */
  public val authenticationExemption:
      InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133? = null,
  /**
   * The postal code submitted as part of the authorization used for postal code verification.
   */
  public val postalCode: String? = null,
  /**
   * 3D Secure details.
   */
  public val threeDSecure: InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da? = null,
) {
  public class Builder {
    private var addressLine1CheckValue:
        InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368? = null

    public var addressLine1Check:
        InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368
      get() = requireNotNull(addressLine1CheckValue) { "addressLine1Check is required" }
      set(`value`) {
        addressLine1CheckValue = value
      }

    private var addressPostalCodeCheckValue:
        InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b? = null

    public var addressPostalCodeCheck:
        InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b
      get() = requireNotNull(addressPostalCodeCheckValue) { "addressPostalCodeCheck is required" }
      set(`value`) {
        addressPostalCodeCheckValue = value
      }

    private var cvcCheckValue: InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d? = null

    public var cvcCheck: InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d
      get() = requireNotNull(cvcCheckValue) { "cvcCheck is required" }
      set(`value`) {
        cvcCheckValue = value
      }

    private var expiryCheckValue: InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f? =
        null

    public var expiryCheck: InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f
      get() = requireNotNull(expiryCheckValue) { "expiryCheck is required" }
      set(`value`) {
        expiryCheckValue = value
      }

    /**
     * The exemption applied to this authorization.
     */
    public var authenticationExemption:
        InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133? = null

    /**
     * The postal code submitted as part of the authorization used for postal code verification.
     */
    public var postalCode: String? = null

    /**
     * 3D Secure details.
     */
    public var threeDSecure: InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da? = null

    public fun build(): IssuingAuthorizationVerificationData {
      check(addressLine1CheckValue != null) { "addressLine1Check is required" }
      check(addressPostalCodeCheckValue != null) { "addressPostalCodeCheck is required" }
      check(cvcCheckValue != null) { "cvcCheck is required" }
      check(expiryCheckValue != null) { "expiryCheck is required" }
      return IssuingAuthorizationVerificationData(
        addressLine1Check = addressLine1Check,
        addressPostalCodeCheck = addressPostalCodeCheck,
        cvcCheck = cvcCheck,
        expiryCheck = expiryCheck,
        authenticationExemption = authenticationExemption,
        postalCode = postalCode,
        threeDSecure = threeDSecure,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationVerificationData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingAuthorizationVerificationData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationVerificationData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationVerificationData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationVerificationData must be a JSON object")
      val addressLine1Check = json.decodeRequired<InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368>(rawObject, "address_line1_check")
      val addressPostalCodeCheck = json.decodeRequired<InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b>(rawObject, "address_postal_code_check")
      val cvcCheck = json.decodeRequired<InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d>(rawObject, "cvc_check")
      val expiryCheck = json.decodeRequired<InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f>(rawObject, "expiry_check")
      return IssuingAuthorizationVerificationData(
        addressLine1Check = addressLine1Check,
        addressPostalCodeCheck = addressPostalCodeCheck,
        cvcCheck = cvcCheck,
        expiryCheck = expiryCheck,
        authenticationExemption = rawObject["authentication_exemption"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133?>(element) },
        postalCode = rawObject["postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        threeDSecure = rawObject["three_d_secure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationVerificationData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationVerificationData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address_line1_check", json.encodeToJsonElement(value.addressLine1Check))
        put("address_postal_code_check", json.encodeToJsonElement(value.addressPostalCodeCheck))
        put("cvc_check", json.encodeToJsonElement(value.cvcCheck))
        put("expiry_check", json.encodeToJsonElement(value.expiryCheck))
        value.authenticationExemption?.let { put("authentication_exemption", json.encodeToJsonElement(it)) }
        value.postalCode?.let { put("postal_code", it) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationVerificationData(block: IssuingAuthorizationVerificationData.Builder.() -> Unit): IssuingAuthorizationVerificationData = IssuingAuthorizationVerificationData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingAuthorizationVerificationData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
