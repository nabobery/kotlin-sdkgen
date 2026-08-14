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
 * urlencoded/schema/properties/hooks/properties/inputs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks/properties/inputs
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973(
  public val tax: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358? = null,
) {
  public class Builder {
    public var tax: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973 = InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973(
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973(
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973(block: InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973 = InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973.build(block)
