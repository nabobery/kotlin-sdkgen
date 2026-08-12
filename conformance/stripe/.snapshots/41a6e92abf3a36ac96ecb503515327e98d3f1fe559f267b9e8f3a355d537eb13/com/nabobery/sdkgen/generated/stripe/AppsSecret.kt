package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Secret Store is an API that allows Stripe Apps developers to securely persist secrets for use by UI Extensions and
 * app backends.
 *
 * The primary resource in Secret Store is a `secret`. Other apps can't view secrets created by an app. Additionally,
 * secrets are scoped to provide further permission control.
 *
 * All Dashboard users and the app backend share `account` scoped secrets. Use the `account` scope for secrets that
 * don't change per-user, like a third-party API key.
 *
 * A `user` scoped secret is accessible by the app backend and one specific Dashboard user. Use the `user` scope for
 * per-user secrets like per-user OAuth tokens, where different users might have different permissions.
 *
 * Related guide: [Store data between page reloads](https://docs.stripe.com/stripe-apps/store-auth-data-custom-objects)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/apps.secret
 */
@Serializable(with = AppsSecret.Serializer::class)
public class AppsSecret(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * A name for the secret that's unique within the scope.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineAppsSecretObjectValueX998e84c6,
  public val scope: SecretServiceResourceScope,
  /**
   * If true, indicates that this secret has been deleted
   */
  public val deleted: Boolean? = null,
  /**
   * The Unix timestamp for the expiry time of the secret, after which the secret deletes.
   */
  public val expiresAt: Int? = null,
  /**
   * The plaintext secret value to be stored.
   */
  public val payload: String? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineAppsSecretObjectValueX998e84c6? = null

    public var objectValue: InlineAppsSecretObjectValueX998e84c6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var scopeValue: SecretServiceResourceScope? = null

    public var scope: SecretServiceResourceScope
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    /**
     * If true, indicates that this secret has been deleted
     */
    public var deleted: Boolean? = null

    /**
     * The Unix timestamp for the expiry time of the secret, after which the secret deletes.
     */
    public var expiresAt: Int? = null

    /**
     * The plaintext secret value to be stored.
     */
    public var payload: String? = null

    public fun build(): AppsSecret {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(scopeValue != null) { "scope is required" }
      return AppsSecret(
        created = created,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        scope = scope,
        deleted = deleted,
        expiresAt = expiresAt,
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AppsSecret = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AppsSecret> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AppsSecret {
      val jsonDecoder = decoder.requireJsonDecoder("AppsSecret")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AppsSecret must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineAppsSecretObjectValueX998e84c6>(rawObject, "object")
      val scope = json.decodeRequired<SecretServiceResourceScope>(rawObject, "scope")
      return AppsSecret(
        created = created,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        scope = scope,
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        payload = rawObject["payload"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AppsSecret) {
      val jsonEncoder = encoder.requireJsonEncoder("AppsSecret")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("scope", json.encodeToJsonElement(value.scope))
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.payload?.let { put("payload", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun appsSecret(block: AppsSecret.Builder.() -> Unit): AppsSecret = AppsSecret.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AppsSecret is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
