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
 * Issue Event Milestone
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-event-milestone
 */
@Serializable(with = IssueEventMilestone.Serializer::class)
public class IssueEventMilestone(
  public val title: String,
) {
  public class Builder {
    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public fun build(): IssueEventMilestone {
      check(titleValue != null) { "title is required" }
      return IssueEventMilestone(
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueEventMilestone = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueEventMilestone> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueEventMilestone {
      val jsonDecoder = decoder.requireJsonDecoder("IssueEventMilestone")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueEventMilestone must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return IssueEventMilestone(
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueEventMilestone) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueEventMilestone")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueEventMilestone(block: IssueEventMilestone.Builder.() -> Unit): IssueEventMilestone = IssueEventMilestone.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueEventMilestone is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
