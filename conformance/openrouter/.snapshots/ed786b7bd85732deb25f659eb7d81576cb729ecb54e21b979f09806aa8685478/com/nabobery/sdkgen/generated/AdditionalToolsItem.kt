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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class AdditionalToolsItemView internal constructor(
  public val id: String? = null,
  public val role: InlineAdditionalToolsItemRoleXe3a56f4e,
  public val tools: List<InlineAdditionalToolsItemToolsItemX046294de>,
  public val type: InlineAdditionalToolsItemTypeXea9f3144,
)

/**
 * Additional tools made available to the model at this point in the input
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdditionalToolsItem
 */
@Serializable(with = AdditionalToolsItem.Serializer::class)
public class AdditionalToolsItem(
  public val role: InlineAdditionalToolsItemRoleXe3a56f4e,
  tools: List<InlineAdditionalToolsItemToolsItemX046294de>,
  public val type: InlineAdditionalToolsItemTypeXea9f3144,
  public val id: String? = null,
) {
  public val tools: List<InlineAdditionalToolsItemToolsItemX046294de> = tools.toList()

  public class Builder {
    private var roleValue: InlineAdditionalToolsItemRoleXe3a56f4e? = null

    public var role: InlineAdditionalToolsItemRoleXe3a56f4e
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var toolsValue: List<InlineAdditionalToolsItemToolsItemX046294de>? = null

    public var tools: List<InlineAdditionalToolsItemToolsItemX046294de>
      get() = requireNotNull(toolsValue) { "tools is required" }.toList()
      set(`value`) {
        toolsValue = value.toList()
      }

    private var typeValue: InlineAdditionalToolsItemTypeXea9f3144? = null

    public var type: InlineAdditionalToolsItemTypeXea9f3144
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public fun build(): AdditionalToolsItem {
      check(roleValue != null) { "role is required" }
      check(toolsValue != null) { "tools is required" }
      check(typeValue != null) { "type is required" }
      return AdditionalToolsItem(
        role = role,
        tools = tools,
        type = type,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AdditionalToolsItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AdditionalToolsItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AdditionalToolsItem {
      val jsonDecoder = decoder.requireJsonDecoder("AdditionalToolsItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AdditionalToolsItem must be a JSON object")
      val role = json.decodeRequired<InlineAdditionalToolsItemRoleXe3a56f4e>(rawObject, "role")
      val tools = json.decodeRequired<List<InlineAdditionalToolsItemToolsItemX046294de>>(rawObject, "tools")
      val type = json.decodeRequired<InlineAdditionalToolsItemTypeXea9f3144>(rawObject, "type")
      return AdditionalToolsItem(
        role = role,
        tools = tools,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AdditionalToolsItem) {
      val jsonEncoder = encoder.requireJsonEncoder("AdditionalToolsItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
        put("tools", json.encodeToJsonElement(value.tools))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun additionalToolsItem(block: AdditionalToolsItem.Builder.() -> Unit): AdditionalToolsItem = AdditionalToolsItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AdditionalToolsItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
