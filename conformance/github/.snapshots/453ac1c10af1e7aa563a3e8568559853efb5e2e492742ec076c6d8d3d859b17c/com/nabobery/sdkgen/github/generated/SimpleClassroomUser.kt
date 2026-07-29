package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A GitHub user simplified for Classroom.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom-user
 */
@Serializable(with = SimpleClassroomUser.Serializer::class)
public class SimpleClassroomUser(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val login: String,
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

    public fun build(): SimpleClassroomUser {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      return SimpleClassroomUser(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleClassroomUser = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SimpleClassroomUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleClassroomUser {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleClassroomUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleClassroomUser must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      return SimpleClassroomUser(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleClassroomUser) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleClassroomUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleClassroomUser(block: SimpleClassroomUser.Builder.() -> Unit): SimpleClassroomUser = SimpleClassroomUser.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleClassroomUser is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
