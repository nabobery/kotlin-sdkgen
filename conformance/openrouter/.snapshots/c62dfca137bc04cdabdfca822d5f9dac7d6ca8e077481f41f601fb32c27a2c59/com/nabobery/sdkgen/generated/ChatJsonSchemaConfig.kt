package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * JSON Schema configuration object
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatJsonSchemaConfig
 */
@Serializable(with = ChatJsonSchemaConfig.Serializer::class)
public class ChatJsonSchemaConfig(
  /**
   * Schema name (a-z, A-Z, 0-9, underscores, dashes, max 64 chars)
   */
  public val name: String,
  /**
   * Schema description for the model
   */
  public val description: String? = null,
  schema: Map<String, JsonElement?>? = null,
  /**
   * Enable strict schema adherence
   */
  public val strict: Boolean? = null,
) {
  /**
   * JSON Schema object
   */
  public val schema: Map<String, JsonElement?>? = schema?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Schema description for the model
     */
    public var description: String? = null

    private var schemaValue: Map<String, JsonElement?>? = null

    /**
     * JSON Schema object
     */
    public var schema: Map<String, JsonElement?>?
      get() = schemaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        schemaValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Enable strict schema adherence
     */
    public var strict: Boolean? = null

    public fun build(): ChatJsonSchemaConfig {
      check(nameValue != null) { "name is required" }
      return ChatJsonSchemaConfig(
        name = name,
        description = description,
        schema = schema,
        strict = strict,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatJsonSchemaConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatJsonSchemaConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatJsonSchemaConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatJsonSchemaConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatJsonSchemaConfig must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return ChatJsonSchemaConfig(
        name = name,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        schema = rawObject["schema"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        strict = rawObject["strict"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatJsonSchemaConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatJsonSchemaConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.schema?.let { put("schema", json.encodeToJsonElement(it)) }
        value.strict?.let { put("strict", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatJsonSchemaConfig(block: ChatJsonSchemaConfig.Builder.() -> Unit): ChatJsonSchemaConfig = ChatJsonSchemaConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatJsonSchemaConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
