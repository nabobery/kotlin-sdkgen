package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}/patch/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}/patch/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineUserCodespacesPatchRequestJsonXe8797cb4.Serializer::class)
public class InlineUserCodespacesPatchRequestJsonXe8797cb4 internal constructor(
  private val displayNameState: FieldState<String>,
  private val machineState: FieldState<String>,
  private val recentFoldersState: FieldState<List<String>>,
) {
  /**
   * Display name for this codespace
   */
  public val displayName: String?
    get() = displayNameState.valueOrNull()

  /**
   * A valid machine to transition this codespace to.
   */
  public val machine: String?
    get() = machineState.valueOrNull()

  /**
   * Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to
   * load the codespace in.
   */
  public val recentFolders: List<String>?
    get() = recentFoldersState.valueOrNull()

  public constructor() : this(displayNameState = FieldState.Absent,
  machineState = FieldState.Absent,
  recentFoldersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `display_name`.
   */
  public fun displayNamePresence(): FieldPresence = displayNameState.presence

  /**
   * Returns the wire presence of `machine`.
   */
  public fun machinePresence(): FieldPresence = machineState.presence

  /**
   * Returns the wire presence of `recent_folders`.
   */
  public fun recentFoldersPresence(): FieldPresence = recentFoldersState.presence

  public class Builder {
    private var displayNameState: FieldState<String> = FieldState.Absent

    /**
     * Display name for this codespace
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var displayName: String?
      get() = displayNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "displayName is not nullable; call unsetDisplayName() to omit it" }
        displayNameState = FieldState.Value(present)
      }

    private var machineState: FieldState<String> = FieldState.Absent

    /**
     * A valid machine to transition this codespace to.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var machine: String?
      get() = machineState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "machine is not nullable; call unsetMachine() to omit it" }
        machineState = FieldState.Value(present)
      }

    private var recentFoldersState: FieldState<List<String>> = FieldState.Absent

    /**
     * Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to
     * load the codespace in.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var recentFolders: List<String>?
      get() = recentFoldersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "recentFolders is not nullable; call unsetRecentFolders() to omit it" }
        recentFoldersState = FieldState.Value(present)
      }

    /**
     * Omits `display_name` from serialized output.
     */
    public fun unsetDisplayName() {
      displayNameState = FieldState.Absent
    }

    /**
     * Omits `machine` from serialized output.
     */
    public fun unsetMachine() {
      machineState = FieldState.Absent
    }

    /**
     * Omits `recent_folders` from serialized output.
     */
    public fun unsetRecentFolders() {
      recentFoldersState = FieldState.Absent
    }

    public fun build(): InlineUserCodespacesPatchRequestJsonXe8797cb4 = InlineUserCodespacesPatchRequestJsonXe8797cb4(
      displayNameState = displayNameState,
      machineState = machineState,
      recentFoldersState = recentFoldersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesPatchRequestJsonXe8797cb4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesPatchRequestJsonXe8797cb4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPatchRequestJsonXe8797cb4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesPatchRequestJsonXe8797cb4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesPatchRequestJsonXe8797cb4 must be a JSON object")
      return InlineUserCodespacesPatchRequestJsonXe8797cb4(
        displayNameState = json.decodeOptional(rawObject, "display_name", nullable = false),
        machineState = json.decodeOptional(rawObject, "machine", nullable = false),
        recentFoldersState = json.decodeOptional(rawObject, "recent_folders", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPatchRequestJsonXe8797cb4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesPatchRequestJsonXe8797cb4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("display_name", value.displayNameState, json::encodeToJsonElement)
        putState("machine", value.machineState, json::encodeToJsonElement)
        putState("recent_folders", value.recentFoldersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesPatchRequestJsonXe8797cb4(block: InlineUserCodespacesPatchRequestJsonXe8797cb4.Builder.() -> Unit): InlineUserCodespacesPatchRequestJsonXe8797cb4 = InlineUserCodespacesPatchRequestJsonXe8797cb4.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineUserCodespacesPatchRequestJsonXe8797cb4 property '" + name + "' is not nullable")
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
