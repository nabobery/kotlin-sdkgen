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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXc9237987? = null,
  public val setupFutureUsage:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX1497b1e7? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXc9237987? = null

    public var setupFutureUsage:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX1497b1e7? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXc9237987>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSetupFutureUsageX1497b1e7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122.build(block)
