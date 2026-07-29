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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks
 */
@Serializable(with = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318.Serializer::class)
public class InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318(
  public val inputs:
      InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009? = null,
) {
  public class Builder {
    public var inputs:
        InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009? = null

    public fun build(): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318 = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318(
      inputs = inputs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318 must be a JSON object")
      return InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318(
        inputs = rawObject["inputs"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318(block: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318.Builder.() -> Unit): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318 = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318.build(block)
