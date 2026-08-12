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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934(
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX6b7942e8? = null,
  public val setupFutureUsage:
      InlineV1SetupIntentsConfirmPostRequestFormSetupFutureUsageX3a632241? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX6b7942e8? =
        null

    public var setupFutureUsage:
        InlineV1SetupIntentsConfirmPostRequestFormSetupFutureUsageX3a632241? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX6b7942e8>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormSetupFutureUsageX3a632241>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934.build(block)
