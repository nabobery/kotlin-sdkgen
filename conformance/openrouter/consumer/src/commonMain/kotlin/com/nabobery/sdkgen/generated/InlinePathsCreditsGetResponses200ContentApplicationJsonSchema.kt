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
 * Total credits purchased and used
 */
@Serializable(with = InlinePathsCreditsGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsCreditsGetResponses200ContentApplicationJsonSchema(
  public val `data`: InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData,
) {
  public class Builder {
    private var dataValue:
        InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData? = null

    public var `data`: InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlinePathsCreditsGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      return InlinePathsCreditsGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsCreditsGetResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsCreditsGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsCreditsGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsCreditsGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsCreditsGetResponses200ContentApplicationJsonSchema must be a JSON " +
          "object")
      val data = json.decodeRequired<InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData>(raw,
        "data")
      return InlinePathsCreditsGetResponses200ContentApplicationJsonSchema(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsCreditsGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsCreditsGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsCreditsGetResponses200ContentApplicationJsonSchema(block: InlinePathsCreditsGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsCreditsGetResponses200ContentApplicationJsonSchema = InlinePathsCreditsGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsCreditsGetResponses200ContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
