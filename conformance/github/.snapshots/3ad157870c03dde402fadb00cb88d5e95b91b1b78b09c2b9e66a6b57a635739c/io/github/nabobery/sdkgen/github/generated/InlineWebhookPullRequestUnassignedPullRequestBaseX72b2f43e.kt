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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e(
  public val label: String?,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestUnassignedPullRequestBaseRepoX3ef262bf,
  public val sha: String,
  public val user: InlineWebhookPullRequestUnassignedPullRequestBaseUserX6e5c1d3a?,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue: InlineWebhookPullRequestUnassignedPullRequestBaseRepoX3ef262bf? = null

    public var repo: InlineWebhookPullRequestUnassignedPullRequestBaseRepoX3ef262bf
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

    private var labelState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        labelState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestUnassignedPullRequestBaseUserX6e5c1d3a?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestUnassignedPullRequestBaseUserX6e5c1d3a?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      check(labelState !== FieldState.Absent) { "label is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e(
        label = labelState.valueOrNull(),
        ref = ref,
        repo = repo,
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestBaseRepoX3ef262bf>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("label")) {
        throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e is missing required property 'label'")
      }
      val label = rawObject["label"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestUnassignedPullRequestBaseUserX6e5c1d3a?>(requireNotNull(element)) }
      return InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e(block: InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e = InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestBaseX72b2f43e property '" + name + "' is not nullable")
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
