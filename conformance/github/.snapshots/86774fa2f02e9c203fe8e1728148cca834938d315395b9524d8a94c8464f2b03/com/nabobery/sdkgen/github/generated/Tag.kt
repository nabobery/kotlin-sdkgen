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
 * Tag
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/tag
 */
@Serializable(with = Tag.Serializer::class)
public class Tag(
  public val commit: InlineTagCommitX7984df2e,
  public val name: String,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val tarballUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val zipballUrl: String,
) {
  public class Builder {
    private var commitValue: InlineTagCommitX7984df2e? = null

    public var commit: InlineTagCommitX7984df2e
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var tarballUrlValue: String? = null

    public var tarballUrl: String
      get() = requireNotNull(tarballUrlValue) { "tarballUrl is required" }
      set(`value`) {
        tarballUrlValue = value
      }

    private var zipballUrlValue: String? = null

    public var zipballUrl: String
      get() = requireNotNull(zipballUrlValue) { "zipballUrl is required" }
      set(`value`) {
        zipballUrlValue = value
      }

    public fun build(): Tag {
      check(commitValue != null) { "commit is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(tarballUrlValue != null) { "tarballUrl is required" }
      check(zipballUrlValue != null) { "zipballUrl is required" }
      return Tag(
        commit = commit,
        name = name,
        nodeId = nodeId,
        tarballUrl = tarballUrl,
        zipballUrl = zipballUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Tag = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Tag> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Tag {
      val jsonDecoder = decoder.requireJsonDecoder("Tag")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Tag must be a JSON object")
      val commit = json.decodeRequired<InlineTagCommitX7984df2e>(rawObject, "commit")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val tarballUrl = json.decodeRequired<String>(rawObject, "tarball_url")
      val zipballUrl = json.decodeRequired<String>(rawObject, "zipball_url")
      return Tag(
        commit = commit,
        name = name,
        nodeId = nodeId,
        tarballUrl = tarballUrl,
        zipballUrl = zipballUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Tag) {
      val jsonEncoder = encoder.requireJsonEncoder("Tag")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", json.encodeToJsonElement(value.commit))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("tarball_url", value.tarballUrl)
        put("zipball_url", value.zipballUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun tag(block: Tag.Builder.() -> Unit): Tag = Tag.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Tag is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
