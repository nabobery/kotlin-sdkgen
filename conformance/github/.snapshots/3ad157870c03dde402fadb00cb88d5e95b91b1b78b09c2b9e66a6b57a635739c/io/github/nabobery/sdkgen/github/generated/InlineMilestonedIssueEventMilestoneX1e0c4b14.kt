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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/milestoned-issue-event/properties/milestone.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/milestoned-issue-event/properties/milestone
 */
@Serializable(with = InlineMilestonedIssueEventMilestoneX1e0c4b14.Serializer::class)
public class InlineMilestonedIssueEventMilestoneX1e0c4b14(
  public val title: String,
) {
  public class Builder {
    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public fun build(): InlineMilestonedIssueEventMilestoneX1e0c4b14 {
      check(titleValue != null) { "title is required" }
      return InlineMilestonedIssueEventMilestoneX1e0c4b14(
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMilestonedIssueEventMilestoneX1e0c4b14 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMilestonedIssueEventMilestoneX1e0c4b14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMilestonedIssueEventMilestoneX1e0c4b14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMilestonedIssueEventMilestoneX1e0c4b14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMilestonedIssueEventMilestoneX1e0c4b14 must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineMilestonedIssueEventMilestoneX1e0c4b14(
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMilestonedIssueEventMilestoneX1e0c4b14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMilestonedIssueEventMilestoneX1e0c4b14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMilestonedIssueEventMilestoneX1e0c4b14(block: InlineMilestonedIssueEventMilestoneX1e0c4b14.Builder.() -> Unit): InlineMilestonedIssueEventMilestoneX1e0c4b14 = InlineMilestonedIssueEventMilestoneX1e0c4b14.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMilestonedIssueEventMilestoneX1e0c4b14 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
