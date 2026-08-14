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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/hea
 * d.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/hea
 * d
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971(
  public val label: String,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestDequeuedPullRequestHeadRepoX383f27a5,
  public val sha: String,
  public val user: InlineWebhookPullRequestDequeuedPullRequestHeadUserX355f9c05?,
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

    private var repoValue: InlineWebhookPullRequestDequeuedPullRequestHeadRepoX383f27a5? = null

    public var repo: InlineWebhookPullRequestDequeuedPullRequestHeadRepoX383f27a5
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

    private var userState: FieldState<InlineWebhookPullRequestDequeuedPullRequestHeadUserX355f9c05?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestDequeuedPullRequestHeadUserX355f9c05?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestHeadRepoX383f27a5>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestDequeuedPullRequestHeadUserX355f9c05?>(requireNotNull(element)) }
      return InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971")
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

public fun inlineWebhookPullRequestDequeuedPullRequestHeadX502a5971(block: InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 = InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestHeadX502a5971 property '" + name + "' is not nullable")
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
