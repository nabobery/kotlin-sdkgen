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
 */
@Serializable(with = InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema(
  /**
   * Auth code data
   */
  public val `data`:
      InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue:
        InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData? = null

    public var `data`:
        InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val data = json
        .decodeRequired<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData>(raw, "data")
      return InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema(block: InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema = InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
