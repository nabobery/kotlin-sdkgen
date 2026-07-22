package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * sdkgen://source/openapi.yaml#/components/schemas/issue-field-value/properties/multi_select_options/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field-value/properties/multi_select_options/items
 */
@Serializable(with = InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3.Serializer::class)
public class InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3(
  /**
   * The color of the option
   */
  public val color: String,
  /**
   * Unique identifier for the option.
   */
  public val id: Long,
  /**
   * The name of the option
   */
  public val name: String,
) {
  public class Builder {
    private var colorValue: String? = null

    public var color: String
      get() = requireNotNull(colorValue) { "color is required" }
      set(`value`) {
        colorValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 {
      check(colorValue != null) { "color is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3(
        color = color,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3(
        color = color,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineIssueFieldValueMultiSelectOptionsItemX5190a2a3(block: InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3.Builder.() -> Unit): InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 = InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
