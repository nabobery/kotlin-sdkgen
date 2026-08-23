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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Git references within a repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-ref
 */
@Serializable(with = GitRef.Serializer::class)
public class GitRef(
  public val nodeId: String,
  public val objectValue: InlineGitRefObjectValueX5ffdd808,
  public val ref: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var objectValueValue: InlineGitRefObjectValueX5ffdd808? = null

    public var objectValue: InlineGitRefObjectValueX5ffdd808
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): GitRef {
      check(nodeIdValue != null) { "nodeId is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(refValue != null) { "ref is required" }
      check(urlValue != null) { "url is required" }
      return GitRef(
        nodeId = nodeId,
        objectValue = objectValue,
        ref = ref,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GitRef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GitRef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GitRef {
      val jsonDecoder = decoder.requireJsonDecoder("GitRef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GitRef must be a JSON object")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val objectValue = json.decodeRequired<InlineGitRefObjectValueX5ffdd808>(rawObject, "object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val url = json.decodeRequired<String>(rawObject, "url")
      return GitRef(
        nodeId = nodeId,
        objectValue = objectValue,
        ref = ref,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GitRef) {
      val jsonEncoder = encoder.requireJsonEncoder("GitRef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("node_id", value.nodeId)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("ref", value.ref)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gitRef(block: GitRef.Builder.() -> Unit): GitRef = GitRef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GitRef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
