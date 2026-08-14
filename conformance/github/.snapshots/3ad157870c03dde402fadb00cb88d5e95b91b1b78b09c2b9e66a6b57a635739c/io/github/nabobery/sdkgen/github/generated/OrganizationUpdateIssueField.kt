package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field
 */
@Serializable(with = OrganizationUpdateIssueField.Serializer::class)
public class OrganizationUpdateIssueField internal constructor(
  private val descriptionState: FieldState<String?>,
  private val nameState: FieldState<String>,
  optionsState: FieldState<List<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16>>,
  private val visibilityState: FieldState<InlineOrganizationUpdateIssueFieldVisibilityXa321fe58>,
) {
  private val optionsState: FieldState<List<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16>>
      = optionsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Description of the issue field.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Name of the issue field.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * Options for select fields. Only applicable when updating single_select or multi_select fields. When provided, this
   * array **replaces** the entire existing set of options rather than adding to or updating individual options. To
   * retain or update an existing option, include it in the array with its `id`. Options sent without an `id` are
   * treated as new options and may cause existing options to be deleted and recreated.
   */
  public val options: List<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16>?
    get() = optionsState.valueOrNull()

  /**
   * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
   * `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
   */
  public val visibility: InlineOrganizationUpdateIssueFieldVisibilityXa321fe58?
    get() = visibilityState.valueOrNull()

  public constructor() : this(descriptionState = FieldState.Absent,
  nameState = FieldState.Absent,
  optionsState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `options`.
   */
  public fun optionsPresence(): FieldPresence = optionsState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

  public class Builder {
    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Description of the issue field.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Name of the issue field.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var optionsState:
        FieldState<List<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16>> = FieldState.Absent

    /**
     * Options for select fields. Only applicable when updating single_select or multi_select fields. When provided,
     * this array **replaces** the entire existing set of options rather than adding to or updating individual options.
     * To retain or update an existing option, include it in the array with its `id`. Options sent without an `id` are
     * treated as new options and may cause existing options to be deleted and recreated.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var options: List<InlineOrganizationUpdateIssueFieldOptionsItemX2741fb16>?
      get() = optionsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "options is not nullable; call unsetOptions() to omit it" }
        optionsState = FieldState.Value(present.toList())
      }

    private var visibilityState: FieldState<InlineOrganizationUpdateIssueFieldVisibilityXa321fe58> =
        FieldState.Absent

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
     * `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: InlineOrganizationUpdateIssueFieldVisibilityXa321fe58?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `options` from serialized output.
     */
    public fun unsetOptions() {
      optionsState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    public fun build(): OrganizationUpdateIssueField = OrganizationUpdateIssueField(
      descriptionState = descriptionState,
      nameState = nameState,
      optionsState = optionsState,
      visibilityState = visibilityState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationUpdateIssueField = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationUpdateIssueField> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationUpdateIssueField {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationUpdateIssueField")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationUpdateIssueField must be a JSON object")
      return OrganizationUpdateIssueField(
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        optionsState = json.decodeOptional(rawObject, "options", nullable = false),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationUpdateIssueField) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationUpdateIssueField")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("options", value.optionsState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationUpdateIssueField(block: OrganizationUpdateIssueField.Builder.() -> Unit): OrganizationUpdateIssueField = OrganizationUpdateIssueField.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("OrganizationUpdateIssueField property '" + name + "' is not nullable")
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
