package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/commit
 */
@Serializable(with = InlineCommitSearchResultItemCommitXdb4a8d53.Serializer::class)
public class InlineCommitSearchResultItemCommitXdb4a8d53 internal constructor(
  public val author: InlineCommitSearchResultItemCommitAuthorX6238a5f0,
  public val commentCount: Int,
  public val committer: NullableGitUser?,
  public val message: String,
  public val tree: InlineCommitSearchResultItemCommitTreeX759de281,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val verificationState: FieldState<Verification>,
) {
  public val verification: Verification?
    get() = verificationState.valueOrNull()

  public constructor(
    author: InlineCommitSearchResultItemCommitAuthorX6238a5f0,
    commentCount: Int,
    committer: NullableGitUser?,
    message: String,
    tree: InlineCommitSearchResultItemCommitTreeX759de281,
    url: String,
  ) : this(author = author,
  commentCount = commentCount,
  committer = committer,
  message = message,
  tree = tree,
  url = url,
  verificationState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `verification`.
   */
  public fun verificationPresence(): FieldPresence = verificationState.presence

  public class Builder {
    private var authorValue: InlineCommitSearchResultItemCommitAuthorX6238a5f0? = null

    public var author: InlineCommitSearchResultItemCommitAuthorX6238a5f0
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var commentCountValue: Int? = null

    public var commentCount: Int
      get() = requireNotNull(commentCountValue) { "commentCount is required" }
      set(`value`) {
        commentCountValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var treeValue: InlineCommitSearchResultItemCommitTreeX759de281? = null

    public var tree: InlineCommitSearchResultItemCommitTreeX759de281
      get() = requireNotNull(treeValue) { "tree is required" }
      set(`value`) {
        treeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var committerState: FieldState<NullableGitUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var committer: NullableGitUser?
      get() = committerState.valueOrNull()
      set(`value`) {
        committerState = value.toNullableFieldState()
      }

    private var verificationState: FieldState<Verification> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var verification: Verification?
      get() = verificationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "verification is not nullable; call unsetVerification() to omit it" }
        verificationState = FieldState.Value(present)
      }

    /**
     * Omits `verification` from serialized output.
     */
    public fun unsetVerification() {
      verificationState = FieldState.Absent
    }

    public fun build(): InlineCommitSearchResultItemCommitXdb4a8d53 {
      check(authorValue != null) { "author is required" }
      check(commentCountValue != null) { "commentCount is required" }
      check(messageValue != null) { "message is required" }
      check(treeValue != null) { "tree is required" }
      check(urlValue != null) { "url is required" }
      check(committerState !== FieldState.Absent) { "committer is required, even when null" }
      return InlineCommitSearchResultItemCommitXdb4a8d53(
        author = author,
        commentCount = commentCount,
        committer = committerState.valueOrNull(),
        message = message,
        tree = tree,
        url = url,
        verificationState = verificationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitSearchResultItemCommitXdb4a8d53 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitSearchResultItemCommitXdb4a8d53> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitSearchResultItemCommitXdb4a8d53 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitSearchResultItemCommitXdb4a8d53")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitSearchResultItemCommitXdb4a8d53 must be a JSON object")
      val author = json.decodeRequired<InlineCommitSearchResultItemCommitAuthorX6238a5f0>(rawObject, "author")
      val commentCount = json.decodeRequired<Int>(rawObject, "comment_count")
      val message = json.decodeRequired<String>(rawObject, "message")
      val tree = json.decodeRequired<InlineCommitSearchResultItemCommitTreeX759de281>(rawObject, "tree")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("committer")) {
        throw SerializationException("InlineCommitSearchResultItemCommitXdb4a8d53 is missing required property 'committer'")
      }
      val committer = rawObject["committer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableGitUser?>(requireNotNull(element)) }
      return InlineCommitSearchResultItemCommitXdb4a8d53(
        author = author,
        commentCount = commentCount,
        committer = committer,
        message = message,
        tree = tree,
        url = url,
        verificationState = json.decodeOptional(rawObject, "verification", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitSearchResultItemCommitXdb4a8d53) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitSearchResultItemCommitXdb4a8d53")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("comment_count", json.encodeToJsonElement(value.commentCount))
        put("committer", value.committer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("message", value.message)
        put("tree", json.encodeToJsonElement(value.tree))
        put("url", value.url)
        putState("verification", value.verificationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitSearchResultItemCommitXdb4a8d53(block: InlineCommitSearchResultItemCommitXdb4a8d53.Builder.() -> Unit): InlineCommitSearchResultItemCommitXdb4a8d53 = InlineCommitSearchResultItemCommitXdb4a8d53.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCommitSearchResultItemCommitXdb4a8d53 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineCommitSearchResultItemCommitXdb4a8d53 property '" + name + "' is not nullable")
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
