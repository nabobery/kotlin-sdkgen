package io.github.nabobery.sdkgen.github.generated

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
 * A GitHub organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom-organization
 */
@Serializable(with = SimpleClassroomOrganization.Serializer::class)
public class SimpleClassroomOrganization(
  public val avatarUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val login: String,
  public val name: String?,
  public val nodeId: String,
) {
  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    public fun build(): SimpleClassroomOrganization {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      return SimpleClassroomOrganization(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        name = nameState.valueOrNull(),
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleClassroomOrganization = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleClassroomOrganization> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleClassroomOrganization {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleClassroomOrganization")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleClassroomOrganization must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      if (!rawObject.containsKey("name")) {
        throw SerializationException("SimpleClassroomOrganization is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return SimpleClassroomOrganization(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        name = name,
        nodeId = nodeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleClassroomOrganization) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleClassroomOrganization")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleClassroomOrganization(block: SimpleClassroomOrganization.Builder.() -> Unit): SimpleClassroomOrganization = SimpleClassroomOrganization.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleClassroomOrganization is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("SimpleClassroomOrganization property '" + name + "' is not nullable")
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
