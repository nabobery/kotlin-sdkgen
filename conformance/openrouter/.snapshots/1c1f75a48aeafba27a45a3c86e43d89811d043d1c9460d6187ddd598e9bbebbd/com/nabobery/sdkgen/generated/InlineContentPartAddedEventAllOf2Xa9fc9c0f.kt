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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartAddedEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartAddedEvent/allOf/1
 */
@Serializable(with = InlineContentPartAddedEventAllOf2Xa9fc9c0f.Serializer::class)
public class InlineContentPartAddedEventAllOf2Xa9fc9c0f(
  public val part: InlineContentPartAddedEventAllOf2PartX89486208? = null,
) {
  public class Builder {
    public var part: InlineContentPartAddedEventAllOf2PartX89486208? = null

    public fun build(): InlineContentPartAddedEventAllOf2Xa9fc9c0f = InlineContentPartAddedEventAllOf2Xa9fc9c0f(
      part = part,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentPartAddedEventAllOf2Xa9fc9c0f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentPartAddedEventAllOf2Xa9fc9c0f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartAddedEventAllOf2Xa9fc9c0f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartAddedEventAllOf2Xa9fc9c0f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentPartAddedEventAllOf2Xa9fc9c0f must be a JSON object")
      return InlineContentPartAddedEventAllOf2Xa9fc9c0f(
        part = rawObject["part"]?.let { json.decodeFromJsonElement<InlineContentPartAddedEventAllOf2PartX89486208>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartAddedEventAllOf2Xa9fc9c0f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentPartAddedEventAllOf2Xa9fc9c0f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.part?.let { put("part", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentPartAddedEventAllOf2Xa9fc9c0f(block: InlineContentPartAddedEventAllOf2Xa9fc9c0f.Builder.() -> Unit): InlineContentPartAddedEventAllOf2Xa9fc9c0f = InlineContentPartAddedEventAllOf2Xa9fc9c0f.build(block)
