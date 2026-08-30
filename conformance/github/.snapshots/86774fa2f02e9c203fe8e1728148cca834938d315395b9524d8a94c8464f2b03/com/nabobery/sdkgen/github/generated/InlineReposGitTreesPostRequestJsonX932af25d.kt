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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineReposGitTreesPostRequestJsonX932af25d.Serializer::class)
public class InlineReposGitTreesPostRequestJsonX932af25d(
  tree: List<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6>,
  /**
   * The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git
   * tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in
   * the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same
   * `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git tree
   * object of the current latest commit on the branch you're working on.
   * If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter. If
   * you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree and
   * were not defined in the `tree` parameter will be listed as deleted by the new commit.
   */
  public val baseTree: String? = null,
) {
  /**
   * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
   */
  public val tree: List<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6> = tree.toList()

  public class Builder {
    private var treeValue: List<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6>? = null

    public var tree: List<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6>
      get() = requireNotNull(treeValue) { "tree is required" }.toList()
      set(`value`) {
        treeValue = value.toList()
      }

    /**
     * The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git
     * tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in
     * the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same
     * `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git
     * tree object of the current latest commit on the branch you're working on.
     * If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter.
     * If you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree
     * and were not defined in the `tree` parameter will be listed as deleted by the new commit.
     */
    public var baseTree: String? = null

    public fun build(): InlineReposGitTreesPostRequestJsonX932af25d {
      check(treeValue != null) { "tree is required" }
      return InlineReposGitTreesPostRequestJsonX932af25d(
        tree = tree,
        baseTree = baseTree,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitTreesPostRequestJsonX932af25d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitTreesPostRequestJsonX932af25d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitTreesPostRequestJsonX932af25d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitTreesPostRequestJsonX932af25d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitTreesPostRequestJsonX932af25d must be a JSON object")
      val tree = json.decodeRequired<List<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6>>(rawObject, "tree")
      return InlineReposGitTreesPostRequestJsonX932af25d(
        tree = tree,
        baseTree = rawObject["base_tree"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTreesPostRequestJsonX932af25d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitTreesPostRequestJsonX932af25d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tree", json.encodeToJsonElement(value.tree))
        value.baseTree?.let { put("base_tree", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitTreesPostRequestJsonX932af25d(block: InlineReposGitTreesPostRequestJsonX932af25d.Builder.() -> Unit): InlineReposGitTreesPostRequestJsonX932af25d = InlineReposGitTreesPostRequestJsonX932af25d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitTreesPostRequestJsonX932af25d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
