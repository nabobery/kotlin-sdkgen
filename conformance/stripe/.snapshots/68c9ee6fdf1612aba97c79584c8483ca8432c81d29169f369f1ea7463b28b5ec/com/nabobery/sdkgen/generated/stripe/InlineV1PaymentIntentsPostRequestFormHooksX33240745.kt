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
 * Automations to be run during the PaymentIntent lifecycle
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksX33240745.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksX33240745(
  public val inputs: InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973? = null,
) {
  public class Builder {
    public var inputs: InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormHooksX33240745 = InlineV1PaymentIntentsPostRequestFormHooksX33240745(
      inputs = inputs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksX33240745 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksX33240745> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksX33240745 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksX33240745")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormHooksX33240745 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormHooksX33240745(
        inputs = rawObject["inputs"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsX1741d973>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksX33240745) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksX33240745")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksX33240745(block: InlineV1PaymentIntentsPostRequestFormHooksX33240745.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksX33240745 = InlineV1PaymentIntentsPostRequestFormHooksX33240745.build(block)
