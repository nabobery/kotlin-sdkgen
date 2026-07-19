package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1endpoints~1zdr/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema(
  `data`: List<PublicEndpoint>,
) {
  public val `data`: List<PublicEndpoint> = data.toList()

  public class Builder {
    private var dataValue: List<PublicEndpoint>? = null

    public var `data`: List<PublicEndpoint>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val data = json.decodeRequired<List<PublicEndpoint>>(raw, "data")
      return InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema(block: InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema = InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
