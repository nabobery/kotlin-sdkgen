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
 * chema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX794e838a? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX794e838a? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX794e838a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiX177b1f7b.build(block)
