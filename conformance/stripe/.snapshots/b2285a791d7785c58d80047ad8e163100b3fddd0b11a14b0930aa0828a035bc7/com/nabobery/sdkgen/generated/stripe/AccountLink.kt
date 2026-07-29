package com.nabobery.sdkgen.generated.stripe

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
 * Account Links are the means by which a Connect platform grants a connected account permission to access
 * Stripe-hosted applications, such as Connect Onboarding.
 *
 * Related guide: [Connect Onboarding](https://docs.stripe.com/connect/custom/hosted-onboarding)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_link
 */
@Serializable(with = AccountLink.Serializer::class)
public class AccountLink(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The timestamp at which this account link will expire.
   */
  public val expiresAt: Int,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineAccountLinkObjectValueX2aa6f759,
  /**
   * The URL for the account link.
   */
  public val url: String,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var objectValueValue: InlineAccountLinkObjectValueX2aa6f759? = null

    public var objectValue: InlineAccountLinkObjectValueX2aa6f759
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): AccountLink {
      check(createdValue != null) { "created is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return AccountLink(
        created = created,
        expiresAt = expiresAt,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountLink = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountLink {
      val jsonDecoder = decoder.requireJsonDecoder("AccountLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountLink must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val objectValue = json.decodeRequired<InlineAccountLinkObjectValueX2aa6f759>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return AccountLink(
        created = created,
        expiresAt = expiresAt,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountLink) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountLink(block: AccountLink.Builder.() -> Unit): AccountLink = AccountLink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountLink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
