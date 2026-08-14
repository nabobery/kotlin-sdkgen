package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/unlabeled-issue-event/properties/label.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/unlabeled-issue-event/properties/label
 */
@Serializable(with = InlineUnlabeledIssueEventLabelXd6068f36.Serializer::class)
public class InlineUnlabeledIssueEventLabelXd6068f36(
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

    public fun build(): InlineUnlabeledIssueEventLabelXd6068f36 {
      check(colorValue != null) { "color is required" }
      check(nameValue != null) { "name is required" }
      return InlineUnlabeledIssueEventLabelXd6068f36(
        color = color,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUnlabeledIssueEventLabelXd6068f36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUnlabeledIssueEventLabelXd6068f36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUnlabeledIssueEventLabelXd6068f36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUnlabeledIssueEventLabelXd6068f36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUnlabeledIssueEventLabelXd6068f36 must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUnlabeledIssueEventLabelXd6068f36(
        color = color,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUnlabeledIssueEventLabelXd6068f36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUnlabeledIssueEventLabelXd6068f36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUnlabeledIssueEventLabelXd6068f36(block: InlineUnlabeledIssueEventLabelXd6068f36.Builder.() -> Unit): InlineUnlabeledIssueEventLabelXd6068f36 = InlineUnlabeledIssueEventLabelXd6068f36.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUnlabeledIssueEventLabelXd6068f36 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
