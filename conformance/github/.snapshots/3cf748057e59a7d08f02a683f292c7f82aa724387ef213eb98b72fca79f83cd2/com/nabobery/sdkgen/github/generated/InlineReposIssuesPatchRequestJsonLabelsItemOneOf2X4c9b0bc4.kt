package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/labels/items/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/labels/items/oneOf/1
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4.Serializer::class)
public class InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 internal constructor(
  private val colorState: FieldState<String?>,
  private val descriptionState: FieldState<String?>,
  private val idState: FieldState<Int>,
  private val nameState: FieldState<String>,
) {
  public val color: String?
    get() = colorState.valueOrNull()

  public val description: String?
    get() = descriptionState.valueOrNull()

  public val id: Int?
    get() = idState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public constructor() : this(colorState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  idState = FieldState.Absent,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `color`.
   */
  public fun colorPresence(): FieldPresence = colorState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `id`.
   */
  public fun idPresence(): FieldPresence = idState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var colorState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var color: String?
      get() = colorState.valueOrNull()
      set(`value`) {
        colorState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var idState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var id: Int?
      get() = idState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "id is not nullable; call unsetId() to omit it" }
        idState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    /**
     * Omits `color` from serialized output.
     */
    public fun unsetColor() {
      colorState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `id` from serialized output.
     */
    public fun unsetId() {
      idState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 = InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4(
      colorState = colorState,
      descriptionState = descriptionState,
      idState = idState,
      nameState = nameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 must be a JSON object")
      return InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4(
        colorState = json.decodeOptional(rawObject, "color", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("color", value.colorState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4(block: InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4.Builder.() -> Unit): InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 = InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposIssuesPatchRequestJsonLabelsItemOneOf2X4c9b0bc4 property '" + name + "' is not nullable")
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
