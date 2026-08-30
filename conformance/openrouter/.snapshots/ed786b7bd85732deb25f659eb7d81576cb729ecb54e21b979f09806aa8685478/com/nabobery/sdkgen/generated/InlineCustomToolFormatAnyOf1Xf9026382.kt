package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0
 */
@Serializable(with = InlineCustomToolFormatAnyOf1Xf9026382.Serializer::class)
public class InlineCustomToolFormatAnyOf1Xf9026382(
  public val type: InlineCustomToolFormatAnyOf1TypeX7b071c68,
) {
  public class Builder {
    private var typeValue: InlineCustomToolFormatAnyOf1TypeX7b071c68? = null

    public var type: InlineCustomToolFormatAnyOf1TypeX7b071c68
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineCustomToolFormatAnyOf1Xf9026382 {
      check(typeValue != null) { "type is required" }
      return InlineCustomToolFormatAnyOf1Xf9026382(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCustomToolFormatAnyOf1Xf9026382 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatAnyOf1Xf9026382> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatAnyOf1Xf9026382 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolFormatAnyOf1Xf9026382")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCustomToolFormatAnyOf1Xf9026382 must be a JSON object")
      val type = json.decodeRequired<InlineCustomToolFormatAnyOf1TypeX7b071c68>(rawObject, "type")
      return InlineCustomToolFormatAnyOf1Xf9026382(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatAnyOf1Xf9026382) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCustomToolFormatAnyOf1Xf9026382")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCustomToolFormatAnyOf1Xf9026382(block: InlineCustomToolFormatAnyOf1Xf9026382.Builder.() -> Unit): InlineCustomToolFormatAnyOf1Xf9026382 = InlineCustomToolFormatAnyOf1Xf9026382.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCustomToolFormatAnyOf1Xf9026382 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
