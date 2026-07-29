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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0? = null,
  public val installments:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b? = null,
  public val requestExtendedAuthorization:
      InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f? = null,
  public val requestIncrementalAuthorization:
      InlineV1CheckoutSessionsPostRequestFormRequestIncrementalAu57cdX55c99bef? = null,
  public val requestMulticapture:
      InlineV1CheckoutSessionsPostRequestFormRequestMulticaptureX2d3a3394? = null,
  public val requestOvercapture:
      InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e? = null,
  public val requestThreeDSecure:
      InlineV1CheckoutSessionsPostRequestFormRequestThreeDSecureX87c29717? = null,
  public val restrictions:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX395df094? = null,
  public val statementDescriptorSuffixKana: String? = null,
  public val statementDescriptorSuffixKanji: String? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0? = null

    public var installments:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b? = null

    public var requestExtendedAuthorization:
        InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f? = null

    public var requestIncrementalAuthorization:
        InlineV1CheckoutSessionsPostRequestFormRequestIncrementalAu57cdX55c99bef? = null

    public var requestMulticapture:
        InlineV1CheckoutSessionsPostRequestFormRequestMulticaptureX2d3a3394? = null

    public var requestOvercapture:
        InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e? = null

    public var requestThreeDSecure:
        InlineV1CheckoutSessionsPostRequestFormRequestThreeDSecureX87c29717? = null

    public var restrictions:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX395df094? =
        null

    public var statementDescriptorSuffixKana: String? = null

    public var statementDescriptorSuffixKanji: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c(
      captureMethod = captureMethod,
      installments = installments,
      requestExtendedAuthorization = requestExtendedAuthorization,
      requestIncrementalAuthorization = requestIncrementalAuthorization,
      requestMulticapture = requestMulticapture,
      requestOvercapture = requestOvercapture,
      requestThreeDSecure = requestThreeDSecure,
      restrictions = restrictions,
      setupFutureUsage = setupFutureUsage,
      statementDescriptorSuffixKana = statementDescriptorSuffixKana,
      statementDescriptorSuffixKanji = statementDescriptorSuffixKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRequestIncrementalAu57cdX55c99bef>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRequestMulticaptureX2d3a3394>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRequestThreeDSecureX87c29717>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX395df094>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorization?.let { put("request_incremental_authorization", json.encodeToJsonElement(it)) }
        value.requestMulticapture?.let { put("request_multicapture", json.encodeToJsonElement(it)) }
        value.requestOvercapture?.let { put("request_overcapture", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptorSuffixKana?.let { put("statement_descriptor_suffix_kana", it) }
        value.statementDescriptorSuffixKanji?.let { put("statement_descriptor_suffix_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c.build(block)
