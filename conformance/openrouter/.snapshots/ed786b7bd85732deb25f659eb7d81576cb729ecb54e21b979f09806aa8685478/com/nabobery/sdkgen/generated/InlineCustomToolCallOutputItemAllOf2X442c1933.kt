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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallOutputItem/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallOutputItem/allOf/1
 */
@Serializable(with = InlineCustomToolCallOutputItemAllOf2X442c1933.Serializer::class)
public class InlineCustomToolCallOutputItemAllOf2X442c1933(
  public val output: InlineCustomToolCallOutputItemAllOf2OutputXca5adec4? = null,
) {
  public class Builder {
    public var output: InlineCustomToolCallOutputItemAllOf2OutputXca5adec4? = null

    public fun build(): InlineCustomToolCallOutputItemAllOf2X442c1933 = InlineCustomToolCallOutputItemAllOf2X442c1933(
      output = output,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCustomToolCallOutputItemAllOf2X442c1933 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCustomToolCallOutputItemAllOf2X442c1933> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolCallOutputItemAllOf2X442c1933 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolCallOutputItemAllOf2X442c1933")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCustomToolCallOutputItemAllOf2X442c1933 must be a JSON object")
      return InlineCustomToolCallOutputItemAllOf2X442c1933(
        output = rawObject["output"]?.let { json.decodeFromJsonElement<InlineCustomToolCallOutputItemAllOf2OutputXca5adec4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolCallOutputItemAllOf2X442c1933) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCustomToolCallOutputItemAllOf2X442c1933")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.output?.let { put("output", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCustomToolCallOutputItemAllOf2X442c1933(block: InlineCustomToolCallOutputItemAllOf2X442c1933.Builder.() -> Unit): InlineCustomToolCallOutputItemAllOf2X442c1933 = InlineCustomToolCallOutputItemAllOf2X442c1933.build(block)
