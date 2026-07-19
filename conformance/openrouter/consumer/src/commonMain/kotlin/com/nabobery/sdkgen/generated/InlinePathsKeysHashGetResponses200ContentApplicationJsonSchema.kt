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
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema(
  /**
   * The API key information
   */
  public val `data`: InlinePathsKeysHashGetResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue:
        InlinePathsKeysHashGetResponses200ContentApplicationJsonSchemaPropertiesData? = null

    public var `data`: InlinePathsKeysHashGetResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema must be a JSON " +
          "object")
      val data = json.decodeRequired<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchemaPropertiesData>(raw,
        "data")
      return InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsKeysHashGetResponses200ContentApplicationJsonSchema(block: InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema = InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
