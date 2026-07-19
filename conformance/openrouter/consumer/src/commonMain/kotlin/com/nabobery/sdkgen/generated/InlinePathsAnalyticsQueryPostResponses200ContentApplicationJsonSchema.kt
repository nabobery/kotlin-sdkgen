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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema(
  public val `data`:
      InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue:
        InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData? = null

    public var `data`:
        InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val data = json
        .decodeRequired<InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData>(raw,
          "data")
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema(block: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
