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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema(
  public val `data`:
      InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData? = null

    public var `data`:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val data = json
        .decodeRequired<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData>(raw, "data")
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema(block: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
