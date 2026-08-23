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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0(
  public val mandateOptions:
      InlineV1TestHelpersConfirmafd4PostRequestFormMandateOptionsXedbb68a8? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1TestHelpersConfirmafd4PostRequestFormMandateOptionsXedbb68a8?
        = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormMandateOptionsXedbb68a8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataUpiX95bd47b0.build(block)
