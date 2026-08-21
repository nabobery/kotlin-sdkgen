package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Verifications that Stripe performed on information that the cardholder provided to the merchant.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5(
  public val addressLine1Check:
      InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0? = null,
  public val addressPostalCodeCheck:
      InlineV1TestHelpersIssuing214aPostRequestFormAddressPostalCodeCheckXbfcaca27? = null,
  public val authenticationExemption:
      InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235? = null,
  public val cvcCheck:
      InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataCvcCheckX8d89be6d? = null,
  public val expiryCheck: InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7? = null,
  public val threeDSecure:
      InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376? = null,
) {
  public class Builder {
    public var addressLine1Check:
        InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0? = null

    public var addressPostalCodeCheck:
        InlineV1TestHelpersIssuing214aPostRequestFormAddressPostalCodeCheckXbfcaca27? = null

    public var authenticationExemption:
        InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235? = null

    public var cvcCheck:
        InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataCvcCheckX8d89be6d? = null

    public var expiryCheck: InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7? =
        null

    public var threeDSecure: InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376? =
        null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5(
      addressLine1Check = addressLine1Check,
      addressPostalCodeCheck = addressPostalCodeCheck,
      authenticationExemption = authenticationExemption,
      cvcCheck = cvcCheck,
      expiryCheck = expiryCheck,
      threeDSecure = threeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5 must be a JSON object")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5(
        addressLine1Check = rawObject["address_line1_check"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0>(it) },
        addressPostalCodeCheck = rawObject["address_postal_code_check"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormAddressPostalCodeCheckXbfcaca27>(it) },
        authenticationExemption = rawObject["authentication_exemption"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235>(it) },
        cvcCheck = rawObject["cvc_check"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataCvcCheckX8d89be6d>(it) },
        expiryCheck = rawObject["expiry_check"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7>(it) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.addressLine1Check?.let { put("address_line1_check", json.encodeToJsonElement(it)) }
        value.addressPostalCodeCheck?.let { put("address_postal_code_check", json.encodeToJsonElement(it)) }
        value.authenticationExemption?.let { put("authentication_exemption", json.encodeToJsonElement(it)) }
        value.cvcCheck?.let { put("cvc_check", json.encodeToJsonElement(it)) }
        value.expiryCheck?.let { put("expiry_check", json.encodeToJsonElement(it)) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5.build(block)
