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
 * lencoded/schema/properties/payment_method_data/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/klarna
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435(
  public val dob: InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaDobX884f3b88? = null,
) {
  public class Builder {
    public var dob: InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaDobX884f3b88? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435(
      dob = dob,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435(
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaDobX884f3b88>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataKlarnaX6ac53435.build(block)
