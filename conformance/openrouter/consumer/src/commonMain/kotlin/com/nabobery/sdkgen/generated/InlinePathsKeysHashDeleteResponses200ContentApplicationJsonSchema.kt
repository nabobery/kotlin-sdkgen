package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/delete/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema(
  /**
   * Confirmation that the API key was deleted
   */
  public val deleted: Boolean,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    public fun build(): InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema {
      check(deletedValue != null) { "deleted is required" }
      return InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val deleted = json.decodeRequired<Boolean>(raw, "deleted")
      return InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema(block: InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema = InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
