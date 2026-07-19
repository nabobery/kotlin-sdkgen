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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1key/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsKeyGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsKeyGetResponses200ContentApplicationJsonSchema(
  /**
   * Current API key information
   */
  public val `data`: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData?
        = null

    public var `data`: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsKeyGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchema = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeyGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeyGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchema must be a JSON object")
      val data = json.decodeRequired<InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData>(raw,
        "data")
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsKeyGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsKeyGetResponses200ContentApplicationJsonSchema(block: InlinePathsKeyGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchema = InlinePathsKeyGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
