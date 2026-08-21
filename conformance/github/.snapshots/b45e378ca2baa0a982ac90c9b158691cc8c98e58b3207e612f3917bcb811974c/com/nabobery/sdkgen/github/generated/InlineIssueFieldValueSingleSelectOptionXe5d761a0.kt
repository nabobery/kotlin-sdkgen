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
 * Details about the selected option (only present for single_select fields)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field-value/properties/single_select_option
 */
@Serializable(with = InlineIssueFieldValueSingleSelectOptionXe5d761a0.Serializer::class)
public class InlineIssueFieldValueSingleSelectOptionXe5d761a0(
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

    public fun build(): InlineIssueFieldValueSingleSelectOptionXe5d761a0 {
      check(colorValue != null) { "color is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineIssueFieldValueSingleSelectOptionXe5d761a0(
        color = color,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIssueFieldValueSingleSelectOptionXe5d761a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineIssueFieldValueSingleSelectOptionXe5d761a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueFieldValueSingleSelectOptionXe5d761a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueFieldValueSingleSelectOptionXe5d761a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssueFieldValueSingleSelectOptionXe5d761a0 must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineIssueFieldValueSingleSelectOptionXe5d761a0(
        color = color,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldValueSingleSelectOptionXe5d761a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssueFieldValueSingleSelectOptionXe5d761a0")
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

public fun inlineIssueFieldValueSingleSelectOptionXe5d761a0(block: InlineIssueFieldValueSingleSelectOptionXe5d761a0.Builder.() -> Unit): InlineIssueFieldValueSingleSelectOptionXe5d761a0 = InlineIssueFieldValueSingleSelectOptionXe5d761a0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineIssueFieldValueSingleSelectOptionXe5d761a0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
