package com.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class NamespaceToolView internal constructor(
  public val description: String,
  public val name: String,
  public val tools: List<InlineNamespaceToolToolsItemXec65fe71>,
  public val type: InlineNamespaceToolTypeX01631f80,
)

/**
 * Groups function/custom tools under a shared namespace
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool
 */
@Serializable(with = NamespaceTool.Serializer::class)
public class NamespaceTool(
  public val description: String,
  public val name: String,
  tools: List<InlineNamespaceToolToolsItemXec65fe71>,
  public val type: InlineNamespaceToolTypeX01631f80,
) {
  public val tools: List<InlineNamespaceToolToolsItemXec65fe71> = tools.toList()

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var toolsValue: List<InlineNamespaceToolToolsItemXec65fe71>? = null

    public var tools: List<InlineNamespaceToolToolsItemXec65fe71>
      get() = requireNotNull(toolsValue) { "tools is required" }.toList()
      set(`value`) {
        toolsValue = value.toList()
      }

    private var typeValue: InlineNamespaceToolTypeX01631f80? = null

    public var type: InlineNamespaceToolTypeX01631f80
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): NamespaceTool {
      check(descriptionValue != null) { "description is required" }
      check(nameValue != null) { "name is required" }
      check(toolsValue != null) { "tools is required" }
      check(typeValue != null) { "type is required" }
      return NamespaceTool(
        description = description,
        name = name,
        tools = tools,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NamespaceTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NamespaceTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NamespaceTool {
      val jsonDecoder = decoder.requireJsonDecoder("NamespaceTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NamespaceTool must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val name = json.decodeRequired<String>(rawObject, "name")
      val tools = json.decodeRequired<List<InlineNamespaceToolToolsItemXec65fe71>>(rawObject, "tools")
      val type = json.decodeRequired<InlineNamespaceToolTypeX01631f80>(rawObject, "type")
      return NamespaceTool(
        description = description,
        name = name,
        tools = tools,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NamespaceTool) {
      val jsonEncoder = encoder.requireJsonEncoder("NamespaceTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("name", value.name)
        put("tools", json.encodeToJsonElement(value.tools))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun namespaceTool(block: NamespaceTool.Builder.() -> Unit): NamespaceTool = NamespaceTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NamespaceTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
