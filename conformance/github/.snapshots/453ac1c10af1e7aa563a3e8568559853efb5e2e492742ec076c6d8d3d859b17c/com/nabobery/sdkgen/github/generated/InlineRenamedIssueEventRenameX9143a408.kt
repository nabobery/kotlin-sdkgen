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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/renamed-issue-event/properties/rename.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/renamed-issue-event/properties/rename
 */
@Serializable(with = InlineRenamedIssueEventRenameX9143a408.Serializer::class)
public class InlineRenamedIssueEventRenameX9143a408(
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

    public fun build(): InlineRenamedIssueEventRenameX9143a408 {
      check(fromValue != null) { "from is required" }
      check(toValue != null) { "to is required" }
      return InlineRenamedIssueEventRenameX9143a408(
        from = from,
        to = to,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRenamedIssueEventRenameX9143a408 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRenamedIssueEventRenameX9143a408> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRenamedIssueEventRenameX9143a408 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRenamedIssueEventRenameX9143a408")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRenamedIssueEventRenameX9143a408 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      val to = json.decodeRequired<String>(rawObject, "to")
      return InlineRenamedIssueEventRenameX9143a408(
        from = from,
        to = to,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRenamedIssueEventRenameX9143a408) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRenamedIssueEventRenameX9143a408")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
        put("to", value.to)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRenamedIssueEventRenameX9143a408(block: InlineRenamedIssueEventRenameX9143a408.Builder.() -> Unit): InlineRenamedIssueEventRenameX9143a408 = InlineRenamedIssueEventRenameX9143a408.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRenamedIssueEventRenameX9143a408 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
