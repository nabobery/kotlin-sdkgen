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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7(
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX24868f92? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX24868f92? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsX24868f92>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7.build(block)
