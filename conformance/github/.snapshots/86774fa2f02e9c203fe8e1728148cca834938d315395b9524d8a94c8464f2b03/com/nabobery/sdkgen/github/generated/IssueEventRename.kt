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
 * Issue Event Rename
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-event-rename
 */
@Serializable(with = IssueEventRename.Serializer::class)
public class IssueEventRename(
  public val from: String,
  public val to: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    private var toValue: String? = null

    public var to: String
      get() = requireNotNull(toValue) { "to is required" }
      set(`value`) {
        toValue = value
      }

    public fun build(): IssueEventRename {
      check(fromValue != null) { "from is required" }
      check(toValue != null) { "to is required" }
      return IssueEventRename(
        from = from,
        to = to,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueEventRename = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueEventRename> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueEventRename {
      val jsonDecoder = decoder.requireJsonDecoder("IssueEventRename")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueEventRename must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      val to = json.decodeRequired<String>(rawObject, "to")
      return IssueEventRename(
        from = from,
        to = to,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueEventRename) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueEventRename")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
        put("to", value.to)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueEventRename(block: IssueEventRename.Builder.() -> Unit): IssueEventRename = IssueEventRename.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueEventRename is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
