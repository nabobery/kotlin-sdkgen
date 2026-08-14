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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd(
  public val captureMethod:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa6d02e6c? = null,
  public val cvcToken: String? = null,
  public val installments:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54? = null,
  public val network:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX3a642352? = null,
  public val requestExtendedAuthorization:
      InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d? = null,
  public val requestIncrementalAuthorization:
      InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX02e5133e? = null,
  public val requestMulticapture:
      InlineV1PaymentIntentsPostRequestFormRequestMulticaptureX44a3355b? = null,
  public val requestOvercapture:
      InlineV1PaymentIntentsPostRequestFormRequestOvercaptureXac720c4d? = null,
  public val requestThreeDSecure:
      InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX39c4c1e0? = null,
  public val requireCvcRecollection: Boolean? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0d30eaa? = null,
  public val statementDescriptorSuffixKana:
      InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21? = null,
  public val statementDescriptorSuffixKanji:
      InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50? = null,
  public val threeDSecure:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d? = null,
) {
  public class Builder {
    public var captureMethod:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa6d02e6c? = null

    public var cvcToken: String? = null

    public var installments:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207? = null

    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54? = null

    public var network:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX3a642352? = null

    public var requestExtendedAuthorization:
        InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d? = null

    public var requestIncrementalAuthorization:
        InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX02e5133e? = null

    public var requestMulticapture:
        InlineV1PaymentIntentsPostRequestFormRequestMulticaptureX44a3355b? = null

    public var requestOvercapture: InlineV1PaymentIntentsPostRequestFormRequestOvercaptureXac720c4d?
        = null

    public var requestThreeDSecure:
        InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX39c4c1e0? = null

    public var requireCvcRecollection: Boolean? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0d30eaa? =
        null

    public var statementDescriptorSuffixKana:
        InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21? = null

    public var statementDescriptorSuffixKanji:
        InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50? = null

    public var threeDSecure:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXa6d02e6c>(it) },
        cvcToken = rawObject["cvc_token"]?.let { json.decodeFromJsonElement<String>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX3a642352>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX02e5133e>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestMulticaptureX44a3355b>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestOvercaptureXac720c4d>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX39c4c1e0>(it) },
        requireCvcRecollection = rawObject["require_cvc_recollection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0d30eaa>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50>(it) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsThreeDSecureX18bd920d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd.build(block)
