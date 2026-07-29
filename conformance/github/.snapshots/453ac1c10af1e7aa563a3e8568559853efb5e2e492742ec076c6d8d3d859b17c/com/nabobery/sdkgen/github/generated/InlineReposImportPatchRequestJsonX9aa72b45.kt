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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/patch/requestBody/content/application~1json/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/patch/requestBody/content/application~1json/sche
 * ma
 */
@Serializable(with = InlineReposImportPatchRequestJsonX9aa72b45.Serializer::class)
public class InlineReposImportPatchRequestJsonX9aa72b45 internal constructor(
  private val tfvcProjectState: FieldState<String>,
  private val vcsState: FieldState<InlineReposImportPatchRequestJsonVcsX9c29592f>,
  private val vcsPasswordState: FieldState<String>,
  private val vcsUsernameState: FieldState<String>,
) {
  /**
   * For a tfvc import, the name of the project that is being imported.
   */
  public val tfvcProject: String?
    get() = tfvcProjectState.valueOrNull()

  /**
   * The type of version control system you are migrating from.
   */
  public val vcs: InlineReposImportPatchRequestJsonVcsX9c29592f?
    get() = vcsState.valueOrNull()

  /**
   * The password to provide to the originating repository.
   */
  public val vcsPassword: String?
    get() = vcsPasswordState.valueOrNull()

  /**
   * The username to provide to the originating repository.
   */
  public val vcsUsername: String?
    get() = vcsUsernameState.valueOrNull()

  public constructor() : this(tfvcProjectState = FieldState.Absent,
  vcsState = FieldState.Absent,
  vcsPasswordState = FieldState.Absent,
  vcsUsernameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `tfvc_project`.
   */
  public fun tfvcProjectPresence(): FieldPresence = tfvcProjectState.presence

  /**
   * Returns the wire presence of `vcs`.
   */
  public fun vcsPresence(): FieldPresence = vcsState.presence

  /**
   * Returns the wire presence of `vcs_password`.
   */
  public fun vcsPasswordPresence(): FieldPresence = vcsPasswordState.presence

  /**
   * Returns the wire presence of `vcs_username`.
   */
  public fun vcsUsernamePresence(): FieldPresence = vcsUsernameState.presence

  public class Builder {
    private var tfvcProjectState: FieldState<String> = FieldState.Absent

    /**
     * For a tfvc import, the name of the project that is being imported.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tfvcProject: String?
      get() = tfvcProjectState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tfvcProject is not nullable; call unsetTfvcProject() to omit it" }
        tfvcProjectState = FieldState.Value(present)
      }

    private var vcsState: FieldState<InlineReposImportPatchRequestJsonVcsX9c29592f> =
        FieldState.Absent

    /**
     * The type of version control system you are migrating from.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var vcs: InlineReposImportPatchRequestJsonVcsX9c29592f?
      get() = vcsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "vcs is not nullable; call unsetVcs() to omit it" }
        vcsState = FieldState.Value(present)
      }

    private var vcsPasswordState: FieldState<String> = FieldState.Absent

    /**
     * The password to provide to the originating repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var vcsPassword: String?
      get() = vcsPasswordState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "vcsPassword is not nullable; call unsetVcsPassword() to omit it" }
        vcsPasswordState = FieldState.Value(present)
      }

    private var vcsUsernameState: FieldState<String> = FieldState.Absent

    /**
     * The username to provide to the originating repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var vcsUsername: String?
      get() = vcsUsernameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "vcsUsername is not nullable; call unsetVcsUsername() to omit it" }
        vcsUsernameState = FieldState.Value(present)
      }

    /**
     * Omits `tfvc_project` from serialized output.
     */
    public fun unsetTfvcProject() {
      tfvcProjectState = FieldState.Absent
    }

    /**
     * Omits `vcs` from serialized output.
     */
    public fun unsetVcs() {
      vcsState = FieldState.Absent
    }

    /**
     * Omits `vcs_password` from serialized output.
     */
    public fun unsetVcsPassword() {
      vcsPasswordState = FieldState.Absent
    }

    /**
     * Omits `vcs_username` from serialized output.
     */
    public fun unsetVcsUsername() {
      vcsUsernameState = FieldState.Absent
    }

    public fun build(): InlineReposImportPatchRequestJsonX9aa72b45 = InlineReposImportPatchRequestJsonX9aa72b45(
      tfvcProjectState = tfvcProjectState,
      vcsState = vcsState,
      vcsPasswordState = vcsPasswordState,
      vcsUsernameState = vcsUsernameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposImportPatchRequestJsonX9aa72b45 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposImportPatchRequestJsonX9aa72b45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposImportPatchRequestJsonX9aa72b45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposImportPatchRequestJsonX9aa72b45")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposImportPatchRequestJsonX9aa72b45 must be a JSON object")
      return InlineReposImportPatchRequestJsonX9aa72b45(
        tfvcProjectState = json.decodeOptional(rawObject, "tfvc_project", nullable = false),
        vcsState = json.decodeOptional(rawObject, "vcs", nullable = false),
        vcsPasswordState = json.decodeOptional(rawObject, "vcs_password", nullable = false),
        vcsUsernameState = json.decodeOptional(rawObject, "vcs_username", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposImportPatchRequestJsonX9aa72b45) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposImportPatchRequestJsonX9aa72b45")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("tfvc_project", value.tfvcProjectState, json::encodeToJsonElement)
        putState("vcs", value.vcsState, json::encodeToJsonElement)
        putState("vcs_password", value.vcsPasswordState, json::encodeToJsonElement)
        putState("vcs_username", value.vcsUsernameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposImportPatchRequestJsonX9aa72b45(block: InlineReposImportPatchRequestJsonX9aa72b45.Builder.() -> Unit): InlineReposImportPatchRequestJsonX9aa72b45 = InlineReposImportPatchRequestJsonX9aa72b45.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposImportPatchRequestJsonX9aa72b45 property '" + name + "' is not nullable")
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
