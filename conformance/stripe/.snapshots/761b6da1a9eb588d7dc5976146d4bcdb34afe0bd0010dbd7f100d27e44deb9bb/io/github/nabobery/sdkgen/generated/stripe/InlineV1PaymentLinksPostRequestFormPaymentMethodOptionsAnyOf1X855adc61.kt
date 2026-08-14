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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61(
  public val card:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959? = null,
) {
  public class Builder {
    public var card: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959? =
        null

    public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61(
      card = card,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61(block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61.build(block)
