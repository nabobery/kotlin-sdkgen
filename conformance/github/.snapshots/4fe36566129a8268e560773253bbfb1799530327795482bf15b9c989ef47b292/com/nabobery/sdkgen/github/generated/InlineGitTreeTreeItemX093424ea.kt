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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/git-tree/properties/tree/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-tree/properties/tree/items
 */
@Serializable(with = InlineGitTreeTreeItemX093424ea.Serializer::class)
public class InlineGitTreeTreeItemX093424ea(
  public val mode: String,
  public val path: String,
  public val sha: String,
  public val type: String,
  public val size: Int? = null,
  public val url: String? = null,
) {
  public class Builder {
    private var modeValue: String? = null

    public var mode: String
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var size: Int? = null

    public var url: String? = null

    public fun build(): InlineGitTreeTreeItemX093424ea {
      check(modeValue != null) { "mode is required" }
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      check(typeValue != null) { "type is required" }
      return InlineGitTreeTreeItemX093424ea(
        mode = mode,
        path = path,
        sha = sha,
        type = type,
        size = size,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGitTreeTreeItemX093424ea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGitTreeTreeItemX093424ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGitTreeTreeItemX093424ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGitTreeTreeItemX093424ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGitTreeTreeItemX093424ea must be a JSON object")
      val mode = json.decodeRequired<String>(rawObject, "mode")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineGitTreeTreeItemX093424ea(
        mode = mode,
        path = path,
        sha = sha,
        type = type,
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGitTreeTreeItemX093424ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGitTreeTreeItemX093424ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mode", value.mode)
        put("path", value.path)
        put("sha", value.sha)
        put("type", value.type)
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGitTreeTreeItemX093424ea(block: InlineGitTreeTreeItemX093424ea.Builder.() -> Unit): InlineGitTreeTreeItemX093424ea = InlineGitTreeTreeItemX093424ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGitTreeTreeItemX093424ea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
