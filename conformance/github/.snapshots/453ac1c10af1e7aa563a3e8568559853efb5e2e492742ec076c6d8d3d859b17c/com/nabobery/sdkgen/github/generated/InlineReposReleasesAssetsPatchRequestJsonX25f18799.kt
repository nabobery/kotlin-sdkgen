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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1assets~1{asset_id}/patch/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1assets~1{asset_id}/patch/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposReleasesAssetsPatchRequestJsonX25f18799.Serializer::class)
public class InlineReposReleasesAssetsPatchRequestJsonX25f18799 internal constructor(
  private val labelState: FieldState<String>,
  private val nameState: FieldState<String>,
  private val stateState: FieldState<String>,
) {
  /**
   * An alternate short description of the asset. Used in place of the filename.
   */
  public val label: String?
    get() = labelState.valueOrNull()

  /**
   * The file name of the asset.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public val state: String?
    get() = stateState.valueOrNull()

  public constructor() : this(labelState = FieldState.Absent,
  nameState = FieldState.Absent,
  stateState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `label`.
   */
  public fun labelPresence(): FieldPresence = labelState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  public class Builder {
    private var labelState: FieldState<String> = FieldState.Absent

    /**
     * An alternate short description of the asset. Used in place of the filename.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "label is not nullable; call unsetLabel() to omit it" }
        labelState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The file name of the asset.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var stateState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: String?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    /**
     * Omits `label` from serialized output.
     */
    public fun unsetLabel() {
      labelState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    public fun build(): InlineReposReleasesAssetsPatchRequestJsonX25f18799 = InlineReposReleasesAssetsPatchRequestJsonX25f18799(
      labelState = labelState,
      nameState = nameState,
      stateState = stateState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposReleasesAssetsPatchRequestJsonX25f18799 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposReleasesAssetsPatchRequestJsonX25f18799> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposReleasesAssetsPatchRequestJsonX25f18799 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposReleasesAssetsPatchRequestJsonX25f18799")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposReleasesAssetsPatchRequestJsonX25f18799 must be a JSON object")
      return InlineReposReleasesAssetsPatchRequestJsonX25f18799(
        labelState = json.decodeOptional(rawObject, "label", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesAssetsPatchRequestJsonX25f18799) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposReleasesAssetsPatchRequestJsonX25f18799")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("label", value.labelState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposReleasesAssetsPatchRequestJsonX25f18799(block: InlineReposReleasesAssetsPatchRequestJsonX25f18799.Builder.() -> Unit): InlineReposReleasesAssetsPatchRequestJsonX25f18799 = InlineReposReleasesAssetsPatchRequestJsonX25f18799.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposReleasesAssetsPatchRequestJsonX25f18799 property '" + name + "' is not nullable")
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
