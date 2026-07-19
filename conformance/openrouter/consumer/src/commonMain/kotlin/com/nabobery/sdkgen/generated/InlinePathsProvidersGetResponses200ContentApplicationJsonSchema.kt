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
 * sdkgen://source/openapi.yaml#/paths/~1providers/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsProvidersGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsProvidersGetResponses200ContentApplicationJsonSchema(
  `data`: List<InlinePathsProvidersGetResponses200ContentApplicationJsonSchemaPropertiesDataItems>,
) {
  public val `data`:
      List<InlinePathsProvidersGetResponses200ContentApplicationJsonSchemaPropertiesDataItems> =
      data.toList()

  public class Builder {
    private var dataValue:
        List<InlinePathsProvidersGetResponses200ContentApplicationJsonSchemaPropertiesDataItems>? =
        null

    public var `data`:
        List<InlinePathsProvidersGetResponses200ContentApplicationJsonSchemaPropertiesDataItems>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsProvidersGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsProvidersGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsProvidersGetResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsProvidersGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsProvidersGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsProvidersGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsProvidersGetResponses200ContentApplicationJsonSchema must be a JSON " +
          "object")
      val data = json
        .decodeRequired<List<InlinePathsProvidersGetResponses200ContentApplicationJsonSchemaPropertiesDataItems>>(raw,
          "data")
      return InlinePathsProvidersGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsProvidersGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsProvidersGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsProvidersGetResponses200ContentApplicationJsonSchema(block: InlinePathsProvidersGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsProvidersGetResponses200ContentApplicationJsonSchema = InlinePathsProvidersGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsProvidersGetResponses200ContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
