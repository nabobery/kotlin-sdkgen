package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits~1pulls~1creation-cap/patch/requestBo
 * dy/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits~1pulls~1creation-cap/patch/requestBo
 * dy/content/application~1json/schema
 */
@Serializable(with = InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6.Serializer::class)
public class InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 internal constructor(
  /**
   * Whether the pull request creation cap is enabled
   */
  public val enabled: Boolean,
  private val maxOpenPullRequestsState: FieldState<Int>,
) {
  /**
   * The maximum number of open pull requests a user can have at one time
   */
  public val maxOpenPullRequests: Int?
    get() = maxOpenPullRequestsState.valueOrNull()

  public constructor(enabled: Boolean) : this(enabled = enabled,
  maxOpenPullRequestsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `max_open_pull_requests`.
   */
  public fun maxOpenPullRequestsPresence(): FieldPresence = maxOpenPullRequestsState.presence

  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var maxOpenPullRequestsState: FieldState<Int> = FieldState.Absent

    /**
     * The maximum number of open pull requests a user can have at one time
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maxOpenPullRequests: Int?
      get() = maxOpenPullRequestsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maxOpenPullRequests is not nullable; call unsetMaxOpenPullRequests() to omit it" }
        maxOpenPullRequestsState = FieldState.Value(present)
      }

    /**
     * Omits `max_open_pull_requests` from serialized output.
     */
    public fun unsetMaxOpenPullRequests() {
      maxOpenPullRequestsState = FieldState.Absent
    }

    public fun build(): InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 {
      check(enabledValue != null) { "enabled is required" }
      return InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6(
        enabled = enabled,
        maxOpenPullRequestsState = maxOpenPullRequestsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6(
        enabled = enabled,
        maxOpenPullRequestsState = json.decodeOptional(rawObject, "max_open_pull_requests", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        putState("max_open_pull_requests", value.maxOpenPullRequestsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6(block: InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6.Builder.() -> Unit): InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 = InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6 property '" + name + "' is not nullable")
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
