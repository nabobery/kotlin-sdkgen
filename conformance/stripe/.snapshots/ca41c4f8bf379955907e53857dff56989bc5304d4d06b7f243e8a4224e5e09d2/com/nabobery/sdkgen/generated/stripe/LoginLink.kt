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
 * Login Links are single-use URLs that takes an Express account to the login page for their Stripe dashboard.
 * A Login Link differs from an [Account Link](https://docs.stripe.com/api/account_links) in that it takes the user
 * directly to their [Express dashboard for the specified
 * account](https://docs.stripe.com/connect/integrate-express-dashboard#create-login-link)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/login_link
 */
@Serializable(with = LoginLink.Serializer::class)
public class LoginLink(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineLoginLinkObjectValueX1d6bb909,
  /**
   * The URL for the login link.
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

    private var objectValueValue: InlineLoginLinkObjectValueX1d6bb909? = null

    public var objectValue: InlineLoginLinkObjectValueX1d6bb909
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

    public fun build(): LoginLink {
      check(createdValue != null) { "created is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return LoginLink(
        created = created,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LoginLink = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LoginLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LoginLink {
      val jsonDecoder = decoder.requireJsonDecoder("LoginLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LoginLink must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val objectValue = json.decodeRequired<InlineLoginLinkObjectValueX1d6bb909>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return LoginLink(
        created = created,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: LoginLink) {
      val jsonEncoder = encoder.requireJsonEncoder("LoginLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun loginLink(block: LoginLink.Builder.() -> Unit): LoginLink = LoginLink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LoginLink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
