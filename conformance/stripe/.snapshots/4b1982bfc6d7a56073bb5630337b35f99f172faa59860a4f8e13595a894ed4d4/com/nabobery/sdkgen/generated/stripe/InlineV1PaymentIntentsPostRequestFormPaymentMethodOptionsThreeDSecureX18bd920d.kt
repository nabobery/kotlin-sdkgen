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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d(
  public val cryptogram: String,
  public val transactionId: String,
  public val version: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6,
  public val aresTransStatus: InlineV1PaymentIntentsPostRequestFormAresTransStatusX9ca8ee38? = null,
  public val electronicCommerceIndicator:
      InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7? = null,
  public val exemptionIndicator:
      InlineV1PaymentIntentsPostRequestFormExemptionIndicatorXa4228990? = null,
  public val networkOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485? = null,
  public val requestorChallengeIndicator: String? = null,
) {
  public class Builder {
    private var cryptogramValue: String? = null

    public var cryptogram: String
      get() = requireNotNull(cryptogramValue) { "cryptogram is required" }
      set(`value`) {
        cryptogramValue = value
      }

    private var transactionIdValue: String? = null

    public var transactionId: String
      get() = requireNotNull(transactionIdValue) { "transactionId is required" }
      set(`value`) {
        transactionIdValue = value
      }

    private var versionValue:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6? = null

    public var version:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public var aresTransStatus: InlineV1PaymentIntentsPostRequestFormAresTransStatusX9ca8ee38? =
        null

    public var electronicCommerceIndicator:
        InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7? = null

    public var exemptionIndicator: InlineV1PaymentIntentsPostRequestFormExemptionIndicatorXa4228990?
        = null

    public var networkOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485? = null

    public var requestorChallengeIndicator: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d {
      check(cryptogramValue != null) { "cryptogram is required" }
      check(transactionIdValue != null) { "transactionId is required" }
      check(versionValue != null) { "version is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d(
        cryptogram = cryptogram,
        transactionId = transactionId,
        version = version,
        aresTransStatus = aresTransStatus,
        electronicCommerceIndicator = electronicCommerceIndicator,
        exemptionIndicator = exemptionIndicator,
        networkOptions = networkOptions,
        requestorChallengeIndicator = requestorChallengeIndicator,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d must be a JSON object")
      val cryptogram = json.decodeRequired<String>(rawObject, "cryptogram")
      val transactionId = json.decodeRequired<String>(rawObject, "transaction_id")
      val version = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6>(rawObject, "version")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d(
        cryptogram = cryptogram,
        transactionId = transactionId,
        version = version,
        aresTransStatus = rawObject["ares_trans_status"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAresTransStatusX9ca8ee38>(it) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7>(it) },
        exemptionIndicator = rawObject["exemption_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExemptionIndicatorXa4228990>(it) },
        networkOptions = rawObject["network_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485>(it) },
        requestorChallengeIndicator = rawObject["requestor_challenge_indicator"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cryptogram", value.cryptogram)
        put("transaction_id", value.transactionId)
        put("version", json.encodeToJsonElement(value.version))
        value.aresTransStatus?.let { put("ares_trans_status", json.encodeToJsonElement(it)) }
        value.electronicCommerceIndicator?.let { put("electronic_commerce_indicator", json.encodeToJsonElement(it)) }
        value.exemptionIndicator?.let { put("exemption_indicator", json.encodeToJsonElement(it)) }
        value.networkOptions?.let { put("network_options", json.encodeToJsonElement(it)) }
        value.requestorChallengeIndicator?.let { put("requestor_challenge_indicator", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
