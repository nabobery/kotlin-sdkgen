package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingCardWalletsView(
  @SerialName("apple_pay")
  public val applePay: IssuingCardApplePay,
  @SerialName("google_pay")
  public val googlePay: IssuingCardGooglePay,
  @SerialName("primary_account_identifier")
  public val primaryAccountIdentifier: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_wallets
 */
@Serializable(with = IssuingCardWallets.Serializer::class)
public class IssuingCardWallets(
  public val applePay: IssuingCardApplePay,
  public val googlePay: IssuingCardGooglePay,
  /**
   * Unique identifier for a card used with digital wallets
   */
  public val primaryAccountIdentifier: String? = null,
) {
  public class Builder {
    private var applePayValue: IssuingCardApplePay? = null

    public var applePay: IssuingCardApplePay
      get() = requireNotNull(applePayValue) { "applePay is required" }
      set(`value`) {
        applePayValue = value
      }

    private var googlePayValue: IssuingCardGooglePay? = null

    public var googlePay: IssuingCardGooglePay
      get() = requireNotNull(googlePayValue) { "googlePay is required" }
      set(`value`) {
        googlePayValue = value
      }

    /**
     * Unique identifier for a card used with digital wallets
     */
    public var primaryAccountIdentifier: String? = null

    public fun build(): IssuingCardWallets {
      check(applePayValue != null) { "applePay is required" }
      check(googlePayValue != null) { "googlePay is required" }
      return IssuingCardWallets(
        applePay = applePay,
        googlePay = googlePay,
        primaryAccountIdentifier = primaryAccountIdentifier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardWallets = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardWallets> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardWallets {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardWallets")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardWallets must be a JSON object")
      val applePay = json.decodeRequired<IssuingCardApplePay>(rawObject, "apple_pay")
      val googlePay = json.decodeRequired<IssuingCardGooglePay>(rawObject, "google_pay")
      return IssuingCardWallets(
        applePay = applePay,
        googlePay = googlePay,
        primaryAccountIdentifier = rawObject["primary_account_identifier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardWallets) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardWallets")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apple_pay", json.encodeToJsonElement(value.applePay))
        put("google_pay", json.encodeToJsonElement(value.googlePay))
        value.primaryAccountIdentifier?.let { put("primary_account_identifier", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardWallets(block: IssuingCardWallets.Builder.() -> Unit): IssuingCardWallets = IssuingCardWallets.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardWallets is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
