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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseCompleted/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseCompleted/allOf/1
 */
@Serializable(with = InlineStreamEventsResponseCompletedAllOf2X7c0b51e3.Serializer::class)
public class InlineStreamEventsResponseCompletedAllOf2X7c0b51e3(
  public val response: OpenResponsesResult? = null,
) {
  public class Builder {
    public var response: OpenResponsesResult? = null

    public fun build(): InlineStreamEventsResponseCompletedAllOf2X7c0b51e3 = InlineStreamEventsResponseCompletedAllOf2X7c0b51e3(
      response = response,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamEventsResponseCompletedAllOf2X7c0b51e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamEventsResponseCompletedAllOf2X7c0b51e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamEventsResponseCompletedAllOf2X7c0b51e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamEventsResponseCompletedAllOf2X7c0b51e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamEventsResponseCompletedAllOf2X7c0b51e3 must be a JSON object")
      return InlineStreamEventsResponseCompletedAllOf2X7c0b51e3(
        response = rawObject["response"]?.let { json.decodeFromJsonElement<OpenResponsesResult>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamEventsResponseCompletedAllOf2X7c0b51e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamEventsResponseCompletedAllOf2X7c0b51e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.response?.let { put("response", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamEventsResponseCompletedAllOf2X7c0b51e3(block: InlineStreamEventsResponseCompletedAllOf2X7c0b51e3.Builder.() -> Unit): InlineStreamEventsResponseCompletedAllOf2X7c0b51e3 = InlineStreamEventsResponseCompletedAllOf2X7c0b51e3.build(block)
