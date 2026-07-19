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
 * sdkgen://source/openapi.yaml#/paths/~1models~1{author}~1{slug}~1endpoints/get/responses/200/content/application~1json
 * /schema.
 */
@Serializable(with = InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema(
  public val `data`: ListEndpointsResponse,
) {
  public class Builder {
    private var dataValue: ListEndpointsResponse? = null

    public var `data`: ListEndpointsResponse
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema " +
          "must be a JSON object")
      val data = json.decodeRequired<ListEndpointsResponse>(raw, "data")
      return InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema(block: InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema = InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
