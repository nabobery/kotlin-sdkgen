package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c(
  public val captureMethod:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa734875b? = null,
  public val cvcToken: String? = null,
  public val installments:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX09008e3e? = null,
  public val network:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73? = null,
  public val requestExtendedAuthorization:
      InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa8743159? = null,
  public val requestIncrementalAuthorization:
      InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958? = null,
  public val requestMulticapture:
      InlineV1PaymentIntentsPostRequestFormRequestMulticaptureXdde2b42b? = null,
  public val requestOvercapture:
      InlineV1PaymentIntentsPostRequestFormRequestOvercaptureX03538a4a? = null,
  public val requestThreeDSecure:
      InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e? = null,
  public val requireCvcRecollection: Boolean? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7811a597? = null,
  public val statementDescriptorSuffixKana:
      InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fXedd1b2c3? = null,
  public val statementDescriptorSuffixKanji:
      InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd? = null,
  public val threeDSecure:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a? = null,
) {
  public class Builder {
    public var captureMethod:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa734875b? = null

    public var cvcToken: String? = null

    public var installments:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9? = null

    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX09008e3e? = null

    public var network:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73? = null

    public var requestExtendedAuthorization:
        InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa8743159? = null

    public var requestIncrementalAuthorization:
        InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958? = null

    public var requestMulticapture:
        InlineV1PaymentIntentsPostRequestFormRequestMulticaptureXdde2b42b? = null

    public var requestOvercapture: InlineV1PaymentIntentsPostRequestFormRequestOvercaptureX03538a4a?
        = null

    public var requestThreeDSecure:
        InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e? = null

    public var requireCvcRecollection: Boolean? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7811a597? =
        null

    public var statementDescriptorSuffixKana:
        InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fXedd1b2c3? = null

    public var statementDescriptorSuffixKanji:
        InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd? = null

    public var threeDSecure:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c(
      captureMethod = captureMethod,
      cvcToken = cvcToken,
      installments = installments,
      mandateOptions = mandateOptions,
      network = network,
      requestExtendedAuthorization = requestExtendedAuthorization,
      requestIncrementalAuthorization = requestIncrementalAuthorization,
      requestMulticapture = requestMulticapture,
      requestOvercapture = requestOvercapture,
      requestThreeDSecure = requestThreeDSecure,
      requireCvcRecollection = requireCvcRecollection,
      setupFutureUsage = setupFutureUsage,
      statementDescriptorSuffixKana = statementDescriptorSuffixKana,
      statementDescriptorSuffixKanji = statementDescriptorSuffixKanji,
      threeDSecure = threeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa734875b>(it) },
        cvcToken = rawObject["cvc_token"]?.let { json.decodeFromJsonElement<String>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX09008e3e>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa8743159>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestMulticaptureXdde2b42b>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestOvercaptureX03538a4a>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e>(it) },
        requireCvcRecollection = rawObject["require_cvc_recollection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7811a597>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fXedd1b2c3>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd>(it) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX5f003b8a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.cvcToken?.let { put("cvc_token", it) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorization?.let { put("request_incremental_authorization", json.encodeToJsonElement(it)) }
        value.requestMulticapture?.let { put("request_multicapture", json.encodeToJsonElement(it)) }
        value.requestOvercapture?.let { put("request_overcapture", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
        value.requireCvcRecollection?.let { put("require_cvc_recollection", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptorSuffixKana?.let { put("statement_descriptor_suffix_kana", json.encodeToJsonElement(it)) }
        value.statementDescriptorSuffixKanji?.let { put("statement_descriptor_suffix_kanji", json.encodeToJsonElement(it)) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c.build(block)
