package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema/properties/tree/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema/properties/tree/items
 */
@Serializable(with = InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6.Serializer::class)
public class InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6(
  /**
   * The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either
   * this, or `tree.sha`.
   *
   * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and
   * `content` will return an error.
   */
  public val content: String? = null,
  /**
   * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree),
   * `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
   */
  public val mode: InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63? = null,
  /**
   * The file referenced in the tree.
   */
  public val path: String? = null,
  /**
   * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will
   * be deleted.
   *
   * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and
   * `content` will return an error.
   */
  public val sha: String? = null,
  /**
   * Either `blob`, `tree`, or `commit`.
   */
  public val type: InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313? = null,
) {
  public class Builder {
    /**
     * The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use
     * either this, or `tree.sha`.
     *
     * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and
     * `content` will return an error.
     */
    public var content: String? = null

    /**
     * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree),
     * `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
     */
    public var mode: InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63? = null

    /**
     * The file referenced in the tree.
     */
    public var path: String? = null

    /**
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will
     * be deleted.
     *
     * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and
     * `content` will return an error.
     */
    public var sha: String? = null

    /**
     * Either `blob`, `tree`, or `commit`.
     */
    public var type: InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313? = null

    public fun build(): InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6 = InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6(
      content = content,
      mode = mode,
      path = path,
      sha = sha,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6 must be a JSON object")
      return InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6(
        content = rawObject["content"]?.let { json.decodeFromJsonElement<String>(it) },
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.content?.let { put("content", it) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.path?.let { put("path", it) }
        value.sha?.let { put("sha", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6(block: InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6.Builder.() -> Unit): InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6 = InlineReposGitTreesPostRequestJsonTreeItemXfb57b3f6.build(block)
