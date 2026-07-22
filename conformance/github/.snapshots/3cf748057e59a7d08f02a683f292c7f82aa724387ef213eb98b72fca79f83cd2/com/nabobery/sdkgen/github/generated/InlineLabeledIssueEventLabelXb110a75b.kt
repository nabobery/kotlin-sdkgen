package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/labeled-issue-event/properties/label.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/labeled-issue-event/properties/label
 */
@Serializable(with = InlineLabeledIssueEventLabelXb110a75b.Serializer::class)
public class InlineLabeledIssueEventLabelXb110a75b(
  public val color: String,
  public val name: String,
) {
  public class Builder {
    private var colorValue: String? = null

    public var color: String
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

    public fun build(): InlineLabeledIssueEventLabelXb110a75b {
      check(colorValue != null) { "color is required" }
      check(nameValue != null) { "name is required" }
      return InlineLabeledIssueEventLabelXb110a75b(
        color = color,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineLabeledIssueEventLabelXb110a75b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineLabeledIssueEventLabelXb110a75b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLabeledIssueEventLabelXb110a75b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLabeledIssueEventLabelXb110a75b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineLabeledIssueEventLabelXb110a75b must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineLabeledIssueEventLabelXb110a75b(
        color = color,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineLabeledIssueEventLabelXb110a75b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineLabeledIssueEventLabelXb110a75b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineLabeledIssueEventLabelXb110a75b(block: InlineLabeledIssueEventLabelXb110a75b.Builder.() -> Unit): InlineLabeledIssueEventLabelXb110a75b = InlineLabeledIssueEventLabelXb110a75b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineLabeledIssueEventLabelXb110a75b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
