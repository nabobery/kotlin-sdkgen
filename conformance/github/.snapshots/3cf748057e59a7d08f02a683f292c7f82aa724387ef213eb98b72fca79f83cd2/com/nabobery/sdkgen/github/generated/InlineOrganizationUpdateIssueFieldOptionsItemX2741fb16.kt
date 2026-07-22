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
 * sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field/properties/options/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field/properties/options/items
 */
@Serializable(with = InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16.Serializer::class)
public class InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 internal constructor(
  /**
   * Color for the option.
   */
  public val color: InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4,
  /**
   * Name of the option.
   */
  public val name: String,
  /**
   * Priority of the option for ordering.
   */
  public val priority: Int,
  private val descriptionState: FieldState<String?>,
  private val idState: FieldState<Int>,
) {
  /**
   * Description of the option.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The id of an existing option to retain or update. Omit this when creating a new option.
   */
  public val id: Int?
    get() = idState.valueOrNull()

  public constructor(
    color: InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4,
    name: String,
    priority: Int,
  ) : this(color = color,
  name = name,
  priority = priority,
  descriptionState = FieldState.Absent,
  idState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `id`.
   */
  public fun idPresence(): FieldPresence = idState.presence

  public class Builder {
    private var colorValue: InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4? = null

    public var color: InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4
      get() = requireNotNull(colorValue) { "color is required" }
      set(`value`) {
        colorValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var priorityValue: Int? = null

    public var priority: Int
      get() = requireNotNull(priorityValue) { "priority is required" }
      set(`value`) {
        priorityValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Description of the option.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var idState: FieldState<Int> = FieldState.Absent

    /**
     * The id of an existing option to retain or update. Omit this when creating a new option.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var id: Int?
      get() = idState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "id is not nullable; call unsetId() to omit it" }
        idState = FieldState.Value(present)
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

    public fun build(): InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 {
      check(colorValue != null) { "color is required" }
      check(nameValue != null) { "name is required" }
      check(priorityValue != null) { "priority is required" }
      return InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16(
        color = color,
        name = name,
        priority = priority,
        descriptionState = descriptionState,
        idState = idState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 must be a JSON object")
      val color = json.decodeRequired<InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4>(rawObject, "color")
      val name = json.decodeRequired<String>(rawObject, "name")
      val priority = json.decodeRequired<Int>(rawObject, "priority")
      return InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16(
        color = color,
        name = name,
        priority = priority,
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", json.encodeToJsonElement(value.color))
        put("name", value.name)
        put("priority", json.encodeToJsonElement(value.priority))
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationUpdateIssueFieldOptionsItemX2741fb16(block: InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16.Builder.() -> Unit): InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 = InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16 property '" + name + "' is not nullable")
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
