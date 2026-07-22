package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Authentication Token
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/authentication-token
 */
@Serializable(with = AuthenticationToken.Serializer::class)
public class AuthenticationToken(
  /**
   * The time this token expires
   */
  public val expiresAt: String,
  /**
   * The token used for authentication
   */
  public val token: String,
  public val permissions: JsonObject? = null,
  /**
   * The repositories this token has access to
   */
  public val repositories: List<Repository>? = null,
  /**
   * Describe whether all repositories have been selected or there's a selection involved
   */
  public val repositorySelection: InlineAuthenticationTokenRepositorySelectionX5b268930? = null,
  public val singleFile: String? = null,
) {
  public class Builder {
    private var expiresAtValue: String? = null

    public var expiresAt: String
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    public var permissions: JsonObject? = null

    /**
     * The repositories this token has access to
     */
    public var repositories: List<Repository>? = null

    /**
     * Describe whether all repositories have been selected or there's a selection involved
     */
    public var repositorySelection: InlineAuthenticationTokenRepositorySelectionX5b268930? = null

    public var singleFile: String? = null

    public fun build(): AuthenticationToken {
      check(expiresAtValue != null) { "expiresAt is required" }
      check(tokenValue != null) { "token is required" }
      return AuthenticationToken(
        expiresAt = expiresAt,
        token = token,
        permissions = permissions,
        repositories = repositories,
        repositorySelection = repositorySelection,
        singleFile = singleFile,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AuthenticationToken = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AuthenticationToken> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AuthenticationToken {
      val jsonDecoder = decoder.requireJsonDecoder("AuthenticationToken")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AuthenticationToken must be a JSON object")
      val expiresAt = json.decodeRequired<String>(rawObject, "expires_at")
      val token = json.decodeRequired<String>(rawObject, "token")
      return AuthenticationToken(
        expiresAt = expiresAt,
        token = token,
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<Repository>>(it) },
        repositorySelection = rawObject["repository_selection"]?.let { json.decodeFromJsonElement<InlineAuthenticationTokenRepositorySelectionX5b268930>(it) },
        singleFile = rawObject["single_file"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AuthenticationToken) {
      val jsonEncoder = encoder.requireJsonEncoder("AuthenticationToken")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", value.expiresAt)
        put("token", value.token)
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.repositorySelection?.let { put("repository_selection", json.encodeToJsonElement(it)) }
        value.singleFile?.let { put("single_file", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun authenticationToken(block: AuthenticationToken.Builder.() -> Unit): AuthenticationToken = AuthenticationToken.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AuthenticationToken is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
