package io.github.nabobery.sdkgen.github.generated

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
 * Repository Collaborator Permission
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-collaborator-permission
 */
@Serializable(with = RepositoryCollaboratorPermission.Serializer::class)
public class RepositoryCollaboratorPermission(
  public val permission: String,
  public val roleName: String,
  public val user: NullableCollaborator?,
) {
  public class Builder {
    private var permissionValue: String? = null

    public var permission: String
      get() = requireNotNull(permissionValue) { "permission is required" }
      set(`value`) {
        permissionValue = value
      }

    private var roleNameValue: String? = null

    public var roleName: String
      get() = requireNotNull(roleNameValue) { "roleName is required" }
      set(`value`) {
        roleNameValue = value
      }

    private var userState: FieldState<NullableCollaborator?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableCollaborator?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): RepositoryCollaboratorPermission {
      check(permissionValue != null) { "permission is required" }
      check(roleNameValue != null) { "roleName is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return RepositoryCollaboratorPermission(
        permission = permission,
        roleName = roleName,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryCollaboratorPermission = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryCollaboratorPermission> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryCollaboratorPermission {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryCollaboratorPermission")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryCollaboratorPermission must be a JSON object")
      val permission = json.decodeRequired<String>(rawObject, "permission")
      val roleName = json.decodeRequired<String>(rawObject, "role_name")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("RepositoryCollaboratorPermission is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCollaborator?>(requireNotNull(element)) }
      return RepositoryCollaboratorPermission(
        permission = permission,
        roleName = roleName,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryCollaboratorPermission) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryCollaboratorPermission")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("permission", value.permission)
        put("role_name", value.roleName)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryCollaboratorPermission(block: RepositoryCollaboratorPermission.Builder.() -> Unit): RepositoryCollaboratorPermission = RepositoryCollaboratorPermission.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryCollaboratorPermission is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("RepositoryCollaboratorPermission property '" + name + "' is not nullable")
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
