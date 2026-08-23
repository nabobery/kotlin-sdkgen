package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class FormatJsonSchemaConfigView internal constructor(
  public val description: String? = null,
  public val name: String,
  public val schema: Map<String, JsonElement?>,
  public val strict: Boolean? = null,
  public val type: InlineFormatJsonSchemaConfigTypeXdd6e2ebb,
)

/**
 * JSON schema constrained response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatJsonSchemaConfig
 */
@Serializable(with = FormatJsonSchemaConfig.Serializer::class)
public class FormatJsonSchemaConfig(
  public val name: String,
  schema: Map<String, JsonElement?>,
  public val type: InlineFormatJsonSchemaConfigTypeXdd6e2ebb,
  public val description: String? = null,
  public val strict: Boolean? = null,
) {
  public val schema: Map<String, JsonElement?> = schema.toMap()

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var schemaValue: Map<String, JsonElement?>? = null

    public var schema: Map<String, JsonElement?>
      get() = requireNotNull(schemaValue) { "schema is required" }.toMap()
      set(`value`) {
        schemaValue = value.toMap()
      }

    private var typeValue: InlineFormatJsonSchemaConfigTypeXdd6e2ebb? = null

    public var type: InlineFormatJsonSchemaConfigTypeXdd6e2ebb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var description: String? = null

    public var strict: Boolean? = null

    public fun build(): FormatJsonSchemaConfig {
      check(nameValue != null) { "name is required" }
      check(schemaValue != null) { "schema is required" }
      check(typeValue != null) { "type is required" }
      return FormatJsonSchemaConfig(
        name = name,
        schema = schema,
        type = type,
        description = description,
        strict = strict,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FormatJsonSchemaConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FormatJsonSchemaConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FormatJsonSchemaConfig {
      val jsonDecoder = decoder.requireJsonDecoder("FormatJsonSchemaConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FormatJsonSchemaConfig must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val schema = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "schema")
      val type = json.decodeRequired<InlineFormatJsonSchemaConfigTypeXdd6e2ebb>(rawObject, "type")
      return FormatJsonSchemaConfig(
        name = name,
        schema = schema,
        type = type,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        strict = rawObject["strict"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FormatJsonSchemaConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("FormatJsonSchemaConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("schema", json.encodeToJsonElement(value.schema))
        put("type", json.encodeToJsonElement(value.type))
        value.description?.let { put("description", it) }
        value.strict?.let { put("strict", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun formatJsonSchemaConfig(block: FormatJsonSchemaConfig.Builder.() -> Unit): FormatJsonSchemaConfig = FormatJsonSchemaConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FormatJsonSchemaConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
