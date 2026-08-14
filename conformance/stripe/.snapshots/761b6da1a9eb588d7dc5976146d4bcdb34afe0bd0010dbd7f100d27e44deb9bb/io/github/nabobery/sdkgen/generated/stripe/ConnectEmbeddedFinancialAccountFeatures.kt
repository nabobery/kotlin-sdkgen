package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_financial_account_features
 */
@Serializable(with = ConnectEmbeddedFinancialAccountFeatures.Serializer::class)
public class ConnectEmbeddedFinancialAccountFeatures(
  /**
   * Whether Stripe user authentication is disabled. This value can only be `true` for accounts where
   * `controller.requirement_collection` is `application` for the account. The default value is the opposite of the
   * `external_account_collection` value. For example, if you don't set `external_account_collection`, it defaults to
   * `true` and `disable_stripe_user_authentication` defaults to `false`.
   */
  public val disableStripeUserAuthentication: Boolean,
  /**
   * Whether external account collection is enabled. This feature can only be `false` for accounts where you’re
   * responsible for collecting updated information when requirements are due or change, like Custom accounts. The
   * default value for this feature is `true`.
   */
  public val externalAccountCollection: Boolean,
  /**
   * Whether to allow sending money.
   */
  public val sendMoney: Boolean,
  /**
   * Whether to allow transferring balance.
   */
  public val transferBalance: Boolean,
) {
  public class Builder {
    private var disableStripeUserAuthenticationValue: Boolean? = null

    public var disableStripeUserAuthentication: Boolean
      get() = requireNotNull(disableStripeUserAuthenticationValue) { "disableStripeUserAuthentication is required" }
      set(`value`) {
        disableStripeUserAuthenticationValue = value
      }

    private var externalAccountCollectionValue: Boolean? = null

    public var externalAccountCollection: Boolean
      get() = requireNotNull(externalAccountCollectionValue) { "externalAccountCollection is required" }
      set(`value`) {
        externalAccountCollectionValue = value
      }

    private var sendMoneyValue: Boolean? = null

    public var sendMoney: Boolean
      get() = requireNotNull(sendMoneyValue) { "sendMoney is required" }
      set(`value`) {
        sendMoneyValue = value
      }

    private var transferBalanceValue: Boolean? = null

    public var transferBalance: Boolean
      get() = requireNotNull(transferBalanceValue) { "transferBalance is required" }
      set(`value`) {
        transferBalanceValue = value
      }

    public fun build(): ConnectEmbeddedFinancialAccountFeatures {
      check(disableStripeUserAuthenticationValue != null) { "disableStripeUserAuthentication is required" }
      check(externalAccountCollectionValue != null) { "externalAccountCollection is required" }
      check(sendMoneyValue != null) { "sendMoney is required" }
      check(transferBalanceValue != null) { "transferBalance is required" }
      return ConnectEmbeddedFinancialAccountFeatures(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        externalAccountCollection = externalAccountCollection,
        sendMoney = sendMoney,
        transferBalance = transferBalance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedFinancialAccountFeatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedFinancialAccountFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedFinancialAccountFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedFinancialAccountFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedFinancialAccountFeatures must be a JSON object")
      val disableStripeUserAuthentication = json.decodeRequired<Boolean>(rawObject, "disable_stripe_user_authentication")
      val externalAccountCollection = json.decodeRequired<Boolean>(rawObject, "external_account_collection")
      val sendMoney = json.decodeRequired<Boolean>(rawObject, "send_money")
      val transferBalance = json.decodeRequired<Boolean>(rawObject, "transfer_balance")
      return ConnectEmbeddedFinancialAccountFeatures(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        externalAccountCollection = externalAccountCollection,
        sendMoney = sendMoney,
        transferBalance = transferBalance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedFinancialAccountFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedFinancialAccountFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("disable_stripe_user_authentication", json.encodeToJsonElement(value.disableStripeUserAuthentication))
        put("external_account_collection", json.encodeToJsonElement(value.externalAccountCollection))
        put("send_money", json.encodeToJsonElement(value.sendMoney))
        put("transfer_balance", json.encodeToJsonElement(value.transferBalance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedFinancialAccountFeatures(block: ConnectEmbeddedFinancialAccountFeatures.Builder.() -> Unit): ConnectEmbeddedFinancialAccountFeatures = ConnectEmbeddedFinancialAccountFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedFinancialAccountFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
