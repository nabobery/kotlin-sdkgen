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
 * Marketplace Purchase
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/marketplace-purchase
 */
@Serializable(with = MarketplacePurchase.Serializer::class)
public class MarketplacePurchase(
  public val id: Int,
  public val login: String,
  public val marketplacePurchase: InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2,
  public val type: String,
  public val url: String,
  public val email: String? = null,
  public val marketplacePendingChange:
      InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297? = null,
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

    private var marketplacePurchaseValue: InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2? =
        null

    public var marketplacePurchase: InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2
      get() = requireNotNull(marketplacePurchaseValue) { "marketplacePurchase is required" }
      set(`value`) {
        marketplacePurchaseValue = value
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

    public var marketplacePendingChange: InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297?
        = null

    public var organizationBillingEmail: String? = null

    public fun build(): MarketplacePurchase {
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(marketplacePurchaseValue != null) { "marketplacePurchase is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return MarketplacePurchase(
        id = id,
        login = login,
        marketplacePurchase = marketplacePurchase,
        type = type,
        url = url,
        email = email,
        marketplacePendingChange = marketplacePendingChange,
        organizationBillingEmail = organizationBillingEmail,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MarketplacePurchase = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MarketplacePurchase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MarketplacePurchase {
      val jsonDecoder = decoder.requireJsonDecoder("MarketplacePurchase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MarketplacePurchase must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val marketplacePurchase = json.decodeRequired<InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2>(rawObject, "marketplace_purchase")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return MarketplacePurchase(
        id = id,
        login = login,
        marketplacePurchase = marketplacePurchase,
        type = type,
        url = url,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        marketplacePendingChange = rawObject["marketplace_pending_change"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297?>(element) },
        organizationBillingEmail = rawObject["organization_billing_email"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MarketplacePurchase) {
      val jsonEncoder = encoder.requireJsonEncoder("MarketplacePurchase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("marketplace_purchase", json.encodeToJsonElement(value.marketplacePurchase))
        put("type", value.type)
        put("url", value.url)
        value.email?.let { put("email", it) }
        value.marketplacePendingChange?.let { put("marketplace_pending_change", json.encodeToJsonElement(it)) }
        value.organizationBillingEmail?.let { put("organization_billing_email", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun marketplacePurchase(block: MarketplacePurchase.Builder.() -> Unit): MarketplacePurchase = MarketplacePurchase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MarketplacePurchase is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
