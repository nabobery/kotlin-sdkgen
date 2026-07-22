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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}/patch/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}/patch/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineReposReleasesPatchRequestJsonXc003765f.Serializer::class)
public class InlineReposReleasesPatchRequestJsonXc003765f internal constructor(
  private val bodyState: FieldState<String>,
  private val discussionCategoryNameState: FieldState<String>,
  private val draftState: FieldState<Boolean>,
  private val makeLatestState: FieldState<InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f>,
  private val nameState: FieldState<String>,
  private val prereleaseState: FieldState<Boolean>,
  private val tagNameState: FieldState<String>,
  private val targetCommitishState: FieldState<String>,
) {
  /**
   * Text describing the contents of the tag.
   */
  public val body: String?
    get() = bodyState.valueOrNull()

  /**
   * If specified, a discussion of the specified category is created and linked to the release. The value must be a
   * category that already exists in the repository. If there is already a discussion linked to the release, this
   * parameter is ignored. For more information, see "[Managing categories for discussions in your
   * repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-dis
   * cussions-in-your-repository)."
   */
  public val discussionCategoryName: String?
    get() = discussionCategoryNameState.valueOrNull()

  /**
   * `true` makes the release a draft, and `false` publishes the release.
   */
  public val draft: Boolean?
    get() = draftState.valueOrNull()

  /**
   * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases
   * cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest
   * release should be determined based on the release creation date and higher semantic version.
   */
  public val makeLatest: InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f?
    get() = makeLatestState.valueOrNull()

  /**
   * The name of the release.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * `true` to identify the release as a prerelease, `false` to identify the release as a full release.
   */
  public val prerelease: Boolean?
    get() = prereleaseState.valueOrNull()

  /**
   * The name of the tag.
   */
  public val tagName: String?
    get() = tagNameState.valueOrNull()

  /**
   * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA.
   * Unused if the Git tag already exists. Default: the repository's default branch.
   */
  public val targetCommitish: String?
    get() = targetCommitishState.valueOrNull()

  public constructor() : this(bodyState = FieldState.Absent,
  discussionCategoryNameState = FieldState.Absent,
  draftState = FieldState.Absent,
  makeLatestState = FieldState.Absent,
  nameState = FieldState.Absent,
  prereleaseState = FieldState.Absent,
  tagNameState = FieldState.Absent,
  targetCommitishState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `discussion_category_name`.
   */
  public fun discussionCategoryNamePresence(): FieldPresence = discussionCategoryNameState.presence

  /**
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  /**
   * Returns the wire presence of `make_latest`.
   */
  public fun makeLatestPresence(): FieldPresence = makeLatestState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `prerelease`.
   */
  public fun prereleasePresence(): FieldPresence = prereleaseState.presence

  /**
   * Returns the wire presence of `tag_name`.
   */
  public fun tagNamePresence(): FieldPresence = tagNameState.presence

  /**
   * Returns the wire presence of `target_commitish`.
   */
  public fun targetCommitishPresence(): FieldPresence = targetCommitishState.presence

  public class Builder {
    private var bodyState: FieldState<String> = FieldState.Absent

    /**
     * Text describing the contents of the tag.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "body is not nullable; call unsetBody() to omit it" }
        bodyState = FieldState.Value(present)
      }

    private var discussionCategoryNameState: FieldState<String> = FieldState.Absent

    /**
     * If specified, a discussion of the specified category is created and linked to the release. The value must be a
     * category that already exists in the repository. If there is already a discussion linked to the release, this
     * parameter is ignored. For more information, see "[Managing categories for discussions in your
     * repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-d
     * iscussions-in-your-repository)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var discussionCategoryName: String?
      get() = discussionCategoryNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "discussionCategoryName is not nullable; call unsetDiscussionCategoryName() to omit it" }
        discussionCategoryNameState = FieldState.Value(present)
      }

    private var draftState: FieldState<Boolean> = FieldState.Absent

    /**
     * `true` makes the release a draft, and `false` publishes the release.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var draft: Boolean?
      get() = draftState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "draft is not nullable; call unsetDraft() to omit it" }
        draftState = FieldState.Value(present)
      }

    private var makeLatestState: FieldState<InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f>
        = FieldState.Absent

    /**
     * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases
     * cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest
     * release should be determined based on the release creation date and higher semantic version.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var makeLatest: InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f?
      get() = makeLatestState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "makeLatest is not nullable; call unsetMakeLatest() to omit it" }
        makeLatestState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the release.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var prereleaseState: FieldState<Boolean> = FieldState.Absent

    /**
     * `true` to identify the release as a prerelease, `false` to identify the release as a full release.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var prerelease: Boolean?
      get() = prereleaseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "prerelease is not nullable; call unsetPrerelease() to omit it" }
        prereleaseState = FieldState.Value(present)
      }

    private var tagNameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the tag.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tagName: String?
      get() = tagNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tagName is not nullable; call unsetTagName() to omit it" }
        tagNameState = FieldState.Value(present)
      }

    private var targetCommitishState: FieldState<String> = FieldState.Absent

    /**
     * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA.
     * Unused if the Git tag already exists. Default: the repository's default branch.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var targetCommitish: String?
      get() = targetCommitishState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "targetCommitish is not nullable; call unsetTargetCommitish() to omit it" }
        targetCommitishState = FieldState.Value(present)
      }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `discussion_category_name` from serialized output.
     */
    public fun unsetDiscussionCategoryName() {
      discussionCategoryNameState = FieldState.Absent
    }

    /**
     * Omits `draft` from serialized output.
     */
    public fun unsetDraft() {
      draftState = FieldState.Absent
    }

    /**
     * Omits `make_latest` from serialized output.
     */
    public fun unsetMakeLatest() {
      makeLatestState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `prerelease` from serialized output.
     */
    public fun unsetPrerelease() {
      prereleaseState = FieldState.Absent
    }

    /**
     * Omits `tag_name` from serialized output.
     */
    public fun unsetTagName() {
      tagNameState = FieldState.Absent
    }

    /**
     * Omits `target_commitish` from serialized output.
     */
    public fun unsetTargetCommitish() {
      targetCommitishState = FieldState.Absent
    }

    public fun build(): InlineReposReleasesPatchRequestJsonXc003765f = InlineReposReleasesPatchRequestJsonXc003765f(
      bodyState = bodyState,
      discussionCategoryNameState = discussionCategoryNameState,
      draftState = draftState,
      makeLatestState = makeLatestState,
      nameState = nameState,
      prereleaseState = prereleaseState,
      tagNameState = tagNameState,
      targetCommitishState = targetCommitishState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposReleasesPatchRequestJsonXc003765f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposReleasesPatchRequestJsonXc003765f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposReleasesPatchRequestJsonXc003765f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposReleasesPatchRequestJsonXc003765f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposReleasesPatchRequestJsonXc003765f must be a JSON object")
      return InlineReposReleasesPatchRequestJsonXc003765f(
        bodyState = json.decodeOptional(rawObject, "body", nullable = false),
        discussionCategoryNameState = json.decodeOptional(rawObject, "discussion_category_name", nullable = false),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        makeLatestState = json.decodeOptional(rawObject, "make_latest", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        prereleaseState = json.decodeOptional(rawObject, "prerelease", nullable = false),
        tagNameState = json.decodeOptional(rawObject, "tag_name", nullable = false),
        targetCommitishState = json.decodeOptional(rawObject, "target_commitish", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesPatchRequestJsonXc003765f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposReleasesPatchRequestJsonXc003765f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("discussion_category_name", value.discussionCategoryNameState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("make_latest", value.makeLatestState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("prerelease", value.prereleaseState, json::encodeToJsonElement)
        putState("tag_name", value.tagNameState, json::encodeToJsonElement)
        putState("target_commitish", value.targetCommitishState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposReleasesPatchRequestJsonXc003765f(block: InlineReposReleasesPatchRequestJsonXc003765f.Builder.() -> Unit): InlineReposReleasesPatchRequestJsonXc003765f = InlineReposReleasesPatchRequestJsonXc003765f.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposReleasesPatchRequestJsonXc003765f property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
