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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An AccountSession allows a Connect platform to grant access to a connected account in Connect embedded components.
 *
 * We recommend that you create an AccountSession each time you need to display an embedded component
 * to your user. Do not save AccountSessions to your database as they expire relatively
 * quickly, and cannot be used more than once.
 *
 * Related guide: [Connect embedded components](https://docs.stripe.com/connect/get-started-connect-embedded-components)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_session
 */
@Serializable(with = AccountSession.Serializer::class)
public class AccountSession(
  /**
   * The ID of the account the AccountSession was created for
   */
  public val account: String,
  /**
   * The client secret of this AccountSession. Used on the client to set up secure access to the given `account`.
   *
   * The client secret can be used to provide access to `account` from your frontend. It should not be stored, logged,
   * or exposed to anyone other than the connected account. Make sure that you have TLS enabled on any page that
   * includes the client secret.
   *
   * Refer to our docs to [setup Connect embedded
   * components](https://docs.stripe.com/connect/get-started-connect-embedded-components) and learn about how
   * `client_secret` should be handled.
   */
  public val clientSecret: String,
  public val components: ConnectEmbeddedAccountSessionCreateComponents,
  /**
   * The timestamp at which this AccountSession will expire.
   */
  public val expiresAt: Int,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineAccountSessionObjectValueX2a6321e2,
) {
  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var clientSecretValue: String? = null

    public var clientSecret: String
      get() = requireNotNull(clientSecretValue) { "clientSecret is required" }
      set(`value`) {
        clientSecretValue = value
      }

    private var componentsValue: ConnectEmbeddedAccountSessionCreateComponents? = null

    public var components: ConnectEmbeddedAccountSessionCreateComponents
      get() = requireNotNull(componentsValue) { "components is required" }
      set(`value`) {
        componentsValue = value
      }

    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineAccountSessionObjectValueX2a6321e2? = null

    public var objectValue: InlineAccountSessionObjectValueX2a6321e2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): AccountSession {
      check(accountValue != null) { "account is required" }
      check(clientSecretValue != null) { "clientSecret is required" }
      check(componentsValue != null) { "components is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return AccountSession(
        account = account,
        clientSecret = clientSecret,
        components = components,
        expiresAt = expiresAt,
        livemode = livemode,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountSession = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountSession {
      val jsonDecoder = decoder.requireJsonDecoder("AccountSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountSession must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      val clientSecret = json.decodeRequired<String>(rawObject, "client_secret")
      val components = json.decodeRequired<ConnectEmbeddedAccountSessionCreateComponents>(rawObject, "components")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineAccountSessionObjectValueX2a6321e2>(rawObject, "object")
      return AccountSession(
        account = account,
        clientSecret = clientSecret,
        components = components,
        expiresAt = expiresAt,
        livemode = livemode,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountSession) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        put("client_secret", value.clientSecret)
        put("components", json.encodeToJsonElement(value.components))
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountSession(block: AccountSession.Builder.() -> Unit): AccountSession = AccountSession.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountSession is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
