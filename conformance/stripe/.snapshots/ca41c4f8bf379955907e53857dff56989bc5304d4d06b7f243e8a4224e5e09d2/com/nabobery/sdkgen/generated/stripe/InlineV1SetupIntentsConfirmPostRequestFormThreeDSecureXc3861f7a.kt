package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a(
  public val aresTransStatus:
      InlineV1SetupIntentsConfirmPostRequestFormAresTransStatusX79855976? = null,
  public val cryptogram: String? = null,
  public val electronicCommerceIndicator:
      InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0? = null,
  public val networkOptions:
      InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba? = null,
  public val requestorChallengeIndicator: String? = null,
  public val transactionId: String? = null,
  public val version:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e? = null,
) {
  public class Builder {
    public var aresTransStatus: InlineV1SetupIntentsConfirmPostRequestFormAresTransStatusX79855976?
        = null

    public var cryptogram: String? = null

    public var electronicCommerceIndicator:
        InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0? = null

    public var networkOptions: InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba? =
        null

    public var requestorChallengeIndicator: String? = null

    public var transactionId: String? = null

    public var version:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a = InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a(
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
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a(
        aresTransStatus = rawObject["ares_trans_status"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormAresTransStatusX79855976>(it) },
        cryptogram = rawObject["cryptogram"]?.let { json.decodeFromJsonElement<String>(it) },
        electronicCommerceIndicator = rawObject["electronic_commerce_indicator"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0>(it) },
        networkOptions = rawObject["network_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba>(it) },
        requestorChallengeIndicator = rawObject["requestor_challenge_indicator"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionId = rawObject["transaction_id"]?.let { json.decodeFromJsonElement<String>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a(block: InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a = InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a.build(block)
