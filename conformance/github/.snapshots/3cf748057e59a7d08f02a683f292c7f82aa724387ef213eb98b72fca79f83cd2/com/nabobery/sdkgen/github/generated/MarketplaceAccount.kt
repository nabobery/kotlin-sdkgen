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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/marketplace-account.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/marketplace-account
 */
@Serializable(with = MarketplaceAccount.Serializer::class)
public class MarketplaceAccount(
  public val id: Int,
  public val login: String,
  public val type: String,
  public val url: String,
  public val email: String? = null,
  public val nodeId: String? = null,
  public val organizationBillingEmail: String? = null,
) {
  public class Builder {
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

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var email: String? = null

    public var nodeId: String? = null

    public var organizationBillingEmail: String? = null

    public fun build(): MarketplaceAccount {
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return MarketplaceAccount(
        id = id,
        login = login,
        type = type,
        url = url,
        email = email,
        nodeId = nodeId,
        organizationBillingEmail = organizationBillingEmail,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MarketplaceAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MarketplaceAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MarketplaceAccount {
      val jsonDecoder = decoder.requireJsonDecoder("MarketplaceAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MarketplaceAccount must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return MarketplaceAccount(
        id = id,
        login = login,
        type = type,
        url = url,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationBillingEmail = rawObject["organization_billing_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MarketplaceAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("MarketplaceAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("type", value.type)
        put("url", value.url)
        value.email?.let { put("email", it) }
        value.nodeId?.let { put("node_id", it) }
        value.organizationBillingEmail?.let { put("organization_billing_email", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun marketplaceAccount(block: MarketplaceAccount.Builder.() -> Unit): MarketplaceAccount = MarketplaceAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MarketplaceAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
