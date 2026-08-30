package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e(
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXd08cb514? = null,
  public val cvcToken: String? = null,
  public val installments:
      InlineV1PaymentIntentsConfirmPostRequestFormInstallmentsX6500bc61? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f? = null,
  public val network:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b? = null,
  public val requestExtendedAuthorization:
      InlineV1PaymentIntentsConfirmPostRequestFormRequestExtendedAutho403fXe9b605d8? = null,
  public val requestIncrementalAuthorization:
      InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3? = null,
  public val requestMulticapture:
      InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e? = null,
  public val requestOvercapture:
      InlineV1PaymentIntentsConfirmPostRequestFormRequestOvercaptureXb5bc38a4? = null,
  public val requestThreeDSecure:
      InlineV1PaymentIntentsConfirmPostRequestFormRequestThreeDSecureXc10609fc? = null,
  public val requireCvcRecollection: Boolean? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8a0bf4c4? = null,
  public val statementDescriptorSuffixKana:
      InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorS583fXf9b759d2? = null,
  public val statementDescriptorSuffixKanji:
      InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorSb1afXec81a7f6? = null,
  public val threeDSecure:
      InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXd08cb514? =
        null

    public var cvcToken: String? = null

    public var installments: InlineV1PaymentIntentsConfirmPostRequestFormInstallmentsX6500bc61? =
        null

    public var mandateOptions: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f?
        = null

    public var network:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b? = null

    public var requestExtendedAuthorization:
        InlineV1PaymentIntentsConfirmPostRequestFormRequestExtendedAutho403fXe9b605d8? = null

    public var requestIncrementalAuthorization:
        InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3? = null

    public var requestMulticapture:
        InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e? = null

    public var requestOvercapture:
        InlineV1PaymentIntentsConfirmPostRequestFormRequestOvercaptureXb5bc38a4? = null

    public var requestThreeDSecure:
        InlineV1PaymentIntentsConfirmPostRequestFormRequestThreeDSecureXc10609fc? = null

    public var requireCvcRecollection: Boolean? = null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8a0bf4c4? = null

    public var statementDescriptorSuffixKana:
        InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorS583fXf9b759d2? = null

    public var statementDescriptorSuffixKanji:
        InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorSb1afXec81a7f6? = null

    public var threeDSecure: InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd? =
        null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXd08cb514>(it) },
        cvcToken = rawObject["cvc_token"]?.let { json.decodeFromJsonElement<String>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormInstallmentsX6500bc61>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestExtendedAutho403fXe9b605d8>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestOvercaptureXb5bc38a4>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestThreeDSecureXc10609fc>(it) },
        requireCvcRecollection = rawObject["require_cvc_recollection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8a0bf4c4>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorS583fXf9b759d2>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormStatementDescriptorSb1afXec81a7f6>(it) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormThreeDSecureX3c588fcd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf4bad71e.build(block)
