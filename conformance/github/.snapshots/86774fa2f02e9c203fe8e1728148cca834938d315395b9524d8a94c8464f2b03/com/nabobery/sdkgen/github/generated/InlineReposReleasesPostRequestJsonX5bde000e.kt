package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases/post/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases/post/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineReposReleasesPostRequestJsonX5bde000e.Serializer::class)
public class InlineReposReleasesPostRequestJsonX5bde000e(
  /**
   * The name of the tag.
   */
  public val tagName: String,
  /**
   * Text describing the contents of the tag.
   */
  public val body: String? = null,
  /**
   * If specified, a discussion of the specified category is created and linked to the release. The value must be a
   * category that already exists in the repository. For more information, see "[Managing categories for discussions in
   * your
   * repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-dis
   * cussions-in-your-repository)."
   */
  public val discussionCategoryName: String? = null,
  /**
   * `true` to create a draft (unpublished) release, `false` to create a published one.
   */
  public val draft: Boolean? = null,
  /**
   * Whether to automatically generate the name and body for this release. If `name` is specified, the specified name
   * will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be
   * pre-pended to the automatically generated notes.
   */
  public val generateReleaseNotes: Boolean? = null,
  /**
   * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases
   * cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest
   * release should be determined based on the release creation date and higher semantic version.
   */
  public val makeLatest: InlineReposReleasesPostRequestJsonMakeLatestX6f46747c? = null,
  /**
   * The name of the release.
   */
  public val name: String? = null,
  /**
   * `true` to identify the release as a prerelease. `false` to identify the release as a full release.
   */
  public val prerelease: Boolean? = null,
  /**
   * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA.
   * Unused if the Git tag already exists. Default: the repository's default branch.
   */
  public val targetCommitish: String? = null,
) {
  public class Builder {
    private var tagNameValue: String? = null

    public var tagName: String
      get() = requireNotNull(tagNameValue) { "tagName is required" }
      set(`value`) {
        tagNameValue = value
      }

    /**
     * Text describing the contents of the tag.
     */
    public var body: String? = null

    /**
     * If specified, a discussion of the specified category is created and linked to the release. The value must be a
     * category that already exists in the repository. For more information, see "[Managing categories for discussions
     * in your
     * repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-d
     * iscussions-in-your-repository)."
     */
    public var discussionCategoryName: String? = null

    /**
     * `true` to create a draft (unpublished) release, `false` to create a published one.
     */
    public var draft: Boolean? = null

    /**
     * Whether to automatically generate the name and body for this release. If `name` is specified, the specified name
     * will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be
     * pre-pended to the automatically generated notes.
     */
    public var generateReleaseNotes: Boolean? = null

    /**
     * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases
     * cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest
     * release should be determined based on the release creation date and higher semantic version.
     */
    public var makeLatest: InlineReposReleasesPostRequestJsonMakeLatestX6f46747c? = null

    /**
     * The name of the release.
     */
    public var name: String? = null

    /**
     * `true` to identify the release as a prerelease. `false` to identify the release as a full release.
     */
    public var prerelease: Boolean? = null

    /**
     * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA.
     * Unused if the Git tag already exists. Default: the repository's default branch.
     */
    public var targetCommitish: String? = null

    public fun build(): InlineReposReleasesPostRequestJsonX5bde000e {
      check(tagNameValue != null) { "tagName is required" }
      return InlineReposReleasesPostRequestJsonX5bde000e(
        tagName = tagName,
        body = body,
        discussionCategoryName = discussionCategoryName,
        draft = draft,
        generateReleaseNotes = generateReleaseNotes,
        makeLatest = makeLatest,
        name = name,
        prerelease = prerelease,
        targetCommitish = targetCommitish,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposReleasesPostRequestJsonX5bde000e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposReleasesPostRequestJsonX5bde000e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposReleasesPostRequestJsonX5bde000e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposReleasesPostRequestJsonX5bde000e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposReleasesPostRequestJsonX5bde000e must be a JSON object")
      val tagName = json.decodeRequired<String>(rawObject, "tag_name")
      return InlineReposReleasesPostRequestJsonX5bde000e(
        tagName = tagName,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        discussionCategoryName = rawObject["discussion_category_name"]?.let { json.decodeFromJsonElement<String>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        generateReleaseNotes = rawObject["generate_release_notes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        makeLatest = rawObject["make_latest"]?.let { json.decodeFromJsonElement<InlineReposReleasesPostRequestJsonMakeLatestX6f46747c>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        prerelease = rawObject["prerelease"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        targetCommitish = rawObject["target_commitish"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesPostRequestJsonX5bde000e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposReleasesPostRequestJsonX5bde000e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tag_name", value.tagName)
        value.body?.let { put("body", it) }
        value.discussionCategoryName?.let { put("discussion_category_name", it) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.generateReleaseNotes?.let { put("generate_release_notes", json.encodeToJsonElement(it)) }
        value.makeLatest?.let { put("make_latest", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.prerelease?.let { put("prerelease", json.encodeToJsonElement(it)) }
        value.targetCommitish?.let { put("target_commitish", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposReleasesPostRequestJsonX5bde000e(block: InlineReposReleasesPostRequestJsonX5bde000e.Builder.() -> Unit): InlineReposReleasesPostRequestJsonX5bde000e = InlineReposReleasesPostRequestJsonX5bde000e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposReleasesPostRequestJsonX5bde000e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
