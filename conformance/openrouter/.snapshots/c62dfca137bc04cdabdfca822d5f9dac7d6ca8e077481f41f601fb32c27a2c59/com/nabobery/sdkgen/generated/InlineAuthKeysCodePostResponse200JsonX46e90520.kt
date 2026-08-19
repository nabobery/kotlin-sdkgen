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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAuthKeysCodePostResponse200JsonX46e90520.Serializer::class)
public class InlineAuthKeysCodePostResponse200JsonX46e90520(
  /**
   * Auth code data
   */
  public val `data`: InlineAuthKeysCodePostResponse200JsonDataX0adfad2a,
) {
  public class Builder {
    private var dataValue: InlineAuthKeysCodePostResponse200JsonDataX0adfad2a? = null

    public var `data`: InlineAuthKeysCodePostResponse200JsonDataX0adfad2a
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineAuthKeysCodePostResponse200JsonX46e90520 {
      check(dataValue != null) { "data is required" }
      return InlineAuthKeysCodePostResponse200JsonX46e90520(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAuthKeysCodePostResponse200JsonX46e90520 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAuthKeysCodePostResponse200JsonX46e90520> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAuthKeysCodePostResponse200JsonX46e90520 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAuthKeysCodePostResponse200JsonX46e90520")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAuthKeysCodePostResponse200JsonX46e90520 must be a JSON object")
      val data = json.decodeRequired<InlineAuthKeysCodePostResponse200JsonDataX0adfad2a>(rawObject, "data")
      return InlineAuthKeysCodePostResponse200JsonX46e90520(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysCodePostResponse200JsonX46e90520) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAuthKeysCodePostResponse200JsonX46e90520")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAuthKeysCodePostResponse200JsonX46e90520(block: InlineAuthKeysCodePostResponse200JsonX46e90520.Builder.() -> Unit): InlineAuthKeysCodePostResponse200JsonX46e90520 = InlineAuthKeysCodePostResponse200JsonX46e90520.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAuthKeysCodePostResponse200JsonX46e90520 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
