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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c(
  public val label: String?,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestReviewSubmittedPullRequestHeadRepoX4dbc2762?,
  public val sha: String,
  public val user: InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserXae3b9bf3?,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var labelState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        labelState = value.toNullableFieldState()
      }

    private var repoState:
        FieldState<InlineWebhookPullRequestReviewSubmittedPullRequestHeadRepoX4dbc2762?> =
        FieldState.Absent

    /**
     * A git repository
     * Required nullable field; assigning `null` records present-null.
     */
    public var repo: InlineWebhookPullRequestReviewSubmittedPullRequestHeadRepoX4dbc2762?
      get() = repoState.valueOrNull()
      set(`value`) {
        repoState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserXae3b9bf3?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserXae3b9bf3?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c {
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      check(labelState !== FieldState.Absent) { "label is required, even when null" }
      check(repoState !== FieldState.Absent) { "repo is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c(
        label = labelState.valueOrNull(),
        ref = ref,
        repo = repoState.valueOrNull(),
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("label")) {
        throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c is missing required property 'label'")
      }
      val label = rawObject["label"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("repo")) {
        throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c is missing required property 'repo'")
      }
      val repo = rawObject["repo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewSubmittedPullRequestHeadRepoX4dbc2762?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserXae3b9bf3?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ref", value.ref)
        put("repo", value.repo?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sha", value.sha)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c(block: InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c = InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestHeadX32a4943c property '" + name + "' is not nullable")
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
