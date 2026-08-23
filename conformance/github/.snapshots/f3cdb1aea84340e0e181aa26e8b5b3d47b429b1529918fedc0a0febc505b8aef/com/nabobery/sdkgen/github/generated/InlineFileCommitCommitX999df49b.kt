package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit
 */
@Serializable(with = InlineFileCommitCommitX999df49b.Serializer::class)
public class InlineFileCommitCommitX999df49b(
  public val author: InlineFileCommitCommitAuthorX637d5240? = null,
  public val committer: InlineFileCommitCommitCommitterX2d8d46b6? = null,
  public val htmlUrl: String? = null,
  public val message: String? = null,
  public val nodeId: String? = null,
  parents: List<InlineFileCommitCommitParentsItemX52e88524>? = null,
  public val sha: String? = null,
  public val tree: InlineFileCommitCommitTreeXbc7caf7d? = null,
  public val url: String? = null,
  public val verification: InlineFileCommitCommitVerificationXf56a2b2e? = null,
) {
  public val parents: List<InlineFileCommitCommitParentsItemX52e88524>? =
      parents?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var author: InlineFileCommitCommitAuthorX637d5240? = null

    public var committer: InlineFileCommitCommitCommitterX2d8d46b6? = null

    public var htmlUrl: String? = null

    public var message: String? = null

    public var nodeId: String? = null

    private var parentsValue: List<InlineFileCommitCommitParentsItemX52e88524>? = null

    public var parents: List<InlineFileCommitCommitParentsItemX52e88524>?
      get() = parentsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        parentsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var sha: String? = null

    public var tree: InlineFileCommitCommitTreeXbc7caf7d? = null

    public var url: String? = null

    public var verification: InlineFileCommitCommitVerificationXf56a2b2e? = null

    public fun build(): InlineFileCommitCommitX999df49b = InlineFileCommitCommitX999df49b(
      author = author,
      committer = committer,
      htmlUrl = htmlUrl,
      message = message,
      nodeId = nodeId,
      parents = parents,
      sha = sha,
      tree = tree,
      url = url,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitX999df49b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileCommitCommitX999df49b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitX999df49b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitX999df49b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitX999df49b must be a JSON object")
      return InlineFileCommitCommitX999df49b(
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineFileCommitCommitAuthorX637d5240>(it) },
        committer = rawObject["committer"]?.let { json.decodeFromJsonElement<InlineFileCommitCommitCommitterX2d8d46b6>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        parents = rawObject["parents"]?.let { json.decodeFromJsonElement<List<InlineFileCommitCommitParentsItemX52e88524>>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        tree = rawObject["tree"]?.let { json.decodeFromJsonElement<InlineFileCommitCommitTreeXbc7caf7d>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineFileCommitCommitVerificationXf56a2b2e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitX999df49b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitX999df49b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.committer?.let { put("committer", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.message?.let { put("message", it) }
        value.nodeId?.let { put("node_id", it) }
        value.parents?.let { put("parents", json.encodeToJsonElement(it)) }
        value.sha?.let { put("sha", it) }
        value.tree?.let { put("tree", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitCommitX999df49b(block: InlineFileCommitCommitX999df49b.Builder.() -> Unit): InlineFileCommitCommitX999df49b = InlineFileCommitCommitX999df49b.build(block)
