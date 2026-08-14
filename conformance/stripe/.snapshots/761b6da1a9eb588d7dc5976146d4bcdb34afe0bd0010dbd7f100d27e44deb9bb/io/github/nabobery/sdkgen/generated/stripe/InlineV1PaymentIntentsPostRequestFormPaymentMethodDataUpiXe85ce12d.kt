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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d(
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXff71f34d? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXff71f34d? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXff71f34d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiXe85ce12d.build(block)
