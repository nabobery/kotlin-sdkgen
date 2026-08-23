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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseFailed/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseFailed/allOf/1
 */
@Serializable(with = InlineStreamEventsResponseFailedAllOf2Xa8ea617d.Serializer::class)
public class InlineStreamEventsResponseFailedAllOf2Xa8ea617d(
  public val response: OpenResponsesResult? = null,
) {
  public class Builder {
    public var response: OpenResponsesResult? = null

    public fun build(): InlineStreamEventsResponseFailedAllOf2Xa8ea617d = InlineStreamEventsResponseFailedAllOf2Xa8ea617d(
      response = response,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamEventsResponseFailedAllOf2Xa8ea617d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamEventsResponseFailedAllOf2Xa8ea617d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamEventsResponseFailedAllOf2Xa8ea617d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamEventsResponseFailedAllOf2Xa8ea617d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamEventsResponseFailedAllOf2Xa8ea617d must be a JSON object")
      return InlineStreamEventsResponseFailedAllOf2Xa8ea617d(
        response = rawObject["response"]?.let { json.decodeFromJsonElement<OpenResponsesResult>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamEventsResponseFailedAllOf2Xa8ea617d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamEventsResponseFailedAllOf2Xa8ea617d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.response?.let { put("response", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamEventsResponseFailedAllOf2Xa8ea617d(block: InlineStreamEventsResponseFailedAllOf2Xa8ea617d.Builder.() -> Unit): InlineStreamEventsResponseFailedAllOf2Xa8ea617d = InlineStreamEventsResponseFailedAllOf2Xa8ea617d.build(block)
