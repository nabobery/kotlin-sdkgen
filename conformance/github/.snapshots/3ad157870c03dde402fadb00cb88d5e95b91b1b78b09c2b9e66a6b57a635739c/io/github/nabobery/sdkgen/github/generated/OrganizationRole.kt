package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * Organization roles
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-role
 */
@Serializable(with = OrganizationRole.Serializer::class)
public class OrganizationRole internal constructor(
  /**
   * The date and time the role was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the role.
   */
  public val id: Long,
  /**
   * The name of the role.
   */
  public val name: String,
  public val organization: NullableSimpleUser?,
  permissions: List<String>,
  /**
   * The date and time the role was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  private val baseRoleState: FieldState<InlineOrganizationRoleBaseRoleXfd6edbf1?>,
  private val descriptionState: FieldState<String?>,
  private val sourceState: FieldState<InlineOrganizationRoleSourceX0ac9f922?>,
) {
  /**
   * A list of permissions included in this role.
   */
  public val permissions: List<String> = permissions.toList()

  /**
   * The system role from which this role inherits permissions.
   */
  public val baseRole: InlineOrganizationRoleBaseRoleXfd6edbf1?
    get() = baseRoleState.valueOrNull()

  /**
   * A short description about who this role is for or what permissions it grants.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Source answers the question, "where did this role come from?"
   */
  public val source: InlineOrganizationRoleSourceX0ac9f922?
    get() = sourceState.valueOrNull()

  public constructor(
    createdAt: String,
    id: Long,
    name: String,
    organization: NullableSimpleUser?,
    permissions: List<String>,
    updatedAt: String,
  ) : this(createdAt = createdAt,
  id = id,
  name = name,
  organization = organization,
  permissions = permissions,
  updatedAt = updatedAt,
  baseRoleState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  sourceState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `base_role`.
   */
  public fun baseRolePresence(): FieldPresence = baseRoleState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `source`.
   */
  public fun sourcePresence(): FieldPresence = sourceState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var permissionsValue: List<String>? = null

    public var permissions: List<String>
      get() = requireNotNull(permissionsValue) { "permissions is required" }.toList()
      set(`value`) {
        permissionsValue = value.toList()
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var organizationState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var organization: NullableSimpleUser?
      get() = organizationState.valueOrNull()
      set(`value`) {
        organizationState = value.toNullableFieldState()
      }

    private var baseRoleState: FieldState<InlineOrganizationRoleBaseRoleXfd6edbf1?> =
        FieldState.Absent

    /**
     * The system role from which this role inherits permissions.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var baseRole: InlineOrganizationRoleBaseRoleXfd6edbf1?
      get() = baseRoleState.valueOrNull()
      set(`value`) {
        baseRoleState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A short description about who this role is for or what permissions it grants.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var sourceState: FieldState<InlineOrganizationRoleSourceX0ac9f922?> = FieldState.Absent

    /**
     * Source answers the question, "where did this role come from?"
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var source: InlineOrganizationRoleSourceX0ac9f922?
      get() = sourceState.valueOrNull()
      set(`value`) {
        sourceState = value.toNullableFieldState()
      }

    /**
     * Omits `base_role` from serialized output.
     */
    public fun unsetBaseRole() {
      baseRoleState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `source` from serialized output.
     */
    public fun unsetSource() {
      sourceState = FieldState.Absent
    }

    public fun build(): OrganizationRole {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(organizationState !== FieldState.Absent) { "organization is required, even when null" }
      return OrganizationRole(
        createdAt = createdAt,
        id = id,
        name = name,
        organization = organizationState.valueOrNull(),
        permissions = permissions,
        updatedAt = updatedAt,
        baseRoleState = baseRoleState,
        descriptionState = descriptionState,
        sourceState = sourceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationRole = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationRole> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationRole {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationRole")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationRole must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val permissions = json.decodeRequired<List<String>>(rawObject, "permissions")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("organization")) {
        throw SerializationException("OrganizationRole is missing required property 'organization'")
      }
      val organization = rawObject["organization"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return OrganizationRole(
        createdAt = createdAt,
        id = id,
        name = name,
        organization = organization,
        permissions = permissions,
        updatedAt = updatedAt,
        baseRoleState = json.decodeOptional(rawObject, "base_role", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        sourceState = json.decodeOptional(rawObject, "source", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationRole) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationRole")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("organization", value.organization?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("updated_at", value.updatedAt)
        putState("base_role", value.baseRoleState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("source", value.sourceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationRole(block: OrganizationRole.Builder.() -> Unit): OrganizationRole = OrganizationRole.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationRole is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
    if (!nullable) throw SerializationException("OrganizationRole property '" + name + "' is not nullable")
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
