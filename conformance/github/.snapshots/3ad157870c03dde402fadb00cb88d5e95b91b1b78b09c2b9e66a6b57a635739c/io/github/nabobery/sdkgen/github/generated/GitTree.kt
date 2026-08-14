package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * The hierarchy between files in a Git repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-tree
 */
@Serializable(with = GitTree.Serializer::class)
public class GitTree(
  public val sha: String,
  tree: List<InlineGitTreeTreeItemX093424ea>,
  public val truncated: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  /**
   * Objects specifying a tree structure
   */
  public val tree: List<InlineGitTreeTreeItemX093424ea> = tree.toList()

  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var treeValue: List<InlineGitTreeTreeItemX093424ea>? = null

    public var tree: List<InlineGitTreeTreeItemX093424ea>
      get() = requireNotNull(treeValue) { "tree is required" }.toList()
      set(`value`) {
        treeValue = value.toList()
      }

    private var truncatedValue: Boolean? = null

    public var truncated: Boolean
      get() = requireNotNull(truncatedValue) { "truncated is required" }
      set(`value`) {
        truncatedValue = value
      }

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): GitTree {
      check(shaValue != null) { "sha is required" }
      check(treeValue != null) { "tree is required" }
      check(truncatedValue != null) { "truncated is required" }
      return GitTree(
        sha = sha,
        tree = tree,
        truncated = truncated,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GitTree = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GitTree> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GitTree {
      val jsonDecoder = decoder.requireJsonDecoder("GitTree")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GitTree must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val tree = json.decodeRequired<List<InlineGitTreeTreeItemX093424ea>>(rawObject, "tree")
      val truncated = json.decodeRequired<Boolean>(rawObject, "truncated")
      return GitTree(
        sha = sha,
        tree = tree,
        truncated = truncated,
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GitTree) {
      val jsonEncoder = encoder.requireJsonEncoder("GitTree")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("tree", json.encodeToJsonElement(value.tree))
        put("truncated", json.encodeToJsonElement(value.truncated))
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gitTree(block: GitTree.Builder.() -> Unit): GitTree = GitTree.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GitTree is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
