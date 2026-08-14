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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd(
  public val cryptogram: String,
  public val transactionId: String,
  public val version:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX714e6190,
  public val aresTransStatus:
      InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d? = null,
  public val electronicCommerceIndicator:
      InlineV1PaymentIntentsConfirmPostRequestFormElectronicCommerceIn67d5X85ce330a? = null,
  public val exemptionIndicator:
      InlineV1PaymentIntentsConfirmPostRequestFormExemptionIndicatorX526276b1? = null,
  public val networkOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac? = null,
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
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX714e6190? = null

    public var version:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX714e6190
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public var aresTransStatus:
        InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d? = null

    public var electronicCommerceIndicator:
        InlineV1PaymentIntentsConfirmPostRequestFormElectronicCommerceIn67d5X85ce330a? = null

    public var exemptionIndicator:
        InlineV1PaymentIntentsConfirmPostRequestFormExemptionIndicatorX526276b1? = null

    public var networkOptions: InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac?
        = null

    public var requestorChallengeIndicator: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd {
      check(cryptogramValue != null) { "cryptogram is required" }
      check(transactionIdValue != null) { "transactionId is required" }
      check(versionValue != null) { "version is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd must be a JSON object")
      val cryptogram = json.decodeRequired<String>(rawObject, "cryptogram")
      val transactionId = json.decodeRequired<String>(rawObject, "transaction_id")
      val version = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX714e6190>(rawObject, "version")
      return InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd(
        cryptogram = cryptogram,
        transactionId = transactionId,
        version = version,
        aresTransStatus = rawObject["ares_trans_status"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d>(it) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormElectronicCommerceIn67d5X85ce330a>(it) },
        exemptionIndicator = rawObject["exemption_indicator"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormExemptionIndicatorX526276b1>(it) },
        networkOptions = rawObject["network_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac>(it) },
        requestorChallengeIndicator = rawObject["requestor_challenge_indicator"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd(block: InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd = InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
