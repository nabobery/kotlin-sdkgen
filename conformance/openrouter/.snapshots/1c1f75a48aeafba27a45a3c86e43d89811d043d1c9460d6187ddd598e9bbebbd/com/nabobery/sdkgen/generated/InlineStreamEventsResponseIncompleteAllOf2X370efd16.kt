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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseIncomplete/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseIncomplete/allOf/1
 */
@Serializable(with = InlineStreamEventsResponseIncompleteAllOf2X370efd16.Serializer::class)
public class InlineStreamEventsResponseIncompleteAllOf2X370efd16(
  public val response: OpenResponsesResult? = null,
) {
  public class Builder {
    public var response: OpenResponsesResult? = null

    public fun build(): InlineStreamEventsResponseIncompleteAllOf2X370efd16 = InlineStreamEventsResponseIncompleteAllOf2X370efd16(
      response = response,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamEventsResponseIncompleteAllOf2X370efd16 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamEventsResponseIncompleteAllOf2X370efd16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamEventsResponseIncompleteAllOf2X370efd16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamEventsResponseIncompleteAllOf2X370efd16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamEventsResponseIncompleteAllOf2X370efd16 must be a JSON object")
      return InlineStreamEventsResponseIncompleteAllOf2X370efd16(
        response = rawObject["response"]?.let { json.decodeFromJsonElement<OpenResponsesResult>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamEventsResponseIncompleteAllOf2X370efd16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamEventsResponseIncompleteAllOf2X370efd16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.response?.let { put("response", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamEventsResponseIncompleteAllOf2X370efd16(block: InlineStreamEventsResponseIncompleteAllOf2X370efd16.Builder.() -> Unit): InlineStreamEventsResponseIncompleteAllOf2X370efd16 = InlineStreamEventsResponseIncompleteAllOf2X370efd16.build(block)
