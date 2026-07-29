package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_issuing_cards_list_features
 */
@Serializable(with = ConnectEmbeddedIssuingCardsListFeatures.Serializer::class)
public class ConnectEmbeddedIssuingCardsListFeatures(
  /**
   * Whether to allow card management features.
   */
  public val cardManagement: Boolean,
  /**
   * Whether to allow card spend dispute management features.
   */
  public val cardSpendDisputeManagement: Boolean,
  /**
   * Whether to allow cardholder management features.
   */
  public val cardholderManagement: Boolean,
  /**
   * Whether Stripe user authentication is disabled. This value can only be `true` for accounts where
   * `controller.requirement_collection` is `application` for the account. The default value is the opposite of the
   * `external_account_collection` value. For example, if you don't set `external_account_collection`, it defaults to
   * `true` and `disable_stripe_user_authentication` defaults to `false`.
   */
  public val disableStripeUserAuthentication: Boolean,
  /**
   * Whether to allow spend control management features.
   */
  public val spendControlManagement: Boolean,
) {
  public class Builder {
    private var cardManagementValue: Boolean? = null

    public var cardManagement: Boolean
      get() = requireNotNull(cardManagementValue) { "cardManagement is required" }
      set(`value`) {
        cardManagementValue = value
      }

    private var cardSpendDisputeManagementValue: Boolean? = null

    public var cardSpendDisputeManagement: Boolean
      get() = requireNotNull(cardSpendDisputeManagementValue) { "cardSpendDisputeManagement is required" }
      set(`value`) {
        cardSpendDisputeManagementValue = value
      }

    private var cardholderManagementValue: Boolean? = null

    public var cardholderManagement: Boolean
      get() = requireNotNull(cardholderManagementValue) { "cardholderManagement is required" }
      set(`value`) {
        cardholderManagementValue = value
      }

    private var disableStripeUserAuthenticationValue: Boolean? = null

    public var disableStripeUserAuthentication: Boolean
      get() = requireNotNull(disableStripeUserAuthenticationValue) { "disableStripeUserAuthentication is required" }
      set(`value`) {
        disableStripeUserAuthenticationValue = value
      }

    private var spendControlManagementValue: Boolean? = null

    public var spendControlManagement: Boolean
      get() = requireNotNull(spendControlManagementValue) { "spendControlManagement is required" }
      set(`value`) {
        spendControlManagementValue = value
      }

    public fun build(): ConnectEmbeddedIssuingCardsListFeatures {
      check(cardManagementValue != null) { "cardManagement is required" }
      check(cardSpendDisputeManagementValue != null) { "cardSpendDisputeManagement is required" }
      check(cardholderManagementValue != null) { "cardholderManagement is required" }
      check(disableStripeUserAuthenticationValue != null) { "disableStripeUserAuthentication is required" }
      check(spendControlManagementValue != null) { "spendControlManagement is required" }
      return ConnectEmbeddedIssuingCardsListFeatures(
        cardManagement = cardManagement,
        cardSpendDisputeManagement = cardSpendDisputeManagement,
        cardholderManagement = cardholderManagement,
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        spendControlManagement = spendControlManagement,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedIssuingCardsListFeatures = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ConnectEmbeddedIssuingCardsListFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedIssuingCardsListFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedIssuingCardsListFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedIssuingCardsListFeatures must be a JSON object")
      val cardManagement = json.decodeRequired<Boolean>(rawObject, "card_management")
      val cardSpendDisputeManagement = json.decodeRequired<Boolean>(rawObject, "card_spend_dispute_management")
      val cardholderManagement = json.decodeRequired<Boolean>(rawObject, "cardholder_management")
      val disableStripeUserAuthentication = json.decodeRequired<Boolean>(rawObject, "disable_stripe_user_authentication")
      val spendControlManagement = json.decodeRequired<Boolean>(rawObject, "spend_control_management")
      return ConnectEmbeddedIssuingCardsListFeatures(
        cardManagement = cardManagement,
        cardSpendDisputeManagement = cardSpendDisputeManagement,
        cardholderManagement = cardholderManagement,
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        spendControlManagement = spendControlManagement,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedIssuingCardsListFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedIssuingCardsListFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("card_management", json.encodeToJsonElement(value.cardManagement))
        put("card_spend_dispute_management", json.encodeToJsonElement(value.cardSpendDisputeManagement))
        put("cardholder_management", json.encodeToJsonElement(value.cardholderManagement))
        put("disable_stripe_user_authentication", json.encodeToJsonElement(value.disableStripeUserAuthentication))
        put("spend_control_management", json.encodeToJsonElement(value.spendControlManagement))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedIssuingCardsListFeatures(block: ConnectEmbeddedIssuingCardsListFeatures.Builder.() -> Unit): ConnectEmbeddedIssuingCardsListFeatures = ConnectEmbeddedIssuingCardsListFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedIssuingCardsListFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
