package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a(
  public val label: String,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestSynchronizePullRequestHeadRepoXad0d7e4b,
  public val sha: String,
  public val user: InlineWebhookPullRequestSynchronizePullRequestHeadUserX8bdd14c9?,
) {
  public class Builder {
    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue: InlineWebhookPullRequestSynchronizePullRequestHeadRepoXad0d7e4b? = null

    public var repo: InlineWebhookPullRequestSynchronizePullRequestHeadRepoXad0d7e4b
      get() = requireNotNull(repoValue) { "repo is required" }
      set(`value`) {
        repoValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var userState:
        FieldState<InlineWebhookPullRequestSynchronizePullRequestHeadUserX8bdd14c9?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestSynchronizePullRequestHeadUserX8bdd14c9?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestHeadRepoXad0d7e4b>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestSynchronizePullRequestHeadUserX8bdd14c9?>(requireNotNull(element)) }
      return InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label)
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a(block: InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a = InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestHeadX41462c3a property '" + name + "' is not nullable")
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
