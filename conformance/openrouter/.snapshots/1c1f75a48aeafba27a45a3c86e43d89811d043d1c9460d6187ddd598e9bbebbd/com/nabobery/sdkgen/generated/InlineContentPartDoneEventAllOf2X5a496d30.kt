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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartDoneEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartDoneEvent/allOf/1
 */
@Serializable(with = InlineContentPartDoneEventAllOf2X5a496d30.Serializer::class)
public class InlineContentPartDoneEventAllOf2X5a496d30(
  public val part: InlineContentPartDoneEventAllOf2PartXf7ed8294? = null,
) {
  public class Builder {
    public var part: InlineContentPartDoneEventAllOf2PartXf7ed8294? = null

    public fun build(): InlineContentPartDoneEventAllOf2X5a496d30 = InlineContentPartDoneEventAllOf2X5a496d30(
      part = part,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentPartDoneEventAllOf2X5a496d30 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentPartDoneEventAllOf2X5a496d30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartDoneEventAllOf2X5a496d30 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartDoneEventAllOf2X5a496d30")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentPartDoneEventAllOf2X5a496d30 must be a JSON object")
      return InlineContentPartDoneEventAllOf2X5a496d30(
        part = rawObject["part"]?.let { json.decodeFromJsonElement<InlineContentPartDoneEventAllOf2PartXf7ed8294>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartDoneEventAllOf2X5a496d30) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentPartDoneEventAllOf2X5a496d30")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.part?.let { put("part", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentPartDoneEventAllOf2X5a496d30(block: InlineContentPartDoneEventAllOf2X5a496d30.Builder.() -> Unit): InlineContentPartDoneEventAllOf2X5a496d30 = InlineContentPartDoneEventAllOf2X5a496d30.build(block)
