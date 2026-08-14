package io.github.nabobery.sdkgen.generated

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

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem
 */
@Serializable(with = InputMessageItem.Serializer::class)
public class InputMessageItem(
  public val role: InlineInputMessageItemRoleX6f3eb6d2,
  content: List<InlineInputMessageItemContentItemX674bde40>? = null,
  public val id: String? = null,
  public val type: InlineInputMessageItemTypeXc91465df? = null,
) {
  public val content: List<InlineInputMessageItemContentItemX674bde40>? =
      content?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var roleValue: InlineInputMessageItemRoleX6f3eb6d2? = null

    public var role: InlineInputMessageItemRoleX6f3eb6d2
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var contentValue: List<InlineInputMessageItemContentItemX674bde40>? = null

    public var content: List<InlineInputMessageItemContentItemX674bde40>?
      get() = contentValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentValue = value?.let { collection0 -> collection0.toList() }
      }

    public var id: String? = null

    public var type: InlineInputMessageItemTypeXc91465df? = null

    public fun build(): InputMessageItem {
      check(roleValue != null) { "role is required" }
      return InputMessageItem(
        role = role,
        content = content,
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputMessageItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InputMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("InputMessageItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InputMessageItem must be a JSON object")
      val role = json.decodeRequired<InlineInputMessageItemRoleX6f3eb6d2>(rawObject, "role")
      return InputMessageItem(
        role = role,
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineInputMessageItemContentItemX674bde40>?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineInputMessageItemTypeXc91465df>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputMessageItem) {
      val jsonEncoder = encoder.requireJsonEncoder("InputMessageItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputMessageItem(block: InputMessageItem.Builder.() -> Unit): InputMessageItem = InputMessageItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputMessageItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
