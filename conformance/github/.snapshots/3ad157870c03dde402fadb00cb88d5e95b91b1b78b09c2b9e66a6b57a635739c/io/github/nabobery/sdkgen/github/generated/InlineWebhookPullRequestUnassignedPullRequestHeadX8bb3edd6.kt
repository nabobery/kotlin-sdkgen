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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/h
 * ead.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/h
 * ead
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6(
  public val label: String?,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestUnassignedPullRequestHeadRepoX2afbb660?,
  public val sha: String,
  public val user: InlineWebhookPullRequestUnassignedPullRequestHeadUserX4fc3c993?,
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
        FieldState<InlineWebhookPullRequestUnassignedPullRequestHeadRepoX2afbb660?> =
        FieldState.Absent

    /**
     * A git repository
     * Required nullable field; assigning `null` records present-null.
     */
    public var repo: InlineWebhookPullRequestUnassignedPullRequestHeadRepoX2afbb660?
      get() = repoState.valueOrNull()
      set(`value`) {
        repoState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestUnassignedPullRequestHeadUserX4fc3c993?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestUnassignedPullRequestHeadUserX4fc3c993?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 {
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      check(labelState !== FieldState.Absent) { "label is required, even when null" }
      check(repoState !== FieldState.Absent) { "repo is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6(
        label = labelState.valueOrNull(),
        ref = ref,
        repo = repoState.valueOrNull(),
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("label")) {
        throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 is missing required property 'label'")
      }
      val label = rawObject["label"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("repo")) {
        throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 is missing required property 'repo'")
      }
      val repo = rawObject["repo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestUnassignedPullRequestHeadRepoX2afbb660?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestUnassignedPullRequestHeadUserX4fc3c993?>(requireNotNull(element)) }
      return InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6")
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

public fun inlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6(block: InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 = InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestHeadX8bb3edd6 property '" + name + "' is not nullable")
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
