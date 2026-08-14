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
 * lencoded/schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiXee1ce1c6.build(block)
