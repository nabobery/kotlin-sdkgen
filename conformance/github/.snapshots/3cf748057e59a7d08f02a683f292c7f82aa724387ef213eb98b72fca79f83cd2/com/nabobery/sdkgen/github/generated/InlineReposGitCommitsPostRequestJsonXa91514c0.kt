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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1commits/post/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1commits/post/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineReposGitCommitsPostRequestJsonXa91514c0.Serializer::class)
public class InlineReposGitCommitsPostRequestJsonXa91514c0(
  /**
   * The commit message
   */
  public val message: String,
  /**
   * The SHA of the tree object this commit points to
   */
  public val tree: String,
  /**
   * Information about the author of the commit. By default, the `author` will be the authenticated user and the current
   * date. See the `author` and `committer` object below for details.
   */
  public val author: InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665? = null,
  /**
   * Information about the person who is making the commit. By default, `committer` will use the information set in
   * `author`. See the `author` and `committer` object below for details.
   */
  public val committer: InlineReposGitCommitsPostRequestJsonCommitterX190fdc97? = null,
  /**
   * The full SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written
   * as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more
   * than one should be provided.
   */
  public val parents: List<String>? = null,
  /**
   * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to
   * the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an
   * ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass
   * a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may
   * find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create
   * signed commits.
   */
  public val signature: String? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var treeValue: String? = null

    public var tree: String
      get() = requireNotNull(treeValue) { "tree is required" }
      set(`value`) {
        treeValue = value
      }

    /**
     * Information about the author of the commit. By default, the `author` will be the authenticated user and the
     * current date. See the `author` and `committer` object below for details.
     */
    public var author: InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665? = null

    /**
     * Information about the person who is making the commit. By default, `committer` will use the information set in
     * `author`. See the `author` and `committer` object below for details.
     */
    public var committer: InlineReposGitCommitsPostRequestJsonCommitterX190fdc97? = null

    /**
     * The full SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be
     * written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an
     * array of more than one should be provided.
     */
    public var parents: List<String>? = null

    /**
     * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature
     * to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must
     * be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database.
     * To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be
     * complicated. You may find it easier to [use the command
     * line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
     */
    public var signature: String? = null

    public fun build(): InlineReposGitCommitsPostRequestJsonXa91514c0 {
      check(messageValue != null) { "message is required" }
      check(treeValue != null) { "tree is required" }
      return InlineReposGitCommitsPostRequestJsonXa91514c0(
        message = message,
        tree = tree,
        author = author,
        committer = committer,
        parents = parents,
        signature = signature,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonXa91514c0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposGitCommitsPostRequestJsonXa91514c0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitCommitsPostRequestJsonXa91514c0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitCommitsPostRequestJsonXa91514c0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitCommitsPostRequestJsonXa91514c0 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val tree = json.decodeRequired<String>(rawObject, "tree")
      return InlineReposGitCommitsPostRequestJsonXa91514c0(
        message = message,
        tree = tree,
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665>(it) },
        committer = rawObject["committer"]?.let { json.decodeFromJsonElement<InlineReposGitCommitsPostRequestJsonCommitterX190fdc97>(it) },
        parents = rawObject["parents"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        signature = rawObject["signature"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitCommitsPostRequestJsonXa91514c0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitCommitsPostRequestJsonXa91514c0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("tree", value.tree)
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.committer?.let { put("committer", json.encodeToJsonElement(it)) }
        value.parents?.let { put("parents", json.encodeToJsonElement(it)) }
        value.signature?.let { put("signature", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitCommitsPostRequestJsonXa91514c0(block: InlineReposGitCommitsPostRequestJsonXa91514c0.Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonXa91514c0 = InlineReposGitCommitsPostRequestJsonXa91514c0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitCommitsPostRequestJsonXa91514c0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
