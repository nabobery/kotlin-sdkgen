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
 * If this is a `klarna` PaymentMethod, this hash contains details about the Klarna payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/klarna
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15(
  public val dob: InlineV1PaymentMethodsPostRequestFormKlarnaDobX27f1cd8d? = null,
) {
  public class Builder {
    public var dob: InlineV1PaymentMethodsPostRequestFormKlarnaDobX27f1cd8d? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15 = InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15(
      dob = dob,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15(
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormKlarnaDobX27f1cd8d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15(block: InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15 = InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15.build(block)
