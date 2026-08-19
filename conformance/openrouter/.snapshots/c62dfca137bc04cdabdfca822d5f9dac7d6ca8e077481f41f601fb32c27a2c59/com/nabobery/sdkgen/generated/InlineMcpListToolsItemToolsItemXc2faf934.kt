package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/McpListToolsItem/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpListToolsItem/properties/tools/items
 */
@Serializable(with = InlineMcpListToolsItemToolsItemXc2faf934.Serializer::class)
public class InlineMcpListToolsItemToolsItemXc2faf934(
  inputSchema: Map<String, JsonElement?>,
  public val name: String,
  public val annotations: JsonElement? = null,
  public val description: String? = null,
) {
  public val inputSchema: Map<String, JsonElement?> = inputSchema.toMap()

  public class Builder {
    private var inputSchemaValue: Map<String, JsonElement?>? = null

    public var inputSchema: Map<String, JsonElement?>
      get() = requireNotNull(inputSchemaValue) { "inputSchema is required" }.toMap()
      set(`value`) {
        inputSchemaValue = value.toMap()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var annotations: JsonElement? = null

    public var description: String? = null

    public fun build(): InlineMcpListToolsItemToolsItemXc2faf934 {
      check(inputSchemaValue != null) { "inputSchema is required" }
      check(nameValue != null) { "name is required" }
      return InlineMcpListToolsItemToolsItemXc2faf934(
        inputSchema = inputSchema,
        name = name,
        annotations = annotations,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMcpListToolsItemToolsItemXc2faf934 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMcpListToolsItemToolsItemXc2faf934> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpListToolsItemToolsItemXc2faf934 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpListToolsItemToolsItemXc2faf934")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMcpListToolsItemToolsItemXc2faf934 must be a JSON object")
      val inputSchema = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "input_schema")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineMcpListToolsItemToolsItemXc2faf934(
        inputSchema = inputSchema,
        name = name,
        annotations = rawObject["annotations"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpListToolsItemToolsItemXc2faf934) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMcpListToolsItemToolsItemXc2faf934")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_schema", json.encodeToJsonElement(value.inputSchema))
        put("name", value.name)
        value.annotations?.let { put("annotations", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMcpListToolsItemToolsItemXc2faf934(block: InlineMcpListToolsItemToolsItemXc2faf934.Builder.() -> Unit): InlineMcpListToolsItemToolsItemXc2faf934 = InlineMcpListToolsItemToolsItemXc2faf934.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMcpListToolsItemToolsItemXc2faf934 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
