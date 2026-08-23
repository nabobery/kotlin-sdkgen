package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesCreatedEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesCreatedEvent/allOf/1
 */
@Serializable(with = InlineOpenResponsesCreatedEventAllOf2Xf3c71d69.Serializer::class)
public class InlineOpenResponsesCreatedEventAllOf2Xf3c71d69(
  public val response: OpenResponsesResult? = null,
) {
  public class Builder {
    public var response: OpenResponsesResult? = null

    public fun build(): InlineOpenResponsesCreatedEventAllOf2Xf3c71d69 = InlineOpenResponsesCreatedEventAllOf2Xf3c71d69(
      response = response,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenResponsesCreatedEventAllOf2Xf3c71d69 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenResponsesCreatedEventAllOf2Xf3c71d69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenResponsesCreatedEventAllOf2Xf3c71d69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenResponsesCreatedEventAllOf2Xf3c71d69")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenResponsesCreatedEventAllOf2Xf3c71d69 must be a JSON object")
      return InlineOpenResponsesCreatedEventAllOf2Xf3c71d69(
        response = rawObject["response"]?.let { json.decodeFromJsonElement<OpenResponsesResult>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenResponsesCreatedEventAllOf2Xf3c71d69) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenResponsesCreatedEventAllOf2Xf3c71d69")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.response?.let { put("response", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenResponsesCreatedEventAllOf2Xf3c71d69(block: InlineOpenResponsesCreatedEventAllOf2Xf3c71d69.Builder.() -> Unit): InlineOpenResponsesCreatedEventAllOf2Xf3c71d69 = InlineOpenResponsesCreatedEventAllOf2Xf3c71d69.build(block)
