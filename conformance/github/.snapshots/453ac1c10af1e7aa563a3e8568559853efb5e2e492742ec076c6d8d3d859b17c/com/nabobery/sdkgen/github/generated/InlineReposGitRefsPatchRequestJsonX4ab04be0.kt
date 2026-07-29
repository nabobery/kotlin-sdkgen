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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1refs~1{ref}/patch/requestBody/content/application~
 * 1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1refs~1{ref}/patch/requestBody/content/application~
 * 1json/schema
 */
@Serializable(with = InlineReposGitRefsPatchRequestJsonX4ab04be0.Serializer::class)
public class InlineReposGitRefsPatchRequestJsonX4ab04be0 internal constructor(
  /**
   * The SHA1 value to set this reference to
   */
  public val sha: String,
  private val forceState: FieldState<Boolean>,
) {
  /**
   * Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or
   * setting it to `false` will make sure you're not overwriting work.
   */
  public val force: Boolean?
    get() = forceState.valueOrNull()

  public constructor(sha: String) : this(sha = sha,
  forceState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `force`.
   */
  public fun forcePresence(): FieldPresence = forceState.presence

  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var forceState: FieldState<Boolean> = FieldState.Absent

    /**
     * Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or
     * setting it to `false` will make sure you're not overwriting work.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var force: Boolean?
      get() = forceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "force is not nullable; call unsetForce() to omit it" }
        forceState = FieldState.Value(present)
      }

    /**
     * Omits `force` from serialized output.
     */
    public fun unsetForce() {
      forceState = FieldState.Absent
    }

    public fun build(): InlineReposGitRefsPatchRequestJsonX4ab04be0 {
      check(shaValue != null) { "sha is required" }
      return InlineReposGitRefsPatchRequestJsonX4ab04be0(
        sha = sha,
        forceState = forceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitRefsPatchRequestJsonX4ab04be0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposGitRefsPatchRequestJsonX4ab04be0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitRefsPatchRequestJsonX4ab04be0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitRefsPatchRequestJsonX4ab04be0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitRefsPatchRequestJsonX4ab04be0 must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineReposGitRefsPatchRequestJsonX4ab04be0(
        sha = sha,
        forceState = json.decodeOptional(rawObject, "force", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitRefsPatchRequestJsonX4ab04be0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitRefsPatchRequestJsonX4ab04be0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        putState("force", value.forceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitRefsPatchRequestJsonX4ab04be0(block: InlineReposGitRefsPatchRequestJsonX4ab04be0.Builder.() -> Unit): InlineReposGitRefsPatchRequestJsonX4ab04be0 = InlineReposGitRefsPatchRequestJsonX4ab04be0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitRefsPatchRequestJsonX4ab04be0 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposGitRefsPatchRequestJsonX4ab04be0 property '" + name + "' is not nullable")
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
