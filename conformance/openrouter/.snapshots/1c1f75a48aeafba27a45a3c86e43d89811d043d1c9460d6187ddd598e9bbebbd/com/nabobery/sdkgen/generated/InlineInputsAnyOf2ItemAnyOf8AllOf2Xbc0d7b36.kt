package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1
 */
@Serializable(with = InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36.Serializer::class)
public class InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36(
  public val content: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89? = null,
) {
  public class Builder {
    public var content: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89? = null

    public fun build(): InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36 = InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36(
      content = content,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36 must be a JSON object")
      return InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36(
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36(block: InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36.Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36 = InlineInputsAnyOf2ItemAnyOf8AllOf2Xbc0d7b36.build(block)
