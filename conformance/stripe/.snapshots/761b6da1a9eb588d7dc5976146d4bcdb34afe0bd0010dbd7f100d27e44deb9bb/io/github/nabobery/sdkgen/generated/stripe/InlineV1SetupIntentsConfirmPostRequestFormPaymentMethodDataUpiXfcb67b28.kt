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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28(
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXe0390874? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXe0390874? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXe0390874>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataUpiXfcb67b28.build(block)
