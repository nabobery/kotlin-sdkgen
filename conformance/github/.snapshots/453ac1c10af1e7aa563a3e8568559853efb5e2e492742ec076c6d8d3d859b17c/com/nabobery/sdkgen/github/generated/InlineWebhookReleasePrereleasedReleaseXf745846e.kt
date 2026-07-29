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
 * The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release
 */
@Serializable(with = InlineWebhookReleasePrereleasedReleaseXf745846e.Serializer::class)
public class InlineWebhookReleasePrereleasedReleaseXf745846e internal constructor(
  assets: List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val assetsUrl: String,
  public val author: InlineWebhookReleasePrereleasedReleaseAuthorX19b9a075?,
  public val body: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  /**
   * Whether the release is a draft or published
   */
  public val draft: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  /**
   * Whether or not the release is immutable.
   */
  public val immutable: Boolean,
  public val name: String?,
  public val nodeId: String,
  /**
   * Whether the release is identified as a prerelease or a full release.
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
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val uploadUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val zipballUrl: String?,
  private val discussionUrlState: FieldState<String>,
  private val reactionsState: FieldState<InlineWebhookReleasePrereleasedReleaseReactionsX472995c1>,
) {
  public val assets: List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?> =
      assets.toList()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val discussionUrl: String?
    get() = discussionUrlState.valueOrNull()

  public val reactions: InlineWebhookReleasePrereleasedReleaseReactionsX472995c1?
    get() = reactionsState.valueOrNull()

  public constructor(
    assets: List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?>,
    assetsUrl: String,
    author: InlineWebhookReleasePrereleasedReleaseAuthorX19b9a075?,
    body: String?,
    createdAt: String?,
    draft: Boolean,
    htmlUrl: String,
    id: Int,
    immutable: Boolean,
    name: String?,
    nodeId: String,
    prerelease: Boolean,
    publishedAt: String?,
    tagName: String,
    tarballUrl: String?,
    targetCommitish: String,
    updatedAt: String?,
    uploadUrl: String,
    url: String,
    zipballUrl: String?,
  ) : this(assets = assets,
  assetsUrl = assetsUrl,
  author = author,
  body = body,
  createdAt = createdAt,
  draft = draft,
  htmlUrl = htmlUrl,
  id = id,
  immutable = immutable,
  name = name,
  nodeId = nodeId,
  prerelease = prerelease,
  publishedAt = publishedAt,
  tagName = tagName,
  tarballUrl = tarballUrl,
  targetCommitish = targetCommitish,
  updatedAt = updatedAt,
  uploadUrl = uploadUrl,
  url = url,
  zipballUrl = zipballUrl,
  discussionUrlState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `discussion_url`.
   */
  public fun discussionUrlPresence(): FieldPresence = discussionUrlState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  public class Builder {
    private var assetsValue: List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?>? =
        null

    public var assets: List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?>
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

    private var immutableValue: Boolean? = null

    public var immutable: Boolean
      get() = requireNotNull(immutableValue) { "immutable is required" }
      set(`value`) {
        immutableValue = value
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

    private var authorState: FieldState<InlineWebhookReleasePrereleasedReleaseAuthorX19b9a075?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: InlineWebhookReleasePrereleasedReleaseAuthorX19b9a075?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
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

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
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

    private var discussionUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var discussionUrl: String?
      get() = discussionUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "discussionUrl is not nullable; call unsetDiscussionUrl() to omit it" }
        discussionUrlState = FieldState.Value(present)
      }

    private var reactionsState: FieldState<InlineWebhookReleasePrereleasedReleaseReactionsX472995c1>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: InlineWebhookReleasePrereleasedReleaseReactionsX472995c1?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    /**
     * Omits `discussion_url` from serialized output.
     */
    public fun unsetDiscussionUrl() {
      discussionUrlState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    public fun build(): InlineWebhookReleasePrereleasedReleaseXf745846e {
      check(assetsValue != null) { "assets is required" }
      check(assetsUrlValue != null) { "assetsUrl is required" }
      check(draftValue != null) { "draft is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(immutableValue != null) { "immutable is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(prereleaseValue != null) { "prerelease is required" }
      check(tagNameValue != null) { "tagName is required" }
      check(targetCommitishValue != null) { "targetCommitish is required" }
      check(uploadUrlValue != null) { "uploadUrl is required" }
      check(urlValue != null) { "url is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      check(publishedAtState !== FieldState.Absent) { "publishedAt is required, even when null" }
      check(tarballUrlState !== FieldState.Absent) { "tarballUrl is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      check(zipballUrlState !== FieldState.Absent) { "zipballUrl is required, even when null" }
      return InlineWebhookReleasePrereleasedReleaseXf745846e(
        assets = assets,
        assetsUrl = assetsUrl,
        author = authorState.valueOrNull(),
        body = bodyState.valueOrNull(),
        createdAt = createdAtState.valueOrNull(),
        draft = draft,
        htmlUrl = htmlUrl,
        id = id,
        immutable = immutable,
        name = nameState.valueOrNull(),
        nodeId = nodeId,
        prerelease = prerelease,
        publishedAt = publishedAtState.valueOrNull(),
        tagName = tagName,
        tarballUrl = tarballUrlState.valueOrNull(),
        targetCommitish = targetCommitish,
        updatedAt = updatedAtState.valueOrNull(),
        uploadUrl = uploadUrl,
        url = url,
        zipballUrl = zipballUrlState.valueOrNull(),
        discussionUrlState = discussionUrlState,
        reactionsState = reactionsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleasePrereleasedReleaseXf745846e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookReleasePrereleasedReleaseXf745846e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePrereleasedReleaseXf745846e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleasePrereleasedReleaseXf745846e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e must be a JSON object")
      val assets = json.decodeRequired<List<InlineWebhookReleasePrereleasedReleaseAssetsItemX67acf76a?>>(rawObject, "assets")
      val assetsUrl = json.decodeRequired<String>(rawObject, "assets_url")
      val draft = json.decodeRequired<Boolean>(rawObject, "draft")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val immutable = json.decodeRequired<Boolean>(rawObject, "immutable")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val prerelease = json.decodeRequired<Boolean>(rawObject, "prerelease")
      val tagName = json.decodeRequired<String>(rawObject, "tag_name")
      val targetCommitish = json.decodeRequired<String>(rawObject, "target_commitish")
      val uploadUrl = json.decodeRequired<String>(rawObject, "upload_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookReleasePrereleasedReleaseAuthorX19b9a075?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("published_at")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'published_at'")
      }
      val publishedAt = rawObject["published_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("tarball_url")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'tarball_url'")
      }
      val tarballUrl = rawObject["tarball_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("zipball_url")) {
        throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property 'zipball_url'")
      }
      val zipballUrl = rawObject["zipball_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookReleasePrereleasedReleaseXf745846e(
        assets = assets,
        assetsUrl = assetsUrl,
        author = author,
        body = body,
        createdAt = createdAt,
        draft = draft,
        htmlUrl = htmlUrl,
        id = id,
        immutable = immutable,
        name = name,
        nodeId = nodeId,
        prerelease = prerelease,
        publishedAt = publishedAt,
        tagName = tagName,
        tarballUrl = tarballUrl,
        targetCommitish = targetCommitish,
        updatedAt = updatedAt,
        uploadUrl = uploadUrl,
        url = url,
        zipballUrl = zipballUrl,
        discussionUrlState = json.decodeOptional(rawObject, "discussion_url", nullable = false),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePrereleasedReleaseXf745846e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleasePrereleasedReleaseXf745846e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assets", json.encodeToJsonElement(value.assets))
        put("assets_url", value.assetsUrl)
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("draft", json.encodeToJsonElement(value.draft))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("immutable", json.encodeToJsonElement(value.immutable))
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("prerelease", json.encodeToJsonElement(value.prerelease))
        put("published_at", value.publishedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tag_name", value.tagName)
        put("tarball_url", value.tarballUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("target_commitish", value.targetCommitish)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("upload_url", value.uploadUrl)
        put("url", value.url)
        put("zipball_url", value.zipballUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("discussion_url", value.discussionUrlState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleasePrereleasedReleaseXf745846e(block: InlineWebhookReleasePrereleasedReleaseXf745846e.Builder.() -> Unit): InlineWebhookReleasePrereleasedReleaseXf745846e = InlineWebhookReleasePrereleasedReleaseXf745846e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookReleasePrereleasedReleaseXf745846e property '" + name + "' is not nullable")
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
