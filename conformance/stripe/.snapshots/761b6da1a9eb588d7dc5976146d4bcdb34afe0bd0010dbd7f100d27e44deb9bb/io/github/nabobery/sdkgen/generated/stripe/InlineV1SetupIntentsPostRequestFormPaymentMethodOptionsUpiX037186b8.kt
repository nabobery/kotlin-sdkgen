package io.github.nabobery.sdkgen.generated.stripe

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
 * lencoded/schema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1caa4bba? = null,
  public val setupFutureUsage:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX28522d97? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1caa4bba? = null

    public var setupFutureUsage:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX28522d97? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1caa4bba>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX28522d97>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiX037186b8.build(block)
