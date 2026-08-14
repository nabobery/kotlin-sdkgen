package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f(
  public val aresTransStatus:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX42e6a2a3? = null,
  public val cryptogram: String? = null,
  public val electronicCommerceIndicator:
      InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X84d8ec0f? = null,
  public val networkOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f? = null,
  public val requestorChallengeIndicator: String? = null,
  public val transactionId: String? = null,
  public val version:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardVersionXf74100c7? = null,
) {
  public class Builder {
    public var aresTransStatus:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX42e6a2a3? = null

    public var cryptogram: String? = null

    public var electronicCommerceIndicator:
        InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X84d8ec0f? = null

    public var networkOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f? = null

    public var requestorChallengeIndicator: String? = null

    public var transactionId: String? = null

    public var version: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardVersionXf74100c7?
        = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f(
      aresTransStatus = aresTransStatus,
      cryptogram = cryptogram,
      electronicCommerceIndicator = electronicCommerceIndicator,
      networkOptions = networkOptions,
      requestorChallengeIndicator = requestorChallengeIndicator,
      transactionId = transactionId,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f(
        aresTransStatus = rawObject["ares_trans_status"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX42e6a2a3>(it) },
        cryptogram = rawObject["cryptogram"]?.let { json.decodeFromJsonElement<String>(it) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X84d8ec0f>(it) },
        networkOptions = rawObject["network_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f>(it) },
        requestorChallengeIndicator = rawObject["requestor_challenge_indicator"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionId = rawObject["transaction_id"]?.let { json.decodeFromJsonElement<String>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardVersionXf74100c7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aresTransStatus?.let { put("ares_trans_status", json.encodeToJsonElement(it)) }
        value.cryptogram?.let { put("cryptogram", it) }
        value.electronicCommerceIndicator?.let { put("electronic_commerce_indicator", json.encodeToJsonElement(it)) }
        value.networkOptions?.let { put("network_options", json.encodeToJsonElement(it)) }
        value.requestorChallengeIndicator?.let { put("requestor_challenge_indicator", it) }
        value.transactionId?.let { put("transaction_id", it) }
        value.version?.let { put("version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f.build(block)
