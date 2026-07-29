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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a(
  public val cryptogram: String,
  public val transactionId: String,
  public val version: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXbb14d8f6,
  public val aresTransStatus: InlineV1PaymentIntentsPostRequestFormAresTransStatusXadd670f0? = null,
  public val electronicCommerceIndicator:
      InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xe3b3f99e? = null,
  public val exemptionIndicator:
      InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819? = null,
  public val networkOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201? = null,
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
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXbb14d8f6? = null

    public var version:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXbb14d8f6
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public var aresTransStatus: InlineV1PaymentIntentsPostRequestFormAresTransStatusXadd670f0? =
        null

    public var electronicCommerceIndicator:
        InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xe3b3f99e? = null

    public var exemptionIndicator: InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819?
        = null

    public var networkOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201? = null

    public var requestorChallengeIndicator: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a {
      check(cryptogramValue != null) { "cryptogram is required" }
      check(transactionIdValue != null) { "transactionId is required" }
      check(versionValue != null) { "version is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a must be a JSON object")
      val cryptogram = json.decodeRequired<String>(rawObject, "cryptogram")
      val transactionId = json.decodeRequired<String>(rawObject, "transaction_id")
      val version = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXbb14d8f6>(rawObject, "version")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a(
        cryptogram = cryptogram,
        transactionId = transactionId,
        version = version,
        aresTransStatus = rawObject["ares_trans_status"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAresTransStatusXadd670f0>(it) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xe3b3f99e>(it) },
        exemptionIndicator = rawObject["exemption_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819>(it) },
        networkOptions = rawObject["network_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201>(it) },
        requestorChallengeIndicator = rawObject["requestor_challenge_indicator"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
