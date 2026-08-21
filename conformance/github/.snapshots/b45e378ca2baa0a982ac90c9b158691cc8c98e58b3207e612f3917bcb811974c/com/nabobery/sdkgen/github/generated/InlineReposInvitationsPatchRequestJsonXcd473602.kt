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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1invitations~1{invitation_id}/patch/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1invitations~1{invitation_id}/patch/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposInvitationsPatchRequestJsonXcd473602.Serializer::class)
public class InlineReposInvitationsPatchRequestJsonXcd473602 internal constructor(
  private val permissionsState:
      FieldState<InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50>,
) {
  /**
   * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`,
   * `triage`, and `admin`.
   */
  public val permissions: InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50?
    get() = permissionsState.valueOrNull()

  public constructor() : this(permissionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  public class Builder {
    private var permissionsState:
        FieldState<InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50> = FieldState.Absent

    /**
     * The permissions that the associated user will have on the repository. Valid values are `read`, `write`,
     * `maintain`, `triage`, and `admin`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    public fun build(): InlineReposInvitationsPatchRequestJsonXcd473602 = InlineReposInvitationsPatchRequestJsonXcd473602(
      permissionsState = permissionsState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposInvitationsPatchRequestJsonXcd473602 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposInvitationsPatchRequestJsonXcd473602> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposInvitationsPatchRequestJsonXcd473602 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposInvitationsPatchRequestJsonXcd473602")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposInvitationsPatchRequestJsonXcd473602 must be a JSON object")
      return InlineReposInvitationsPatchRequestJsonXcd473602(
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposInvitationsPatchRequestJsonXcd473602) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposInvitationsPatchRequestJsonXcd473602")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposInvitationsPatchRequestJsonXcd473602(block: InlineReposInvitationsPatchRequestJsonXcd473602.Builder.() -> Unit): InlineReposInvitationsPatchRequestJsonXcd473602 = InlineReposInvitationsPatchRequestJsonXcd473602.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposInvitationsPatchRequestJsonXcd473602 property '" + name + "' is not nullable")
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
