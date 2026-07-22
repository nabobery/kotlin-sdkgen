package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field/properties/options/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field/properties/options/items
 */
@Serializable(with = InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5.Serializer::class)
public class InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5(
  /**
   * Color for the option.
   */
  public val color: InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb,
  /**
   * Name of the option.
   */
  public val name: String,
  /**
   * Priority of the option for ordering.
   */
  public val priority: Int,
  /**
   * Description of the option.
   */
  public val description: String? = null,
) {
  public class Builder {
    private var colorValue: InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb? = null

    public var color: InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb
      get() = requireNotNull(colorValue) { "color is required" }
      set(`value`) {
        colorValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var priorityValue: Int? = null

    public var priority: Int
      get() = requireNotNull(priorityValue) { "priority is required" }
      set(`value`) {
        priorityValue = value
      }

    /**
     * Description of the option.
     */
    public var description: String? = null

    public fun build(): InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 {
      check(colorValue != null) { "color is required" }
      check(nameValue != null) { "name is required" }
      check(priorityValue != null) { "priority is required" }
      return InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5(
        color = color,
        name = name,
        priority = priority,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 must be a JSON object")
      val color = json.decodeRequired<InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb>(rawObject, "color")
      val name = json.decodeRequired<String>(rawObject, "name")
      val priority = json.decodeRequired<Int>(rawObject, "priority")
      return InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5(
        color = color,
        name = name,
        priority = priority,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", json.encodeToJsonElement(value.color))
        put("name", value.name)
        put("priority", json.encodeToJsonElement(value.priority))
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationCreateIssueFieldOptionsItemX4e01dac5(block: InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5.Builder.() -> Unit): InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 = InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
