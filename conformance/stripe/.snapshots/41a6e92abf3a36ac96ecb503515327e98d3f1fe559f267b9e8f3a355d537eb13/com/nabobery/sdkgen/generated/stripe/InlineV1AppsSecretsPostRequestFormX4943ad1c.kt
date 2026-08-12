package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1AppsSecretsPostRequestFormX4943ad1c.Serializer::class)
public class InlineV1AppsSecretsPostRequestFormX4943ad1c(
  /**
   * A name for the secret that's unique within the scope.
   */
  public val name: String,
  /**
   * The plaintext secret value to be stored.
   */
  public val payload: String,
  /**
   * Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets
   * or secrets scoped to their own user.
   */
  public val scope: InlineV1AppsSecretsPostRequestFormScopeX5237eff0,
  expand: List<String>? = null,
  /**
   * The Unix timestamp for the expiry time of the secret, after which the secret deletes.
   */
  public val expiresAt: Int? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var payloadValue: String? = null

    public var payload: String
      get() = requireNotNull(payloadValue) { "payload is required" }
      set(`value`) {
        payloadValue = value
      }

    private var scopeValue: InlineV1AppsSecretsPostRequestFormScopeX5237eff0? = null

    public var scope: InlineV1AppsSecretsPostRequestFormScopeX5237eff0
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The Unix timestamp for the expiry time of the secret, after which the secret deletes.
     */
    public var expiresAt: Int? = null

    public fun build(): InlineV1AppsSecretsPostRequestFormX4943ad1c {
      check(nameValue != null) { "name is required" }
      check(payloadValue != null) { "payload is required" }
      check(scopeValue != null) { "scope is required" }
      return InlineV1AppsSecretsPostRequestFormX4943ad1c(
        name = name,
        payload = payload,
        scope = scope,
        expand = expand,
        expiresAt = expiresAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsPostRequestFormX4943ad1c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AppsSecretsPostRequestFormX4943ad1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsPostRequestFormX4943ad1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsPostRequestFormX4943ad1c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsPostRequestFormX4943ad1c must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      val scope = json.decodeRequired<InlineV1AppsSecretsPostRequestFormScopeX5237eff0>(rawObject, "scope")
      return InlineV1AppsSecretsPostRequestFormX4943ad1c(
        name = name,
        payload = payload,
        scope = scope,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsPostRequestFormX4943ad1c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsPostRequestFormX4943ad1c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("payload", value.payload)
        put("scope", json.encodeToJsonElement(value.scope))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsPostRequestFormX4943ad1c(block: InlineV1AppsSecretsPostRequestFormX4943ad1c.Builder.() -> Unit): InlineV1AppsSecretsPostRequestFormX4943ad1c = InlineV1AppsSecretsPostRequestFormX4943ad1c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsPostRequestFormX4943ad1c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
