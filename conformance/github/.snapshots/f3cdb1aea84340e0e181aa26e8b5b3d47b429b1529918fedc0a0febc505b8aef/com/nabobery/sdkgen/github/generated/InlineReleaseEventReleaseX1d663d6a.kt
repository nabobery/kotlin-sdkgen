package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/release-event/properties/release.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-event/properties/release
 */
@Serializable(with = InlineReleaseEventReleaseX1d663d6a.Serializer::class)
public class InlineReleaseEventReleaseX1d663d6a internal constructor(
  assets: List<ReleaseAsset>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val assetsUrl: String,
  public val author: SimpleUser,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * true to create a draft (unpublished) release, false to create a published one.
   */
  public val draft: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val name: String?,
  public val nodeId: String,
  /**
   * Whether to identify the release as a prerelease or a full release.
   */
  public val prerelease: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val publishedAt: String?,
  /**
   * The name of the tag.
   */
  public val tagName: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val tarballUrl: String?,
  /**
   * Specifies the commitish value that determines where the Git tag is created from.
   */
  public val targetCommitish: String,
  public val uploadUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val zipballUrl: String?,
  private val bodyState: FieldState<String?>,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val discussionUrlState: FieldState<String>,
  private val immutableState: FieldState<Boolean>,
  private val isShortDescriptionHtmlTruncatedState: FieldState<Boolean>,
  private val mentionsCountState: FieldState<Int>,
  private val reactionsState: FieldState<ReactionRollup>,
  private val shortDescriptionHtmlState: FieldState<String>,
  private val updatedAtState: FieldState<String?>,
) {
  public val assets: List<ReleaseAsset> = assets.toList()

  public val body: String?
    get() = bodyState.valueOrNull()

  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  /**
   * The URL of the release discussion.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val discussionUrl: String?
    get() = discussionUrlState.valueOrNull()

  /**
   * Whether or not the release is immutable.
   */
  public val immutable: Boolean?
    get() = immutableState.valueOrNull()

  public val isShortDescriptionHtmlTruncated: Boolean?
    get() = isShortDescriptionHtmlTruncatedState.valueOrNull()

  public val mentionsCount: Int?
    get() = mentionsCountState.valueOrNull()

  public val reactions: ReactionRollup?
    get() = reactionsState.valueOrNull()

  public val shortDescriptionHtml: String?
    get() = shortDescriptionHtmlState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    assets: List<ReleaseAsset>,
    assetsUrl: String,
    author: SimpleUser,
    createdAt: String,
    draft: Boolean,
    htmlUrl: String,
    id: Int,
    name: String?,
    nodeId: String,
    prerelease: Boolean,
    publishedAt: String?,
    tagName: String,
    tarballUrl: String?,
    targetCommitish: String,
    uploadUrl: String,
    url: String,
    zipballUrl: String?,
  ) : this(assets = assets,
  assetsUrl = assetsUrl,
  author = author,
  createdAt = createdAt,
  draft = draft,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  prerelease = prerelease,
  publishedAt = publishedAt,
  tagName = tagName,
  tarballUrl = tarballUrl,
  targetCommitish = targetCommitish,
  uploadUrl = uploadUrl,
  url = url,
  zipballUrl = zipballUrl,
  bodyState = FieldState.Absent,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  discussionUrlState = FieldState.Absent,
  immutableState = FieldState.Absent,
  isShortDescriptionHtmlTruncatedState = FieldState.Absent,
  mentionsCountState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  shortDescriptionHtmlState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `body_html`.
   */
  public fun bodyHtmlPresence(): FieldPresence = bodyHtmlState.presence

  /**
   * Returns the wire presence of `body_text`.
   */
  public fun bodyTextPresence(): FieldPresence = bodyTextState.presence

  /**
   * Returns the wire presence of `discussion_url`.
   */
  public fun discussionUrlPresence(): FieldPresence = discussionUrlState.presence

  /**
   * Returns the wire presence of `immutable`.
   */
  public fun immutablePresence(): FieldPresence = immutableState.presence

  /**
   * Returns the wire presence of `is_short_description_html_truncated`.
   */
  public fun isShortDescriptionHtmlTruncatedPresence(): FieldPresence = isShortDescriptionHtmlTruncatedState.presence

  /**
   * Returns the wire presence of `mentions_count`.
   */
  public fun mentionsCountPresence(): FieldPresence = mentionsCountState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  /**
   * Returns the wire presence of `short_description_html`.
   */
  public fun shortDescriptionHtmlPresence(): FieldPresence = shortDescriptionHtmlState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  public class Builder {
    private var assetsValue: List<ReleaseAsset>? = null

    public var assets: List<ReleaseAsset>
      get() = requireNotNull(assetsValue) { "assets is required" }.toList()
      set(`value`) {
        assetsValue = value.toList()
      }

    private var assetsUrlValue: String? = null

    public var assetsUrl: String
      get() = requireNotNull(assetsUrlValue) { "assetsUrl is required" }
      set(`value`) {
        assetsUrlValue = value
      }

    private var authorValue: SimpleUser? = null

    public var author: SimpleUser
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var draftValue: Boolean? = null

    public var draft: Boolean
      get() = requireNotNull(draftValue) { "draft is required" }
      set(`value`) {
        draftValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var prereleaseValue: Boolean? = null

    public var prerelease: Boolean
      get() = requireNotNull(prereleaseValue) { "prerelease is required" }
      set(`value`) {
        prereleaseValue = value
      }

    private var tagNameValue: String? = null

    public var tagName: String
      get() = requireNotNull(tagNameValue) { "tagName is required" }
      set(`value`) {
        tagNameValue = value
      }

    private var targetCommitishValue: String? = null

    public var targetCommitish: String
      get() = requireNotNull(targetCommitishValue) { "targetCommitish is required" }
      set(`value`) {
        targetCommitishValue = value
      }

    private var uploadUrlValue: String? = null

    public var uploadUrl: String
      get() = requireNotNull(uploadUrlValue) { "uploadUrl is required" }
      set(`value`) {
        uploadUrlValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var publishedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var publishedAt: String?
      get() = publishedAtState.valueOrNull()
      set(`value`) {
        publishedAtState = value.toNullableFieldState()
      }

    private var tarballUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var tarballUrl: String?
      get() = tarballUrlState.valueOrNull()
      set(`value`) {
        tarballUrlState = value.toNullableFieldState()
      }

    private var zipballUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var zipballUrl: String?
      get() = zipballUrlState.valueOrNull()
      set(`value`) {
        zipballUrlState = value.toNullableFieldState()
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var bodyHtmlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyHtml: String?
      get() = bodyHtmlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyHtml is not nullable; call unsetBodyHtml() to omit it" }
        bodyHtmlState = FieldState.Value(present)
      }

    private var bodyTextState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyText: String?
      get() = bodyTextState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyText is not nullable; call unsetBodyText() to omit it" }
        bodyTextState = FieldState.Value(present)
      }

    private var discussionUrlState: FieldState<String> = FieldState.Absent

    /**
     * The URL of the release discussion.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var discussionUrl: String?
      get() = discussionUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "discussionUrl is not nullable; call unsetDiscussionUrl() to omit it" }
        discussionUrlState = FieldState.Value(present)
      }

    private var immutableState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether or not the release is immutable.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var immutable: Boolean?
      get() = immutableState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "immutable is not nullable; call unsetImmutable() to omit it" }
        immutableState = FieldState.Value(present)
      }

    private var isShortDescriptionHtmlTruncatedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isShortDescriptionHtmlTruncated: Boolean?
      get() = isShortDescriptionHtmlTruncatedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isShortDescriptionHtmlTruncated is not nullable; call unsetIsShortDescriptionHtmlTruncated() to omit it" }
        isShortDescriptionHtmlTruncatedState = FieldState.Value(present)
      }

    private var mentionsCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mentionsCount: Int?
      get() = mentionsCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mentionsCount is not nullable; call unsetMentionsCount() to omit it" }
        mentionsCountState = FieldState.Value(present)
      }

    private var reactionsState: FieldState<ReactionRollup> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: ReactionRollup?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    private var shortDescriptionHtmlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var shortDescriptionHtml: String?
      get() = shortDescriptionHtmlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "shortDescriptionHtml is not nullable; call unsetShortDescriptionHtml() to omit it" }
        shortDescriptionHtmlState = FieldState.Value(present)
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `body_html` from serialized output.
     */
    public fun unsetBodyHtml() {
      bodyHtmlState = FieldState.Absent
    }

    /**
     * Omits `body_text` from serialized output.
     */
    public fun unsetBodyText() {
      bodyTextState = FieldState.Absent
    }

    /**
     * Omits `discussion_url` from serialized output.
     */
    public fun unsetDiscussionUrl() {
      discussionUrlState = FieldState.Absent
    }

    /**
     * Omits `immutable` from serialized output.
     */
    public fun unsetImmutable() {
      immutableState = FieldState.Absent
    }

    /**
     * Omits `is_short_description_html_truncated` from serialized output.
     */
    public fun unsetIsShortDescriptionHtmlTruncated() {
      isShortDescriptionHtmlTruncatedState = FieldState.Absent
    }

    /**
     * Omits `mentions_count` from serialized output.
     */
    public fun unsetMentionsCount() {
      mentionsCountState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    /**
     * Omits `short_description_html` from serialized output.
     */
    public fun unsetShortDescriptionHtml() {
      shortDescriptionHtmlState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): InlineReleaseEventReleaseX1d663d6a {
      check(assetsValue != null) { "assets is required" }
      check(assetsUrlValue != null) { "assetsUrl is required" }
      check(authorValue != null) { "author is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(draftValue != null) { "draft is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(prereleaseValue != null) { "prerelease is required" }
      check(tagNameValue != null) { "tagName is required" }
      check(targetCommitishValue != null) { "targetCommitish is required" }
      check(uploadUrlValue != null) { "uploadUrl is required" }
      check(urlValue != null) { "url is required" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      check(publishedAtState !== FieldState.Absent) { "publishedAt is required, even when null" }
      check(tarballUrlState !== FieldState.Absent) { "tarballUrl is required, even when null" }
      check(zipballUrlState !== FieldState.Absent) { "zipballUrl is required, even when null" }
      return InlineReleaseEventReleaseX1d663d6a(
        assets = assets,
        assetsUrl = assetsUrl,
        author = author,
        createdAt = createdAt,
        draft = draft,
        htmlUrl = htmlUrl,
        id = id,
        name = nameState.valueOrNull(),
        nodeId = nodeId,
        prerelease = prerelease,
        publishedAt = publishedAtState.valueOrNull(),
        tagName = tagName,
        tarballUrl = tarballUrlState.valueOrNull(),
        targetCommitish = targetCommitish,
        uploadUrl = uploadUrl,
        url = url,
        zipballUrl = zipballUrlState.valueOrNull(),
        bodyState = bodyState,
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        discussionUrlState = discussionUrlState,
        immutableState = immutableState,
        isShortDescriptionHtmlTruncatedState = isShortDescriptionHtmlTruncatedState,
        mentionsCountState = mentionsCountState,
        reactionsState = reactionsState,
        shortDescriptionHtmlState = shortDescriptionHtmlState,
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReleaseEventReleaseX1d663d6a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReleaseEventReleaseX1d663d6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReleaseEventReleaseX1d663d6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReleaseEventReleaseX1d663d6a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReleaseEventReleaseX1d663d6a must be a JSON object")
      val assets = json.decodeRequired<List<ReleaseAsset>>(rawObject, "assets")
      val assetsUrl = json.decodeRequired<String>(rawObject, "assets_url")
      val author = json.decodeRequired<SimpleUser>(rawObject, "author")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val draft = json.decodeRequired<Boolean>(rawObject, "draft")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val prerelease = json.decodeRequired<Boolean>(rawObject, "prerelease")
      val tagName = json.decodeRequired<String>(rawObject, "tag_name")
      val targetCommitish = json.decodeRequired<String>(rawObject, "target_commitish")
      val uploadUrl = json.decodeRequired<String>(rawObject, "upload_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("name")) {
        throw SerializationException("InlineReleaseEventReleaseX1d663d6a is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("published_at")) {
        throw SerializationException("InlineReleaseEventReleaseX1d663d6a is missing required property 'published_at'")
      }
      val publishedAt = rawObject["published_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("tarball_url")) {
        throw SerializationException("InlineReleaseEventReleaseX1d663d6a is missing required property 'tarball_url'")
      }
      val tarballUrl = rawObject["tarball_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("zipball_url")) {
        throw SerializationException("InlineReleaseEventReleaseX1d663d6a is missing required property 'zipball_url'")
      }
      val zipballUrl = rawObject["zipball_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineReleaseEventReleaseX1d663d6a(
        assets = assets,
        assetsUrl = assetsUrl,
        author = author,
        createdAt = createdAt,
        draft = draft,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        prerelease = prerelease,
        publishedAt = publishedAt,
        tagName = tagName,
        tarballUrl = tarballUrl,
        targetCommitish = targetCommitish,
        uploadUrl = uploadUrl,
        url = url,
        zipballUrl = zipballUrl,
        bodyState = json.decodeOptional(rawObject, "body", nullable = true),
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        discussionUrlState = json.decodeOptional(rawObject, "discussion_url", nullable = false),
        immutableState = json.decodeOptional(rawObject, "immutable", nullable = false),
        isShortDescriptionHtmlTruncatedState = json.decodeOptional(rawObject, "is_short_description_html_truncated", nullable = false),
        mentionsCountState = json.decodeOptional(rawObject, "mentions_count", nullable = false),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
        shortDescriptionHtmlState = json.decodeOptional(rawObject, "short_description_html", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReleaseEventReleaseX1d663d6a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReleaseEventReleaseX1d663d6a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assets", json.encodeToJsonElement(value.assets))
        put("assets_url", value.assetsUrl)
        put("author", json.encodeToJsonElement(value.author))
        put("created_at", value.createdAt)
        put("draft", json.encodeToJsonElement(value.draft))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("prerelease", json.encodeToJsonElement(value.prerelease))
        put("published_at", value.publishedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tag_name", value.tagName)
        put("tarball_url", value.tarballUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("target_commitish", value.targetCommitish)
        put("upload_url", value.uploadUrl)
        put("url", value.url)
        put("zipball_url", value.zipballUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("discussion_url", value.discussionUrlState, json::encodeToJsonElement)
        putState("immutable", value.immutableState, json::encodeToJsonElement)
        putState("is_short_description_html_truncated", value.isShortDescriptionHtmlTruncatedState, json::encodeToJsonElement)
        putState("mentions_count", value.mentionsCountState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
        putState("short_description_html", value.shortDescriptionHtmlState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReleaseEventReleaseX1d663d6a(block: InlineReleaseEventReleaseX1d663d6a.Builder.() -> Unit): InlineReleaseEventReleaseX1d663d6a = InlineReleaseEventReleaseX1d663d6a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReleaseEventReleaseX1d663d6a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReleaseEventReleaseX1d663d6a property '" + name + "' is not nullable")
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
