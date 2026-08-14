package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1organization~1members/get/responses/200/content/application~1json/schema/proper
 * ties/data/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organization~1members/get/responses/200/content/application~1json/schema/proper
 * ties/data/items
 */
@Serializable(with = InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724.Serializer::class)
public class InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724(
  /**
   * Email address of the member
   */
  public val email: String,
  /**
   * First name of the member
   */
  public val firstName: String?,
  /**
   * User ID of the organization member
   */
  public val id: String,
  /**
   * Last name of the member
   */
  public val lastName: String?,
  /**
   * Role of the member in the organization
   */
  public val role: InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba,
) {
  public class Builder {
    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba? = null

    public var role: InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var firstNameState: FieldState<String?> = FieldState.Absent

    /**
     * First name of the member
     * Required nullable field; assigning `null` records present-null.
     */
    public var firstName: String?
      get() = firstNameState.valueOrNull()
      set(`value`) {
        firstNameState = value.toNullableFieldState()
      }

    private var lastNameState: FieldState<String?> = FieldState.Absent

    /**
     * Last name of the member
     * Required nullable field; assigning `null` records present-null.
     */
    public var lastName: String?
      get() = lastNameState.valueOrNull()
      set(`value`) {
        lastNameState = value.toNullableFieldState()
      }

    public fun build(): InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 {
      check(emailValue != null) { "email is required" }
      check(idValue != null) { "id is required" }
      check(roleValue != null) { "role is required" }
      check(firstNameState !== FieldState.Absent) { "firstName is required, even when null" }
      check(lastNameState !== FieldState.Absent) { "lastName is required, even when null" }
      return InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724(
        email = email,
        firstName = firstNameState.valueOrNull(),
        id = id,
        lastName = lastNameState.valueOrNull(),
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val id = json.decodeRequired<String>(rawObject, "id")
      val role = json.decodeRequired<InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba>(rawObject, "role")
      if (!rawObject.containsKey("first_name")) {
        throw SerializationException("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 is missing required property 'first_name'")
      }
      val firstName = rawObject["first_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("last_name")) {
        throw SerializationException("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 is missing required property 'last_name'")
      }
      val lastName = rawObject["last_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724(
        email = email,
        firstName = firstName,
        id = id,
        lastName = lastName,
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("first_name", value.firstName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("last_name", value.lastName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationMembersGetResponse200JsonDataItemX43d6a724(block: InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724.Builder.() -> Unit): InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 = InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724 property '" + name + "' is not nullable")
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
